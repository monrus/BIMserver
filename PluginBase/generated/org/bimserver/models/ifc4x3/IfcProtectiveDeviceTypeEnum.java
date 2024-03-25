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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ifc Protective Device Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc4x3.Ifc4x3Package#getIfcProtectiveDeviceTypeEnum()
 * @model
 * @generated
 */
public enum IfcProtectiveDeviceTypeEnum implements Enumerator {
	/**
	 * The '<em><b>NULL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NULL_VALUE
	 * @generated
	 * @ordered
	 */
	NULL(0, "NULL", "NULL"),

	/**
	 * The '<em><b>EARTHINGSWITCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EARTHINGSWITCH_VALUE
	 * @generated
	 * @ordered
	 */
	EARTHINGSWITCH(1, "EARTHINGSWITCH", "EARTHINGSWITCH"),

	/**
	 * The '<em><b>ANTI ARCING DEVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANTI_ARCING_DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	ANTI_ARCING_DEVICE(2, "ANTI_ARCING_DEVICE", "ANTI_ARCING_DEVICE"),

	/**
	 * The '<em><b>RESIDUALCURRENTCIRCUITBREAKER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESIDUALCURRENTCIRCUITBREAKER_VALUE
	 * @generated
	 * @ordered
	 */
	RESIDUALCURRENTCIRCUITBREAKER(3, "RESIDUALCURRENTCIRCUITBREAKER", "RESIDUALCURRENTCIRCUITBREAKER"),

	/**
	 * The '<em><b>NOTDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTDEFINED(4, "NOTDEFINED", "NOTDEFINED"),

	/**
	 * The '<em><b>EARTHLEAKAGECIRCUITBREAKER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EARTHLEAKAGECIRCUITBREAKER_VALUE
	 * @generated
	 * @ordered
	 */
	EARTHLEAKAGECIRCUITBREAKER(5, "EARTHLEAKAGECIRCUITBREAKER", "EARTHLEAKAGECIRCUITBREAKER"),

	/**
	 * The '<em><b>CIRCUITBREAKER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIRCUITBREAKER_VALUE
	 * @generated
	 * @ordered
	 */
	CIRCUITBREAKER(6, "CIRCUITBREAKER", "CIRCUITBREAKER"),

	/**
	 * The '<em><b>VARISTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARISTOR_VALUE
	 * @generated
	 * @ordered
	 */
	VARISTOR(7, "VARISTOR", "VARISTOR"),

	/**
	 * The '<em><b>USERDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	USERDEFINED(8, "USERDEFINED", "USERDEFINED"),

	/**
	 * The '<em><b>SPARKGAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPARKGAP_VALUE
	 * @generated
	 * @ordered
	 */
	SPARKGAP(9, "SPARKGAP", "SPARKGAP"),

	/**
	 * The '<em><b>RESIDUALCURRENTSWITCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESIDUALCURRENTSWITCH_VALUE
	 * @generated
	 * @ordered
	 */
	RESIDUALCURRENTSWITCH(10, "RESIDUALCURRENTSWITCH", "RESIDUALCURRENTSWITCH"),

	/**
	 * The '<em><b>FUSEDISCONNECTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUSEDISCONNECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	FUSEDISCONNECTOR(11, "FUSEDISCONNECTOR", "FUSEDISCONNECTOR"),

	/**
	 * The '<em><b>VOLTAGELIMITER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOLTAGELIMITER_VALUE
	 * @generated
	 * @ordered
	 */
	VOLTAGELIMITER(12, "VOLTAGELIMITER", "VOLTAGELIMITER");

	/**
	 * The '<em><b>NULL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NULL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NULL_VALUE = 0;

	/**
	 * The '<em><b>EARTHINGSWITCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EARTHINGSWITCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EARTHINGSWITCH_VALUE = 1;

	/**
	 * The '<em><b>ANTI ARCING DEVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANTI_ARCING_DEVICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANTI_ARCING_DEVICE_VALUE = 2;

	/**
	 * The '<em><b>RESIDUALCURRENTCIRCUITBREAKER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESIDUALCURRENTCIRCUITBREAKER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESIDUALCURRENTCIRCUITBREAKER_VALUE = 3;

	/**
	 * The '<em><b>NOTDEFINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOTDEFINED_VALUE = 4;

	/**
	 * The '<em><b>EARTHLEAKAGECIRCUITBREAKER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EARTHLEAKAGECIRCUITBREAKER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EARTHLEAKAGECIRCUITBREAKER_VALUE = 5;

	/**
	 * The '<em><b>CIRCUITBREAKER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIRCUITBREAKER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CIRCUITBREAKER_VALUE = 6;

	/**
	 * The '<em><b>VARISTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARISTOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VARISTOR_VALUE = 7;

	/**
	 * The '<em><b>USERDEFINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USERDEFINED_VALUE = 8;

	/**
	 * The '<em><b>SPARKGAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPARKGAP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPARKGAP_VALUE = 9;

	/**
	 * The '<em><b>RESIDUALCURRENTSWITCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESIDUALCURRENTSWITCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESIDUALCURRENTSWITCH_VALUE = 10;

	/**
	 * The '<em><b>FUSEDISCONNECTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUSEDISCONNECTOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FUSEDISCONNECTOR_VALUE = 11;

	/**
	 * The '<em><b>VOLTAGELIMITER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOLTAGELIMITER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGELIMITER_VALUE = 12;

	/**
	 * An array of all the '<em><b>Ifc Protective Device Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcProtectiveDeviceTypeEnum[] VALUES_ARRAY = new IfcProtectiveDeviceTypeEnum[] { NULL,
			EARTHINGSWITCH, ANTI_ARCING_DEVICE, RESIDUALCURRENTCIRCUITBREAKER, NOTDEFINED, EARTHLEAKAGECIRCUITBREAKER,
			CIRCUITBREAKER, VARISTOR, USERDEFINED, SPARKGAP, RESIDUALCURRENTSWITCH, FUSEDISCONNECTOR, VOLTAGELIMITER, };

	/**
	 * A public read-only list of all the '<em><b>Ifc Protective Device Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcProtectiveDeviceTypeEnum> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Protective Device Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IfcProtectiveDeviceTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcProtectiveDeviceTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Protective Device Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IfcProtectiveDeviceTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcProtectiveDeviceTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Protective Device Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IfcProtectiveDeviceTypeEnum get(int value) {
		switch (value) {
		case NULL_VALUE:
			return NULL;
		case EARTHINGSWITCH_VALUE:
			return EARTHINGSWITCH;
		case ANTI_ARCING_DEVICE_VALUE:
			return ANTI_ARCING_DEVICE;
		case RESIDUALCURRENTCIRCUITBREAKER_VALUE:
			return RESIDUALCURRENTCIRCUITBREAKER;
		case NOTDEFINED_VALUE:
			return NOTDEFINED;
		case EARTHLEAKAGECIRCUITBREAKER_VALUE:
			return EARTHLEAKAGECIRCUITBREAKER;
		case CIRCUITBREAKER_VALUE:
			return CIRCUITBREAKER;
		case VARISTOR_VALUE:
			return VARISTOR;
		case USERDEFINED_VALUE:
			return USERDEFINED;
		case SPARKGAP_VALUE:
			return SPARKGAP;
		case RESIDUALCURRENTSWITCH_VALUE:
			return RESIDUALCURRENTSWITCH;
		case FUSEDISCONNECTOR_VALUE:
			return FUSEDISCONNECTOR;
		case VOLTAGELIMITER_VALUE:
			return VOLTAGELIMITER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private IfcProtectiveDeviceTypeEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //IfcProtectiveDeviceTypeEnum