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

import org.bimserver.emf.IdEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Globally Unique Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4x3.IfcGloballyUniqueId#getWrappedValue <em>Wrapped Value</em>}</li>
 * </ul>
 *
 * @see org.bimserver.models.ifc4x3.Ifc4x3Package#getIfcGloballyUniqueId()
 * @model annotation="wrapped"
 * @extends IdEObject
 * @generated
 */
public interface IfcGloballyUniqueId extends IdEObject {
	/**
	 * Returns the value of the '<em><b>Wrapped Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrapped Value</em>' attribute.
	 * @see #isSetWrappedValue()
	 * @see #unsetWrappedValue()
	 * @see #setWrappedValue(String)
	 * @see org.bimserver.models.ifc4x3.Ifc4x3Package#getIfcGloballyUniqueId_WrappedValue()
	 * @model unsettable="true"
	 * @generated
	 */
	String getWrappedValue();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4x3.IfcGloballyUniqueId#getWrappedValue <em>Wrapped Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrapped Value</em>' attribute.
	 * @see #isSetWrappedValue()
	 * @see #unsetWrappedValue()
	 * @see #getWrappedValue()
	 * @generated
	 */
	void setWrappedValue(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4x3.IfcGloballyUniqueId#getWrappedValue <em>Wrapped Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWrappedValue()
	 * @see #getWrappedValue()
	 * @see #setWrappedValue(String)
	 * @generated
	 */
	void unsetWrappedValue();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4x3.IfcGloballyUniqueId#getWrappedValue <em>Wrapped Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wrapped Value</em>' attribute is set.
	 * @see #unsetWrappedValue()
	 * @see #getWrappedValue()
	 * @see #setWrappedValue(String)
	 * @generated
	 */
	boolean isSetWrappedValue();

} // IfcGloballyUniqueId
