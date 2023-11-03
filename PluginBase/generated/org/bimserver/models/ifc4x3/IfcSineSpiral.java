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
 * A representation of the model object '<em><b>Ifc Sine Spiral</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4x3.IfcSineSpiral#getSineTerm <em>Sine Term</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3.IfcSineSpiral#getSineTermAsString <em>Sine Term As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3.IfcSineSpiral#getLinearTerm <em>Linear Term</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3.IfcSineSpiral#getLinearTermAsString <em>Linear Term As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3.IfcSineSpiral#getConstantTerm <em>Constant Term</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3.IfcSineSpiral#getConstantTermAsString <em>Constant Term As String</em>}</li>
 * </ul>
 *
 * @see org.bimserver.models.ifc4x3.Ifc4x3Package#getIfcSineSpiral()
 * @model
 * @generated
 */
public interface IfcSineSpiral extends IfcSpiral {
	/**
	 * Returns the value of the '<em><b>Sine Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sine Term</em>' attribute.
	 * @see #setSineTerm(double)
	 * @see org.bimserver.models.ifc4x3.Ifc4x3Package#getIfcSineSpiral_SineTerm()
	 * @model
	 * @generated
	 */
	double getSineTerm();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4x3.IfcSineSpiral#getSineTerm <em>Sine Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sine Term</em>' attribute.
	 * @see #getSineTerm()
	 * @generated
	 */
	void setSineTerm(double value);

	/**
	 * Returns the value of the '<em><b>Sine Term As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sine Term As String</em>' attribute.
	 * @see #setSineTermAsString(String)
	 * @see org.bimserver.models.ifc4x3.Ifc4x3Package#getIfcSineSpiral_SineTermAsString()
	 * @model annotation="asstring"
	 *        annotation="hidden"
	 * @generated
	 */
	String getSineTermAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4x3.IfcSineSpiral#getSineTermAsString <em>Sine Term As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sine Term As String</em>' attribute.
	 * @see #getSineTermAsString()
	 * @generated
	 */
	void setSineTermAsString(String value);

	/**
	 * Returns the value of the '<em><b>Linear Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Term</em>' attribute.
	 * @see #isSetLinearTerm()
	 * @see #unsetLinearTerm()
	 * @see #setLinearTerm(double)
	 * @see org.bimserver.models.ifc4x3.Ifc4x3Package#getIfcSineSpiral_LinearTerm()
	 * @model unsettable="true"
	 * @generated
	 */
	double getLinearTerm();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4x3.IfcSineSpiral#getLinearTerm <em>Linear Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Term</em>' attribute.
	 * @see #isSetLinearTerm()
	 * @see #unsetLinearTerm()
	 * @see #getLinearTerm()
	 * @generated
	 */
	void setLinearTerm(double value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4x3.IfcSineSpiral#getLinearTerm <em>Linear Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearTerm()
	 * @see #getLinearTerm()
	 * @see #setLinearTerm(double)
	 * @generated
	 */
	void unsetLinearTerm();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4x3.IfcSineSpiral#getLinearTerm <em>Linear Term</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Term</em>' attribute is set.
	 * @see #unsetLinearTerm()
	 * @see #getLinearTerm()
	 * @see #setLinearTerm(double)
	 * @generated
	 */
	boolean isSetLinearTerm();

	/**
	 * Returns the value of the '<em><b>Linear Term As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Term As String</em>' attribute.
	 * @see #isSetLinearTermAsString()
	 * @see #unsetLinearTermAsString()
	 * @see #setLinearTermAsString(String)
	 * @see org.bimserver.models.ifc4x3.Ifc4x3Package#getIfcSineSpiral_LinearTermAsString()
	 * @model unsettable="true"
	 *        annotation="asstring"
	 *        annotation="hidden"
	 * @generated
	 */
	String getLinearTermAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4x3.IfcSineSpiral#getLinearTermAsString <em>Linear Term As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Term As String</em>' attribute.
	 * @see #isSetLinearTermAsString()
	 * @see #unsetLinearTermAsString()
	 * @see #getLinearTermAsString()
	 * @generated
	 */
	void setLinearTermAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4x3.IfcSineSpiral#getLinearTermAsString <em>Linear Term As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearTermAsString()
	 * @see #getLinearTermAsString()
	 * @see #setLinearTermAsString(String)
	 * @generated
	 */
	void unsetLinearTermAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4x3.IfcSineSpiral#getLinearTermAsString <em>Linear Term As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Term As String</em>' attribute is set.
	 * @see #unsetLinearTermAsString()
	 * @see #getLinearTermAsString()
	 * @see #setLinearTermAsString(String)
	 * @generated
	 */
	boolean isSetLinearTermAsString();

	/**
	 * Returns the value of the '<em><b>Constant Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Term</em>' attribute.
	 * @see #isSetConstantTerm()
	 * @see #unsetConstantTerm()
	 * @see #setConstantTerm(double)
	 * @see org.bimserver.models.ifc4x3.Ifc4x3Package#getIfcSineSpiral_ConstantTerm()
	 * @model unsettable="true"
	 * @generated
	 */
	double getConstantTerm();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4x3.IfcSineSpiral#getConstantTerm <em>Constant Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant Term</em>' attribute.
	 * @see #isSetConstantTerm()
	 * @see #unsetConstantTerm()
	 * @see #getConstantTerm()
	 * @generated
	 */
	void setConstantTerm(double value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4x3.IfcSineSpiral#getConstantTerm <em>Constant Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConstantTerm()
	 * @see #getConstantTerm()
	 * @see #setConstantTerm(double)
	 * @generated
	 */
	void unsetConstantTerm();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4x3.IfcSineSpiral#getConstantTerm <em>Constant Term</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Constant Term</em>' attribute is set.
	 * @see #unsetConstantTerm()
	 * @see #getConstantTerm()
	 * @see #setConstantTerm(double)
	 * @generated
	 */
	boolean isSetConstantTerm();

	/**
	 * Returns the value of the '<em><b>Constant Term As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Term As String</em>' attribute.
	 * @see #isSetConstantTermAsString()
	 * @see #unsetConstantTermAsString()
	 * @see #setConstantTermAsString(String)
	 * @see org.bimserver.models.ifc4x3.Ifc4x3Package#getIfcSineSpiral_ConstantTermAsString()
	 * @model unsettable="true"
	 *        annotation="asstring"
	 *        annotation="hidden"
	 * @generated
	 */
	String getConstantTermAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc4x3.IfcSineSpiral#getConstantTermAsString <em>Constant Term As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant Term As String</em>' attribute.
	 * @see #isSetConstantTermAsString()
	 * @see #unsetConstantTermAsString()
	 * @see #getConstantTermAsString()
	 * @generated
	 */
	void setConstantTermAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc4x3.IfcSineSpiral#getConstantTermAsString <em>Constant Term As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConstantTermAsString()
	 * @see #getConstantTermAsString()
	 * @see #setConstantTermAsString(String)
	 * @generated
	 */
	void unsetConstantTermAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc4x3.IfcSineSpiral#getConstantTermAsString <em>Constant Term As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Constant Term As String</em>' attribute is set.
	 * @see #unsetConstantTermAsString()
	 * @see #getConstantTermAsString()
	 * @see #setConstantTermAsString(String)
	 * @generated
	 */
	boolean isSetConstantTermAsString();

} // IfcSineSpiral
