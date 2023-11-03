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
import org.bimserver.models.ifc4x3.IfcDirection;
import org.bimserver.models.ifc4x3.IfcFixedReferenceSweptAreaSolid;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Fixed Reference Swept Area Solid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4x3.impl.IfcFixedReferenceSweptAreaSolidImpl#getFixedReference <em>Fixed Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcFixedReferenceSweptAreaSolidImpl extends IfcDirectrixCurveSweptAreaSolidImpl
		implements IfcFixedReferenceSweptAreaSolid {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFixedReferenceSweptAreaSolidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4x3Package.Literals.IFC_FIXED_REFERENCE_SWEPT_AREA_SOLID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfcDirection getFixedReference() {
		return (IfcDirection) eGet(Ifc4x3Package.Literals.IFC_FIXED_REFERENCE_SWEPT_AREA_SOLID__FIXED_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedReference(IfcDirection newFixedReference) {
		eSet(Ifc4x3Package.Literals.IFC_FIXED_REFERENCE_SWEPT_AREA_SOLID__FIXED_REFERENCE, newFixedReference);
	}

} //IfcFixedReferenceSweptAreaSolidImpl
