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
import org.bimserver.models.ifc4x3.IfcGroup;
import org.bimserver.models.ifc4x3.IfcRelAssignsToGroup;
import org.bimserver.models.ifc4x3.IfcRelReferencedInSpatialStructure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4x3.impl.IfcGroupImpl#getIsGroupedBy <em>Is Grouped By</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3.impl.IfcGroupImpl#getReferencedInStructures <em>Referenced In Structures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcGroupImpl extends IfcObjectImpl implements IfcGroup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4x3Package.Literals.IFC_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<IfcRelAssignsToGroup> getIsGroupedBy() {
		return (EList<IfcRelAssignsToGroup>) eGet(Ifc4x3Package.Literals.IFC_GROUP__IS_GROUPED_BY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsGroupedBy() {
		eUnset(Ifc4x3Package.Literals.IFC_GROUP__IS_GROUPED_BY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsGroupedBy() {
		return eIsSet(Ifc4x3Package.Literals.IFC_GROUP__IS_GROUPED_BY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<IfcRelReferencedInSpatialStructure> getReferencedInStructures() {
		return (EList<IfcRelReferencedInSpatialStructure>) eGet(
				Ifc4x3Package.Literals.IFC_GROUP__REFERENCED_IN_STRUCTURES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetReferencedInStructures() {
		eUnset(Ifc4x3Package.Literals.IFC_GROUP__REFERENCED_IN_STRUCTURES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetReferencedInStructures() {
		return eIsSet(Ifc4x3Package.Literals.IFC_GROUP__REFERENCED_IN_STRUCTURES);
	}

} //IfcGroupImpl
