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
 * A representation of the model object '<em><b>Ifc Composite Curve Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4x3.IfcCompositeCurveSegment#getSameSense <em>Same Sense</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3.IfcCompositeCurveSegment#getParentCurve <em>Parent Curve</em>}</li>
 * </ul>
 *
 * @see org.bimserver.models.ifc4x3.Ifc4x3Package#getIfcCompositeCurveSegment()
 * @model
 * @generated
 */
public interface IfcCompositeCurveSegment extends IfcSegment {
	/**
	 * Returns the value of the '<em><b>Same Sense</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc4x3.Tristate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Same Sense</em>' attribute.
	 * @see org.bimserver.models.ifc4x3.Tristate
	 * @see #setSameSense(Tristate)
	 * @see org.bimserver.models.ifc4x3.Ifc4x3Package#getIfcCompositeCurveSegment_SameSense()
	 * @model
	 * @generated
	 */
	Tristate getSameSense();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4x3.IfcCompositeCurveSegment#getSameSense <em>Same Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Same Sense</em>' attribute.
	 * @see org.bimserver.models.ifc4x3.Tristate
	 * @see #getSameSense()
	 * @generated
	 */
	void setSameSense(Tristate value);

	/**
	 * Returns the value of the '<em><b>Parent Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Curve</em>' reference.
	 * @see #setParentCurve(IfcCurve)
	 * @see org.bimserver.models.ifc4x3.Ifc4x3Package#getIfcCompositeCurveSegment_ParentCurve()
	 * @model
	 * @generated
	 */
	IfcCurve getParentCurve();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4x3.IfcCompositeCurveSegment#getParentCurve <em>Parent Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Curve</em>' reference.
	 * @see #getParentCurve()
	 * @generated
	 */
	void setParentCurve(IfcCurve value);

} // IfcCompositeCurveSegment