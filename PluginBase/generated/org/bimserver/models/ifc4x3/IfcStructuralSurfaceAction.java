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
 * A representation of the model object '<em><b>Ifc Structural Surface Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4x3.IfcStructuralSurfaceAction#getProjectedOrTrue <em>Projected Or True</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3.IfcStructuralSurfaceAction#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 *
 * @see org.bimserver.models.ifc4x3.Ifc4x3Package#getIfcStructuralSurfaceAction()
 * @model
 * @generated
 */
public interface IfcStructuralSurfaceAction extends IfcStructuralAction {
	/**
	 * Returns the value of the '<em><b>Projected Or True</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc4x3.IfcProjectedOrTrueLengthEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projected Or True</em>' attribute.
	 * @see org.bimserver.models.ifc4x3.IfcProjectedOrTrueLengthEnum
	 * @see #isSetProjectedOrTrue()
	 * @see #unsetProjectedOrTrue()
	 * @see #setProjectedOrTrue(IfcProjectedOrTrueLengthEnum)
	 * @see org.bimserver.models.ifc4x3.Ifc4x3Package#getIfcStructuralSurfaceAction_ProjectedOrTrue()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcProjectedOrTrueLengthEnum getProjectedOrTrue();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4x3.IfcStructuralSurfaceAction#getProjectedOrTrue <em>Projected Or True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projected Or True</em>' attribute.
	 * @see org.bimserver.models.ifc4x3.IfcProjectedOrTrueLengthEnum
	 * @see #isSetProjectedOrTrue()
	 * @see #unsetProjectedOrTrue()
	 * @see #getProjectedOrTrue()
	 * @generated
	 */
	void setProjectedOrTrue(IfcProjectedOrTrueLengthEnum value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4x3.IfcStructuralSurfaceAction#getProjectedOrTrue <em>Projected Or True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProjectedOrTrue()
	 * @see #getProjectedOrTrue()
	 * @see #setProjectedOrTrue(IfcProjectedOrTrueLengthEnum)
	 * @generated
	 */
	void unsetProjectedOrTrue();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4x3.IfcStructuralSurfaceAction#getProjectedOrTrue <em>Projected Or True</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Projected Or True</em>' attribute is set.
	 * @see #unsetProjectedOrTrue()
	 * @see #getProjectedOrTrue()
	 * @see #setProjectedOrTrue(IfcProjectedOrTrueLengthEnum)
	 * @generated
	 */
	boolean isSetProjectedOrTrue();

	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc4x3.IfcStructuralSurfaceActivityTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see org.bimserver.models.ifc4x3.IfcStructuralSurfaceActivityTypeEnum
	 * @see #setPredefinedType(IfcStructuralSurfaceActivityTypeEnum)
	 * @see org.bimserver.models.ifc4x3.Ifc4x3Package#getIfcStructuralSurfaceAction_PredefinedType()
	 * @model
	 * @generated
	 */
	IfcStructuralSurfaceActivityTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4x3.IfcStructuralSurfaceAction#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see org.bimserver.models.ifc4x3.IfcStructuralSurfaceActivityTypeEnum
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcStructuralSurfaceActivityTypeEnum value);

} // IfcStructuralSurfaceAction
