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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link store.ServiceType#getName <em>Name</em>}</li>
 *   <li>{@link store.ServiceType#getSimpleName <em>Simple Name</em>}</li>
 *   <li>{@link store.ServiceType#getFields <em>Fields</em>}</li>
 *   <li>{@link store.ServiceType#getSimpleType <em>Simple Type</em>}</li>
 * </ul>
 *
 * @see store.StorePackage#getServiceType()
 * @model
 * @extends IdEObject
 * @generated
 */
public interface ServiceType extends IdEObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see store.StorePackage#getServiceType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link store.ServiceType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Simple Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Name</em>' attribute.
	 * @see #setSimpleName(String)
	 * @see store.StorePackage#getServiceType_SimpleName()
	 * @model
	 * @generated
	 */
	String getSimpleName();

	/**
	 * Sets the value of the '{@link store.ServiceType#getSimpleName <em>Simple Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Name</em>' attribute.
	 * @see #getSimpleName()
	 * @generated
	 */
	void setSimpleName(String value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' reference list.
	 * The list contents are of type {@link store.ServiceField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' reference list.
	 * @see store.StorePackage#getServiceType_Fields()
	 * @model annotation="embedsreference"
	 * @generated
	 */
	EList<ServiceField> getFields();

	/**
	 * Returns the value of the '<em><b>Simple Type</b></em>' attribute.
	 * The literals are from the enumeration {@link store.ServiceSimpleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Type</em>' attribute.
	 * @see store.ServiceSimpleType
	 * @see #setSimpleType(ServiceSimpleType)
	 * @see store.StorePackage#getServiceType_SimpleType()
	 * @model
	 * @generated
	 */
	ServiceSimpleType getSimpleType();

	/**
	 * Sets the value of the '{@link store.ServiceType#getSimpleType <em>Simple Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Type</em>' attribute.
	 * @see store.ServiceSimpleType
	 * @see #getSimpleType()
	 * @generated
	 */
	void setSimpleType(ServiceSimpleType value);

} // ServiceType
