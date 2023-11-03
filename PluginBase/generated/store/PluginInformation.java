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
 * A representation of the model object '<em><b>Plugin Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link store.PluginInformation#getName <em>Name</em>}</li>
 *   <li>{@link store.PluginInformation#getType <em>Type</em>}</li>
 *   <li>{@link store.PluginInformation#getDescription <em>Description</em>}</li>
 *   <li>{@link store.PluginInformation#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link store.PluginInformation#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link store.PluginInformation#isInstallForAllUsers <em>Install For All Users</em>}</li>
 *   <li>{@link store.PluginInformation#isInstallForNewUsers <em>Install For New Users</em>}</li>
 * </ul>
 *
 * @see store.StorePackage#getPluginInformation()
 * @model
 * @extends IdEObject
 * @generated
 */
public interface PluginInformation extends IdEObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see store.StorePackage#getPluginInformation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link store.PluginInformation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link store.PluginType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see store.PluginType
	 * @see #setType(PluginType)
	 * @see store.StorePackage#getPluginInformation_Type()
	 * @model
	 * @generated
	 */
	PluginType getType();

	/**
	 * Sets the value of the '{@link store.PluginInformation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see store.PluginType
	 * @see #getType()
	 * @generated
	 */
	void setType(PluginType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see store.StorePackage#getPluginInformation_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link store.PluginInformation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see store.StorePackage#getPluginInformation_Enabled()
	 * @model
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link store.PluginInformation#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see store.StorePackage#getPluginInformation_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link store.PluginInformation#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Install For All Users</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Install For All Users</em>' attribute.
	 * @see #setInstallForAllUsers(boolean)
	 * @see store.StorePackage#getPluginInformation_InstallForAllUsers()
	 * @model
	 * @generated
	 */
	boolean isInstallForAllUsers();

	/**
	 * Sets the value of the '{@link store.PluginInformation#isInstallForAllUsers <em>Install For All Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Install For All Users</em>' attribute.
	 * @see #isInstallForAllUsers()
	 * @generated
	 */
	void setInstallForAllUsers(boolean value);

	/**
	 * Returns the value of the '<em><b>Install For New Users</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Install For New Users</em>' attribute.
	 * @see #setInstallForNewUsers(boolean)
	 * @see store.StorePackage#getPluginInformation_InstallForNewUsers()
	 * @model
	 * @generated
	 */
	boolean isInstallForNewUsers();

	/**
	 * Sets the value of the '{@link store.PluginInformation#isInstallForNewUsers <em>Install For New Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Install For New Users</em>' attribute.
	 * @see #isInstallForNewUsers()
	 * @generated
	 */
	void setInstallForNewUsers(boolean value);

} // PluginInformation
