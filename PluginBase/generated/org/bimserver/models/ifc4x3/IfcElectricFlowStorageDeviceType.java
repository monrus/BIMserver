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
package org.bimserver.models.ifc4x3;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Electric Flow Storage Device Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4x3.IfcElectricFlowStorageDeviceType#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 *
 * @see org.bimserver.models.ifc4x3.Ifc4x3Package#getIfcElectricFlowStorageDeviceType()
 * @model
 * @generated
 */
public interface IfcElectricFlowStorageDeviceType extends IfcFlowStorageDeviceType {
	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc4x3.IfcElectricFlowStorageDeviceTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see org.bimserver.models.ifc4x3.IfcElectricFlowStorageDeviceTypeEnum
	 * @see #setPredefinedType(IfcElectricFlowStorageDeviceTypeEnum)
	 * @see org.bimserver.models.ifc4x3.Ifc4x3Package#getIfcElectricFlowStorageDeviceType_PredefinedType()
	 * @model
	 * @generated
	 */
	IfcElectricFlowStorageDeviceTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4x3.IfcElectricFlowStorageDeviceType#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see org.bimserver.models.ifc4x3.IfcElectricFlowStorageDeviceTypeEnum
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcElectricFlowStorageDeviceTypeEnum value);

} // IfcElectricFlowStorageDeviceType