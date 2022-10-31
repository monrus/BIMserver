package org.bimserver.merging;

/******************************************************************************
 * Copyright (C) 2009-2019  BIMserver.org
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
 * along with this program.  If not, see {@literal<http://www.gnu.org/licenses/>}.
 *****************************************************************************/

import org.bimserver.emf.IdEObject;
import org.bimserver.emf.IfcModelInterface;
import org.bimserver.ifc.ReferenceCounter;
import org.bimserver.models.ifc4.IfcRoot;
import org.bimserver.models.store.Project;
import org.bimserver.plugins.IfcModelSet;
import org.bimserver.plugins.ModelHelper;
import org.bimserver.plugins.modelmerger.MergeException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.bimserver.ifc.ReferenceCounter.Reference;

import java.util.*;
import java.util.stream.Collectors;

public abstract class AbstractIntelligentModelMerger extends AbstractModelMerger {
	private final Logger LOGGER = LoggerFactory.getLogger(AbstractIntelligentModelMerger.class);
	private ReferenceCounter referenceCounter;
	private IfcModelInterface model;

	public abstract String getIdentifier(IdEObject idEObject);

	/*
	 * ifcModels MUST be ordered by date already
	 */
	public IfcModelInterface merge(Project project, IfcModelSet modelSet, ModelHelper modelHelper) throws MergeException {
		if (modelSet.size() == 1) {
			// Do no merging on only 1 model, same in - same out principle of
			// Leon :)
			return modelSet.iterator().next();
		}
		modelSet.sortByDate();
		model = mergeScales(project, modelSet, modelHelper);

		LOGGER.info("Intelligent merging");

		referenceCounter = new ReferenceCounter(model);
		referenceCounter.updateReferences();
		Map<String, List<IdEObject>> identifierMap = buildIdentifierMap();
		cleanIdentifierMap(identifierMap);		;
		LOGGER.info("Model size: " + model.size());
		return model;
	}

	private void removeObjects(Set<IdEObject> referencedObjectsToRemove) {
		List<Reference> allRefs = referenceCounter.getReferenceMap().values().stream().flatMap(Set::stream).collect(Collectors.toList());
		List<IdEObject> foundRefs = new ArrayList<>();
		for (IdEObject obj : referencedObjectsToRemove) {
			addToRemoveList(obj, foundRefs, allRefs);
		}
		referencedObjectsToRemove.addAll(foundRefs);
		referencedObjectsToRemove.forEach(o -> model.remove(o));
	}


	void addToRemoveList(IdEObject object, List<IdEObject> refList, List<Reference> allRefs) {
		List<Reference> refs = allRefs.stream().filter(r -> r.getIdEObject() == object).collect(Collectors.toList());
		if (refs == null)
			return;
		for (Reference reference : refs) {
			if (!(reference.getReferredObject() instanceof IfcRoot)
					&& !refList.contains(reference.getReferredObject())) {
				refList.add(reference.getReferredObject());
				addToRemoveList(reference.getReferredObject(), refList, allRefs);
			}
		}
	}

	private Map<String, List<IdEObject>> buildIdentifierMap() {
		Map<String, List<IdEObject>> map = new HashMap<>();
		for (IdEObject idEObject : model.getValues()) {
			if (idEObject instanceof IfcRoot) {
				IfcRoot ifcRoot = (IfcRoot) idEObject;
				String identifier = getIdentifier(idEObject);
				if (identifier != null) {
					if (map.containsKey(identifier)) {
						if (map.get(identifier).get(0).eClass() != ifcRoot.eClass()) {
							LOGGER.info("Not merging " + identifier + " because different types are found: " + map.get(identifier).get(0).eClass().getName() + " and "
									+ ifcRoot.eClass().getName());
						} else {
							if (model.contains(ifcRoot)) {
								map.get(identifier).add(ifcRoot);
							}
						}
					} else {
						if (model.contains(ifcRoot)) {
							List<IdEObject> list = new ArrayList<IdEObject>();
							list.add(ifcRoot);
							map.put(identifier, list);
						}
					}
				}
			}
		}
		return map;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void cleanIdentifierMap(Map<String, List<IdEObject>> identifierMap) {
		for (String identifier : identifierMap.keySet()) {
			List<IdEObject> list = identifierMap.get(identifier);
			if (list.size() > 1) {
				Set<IdEObject> referencedObjectsToRemove = new HashSet<>();
				IdEObject newestObject = list.get(list.size() - 1);
				// Change all attributes FROM this object
				for (EAttribute eAttribute : newestObject.eClass().getEAllAttributes()) {
					if (eAttribute.isMany()) {
						// Do not merge lists
					} else {
						if (!newestObject.eIsSet(eAttribute)) {
							for (int i = list.size() - 2; i >= 0; i--) {
								IdEObject olderObject = list.get(i);
								if (olderObject.eIsSet(eAttribute)) {
									newestObject.eSet(eAttribute, olderObject.eGet(eAttribute));
									break;
								}
							}
						}
					}
				}
				// Change all references FROM this object
				for (EReference eReference : newestObject.eClass().getEAllReferences()) {
					if (eReference.isMany()) {
						// This is strange, in some cases the list can be merged without problems, but we just play "safe" here
						if (!newestObject.eIsSet(eReference)) {
							List<?> l = (List<?>)newestObject.eGet(eReference);
							for (int i = list.size() - 2; i >= 0; i--) {
								IdEObject olderObject = list.get(i);
								if (olderObject.eIsSet(eReference)) {
									List a = (List) olderObject.eGet(eReference);
									l.addAll(a);
									for (Object o : a) {
										referenceCounter.addReference(new ReferenceCounter.MultiReference(newestObject, (IdEObject) o, eReference));
									}
									a.clear();
									break;
								}
							}
						} else {
							for (int i = list.size() - 2; i >= 0; i--) {
								IdEObject olderObject = list.get(i);
								if (olderObject.eIsSet(eReference)) {
									List a = (List) olderObject.eGet(eReference);
									referencedObjectsToRemove.addAll(a);
								}
							}
						}
					} else {
						if (!newestObject.eIsSet(eReference)) {
							for (int i = list.size() - 2; i >= 0; i--) {
								IdEObject olderObject = list.get(i);
								if (olderObject.eIsSet(eReference)) {
									newestObject.eSet(eReference, olderObject.eGet(eReference));
									referenceCounter.addReference(new ReferenceCounter.SingleReference(newestObject, (IdEObject) olderObject.eGet(eReference), eReference));
									break;
								}
							}
						} else {
							for (int i = list.size() - 2; i >= 0; i--) {
								IdEObject olderObject = list.get(i);
								if (olderObject.eIsSet(eReference)) {
									referencedObjectsToRemove.add((IdEObject) olderObject.eGet(eReference));
								}
							}
						}
					}
				}
				// Change all references TO this object
				for (IdEObject idEObject : list) {
					if (idEObject != newestObject) {
						removeReplaceLinks(newestObject, idEObject, referencedObjectsToRemove);
						//removeObjects(referencedObjectsToRemove);
					}
				}
			}
		}
	}

	private void removeReplaceLinks(IdEObject mainObject, IdEObject objectToRemove, Set<IdEObject> objectsToRemove) {
		if (mainObject.eClass() != objectToRemove.eClass()) {
			throw new RuntimeException("Classes must be the same");
		}
		Set<Reference> referencesTo = referenceCounter.getReferencesTo(objectToRemove);
		if (referencesTo != null) {
			Iterator<Reference> referenceIterator = referencesTo.iterator();
			Set<Reference> newReferences = new HashSet<Reference>();
			while (referenceIterator.hasNext()) {
				Reference reference = referenceIterator.next();
				if (!objectsToRemove.contains(reference.getIdEObject()))
					newReferences.add(reference.reAttach(mainObject));
				else
					reference.reAttach(null);
				referenceIterator.remove();
			}
			for (Reference reference : newReferences) {
				referenceCounter.addReference(reference);
			}
		}
//		LOGGER.info("Removing " + objectToRemove);
		referenceCounter.remove(objectToRemove);
		model.remove(objectToRemove);
	}
}
