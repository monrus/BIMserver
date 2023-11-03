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
import org.bimserver.models.ifc4x3.IfcQuantityVolume;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Quantity Volume</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4x3.impl.IfcQuantityVolumeImpl#getVolumeValue <em>Volume Value</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3.impl.IfcQuantityVolumeImpl#getVolumeValueAsString <em>Volume Value As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3.impl.IfcQuantityVolumeImpl#getFormula <em>Formula</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcQuantityVolumeImpl extends IfcPhysicalSimpleQuantityImpl implements IfcQuantityVolume {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcQuantityVolumeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4x3Package.Literals.IFC_QUANTITY_VOLUME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getVolumeValue() {
		return (Double) eGet(Ifc4x3Package.Literals.IFC_QUANTITY_VOLUME__VOLUME_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolumeValue(double newVolumeValue) {
		eSet(Ifc4x3Package.Literals.IFC_QUANTITY_VOLUME__VOLUME_VALUE, newVolumeValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVolumeValueAsString() {
		return (String) eGet(Ifc4x3Package.Literals.IFC_QUANTITY_VOLUME__VOLUME_VALUE_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolumeValueAsString(String newVolumeValueAsString) {
		eSet(Ifc4x3Package.Literals.IFC_QUANTITY_VOLUME__VOLUME_VALUE_AS_STRING, newVolumeValueAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormula() {
		return (String) eGet(Ifc4x3Package.Literals.IFC_QUANTITY_VOLUME__FORMULA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormula(String newFormula) {
		eSet(Ifc4x3Package.Literals.IFC_QUANTITY_VOLUME__FORMULA, newFormula);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFormula() {
		eUnset(Ifc4x3Package.Literals.IFC_QUANTITY_VOLUME__FORMULA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFormula() {
		return eIsSet(Ifc4x3Package.Literals.IFC_QUANTITY_VOLUME__FORMULA);
	}

} //IfcQuantityVolumeImpl
