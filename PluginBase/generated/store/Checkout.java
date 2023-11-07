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

import java.util.Date;

import org.bimserver.emf.IdEObject;

import org.bimserver.models.log.CheckoutRelated;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Checkout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link store.Checkout#getUser <em>User</em>}</li>
 *   <li>{@link store.Checkout#getRevision <em>Revision</em>}</li>
 *   <li>{@link store.Checkout#getProject <em>Project</em>}</li>
 *   <li>{@link store.Checkout#getDate <em>Date</em>}</li>
 *   <li>{@link store.Checkout#getCheckin <em>Checkin</em>}</li>
 *   <li>{@link store.Checkout#getActive <em>Active</em>}</li>
 *   <li>{@link store.Checkout#getLogs <em>Logs</em>}</li>
 * </ul>
 *
 * @see store.StorePackage#getCheckout()
 * @model
 * @extends IdEObject
 * @generated
 */
public interface Checkout extends IdEObject {
	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see store.StorePackage#getCheckout_User()
	 * @model
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link store.Checkout#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link store.Revision#getCheckouts <em>Checkouts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' reference.
	 * @see #setRevision(Revision)
	 * @see store.StorePackage#getCheckout_Revision()
	 * @see store.Revision#getCheckouts
	 * @model opposite="checkouts"
	 *        annotation="embedsreference"
	 * @generated
	 */
	Revision getRevision();

	/**
	 * Sets the value of the '{@link store.Checkout#getRevision <em>Revision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' reference.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(Revision value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link store.Project#getCheckouts <em>Checkouts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference.
	 * @see #setProject(Project)
	 * @see store.StorePackage#getCheckout_Project()
	 * @see store.Project#getCheckouts
	 * @model opposite="checkouts"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link store.Checkout#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see store.StorePackage#getCheckout_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link store.Checkout#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Checkin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checkin</em>' reference.
	 * @see #setCheckin(Revision)
	 * @see store.StorePackage#getCheckout_Checkin()
	 * @model annotation="embedsreference"
	 * @generated
	 */
	Revision getCheckin();

	/**
	 * Sets the value of the '{@link store.Checkout#getCheckin <em>Checkin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checkin</em>' reference.
	 * @see #getCheckin()
	 * @generated
	 */
	void setCheckin(Revision value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(Boolean)
	 * @see store.StorePackage#getCheckout_Active()
	 * @model
	 * @generated
	 */
	Boolean getActive();

	/**
	 * Sets the value of the '{@link store.Checkout#getActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(Boolean value);

	/**
	 * Returns the value of the '<em><b>Logs</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.log.CheckoutRelated}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.log.CheckoutRelated#getCheckout <em>Checkout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logs</em>' reference list.
	 * @see store.StorePackage#getCheckout_Logs()
	 * @see org.bimserver.models.log.CheckoutRelated#getCheckout
	 * @model opposite="checkout"
	 * @generated
	 */
	EList<CheckoutRelated> getLogs();

} // Checkout
