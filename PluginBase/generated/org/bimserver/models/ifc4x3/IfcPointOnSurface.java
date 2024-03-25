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
 * A representation of the model object '<em><b>Ifc Point On Surface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4x3.IfcPointOnSurface#getBasisSurface <em>Basis Surface</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3.IfcPointOnSurface#getPointParameterU <em>Point Parameter U</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3.IfcPointOnSurface#getPointParameterUAsString <em>Point Parameter UAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3.IfcPointOnSurface#getPointParameterV <em>Point Parameter V</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3.IfcPointOnSurface#getPointParameterVAsString <em>Point Parameter VAs String</em>}</li>
 * </ul>
 *
 * @see org.bimserver.models.ifc4x3.Ifc4x3Package#getIfcPointOnSurface()
 * @model
 * @generated
 */
public interface IfcPointOnSurface extends IfcPoint {
	/**
	 * Returns the value of the '<em><b>Basis Surface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis Surface</em>' reference.
	 * @see #setBasisSurface(IfcSurface)
	 * @see org.bimserver.models.ifc4x3.Ifc4x3Package#getIfcPointOnSurface_BasisSurface()
	 * @model
	 * @generated
	 */
	IfcSurface getBasisSurface();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4x3.IfcPointOnSurface#getBasisSurface <em>Basis Surface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basis Surface</em>' reference.
	 * @see #getBasisSurface()
	 * @generated
	 */
	void setBasisSurface(IfcSurface value);

	/**
	 * Returns the value of the '<em><b>Point Parameter U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Parameter U</em>' attribute.
	 * @see #setPointParameterU(double)
	 * @see org.bimserver.models.ifc4x3.Ifc4x3Package#getIfcPointOnSurface_PointParameterU()
	 * @model
	 * @generated
	 */
	double getPointParameterU();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4x3.IfcPointOnSurface#getPointParameterU <em>Point Parameter U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Parameter U</em>' attribute.
	 * @see #getPointParameterU()
	 * @generated
	 */
	void setPointParameterU(double value);

	/**
	 * Returns the value of the '<em><b>Point Parameter UAs String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Parameter UAs String</em>' attribute.
	 * @see #setPointParameterUAsString(String)
	 * @see org.bimserver.models.ifc4x3.Ifc4x3Package#getIfcPointOnSurface_PointParameterUAsString()
	 * @model annotation="asstring"
	 *        annotation="hidden"
	 * @generated
	 */
	String getPointParameterUAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4x3.IfcPointOnSurface#getPointParameterUAsString <em>Point Parameter UAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Parameter UAs String</em>' attribute.
	 * @see #getPointParameterUAsString()
	 * @generated
	 */
	void setPointParameterUAsString(String value);

	/**
	 * Returns the value of the '<em><b>Point Parameter V</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Parameter V</em>' attribute.
	 * @see #setPointParameterV(double)
	 * @see org.bimserver.models.ifc4x3.Ifc4x3Package#getIfcPointOnSurface_PointParameterV()
	 * @model
	 * @generated
	 */
	double getPointParameterV();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4x3.IfcPointOnSurface#getPointParameterV <em>Point Parameter V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Parameter V</em>' attribute.
	 * @see #getPointParameterV()
	 * @generated
	 */
	void setPointParameterV(double value);

	/**
	 * Returns the value of the '<em><b>Point Parameter VAs String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Parameter VAs String</em>' attribute.
	 * @see #setPointParameterVAsString(String)
	 * @see org.bimserver.models.ifc4x3.Ifc4x3Package#getIfcPointOnSurface_PointParameterVAsString()
	 * @model annotation="asstring"
	 *        annotation="hidden"
	 * @generated
	 */
	String getPointParameterVAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4x3.IfcPointOnSurface#getPointParameterVAsString <em>Point Parameter VAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Parameter VAs String</em>' attribute.
	 * @see #getPointParameterVAsString()
	 * @generated
	 */
	void setPointParameterVAsString(String value);

} // IfcPointOnSurface