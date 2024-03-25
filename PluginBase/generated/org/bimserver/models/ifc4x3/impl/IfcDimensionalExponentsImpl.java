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
import org.bimserver.models.ifc4x3.IfcDimensionalExponents;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Dimensional Exponents</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4x3.impl.IfcDimensionalExponentsImpl#getLengthExponent <em>Length Exponent</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3.impl.IfcDimensionalExponentsImpl#getMassExponent <em>Mass Exponent</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3.impl.IfcDimensionalExponentsImpl#getTimeExponent <em>Time Exponent</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3.impl.IfcDimensionalExponentsImpl#getElectricCurrentExponent <em>Electric Current Exponent</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3.impl.IfcDimensionalExponentsImpl#getThermodynamicTemperatureExponent <em>Thermodynamic Temperature Exponent</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3.impl.IfcDimensionalExponentsImpl#getAmountOfSubstanceExponent <em>Amount Of Substance Exponent</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3.impl.IfcDimensionalExponentsImpl#getLuminousIntensityExponent <em>Luminous Intensity Exponent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcDimensionalExponentsImpl extends IdEObjectImpl implements IfcDimensionalExponents {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDimensionalExponentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4x3Package.Literals.IFC_DIMENSIONAL_EXPONENTS;
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
	public long getLengthExponent() {
		return (Long) eGet(Ifc4x3Package.Literals.IFC_DIMENSIONAL_EXPONENTS__LENGTH_EXPONENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLengthExponent(long newLengthExponent) {
		eSet(Ifc4x3Package.Literals.IFC_DIMENSIONAL_EXPONENTS__LENGTH_EXPONENT, newLengthExponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMassExponent() {
		return (Long) eGet(Ifc4x3Package.Literals.IFC_DIMENSIONAL_EXPONENTS__MASS_EXPONENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMassExponent(long newMassExponent) {
		eSet(Ifc4x3Package.Literals.IFC_DIMENSIONAL_EXPONENTS__MASS_EXPONENT, newMassExponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTimeExponent() {
		return (Long) eGet(Ifc4x3Package.Literals.IFC_DIMENSIONAL_EXPONENTS__TIME_EXPONENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeExponent(long newTimeExponent) {
		eSet(Ifc4x3Package.Literals.IFC_DIMENSIONAL_EXPONENTS__TIME_EXPONENT, newTimeExponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getElectricCurrentExponent() {
		return (Long) eGet(Ifc4x3Package.Literals.IFC_DIMENSIONAL_EXPONENTS__ELECTRIC_CURRENT_EXPONENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElectricCurrentExponent(long newElectricCurrentExponent) {
		eSet(Ifc4x3Package.Literals.IFC_DIMENSIONAL_EXPONENTS__ELECTRIC_CURRENT_EXPONENT, newElectricCurrentExponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getThermodynamicTemperatureExponent() {
		return (Long) eGet(Ifc4x3Package.Literals.IFC_DIMENSIONAL_EXPONENTS__THERMODYNAMIC_TEMPERATURE_EXPONENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThermodynamicTemperatureExponent(long newThermodynamicTemperatureExponent) {
		eSet(Ifc4x3Package.Literals.IFC_DIMENSIONAL_EXPONENTS__THERMODYNAMIC_TEMPERATURE_EXPONENT,
				newThermodynamicTemperatureExponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getAmountOfSubstanceExponent() {
		return (Long) eGet(Ifc4x3Package.Literals.IFC_DIMENSIONAL_EXPONENTS__AMOUNT_OF_SUBSTANCE_EXPONENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmountOfSubstanceExponent(long newAmountOfSubstanceExponent) {
		eSet(Ifc4x3Package.Literals.IFC_DIMENSIONAL_EXPONENTS__AMOUNT_OF_SUBSTANCE_EXPONENT,
				newAmountOfSubstanceExponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getLuminousIntensityExponent() {
		return (Long) eGet(Ifc4x3Package.Literals.IFC_DIMENSIONAL_EXPONENTS__LUMINOUS_INTENSITY_EXPONENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLuminousIntensityExponent(long newLuminousIntensityExponent) {
		eSet(Ifc4x3Package.Literals.IFC_DIMENSIONAL_EXPONENTS__LUMINOUS_INTENSITY_EXPONENT,
				newLuminousIntensityExponent);
	}

} //IfcDimensionalExponentsImpl