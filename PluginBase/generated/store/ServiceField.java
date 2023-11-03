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
package store;

import org.bimserver.emf.IdEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link store.ServiceField#getName <em>Name</em>}</li>
 *   <li>{@link store.ServiceField#getType <em>Type</em>}</li>
 *   <li>{@link store.ServiceField#getGenericType <em>Generic Type</em>}</li>
 *   <li>{@link store.ServiceField#getDoc <em>Doc</em>}</li>
 * </ul>
 *
 * @see store.StorePackage#getServiceField()
 * @model annotation="nodatabase"
 * @extends IdEObject
 * @generated
 */
public interface ServiceField extends IdEObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see store.StorePackage#getServiceField_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link store.ServiceField#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ServiceType)
	 * @see store.StorePackage#getServiceField_Type()
	 * @model annotation="embedsreference"
	 * @generated
	 */
	ServiceType getType();

	/**
	 * Sets the value of the '{@link store.ServiceField#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ServiceType value);

	/**
	 * Returns the value of the '<em><b>Generic Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Type</em>' reference.
	 * @see #setGenericType(ServiceType)
	 * @see store.StorePackage#getServiceField_GenericType()
	 * @model annotation="embedsreference"
	 * @generated
	 */
	ServiceType getGenericType();

	/**
	 * Sets the value of the '{@link store.ServiceField#getGenericType <em>Generic Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Type</em>' reference.
	 * @see #getGenericType()
	 * @generated
	 */
	void setGenericType(ServiceType value);

	/**
	 * Returns the value of the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc</em>' attribute.
	 * @see #setDoc(String)
	 * @see store.StorePackage#getServiceField_Doc()
	 * @model
	 * @generated
	 */
	String getDoc();

	/**
	 * Sets the value of the '{@link store.ServiceField#getDoc <em>Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc</em>' attribute.
	 * @see #getDoc()
	 * @generated
	 */
	void setDoc(String value);

} // ServiceField
