package org.bimserver.ifc;

/******************************************************************************
 * Copyright (C) 2009-2013  BIMserver.org
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
 *****************************************************************************/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.LinkedBlockingQueue;

import org.bimserver.emf.IdEObject;
import org.bimserver.emf.IdEObjectImpl;
import org.bimserver.emf.IfcModelInterface;
import org.bimserver.emf.IfcModelInterfaceException;
import org.bimserver.emf.ModelMetaData;
import org.bimserver.emf.OidProvider;
import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcRoot;
import org.bimserver.models.store.StorePackage;
import org.bimserver.plugins.objectidms.ObjectIDM;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class IfcModel implements IfcModelInterface {

	private static final BiMap<EClass, Class<?>> eClassClassMap = initEClassClassMap();

	private final ModelMetaData modelMetaData = new ModelMetaData();
	private BiMap<Long, IdEObject> objects;
	private IdEObject eObject;
	private final Set<IfcModelChangeListener> changeListeners = new LinkedHashSet<IfcModelChangeListener>();

	private Map<String, IfcRoot> guidIndexed;
	private Map<EClass, List<? extends EObject>> index;
	private Map<EClass, List<? extends EObject>> indexWithSubTypes;
	private Map<EClass, Map<String, IdEObject>> guidIndex;
	private Map<EClass, Map<String, IdEObject>> nameIndex;
	private long oidCounter = 1;
	private boolean useDoubleStrings = true;

	public IfcModel(BiMap<Long, IdEObject> objects) {
		this.objects = objects;
	}

	private static BiMap<EClass, Class<?>> initEClassClassMap() {
		BiMap<EClass, Class<?>> eClassClassMap = HashBiMap.create();
		for (EPackage ePackage : new EPackage[] { Ifc2x3tc1Package.eINSTANCE, StorePackage.eINSTANCE }) {
			for (EClassifier eClassifier : ePackage.getEClassifiers()) {
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass) eClassifier;
					eClassClassMap.put(eClass, eClass.getInstanceClass());
				}
			}
		}
		return eClassClassMap;
	}

	public IfcModel() {
		this.objects = HashBiMap.create();
	}

	public IfcModel(int size) {
		this.objects = HashBiMap.create(size);
	}

	@SuppressWarnings("unchecked")
	private void buildIndex() {
		index = new HashMap<EClass, List<? extends EObject>>();
		for (EClass eClass : eClassClassMap.keySet()) {
			index.put((EClass) eClass, new ArrayList<EObject>());
		}
		for (Long key : objects.keySet()) {
			EObject value = objects.get((Long) key);
			if (value != null) {
				((List<EObject>) index.get(value.eClass())).add(value);
			}
		}
	}

	private void buildIndexWithSubTypes() {
		indexWithSubTypes = new HashMap<EClass, List<? extends EObject>>();
		for (EClass eClass : eClassClassMap.keySet()) {
			indexWithSubTypes.put((EClass) eClass, new ArrayList<EObject>());
		}
		for (Long key : objects.keySet()) {
			IdEObject idEObject = objects.get(key);
			if (idEObject != null) {
				buildIndexWithSuperTypes(idEObject, idEObject.eClass());
			}
		}
	}

	@SuppressWarnings("unchecked")
	private void buildIndexWithSuperTypes(IdEObject eObject, EClass eClass) {
		((List<EObject>) indexWithSubTypes.get(eClass)).add(eObject);
		for (EClass superClass : eClass.getESuperTypes()) {
			buildIndexWithSuperTypes(eObject, superClass);
		}
	}

	public void buildGuidIndex() {
		guidIndex = new HashMap<EClass, Map<String, IdEObject>>();
		if (objects.isEmpty()) {
			return;
		}
		for (EClassifier classifier : objects.values().iterator().next().eClass().getEPackage().getEClassifiers()) {
			if (classifier instanceof EClass) {
				Map<String, IdEObject> map = new TreeMap<String, IdEObject>();
				guidIndex.put((EClass) classifier, map);
			}
		}
		for (Long key : objects.keySet()) {
			IdEObject value = objects.get((Long) key);
			if (value instanceof IfcRoot) {
				IfcRoot ifcRoot = (IfcRoot) value;
				guidIndex.get(value.eClass()).put(ifcRoot.getGlobalId(), value);
			}
		}
	}

	public void buildNameIndex() {
		nameIndex = new HashMap<EClass, Map<String, IdEObject>>();
		for (EClassifier classifier : objects.values().iterator().next().eClass().getEPackage().getEClassifiers()) {
			if (classifier instanceof EClass) {
				Map<String, IdEObject> map = new TreeMap<String, IdEObject>();
				nameIndex.put((EClass) classifier, map);
			}
		}
		for (Long key : objects.keySet()) {
			IdEObject value = objects.get((Long) key);
			if (value instanceof IfcRoot) {
				IfcRoot ifcRoot = (IfcRoot) value;
				if (ifcRoot.getName() != null) {
					nameIndex.get(value.eClass()).put(ifcRoot.getName(), value);
				}
			}
		}
	}

	@SuppressWarnings("unchecked")
	public void sortAllAggregates(ObjectIDM objectIDM, IfcRoot ifcRoot) {
		for (EStructuralFeature eStructuralFeature : ifcRoot.eClass().getEAllStructuralFeatures()) {
			if (objectIDM.shouldFollowReference(ifcRoot.eClass(), ifcRoot.eClass(), eStructuralFeature)) {
				if (eStructuralFeature.getUpperBound() == -1 || eStructuralFeature.getUpperBound() > 1) {
					if (eStructuralFeature.getEType() instanceof EClass) {
						if (eStructuralFeature.getEType().getEAnnotation("wrapped") != null) {
							EList<EObject> list = (EList<EObject>) ifcRoot.eGet(eStructuralFeature);
							sortPrimitiveList(list);
						} else {
							EList<EObject> list = (EList<EObject>) ifcRoot.eGet(eStructuralFeature);
							sortComplexList(objectIDM, ifcRoot.eClass(), list, eStructuralFeature);
						}
					}
				}
			}
		}
	}

	private void sortPrimitiveList(EList<EObject> list) {
		ECollections.sort(list, new Comparator<EObject>() {
			@Override
			public int compare(EObject o1, EObject o2) {
				return comparePrimitives(o1, o2);
			}
		});
	}

	private void sortComplexList(final ObjectIDM objectIDM, final EClass originalQueryClass, EList<EObject> list, EStructuralFeature eStructuralFeature) {
		final EClass type = (EClass) eStructuralFeature.getEType();
		ECollections.sort(list, new Comparator<EObject>() {
			@Override
			public int compare(EObject o1, EObject o2) {
				int i = 1;
				for (EStructuralFeature eStructuralFeature : type.getEAllStructuralFeatures()) {
					if (objectIDM.shouldFollowReference(originalQueryClass, type, eStructuralFeature)) {
						Object val1 = o1.eGet(eStructuralFeature);
						Object val2 = o2.eGet(eStructuralFeature);
						if (val1 != null && val2 != null) {
							if (eStructuralFeature.getEType() instanceof EClass) {
								if (eStructuralFeature.getEType().getEAnnotation("wrapped") != null) {
									int compare = comparePrimitives((EObject) val1, (EObject) val2);
									if (compare != 0) {
										return compare * i;
									}
								}
							}
						}
						i++;
					}
				}
				return 0;
			}
		});
	}

	private int comparePrimitives(EObject o1, EObject o2) {
		EClass eClass = o1.eClass();
		EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature("wrappedValue");
		Object val1 = o1.eGet(eStructuralFeature);
		Object val2 = o2.eGet(eStructuralFeature);
		if (eStructuralFeature.getEType() == EcorePackage.eINSTANCE.getEString()) {
			return ((String) val1).compareTo((String) val2);
		} else if (eStructuralFeature.getEType() == EcorePackage.eINSTANCE.getEInt()) {
			return ((Integer) val1).compareTo((Integer) val2);
		} else {
			throw new RuntimeException("ni");
		}
	}

	@SuppressWarnings("unchecked")
	public <T extends EObject> List<T> getAll(EClass eClass) {
		if (index == null) {
			buildIndex();
		}
		List<? extends EObject> list = index.get(eClass);
		if (list == null) {
			return Collections.EMPTY_LIST;
		} else {
			return (List<T>) list;
		}
	}

	public <T extends EObject> List<T> getAll(Class<T> interfaceClass) {
		return getAll(eClassClassMap.inverse().get(interfaceClass));
	}

	@SuppressWarnings("unchecked")
	public <T extends EObject> List<T> getAllWithSubTypes(EClass eClass) {
		if (indexWithSubTypes == null) {
			buildIndexWithSubTypes();
		}
		List<? extends EObject> list = indexWithSubTypes.get(eClass);
		if (list == null) {
			return Collections.EMPTY_LIST;
		} else {
			return (List<T>) list;
		}
	}

	@Override
	public <T extends EObject> List<T> getAllWithSubTypes(Class<T> interfaceClass)  {
		return getAllWithSubTypes(eClassClassMap.inverse().get(interfaceClass));
	}

	public Set<String> getGuids(EClass eClass) {
		if (guidIndex == null) {
			buildGuidIndex();
		}
		Map<String, IdEObject> map = guidIndex.get(eClass);
		if (map == null) {
			return new HashSet<String>();
		}
		return map.keySet();
	}

	public Set<String> getNames(EClass eClass) {
		if (nameIndex == null) {
			buildNameIndex();
		}
		return nameIndex.get(eClass).keySet();
	}

	public IdEObject getByName(EClass eClass, String name) {
		if (nameIndex == null) {
			buildNameIndex();
		}
		return nameIndex.get(eClass).get(name);
	}

	public long size() {
		return objects.size();
	}

	public Set<Long> keySet() {
		return objects.keySet();
	}

	public IdEObject get(long oid) {
		return objects.get(oid);
	}

	public Collection<IdEObject> getValues() {
		return objects.values();
	}

	public long add(IdEObject eObject) throws IfcModelInterfaceException {
		long oid = oidCounter++;
		((IdEObjectImpl) eObject).setOid(oid);
		((IdEObjectImpl) eObject).setModel(this);
		add(oid, eObject, false, false);
		return oid;
	}

	public void add(long key, IdEObject eObject) throws IfcModelInterfaceException {
		add(key, eObject, false, false);
	}

	@Override
	public void addAllowMultiModel(long oid, IdEObject eObject) throws IfcModelInterfaceException {
		add(oid, eObject, false, true);
	}

	public void add(Long key, IdEObject eObject, boolean ignoreDuplicateOids, boolean allowMultiModel) throws IfcModelInterfaceException {
		if (((IdEObjectImpl) eObject).hasModel() && !allowMultiModel) {
			throw new IfcModelInterfaceException("This object (" + eObject + ") already belongs to a Model: " + ((IdEObjectImpl) eObject).getModel());
		}
		if (objects.containsKey(key)) {
			if (!ignoreDuplicateOids) {
				throw new IfcModelInterfaceException("Oid already stored: " + key + " " + eObject + " (old: " + objects.get(key));
			}
		} else {
			objects.put(key, eObject);
			if (!((IdEObjectImpl) eObject).hasModel() || !allowMultiModel) {
				((IdEObjectImpl) eObject).setModel(this);
			}
			if (guidIndexed != null) {
				indexGuid(eObject);
			}
		}
		if (!changeListeners.isEmpty()) {
			for (IfcModelChangeListener ifcModelChangeListener : changeListeners) {
				ifcModelChangeListener.objectAdded();
			}
		}
	}

	public BiMap<Long, IdEObject> getObjects() {
		return (BiMap<Long, IdEObject>) objects;
	}

	public boolean contains(long oid) {
		return objects.containsKey(oid);
	}

	public IdEObject getMainObject() {
		return eObject;
	}

	public void setMainObject(IdEObject eObject) {
		this.eObject = eObject;
	}

	public boolean contains(IdEObject eObject) {
		return objects.containsValue(eObject);
	}

	public void indexGuids() {
		guidIndexed = new HashMap<String, IfcRoot>();
		for (IdEObject idEObject : objects.values()) {
			indexGuid(idEObject);
		}
	}

	private void indexGuid(IdEObject idEObject) {
		if (idEObject instanceof IfcRoot) {
			IfcRoot ifcRoot = (IfcRoot) idEObject;
			if (ifcRoot.getGlobalId() != null) {
				guidIndexed.put(ifcRoot.getGlobalId(), ifcRoot);
			}
		}
	}

	public boolean isValid() {
		return true;
	}

	public void dumpObject(IdEObject idEObject) {
		dumpObject(idEObject, 0, new HashSet<IdEObject>());
	}

	@SuppressWarnings("rawtypes")
	private void dumpObject(IdEObject idEObject, int indention, Set<IdEObject> printed) {
		if (printed.contains(idEObject)) {
			printIndention(indention);
			System.out.println("[REFERENCE: " + idEObject.getOid() + "]");
			return;
		}
		printed.add(idEObject);
		printIndention(indention);
		System.out.println(idEObject.eClass().getName() + " (" + idEObject.getOid() + ")");
		for (EAttribute eAttribute : idEObject.eClass().getEAllAttributes()) {
			Object val = idEObject.eGet(eAttribute);
			if (val != null) {
				printIndention(indention + 1);
				System.out.println(eAttribute.getName() + ": " + val);
			}
		}
		for (EReference eReference : idEObject.eClass().getEAllReferences()) {
			Object referencedObject = idEObject.eGet(eReference);
			if (eReference.isMany()) {
				List list = (List) referencedObject;
				if (list.size() > 0) {
					printIndention(indention + 1);
					System.out.println(eReference.getName() + ": ");
					for (Object o : list) {
						dumpObject((IdEObject) o, indention + 2, printed);
					}
				}
			} else {
				if (referencedObject != null) {
					printIndention(indention + 1);
					System.out.println(eReference.getName() + ": ");
					dumpObject((IdEObject) referencedObject, indention + 2, printed);
				}
			}
		}
	}

	private void printIndention(int indention) {
		for (int i = 0; i < indention; i++) {
			System.out.print("  ");
		}
	}

	public void dumpSummary() {
		Map<EClass, Integer> counts = new TreeMap<EClass, Integer>(new Comparator<EClass>() {
			@Override
			public int compare(EClass o1, EClass o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		for (IdEObject idEObject : objects.values()) {
			if (!counts.containsKey(idEObject.eClass())) {
				counts.put(idEObject.eClass(), 1);
			} else {
				counts.put(idEObject.eClass(), counts.get(idEObject.eClass()) + 1);
			}
		}
		for (EClass eClass : counts.keySet()) {
			System.out.println(eClass.getName() + ": " + counts.get(eClass));
		}
	}

	public void dump() {
		System.out.println("Dumping IFC Model");
		for (Long key : objects.keySet()) {
			System.out.println(key + ": " + objects.get(key).eClass().getName());
		}
	}

	public void dumpPlusReferences() {
		System.out.println("Dumping IFC Model + References");
		Set<IdEObject> done = new HashSet<IdEObject>();
		for (Long key : objects.keySet()) {
			dumpPlusReferences(done, objects.get(key));
		}
	}

	@SuppressWarnings("rawtypes")
	private void dumpPlusReferences(Set<IdEObject> done, IdEObject idEObject) {
		if (idEObject == null) {
			return;
		}
		if (done.contains(idEObject)) {
			return;
		}
		done.add(idEObject);
		System.out.println(idEObject.getOid() + ": " + idEObject.eClass().getName());
		for (EReference eReference : idEObject.eClass().getEAllReferences()) {
			Object val = idEObject.eGet(eReference);
			if (eReference.isMany()) {
				List list = (List) val;
				for (Object o : list) {
					dumpPlusReferences(done, (IdEObject) o);
				}
			} else {
				dumpPlusReferences(done, (IdEObject) val);
			}
		}
	}

	public void remove(IdEObject idEObject) {
		objects.inverse().remove(idEObject);
	}

	public void setOid(IdEObject object, Long oid) {
		objects.forcePut(oid, object);
	}

	public void fixOids(OidProvider<Long> oidProvider) {
		BiMap<Long, IdEObject> temp = HashBiMap.create();
		for (long oid : objects.keySet()) {
			fixOids(objects.get(oid), oidProvider, temp);
		}
		objects = temp;
	}

	public void fixOids() {
		BiMap<Long, IdEObject> temp = HashBiMap.create();
		for (IdEObject object : objects.values()) {
			temp.put(object.getOid(), object);
		}
		objects = temp;
	}
	
	@SuppressWarnings("rawtypes")
	private void fixOids(IdEObject idEObject, OidProvider<Long> oidProvider, BiMap<Long, IdEObject> temp) {
		if (idEObject == null) {
			return;
		}
		if (temp.containsValue(idEObject)) {
			return;
		}
		((IdEObjectImpl) idEObject).setOid(oidProvider.newOid(idEObject.eClass()));
		if (objects.containsValue(idEObject)) {
			temp.put(idEObject.getOid(), idEObject);
		}
		for (EReference eReference : idEObject.eClass().getEAllReferences()) {
			Object val = idEObject.eGet(eReference);
			if (eReference.isMany()) {
				List list = (List) val;
				for (Object o : list) {
					fixOids((IdEObject) o, oidProvider, temp);
				}
			} else {
				fixOids((IdEObject) val, oidProvider, temp);
			}
		}
	}

	public void setObjectOids() {
		for (long oid : objects.keySet()) {
			((IdEObjectImpl) objects.get(oid)).setOid(oid);
		}
	}

	public long getHighestOid() {
		long max = 0;
		for (long oid : objects.keySet()) {
			if (oid > max) {
				max = oid;
			}
		}
		return max;
	}

	public void changeOid(IdEObject object) {
		objects.inverse().remove(object);
		objects.put(object.getOid(), object);
	}
	
	public IfcRoot getByGuid(String guid) {
		if (guidIndexed == null) {
			indexGuids();
		}
		return guidIndexed.get(guid);
	}

	public boolean containsGuid(String guid) {
		if (guidIndexed == null) {
			indexGuids();
		}
		return guidIndexed.containsKey(guid);
	}

	public void checkDoubleOids() {
		Set<Long> oids = new HashSet<Long>();
		for (IdEObject idEObject : objects.values()) {
			if (oids.contains(idEObject.getOid())) {
				throw new RuntimeException("Double oid: " + idEObject.getOid());
			}
			oids.add(idEObject.getOid());
		}
	}

	public void fixOidCounter() {
		oidCounter = getHighestOid() + 1;
	}

	@SuppressWarnings("rawtypes")
	private void checkDoubleOidsPlusReferences(BiMap<IdEObject, Long> done, IdEObject idEObject) {
		if (idEObject == null) {
			return;
		}
		if (idEObject.eClass().getEAnnotation("wrapped") != null) {
			return;
		}
		if (done.containsKey(idEObject)) {
			return;
		}
		if (done.containsValue(idEObject.getOid())) {
			showBackReferences(idEObject);
			IdEObject existing = done.inverse().get(idEObject.getOid());
			showBackReferences(existing);
			throw new RuntimeException("Double oid: " + idEObject.getOid() + " " + idEObject + ", " + existing);
		}
		done.put(idEObject, idEObject.getOid());
		for (EReference eReference : idEObject.eClass().getEAllReferences()) {
			if (eReference.isMany()) {
				List list = (List) idEObject.eGet(eReference);
				for (Object o : list) {
					checkDoubleOidsPlusReferences(done, (IdEObject) o);
				}
			} else {
				checkDoubleOidsPlusReferences(done, (IdEObject) idEObject.eGet(eReference));
			}
		}
	}

	@SuppressWarnings("rawtypes")
	public void showBackReferences(IdEObject idEObject) {
		System.out.println("Showing back references to: " + idEObject);
		for (IdEObject object : getValues()) {
			for (EReference eReference : object.eClass().getEAllReferences()) {
				if (eReference.isMany()) {
					List list = (List) object.eGet(eReference);
					for (Object o : list) {
						if (o == idEObject) {
							System.out.println(object.eClass().getName() + "." + eReference.getName() + " " + object);
						}
					}
				} else {
					Object o = object.eGet(eReference);
					if (o == idEObject) {
						System.out.println(object.eClass().getName() + "." + eReference.getName() + " " + object);
					}
				}
			}
		}
	}

	public void checkDoubleOidsPlusReferences() {
		BiMap<IdEObject, Long> done = HashBiMap.create();
		for (IdEObject idEObject : objects.values()) {
			checkDoubleOidsPlusReferences(done, idEObject);
		}
	}

	public void resetOidsFlat() {
		for (IdEObject idEObject : objects.values()) {
			((IdEObjectImpl) idEObject).setOid(-1);
		}
	}

	public void resetOids() {
		Set<IdEObject> done = new HashSet<IdEObject>();
		for (IdEObject idEObject : objects.values()) {
			resetOids(idEObject, done);
		}
	}

	@SuppressWarnings("rawtypes")
	public void resetOids(IdEObject idEObject, Set<IdEObject> done) {
		if (idEObject == null) {
			return;
		}
		if (done.contains(idEObject)) {
			return;
		}
		((IdEObjectImpl) idEObject).setOid(-1);
		done.add(idEObject);
		for (EReference eReference : idEObject.eClass().getEAllReferences()) {
			Object val = idEObject.eGet(eReference);
			if (eReference.isMany()) {
				List list = (List) val;
				for (Object o : list) {
					resetOids((IdEObject) o, done);
				}
			} else {
				resetOids((IdEObject) val, done);
			}
		}
	}

	public void addChangeListener(IfcModelChangeListener listener) {
		changeListeners.add(listener);
	}

	@Override
	public void setUseDoubleStrings(boolean useDoubleStrings) {
		this.useDoubleStrings = useDoubleStrings;
	}

	public boolean isUseDoubleStrings() {
		return useDoubleStrings;
	}

	@Override
	public Iterator<IdEObject> iterator() {
		return objects.values().iterator();
	}

	@Override
	public int count(EClass eClass) {
		List<EObject> list = getAll(eClass);
		if (list == null) {
			return 0;
		}
		return list.size();
	}
	
	public Iterator<IdEObject> iterateAllObjects() {
		return new Iterator<IdEObject>() {
			private final Queue<IdEObject> todo = new LinkedBlockingQueue<IdEObject>(getValues());
			private final Set<IdEObject> done = new HashSet<IdEObject>();
			
			@Override
			public boolean hasNext() {
				return !todo.isEmpty();
			}

			@SuppressWarnings("rawtypes")
			@Override
			public IdEObject next() {
				IdEObject idEObject = todo.poll();
				done.add(idEObject);
				for (EReference eReference : idEObject.eClass().getEAllReferences()) {
					Object val = idEObject.eGet(eReference);
					if (eReference.isMany()) {
						List list = (List) val;
						for (Object o : list) {
							if (!done.contains(o)) {
								todo.add((IdEObject) o);
							}
						}
					} else {
						if (val != null && !done.contains(val)) {
							todo.add((IdEObject) val);
						}
					}
				}
				return idEObject;
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
	
	@Override
	public void generateMinimalExpressIds() {
		int expressId = 1;
		Iterator<IdEObject> iterateAllObjects = iterateAllObjects();
		while (iterateAllObjects.hasNext()) {
			IdEObject idEObject = iterateAllObjects.next();
			((IdEObjectImpl)idEObject).setExpressId(expressId++);
		}
	}

	@Override
	public ModelMetaData getModelMetaData() {
		return modelMetaData ;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends IdEObject> T create(EClass eClass) throws IfcModelInterfaceException {
		IdEObject object = (IdEObject) eClass.getEPackage().getEFactoryInstance().create(eClass);
		add(object);
		return (T) object;
	}
}