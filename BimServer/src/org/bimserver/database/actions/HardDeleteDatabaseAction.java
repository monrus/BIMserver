package org.bimserver.database.actions;

import com.sleepycat.je.*;
import com.sun.istack.Nullable;
import org.bimserver.BimServer;
import org.bimserver.BimserverDatabaseException;
import org.bimserver.database.Database;
import org.bimserver.database.DatabaseSession;
import org.bimserver.database.berkeley.BerkeleyKeyValueStore;
import org.bimserver.database.berkeley.TableWrapper;
import org.bimserver.models.log.AccessMethod;
import org.bimserver.models.store.Project;
import org.bimserver.utils.BinUtils;
import org.bimserver.webservices.authorization.Authorization;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

public class HardDeleteDatabaseAction extends BimDatabaseAction<Boolean> {

    private final long poidToDelete;
    private Authorization authorization;
    private BerkeleyKeyValueStore keyValueStore;
    private CursorConfig cursorConfig;
    private BimServer bimServer;

    private static final Logger LOGGER = LoggerFactory.getLogger(HardDeleteDatabaseAction.class);

    private static final String REGISTRY_TABLE = "INT-Registry";
    private static final String CLASS_LOOKUP_TABLE = "INT-ClassLookup";
    private static final String STORE_PREFIX = "store_";
    private static final String LOG_PREFIX = "log_";
    private static final String STORE_PROJECT = "store_Project";
    private static final String ERR_MSG_PROJECT_NOT_EXIST = "Project does not exit.";
    public static final WriteOptions WriteOptions = new WriteOptions();

    public HardDeleteDatabaseAction(BimServer bimServer, DatabaseSession databaseSession, AccessMethod accessMethod, long poid, Authorization authorization) {
        super(databaseSession, accessMethod);
        this.poidToDelete = poid;
        this.authorization = authorization;
        this.keyValueStore = (BerkeleyKeyValueStore) ((Database) bimServer.getDatabase()).getKeyValueStore();
        this.cursorConfig = new CursorConfig();
        cursorConfig.setReadUncommitted(true);
        this.bimServer = bimServer;
        WriteOptions.setTTL(1);
    }

    @Override
    public Boolean execute() throws BimserverDatabaseException {

        try {
            LOGGER.info("Delete project " + poidToDelete + " starts.");
            long startTime = System.currentTimeMillis();

            Project project = getProjectWithRetry(poidToDelete);
            if (project == null) {
                LOGGER.error("Project not exists or exceeding retry times");
                throw new BimserverDatabaseException(ERR_MSG_PROJECT_NOT_EXIST);
            }

            // Auth may be needed in the future
            /*
            User actingUser = getUserByUoid(authorization.getUoid());
            if (actingUser.getUserType() == UserType.ADMIN || (actingUser.getHasRightsOn().contains(project) && bimServer.getServerSettingsCache().getServerSettings().isAllowUsersToCreateTopLevelProjects())) {
            */

            int pidToDelete = project.getId();
            byte[] startSearchingAt = BinUtils.intToByteArray(pidToDelete);

            deleteProjectInStoreProject(keyValueStore, poidToDelete);

            TableWrapper tableWrapper;
            Cursor cursor = null;
            int nbrDeleteRecords;

            for (String databaseName : keyValueStore.getAllTableNames()) {
                // We don't delete data in the metadata tables
                if (CLASS_LOOKUP_TABLE.equals(databaseName)
                        || REGISTRY_TABLE.equals(databaseName)
                        || databaseName.startsWith(STORE_PREFIX)
                        || databaseName.startsWith(LOG_PREFIX)) {
                    continue;
                }

                tableWrapper = keyValueStore.getTableWrapper(databaseName);
                nbrDeleteRecords = 0;

                try {
                    cursor = tableWrapper.getDatabase().openCursor(keyValueStore.getTransaction(getDatabaseSession(), tableWrapper), cursorConfig);
                    // Cache in this case is useless, it may lead to OutOfMemory error
                    cursor.setCacheMode(CacheMode.EVICT_BIN);
                    DatabaseEntry key = new DatabaseEntry(startSearchingAt);
                    DatabaseEntry value = new DatabaseEntry();
                    // Find the first matching record
                    if (cursor.getSearchKeyRange(key, value, LockMode.DEFAULT) == OperationStatus.SUCCESS) {
                        int pid = BinUtils.readInt(key.getData(), 0);
                        if (pid == pidToDelete) {

                            cursor.delete(WriteOptions);
                            nbrDeleteRecords++;
                        } else {
                            // pid not match, continue
                            continue;
                        }
                    } else {
                        // nothing found, continue
                        continue;
                    }

                    // As value of record is not needed, setting null can have a better performance
                    while (cursor.getNext(key, value, LockMode.DEFAULT) == OperationStatus.SUCCESS) {
                        int pid = BinUtils.readInt(key.getData(), 0);
                        if (pid == pidToDelete) {
                            cursor.delete(WriteOptions);
                            nbrDeleteRecords++;
                        } else {
                            // We have deleted all related records
                            break;
                        }
                    }

                    LOGGER.debug("Delete " + nbrDeleteRecords + " records in " + databaseName);
                } catch (DatabaseException e) {
                    throw new BimserverDatabaseException(e);
                } finally {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }
            keyValueStore.commit(getDatabaseSession());
            keyValueStore.sync();
            getDatabaseSession().close();

            LOGGER.info("Delete project " + this.poidToDelete + "  ends, it takes " + (System.currentTimeMillis() - startTime) + " ms.");
            return true;
        } catch (BimserverDatabaseException e) {
            LOGGER.error("BimserverDatabaseException in delete project physically", e);
            throw new BimserverDatabaseException(e);
        } catch (Exception e) {
            LOGGER.error("Unchecked exception in delete project physically", e);
            throw new BimserverDatabaseException(e);
        }
        /*
        } else {
            throw new UserException("No rights to delete this project");
        }
        */
    }

    private void deleteProjectInStoreProject(BerkeleyKeyValueStore keyValueStore, long poidToDelete) throws BimserverDatabaseException {
        TableWrapper tableWrapper = keyValueStore.getTableWrapper(STORE_PROJECT);
        Cursor cursor = null;

        try {
            cursor = tableWrapper.getDatabase().openCursor(keyValueStore.getTransaction(getDatabaseSession(), tableWrapper), cursorConfig);
            DatabaseEntry foundKey = new DatabaseEntry();

            while (cursor.getNext(foundKey, null, LockMode.DEFAULT) == OperationStatus.SUCCESS) {
                ByteBuffer buffer = ByteBuffer.wrap(foundKey.getData());
                long poid = buffer.getLong(4);
                if (poid == poidToDelete) {
                    cursor.delete(WriteOptions);
                }
            }
        } catch (DatabaseException e) {
            throw new BimserverDatabaseException(e);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    // called by LongDeleteAction, used in progress bar
    public Long getPoid() {
        return this.poidToDelete;
    }

    @Nullable
    private Project getProjectWithRetry(long poidToDelete) throws BimserverDatabaseException {
        Project result = null;
        boolean success = false;
        int nbrRetry = 0;

        // we retry max 10 times
        while (!success && nbrRetry < 10) {
            try {
                if (!success) {
                    // waiting time increases by retry times
                    TimeUnit.SECONDS.sleep(1 * nbrRetry);
                }
                result = getProjectByPoid(poidToDelete);
                success = true;
            } catch (LockTimeoutException e) {
                LOGGER.warn("LockTimeoutException happens when getProjectByPoid, waiting " + 1 * nbrRetry + " seconds to retry.");
                nbrRetry++;
            } catch (InterruptedException e) {
                LOGGER.error("Interrupted exception in retry of getProjectByPoid", e);
            }
        }

        return result;
    }
}