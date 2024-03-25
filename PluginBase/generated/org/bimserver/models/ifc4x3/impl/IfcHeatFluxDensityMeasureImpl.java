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

import org.bimserver.emf.IdEObjectImpl;

import org.bimserver.models.ifc4x3.Ifc4x3Package;
import org.bimserver.models.ifc4x3.IfcHeatFluxDensityMeasure;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Heat Flux Density Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4x3.impl.IfcHeatFluxDensityMeasureImpl#getWrappedValue <em>Wrapped Value</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3.impl.IfcHeatFluxDensityMeasureImpl#getWrappedValueAsString <em>Wrapped Value As String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcHeatFluxDensityMeasureImpl extends IdEObjectImpl implements IfcHeatFluxDensityMeasure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcHeatFluxDensityMeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4x3Package.Literals.IFC_HEAT_FLUX_DENSITY_MEASURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWrappedValue() {
		return (Double) eGet(Ifc4x3Package.Literals.IFC_HEAT_FLUX_DENSITY_MEASURE__WRAPPED_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrappedValue(double newWrappedValue) {
		eSet(Ifc4x3Package.Literals.IFC_HEAT_FLUX_DENSITY_MEASURE__WRAPPED_VALUE, newWrappedValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWrappedValue() {
		eUnset(Ifc4x3Package.Literals.IFC_HEAT_FLUX_DENSITY_MEASURE__WRAPPED_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWrappedValue() {
		return eIsSet(Ifc4x3Package.Literals.IFC_HEAT_FLUX_DENSITY_MEASURE__WRAPPED_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWrappedValueAsString() {
		return (String) eGet(Ifc4x3Package.Literals.IFC_HEAT_FLUX_DENSITY_MEASURE__WRAPPED_VALUE_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrappedValueAsString(String newWrappedValueAsString) {
		eSet(Ifc4x3Package.Literals.IFC_HEAT_FLUX_DENSITY_MEASURE__WRAPPED_VALUE_AS_STRING, newWrappedValueAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWrappedValueAsString() {
		eUnset(Ifc4x3Package.Literals.IFC_HEAT_FLUX_DENSITY_MEASURE__WRAPPED_VALUE_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWrappedValueAsString() {
		return eIsSet(Ifc4x3Package.Literals.IFC_HEAT_FLUX_DENSITY_MEASURE__WRAPPED_VALUE_AS_STRING);
	}

} //IfcHeatFluxDensityMeasureImpl