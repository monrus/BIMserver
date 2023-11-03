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
package org.bimserver.models.ifc4x3.impl;

import org.bimserver.models.ifc4x3.Ifc4x3Package;
import org.bimserver.models.ifc4x3.IfcElement;
import org.bimserver.models.ifc4x3.IfcRelAdheresToElement;
import org.bimserver.models.ifc4x3.IfcSurfaceFeature;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Adheres To Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4x3.impl.IfcRelAdheresToElementImpl#getRelatingElement <em>Relating Element</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3.impl.IfcRelAdheresToElementImpl#getRelatedSurfaceFeatures <em>Related Surface Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcRelAdheresToElementImpl extends IfcRelDecomposesImpl implements IfcRelAdheresToElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAdheresToElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4x3Package.Literals.IFC_REL_ADHERES_TO_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfcElement getRelatingElement() {
		return (IfcElement) eGet(Ifc4x3Package.Literals.IFC_REL_ADHERES_TO_ELEMENT__RELATING_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelatingElement(IfcElement newRelatingElement) {
		eSet(Ifc4x3Package.Literals.IFC_REL_ADHERES_TO_ELEMENT__RELATING_ELEMENT, newRelatingElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<IfcSurfaceFeature> getRelatedSurfaceFeatures() {
		return (EList<IfcSurfaceFeature>) eGet(
				Ifc4x3Package.Literals.IFC_REL_ADHERES_TO_ELEMENT__RELATED_SURFACE_FEATURES, true);
	}

} //IfcRelAdheresToElementImpl
