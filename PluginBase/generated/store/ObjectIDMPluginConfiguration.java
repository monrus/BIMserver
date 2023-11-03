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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object IDM Plugin Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link store.ObjectIDMPluginConfiguration#getSerializers <em>Serializers</em>}</li>
 *   <li>{@link store.ObjectIDMPluginConfiguration#getUserSettings <em>User Settings</em>}</li>
 * </ul>
 *
 * @see store.StorePackage#getObjectIDMPluginConfiguration()
 * @model
 * @generated
 */
public interface ObjectIDMPluginConfiguration extends PluginConfiguration {
	/**
	 * Returns the value of the '<em><b>Serializers</b></em>' reference list.
	 * The list contents are of type {@link store.SerializerPluginConfiguration}.
	 * It is bidirectional and its opposite is '{@link store.SerializerPluginConfiguration#getObjectIDM <em>Object IDM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serializers</em>' reference list.
	 * @see store.StorePackage#getObjectIDMPluginConfiguration_Serializers()
	 * @see store.SerializerPluginConfiguration#getObjectIDM
	 * @model opposite="objectIDM"
	 * @generated
	 */
	EList<SerializerPluginConfiguration> getSerializers();

	/**
	 * Returns the value of the '<em><b>User Settings</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link store.UserSettings#getObjectIDMs <em>Object ID Ms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Settings</em>' reference.
	 * @see #setUserSettings(UserSettings)
	 * @see store.StorePackage#getObjectIDMPluginConfiguration_UserSettings()
	 * @see store.UserSettings#getObjectIDMs
	 * @model opposite="objectIDMs"
	 * @generated
	 */
	UserSettings getUserSettings();

	/**
	 * Sets the value of the '{@link store.ObjectIDMPluginConfiguration#getUserSettings <em>User Settings</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Settings</em>' reference.
	 * @see #getUserSettings()
	 * @generated
	 */
	void setUserSettings(UserSettings value);

} // ObjectIDMPluginConfiguration
