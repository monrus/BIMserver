/**
 * Copyright (C) 2009-2014 BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package store;

import java.util.Date;

import org.bimserver.emf.IdEObject;

import org.bimserver.models.log.ProjectRelated;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link store.Project#getId <em>Id</em>}</li>
 *   <li>{@link store.Project#getName <em>Name</em>}</li>
 *   <li>{@link store.Project#getHasAuthorizedUsers <em>Has Authorized Users</em>}</li>
 *   <li>{@link store.Project#getConcreteRevisions <em>Concrete Revisions</em>}</li>
 *   <li>{@link store.Project#getRevisions <em>Revisions</em>}</li>
 *   <li>{@link store.Project#getLastConcreteRevision <em>Last Concrete Revision</em>}</li>
 *   <li>{@link store.Project#getLastRevision <em>Last Revision</em>}</li>
 *   <li>{@link store.Project#getCheckouts <em>Checkouts</em>}</li>
 *   <li>{@link store.Project#getState <em>State</em>}</li>
 *   <li>{@link store.Project#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link store.Project#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link store.Project#getGeoTag <em>Geo Tag</em>}</li>
 *   <li>{@link store.Project#getSubProjects <em>Sub Projects</em>}</li>
 *   <li>{@link store.Project#getParent <em>Parent</em>}</li>
 *   <li>{@link store.Project#getDescription <em>Description</em>}</li>
 *   <li>{@link store.Project#getExportLengthMeasurePrefix <em>Export Length Measure Prefix</em>}</li>
 *   <li>{@link store.Project#getExtendedData <em>Extended Data</em>}</li>
 *   <li>{@link store.Project#getServices <em>Services</em>}</li>
 *   <li>{@link store.Project#getLogs <em>Logs</em>}</li>
 *   <li>{@link store.Project#getModelCheckers <em>Model Checkers</em>}</li>
 *   <li>{@link store.Project#getSchema <em>Schema</em>}</li>
 *   <li>{@link store.Project#isSendEmailOnNewRevision <em>Send Email On New Revision</em>}</li>
 *   <li>{@link store.Project#getNewServices <em>New Services</em>}</li>
 *   <li>{@link store.Project#getCheckinInProgress <em>Checkin In Progress</em>}</li>
 * </ul>
 *
 * @see store.StorePackage#getProject()
 * @model
 * @extends IdEObject
 * @generated
 */
public interface Project extends IdEObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Integer)
	 * @see store.StorePackage#getProject_Id()
	 * @model annotation="singleindex"
	 * @generated
	 */
	Integer getId();

	/**
	 * Sets the value of the '{@link store.Project#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Integer value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see store.StorePackage#getProject_Name()
	 * @model annotation="singleindex"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link store.Project#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Authorized Users</b></em>' reference list.
	 * The list contents are of type {@link store.User}.
	 * It is bidirectional and its opposite is '{@link store.User#getHasRightsOn <em>Has Rights On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Authorized Users</em>' reference list.
	 * @see store.StorePackage#getProject_HasAuthorizedUsers()
	 * @see store.User#getHasRightsOn
	 * @model opposite="hasRightsOn"
	 * @generated
	 */
	EList<User> getHasAuthorizedUsers();

	/**
	 * Returns the value of the '<em><b>Concrete Revisions</b></em>' reference list.
	 * The list contents are of type {@link store.ConcreteRevision}.
	 * It is bidirectional and its opposite is '{@link store.ConcreteRevision#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Revisions</em>' reference list.
	 * @see store.StorePackage#getProject_ConcreteRevisions()
	 * @see store.ConcreteRevision#getProject
	 * @model opposite="project"
	 * @generated
	 */
	EList<ConcreteRevision> getConcreteRevisions();

	/**
	 * Returns the value of the '<em><b>Revisions</b></em>' reference list.
	 * The list contents are of type {@link store.Revision}.
	 * It is bidirectional and its opposite is '{@link store.Revision#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revisions</em>' reference list.
	 * @see store.StorePackage#getProject_Revisions()
	 * @see store.Revision#getProject
	 * @model opposite="project"
	 * @generated
	 */
	EList<Revision> getRevisions();

	/**
	 * Returns the value of the '<em><b>Last Concrete Revision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Concrete Revision</em>' reference.
	 * @see #setLastConcreteRevision(ConcreteRevision)
	 * @see store.StorePackage#getProject_LastConcreteRevision()
	 * @model
	 * @generated
	 */
	ConcreteRevision getLastConcreteRevision();

	/**
	 * Sets the value of the '{@link store.Project#getLastConcreteRevision <em>Last Concrete Revision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Concrete Revision</em>' reference.
	 * @see #getLastConcreteRevision()
	 * @generated
	 */
	void setLastConcreteRevision(ConcreteRevision value);

	/**
	 * Returns the value of the '<em><b>Last Revision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Revision</em>' reference.
	 * @see #setLastRevision(Revision)
	 * @see store.StorePackage#getProject_LastRevision()
	 * @model
	 * @generated
	 */
	Revision getLastRevision();

	/**
	 * Sets the value of the '{@link store.Project#getLastRevision <em>Last Revision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Revision</em>' reference.
	 * @see #getLastRevision()
	 * @generated
	 */
	void setLastRevision(Revision value);

	/**
	 * Returns the value of the '<em><b>Checkouts</b></em>' reference list.
	 * The list contents are of type {@link store.Checkout}.
	 * It is bidirectional and its opposite is '{@link store.Checkout#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checkouts</em>' reference list.
	 * @see store.StorePackage#getProject_Checkouts()
	 * @see store.Checkout#getProject
	 * @model opposite="project"
	 * @generated
	 */
	EList<Checkout> getCheckouts();

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link store.ObjectState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see store.ObjectState
	 * @see #setState(ObjectState)
	 * @see store.StorePackage#getProject_State()
	 * @model
	 * @generated
	 */
	ObjectState getState();

	/**
	 * Sets the value of the '{@link store.Project#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see store.ObjectState
	 * @see #getState()
	 * @generated
	 */
	void setState(ObjectState value);

	/**
	 * Returns the value of the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Date</em>' attribute.
	 * @see #setCreatedDate(Date)
	 * @see store.StorePackage#getProject_CreatedDate()
	 * @model
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link store.Project#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By</em>' reference.
	 * @see #setCreatedBy(User)
	 * @see store.StorePackage#getProject_CreatedBy()
	 * @model
	 * @generated
	 */
	User getCreatedBy();

	/**
	 * Sets the value of the '{@link store.Project#getCreatedBy <em>Created By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By</em>' reference.
	 * @see #getCreatedBy()
	 * @generated
	 */
	void setCreatedBy(User value);

	/**
	 * Returns the value of the '<em><b>Geo Tag</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link store.GeoTag#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Tag</em>' reference.
	 * @see #setGeoTag(GeoTag)
	 * @see store.StorePackage#getProject_GeoTag()
	 * @see store.GeoTag#getProjects
	 * @model opposite="projects"
	 * @generated
	 */
	GeoTag getGeoTag();

	/**
	 * Sets the value of the '{@link store.Project#getGeoTag <em>Geo Tag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Tag</em>' reference.
	 * @see #getGeoTag()
	 * @generated
	 */
	void setGeoTag(GeoTag value);

	/**
	 * Returns the value of the '<em><b>Sub Projects</b></em>' reference list.
	 * The list contents are of type {@link store.Project}.
	 * It is bidirectional and its opposite is '{@link store.Project#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Projects</em>' reference list.
	 * @see store.StorePackage#getProject_SubProjects()
	 * @see store.Project#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<Project> getSubProjects();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link store.Project#getSubProjects <em>Sub Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Project)
	 * @see store.StorePackage#getProject_Parent()
	 * @see store.Project#getSubProjects
	 * @model opposite="subProjects"
	 * @generated
	 */
	Project getParent();

	/**
	 * Sets the value of the '{@link store.Project#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Project value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see store.StorePackage#getProject_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link store.Project#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Export Length Measure Prefix</b></em>' attribute.
	 * The literals are from the enumeration {@link store.SIPrefix}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Export Length Measure Prefix</em>' attribute.
	 * @see store.SIPrefix
	 * @see #setExportLengthMeasurePrefix(SIPrefix)
	 * @see store.StorePackage#getProject_ExportLengthMeasurePrefix()
	 * @model
	 * @generated
	 */
	SIPrefix getExportLengthMeasurePrefix();

	/**
	 * Sets the value of the '{@link store.Project#getExportLengthMeasurePrefix <em>Export Length Measure Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Export Length Measure Prefix</em>' attribute.
	 * @see store.SIPrefix
	 * @see #getExportLengthMeasurePrefix()
	 * @generated
	 */
	void setExportLengthMeasurePrefix(SIPrefix value);

	/**
	 * Returns the value of the '<em><b>Extended Data</b></em>' reference list.
	 * The list contents are of type {@link store.ExtendedData}.
	 * It is bidirectional and its opposite is '{@link store.ExtendedData#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Data</em>' reference list.
	 * @see store.StorePackage#getProject_ExtendedData()
	 * @see store.ExtendedData#getProject
	 * @model opposite="project"
	 * @generated
	 */
	EList<ExtendedData> getExtendedData();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link store.Service}.
	 * It is bidirectional and its opposite is '{@link store.Service#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see store.StorePackage#getProject_Services()
	 * @see store.Service#getProject
	 * @model opposite="project"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Logs</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.log.ProjectRelated}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.log.ProjectRelated#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logs</em>' reference list.
	 * @see store.StorePackage#getProject_Logs()
	 * @see org.bimserver.models.log.ProjectRelated#getProject
	 * @model opposite="project"
	 * @generated
	 */
	EList<ProjectRelated> getLogs();

	/**
	 * Returns the value of the '<em><b>Model Checkers</b></em>' reference list.
	 * The list contents are of type {@link store.ModelCheckerInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Checkers</em>' reference list.
	 * @see store.StorePackage#getProject_ModelCheckers()
	 * @model
	 * @generated
	 */
	EList<ModelCheckerInstance> getModelCheckers();

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' attribute.
	 * @see #setSchema(String)
	 * @see store.StorePackage#getProject_Schema()
	 * @model
	 * @generated
	 */
	String getSchema();

	/**
	 * Sets the value of the '{@link store.Project#getSchema <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' attribute.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(String value);

	/**
	 * Returns the value of the '<em><b>Send Email On New Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Email On New Revision</em>' attribute.
	 * @see #setSendEmailOnNewRevision(boolean)
	 * @see store.StorePackage#getProject_SendEmailOnNewRevision()
	 * @model
	 * @generated
	 */
	boolean isSendEmailOnNewRevision();

	/**
	 * Sets the value of the '{@link store.Project#isSendEmailOnNewRevision <em>Send Email On New Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Email On New Revision</em>' attribute.
	 * @see #isSendEmailOnNewRevision()
	 * @generated
	 */
	void setSendEmailOnNewRevision(boolean value);

	/**
	 * Returns the value of the '<em><b>New Services</b></em>' reference list.
	 * The list contents are of type {@link store.NewService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Services</em>' reference list.
	 * @see store.StorePackage#getProject_NewServices()
	 * @model
	 * @generated
	 */
	EList<NewService> getNewServices();

	/**
	 * Returns the value of the '<em><b>Checkin In Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checkin In Progress</em>' attribute.
	 * @see #setCheckinInProgress(long)
	 * @see store.StorePackage#getProject_CheckinInProgress()
	 * @model
	 * @generated
	 */
	long getCheckinInProgress();

	/**
	 * Sets the value of the '{@link store.Project#getCheckinInProgress <em>Checkin In Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checkin In Progress</em>' attribute.
	 * @see #getCheckinInProgress()
	 * @generated
	 */
	void setCheckinInProgress(long value);

} // Project
