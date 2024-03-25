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
 * A representation of the literals of the enumeration '<em><b>Ifc Alignment Vertical Segment Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc4x3.Ifc4x3Package#getIfcAlignmentVerticalSegmentTypeEnum()
 * @model
 * @generated
 */
public enum IfcAlignmentVerticalSegmentTypeEnum implements Enumerator {
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
	 * The '<em><b>PARABOLICARC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARABOLICARC_VALUE
	 * @generated
	 * @ordered
	 */
	PARABOLICARC(1, "PARABOLICARC", "PARABOLICARC"),

	/**
	 * The '<em><b>CIRCULARARC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIRCULARARC_VALUE
	 * @generated
	 * @ordered
	 */
	CIRCULARARC(2, "CIRCULARARC", "CIRCULARARC"),

	/**
	 * The '<em><b>CLOTHOID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOTHOID_VALUE
	 * @generated
	 * @ordered
	 */
	CLOTHOID(3, "CLOTHOID", "CLOTHOID"),

	/**
	 * The '<em><b>CONSTANTGRADIENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTANTGRADIENT_VALUE
	 * @generated
	 * @ordered
	 */
	CONSTANTGRADIENT(4, "CONSTANTGRADIENT", "CONSTANTGRADIENT");

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
	 * The '<em><b>PARABOLICARC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARABOLICARC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARABOLICARC_VALUE = 1;

	/**
	 * The '<em><b>CIRCULARARC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIRCULARARC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CIRCULARARC_VALUE = 2;

	/**
	 * The '<em><b>CLOTHOID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOTHOID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLOTHOID_VALUE = 3;

	/**
	 * The '<em><b>CONSTANTGRADIENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTANTGRADIENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONSTANTGRADIENT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Ifc Alignment Vertical Segment Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcAlignmentVerticalSegmentTypeEnum[] VALUES_ARRAY = new IfcAlignmentVerticalSegmentTypeEnum[] {
			NULL, PARABOLICARC, CIRCULARARC, CLOTHOID, CONSTANTGRADIENT, };

	/**
	 * A public read-only list of all the '<em><b>Ifc Alignment Vertical Segment Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcAlignmentVerticalSegmentTypeEnum> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Alignment Vertical Segment Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IfcAlignmentVerticalSegmentTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcAlignmentVerticalSegmentTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Alignment Vertical Segment Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IfcAlignmentVerticalSegmentTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcAlignmentVerticalSegmentTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Alignment Vertical Segment Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IfcAlignmentVerticalSegmentTypeEnum get(int value) {
		switch (value) {
		case NULL_VALUE:
			return NULL;
		case PARABOLICARC_VALUE:
			return PARABOLICARC;
		case CIRCULARARC_VALUE:
			return CIRCULARARC;
		case CLOTHOID_VALUE:
			return CLOTHOID;
		case CONSTANTGRADIENT_VALUE:
			return CONSTANTGRADIENT;
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
	private IfcAlignmentVerticalSegmentTypeEnum(int value, String name, String literal) {
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

} //IfcAlignmentVerticalSegmentTypeEnum