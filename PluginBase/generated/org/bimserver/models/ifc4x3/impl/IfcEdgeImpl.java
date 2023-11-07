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
package org.bimserver.models.ifc4x3.impl;

import org.bimserver.models.ifc4x3.Ifc4x3Package;
import org.bimserver.models.ifc4x3.IfcEdge;
import org.bimserver.models.ifc4x3.IfcVertex;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4x3.impl.IfcEdgeImpl#getEdgeStart <em>Edge Start</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3.impl.IfcEdgeImpl#getEdgeEnd <em>Edge End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcEdgeImpl extends IfcTopologicalRepresentationItemImpl implements IfcEdge {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4x3Package.Literals.IFC_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfcVertex getEdgeStart() {
		return (IfcVertex) eGet(Ifc4x3Package.Literals.IFC_EDGE__EDGE_START, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEdgeStart(IfcVertex newEdgeStart) {
		eSet(Ifc4x3Package.Literals.IFC_EDGE__EDGE_START, newEdgeStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfcVertex getEdgeEnd() {
		return (IfcVertex) eGet(Ifc4x3Package.Literals.IFC_EDGE__EDGE_END, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEdgeEnd(IfcVertex newEdgeEnd) {
		eSet(Ifc4x3Package.Literals.IFC_EDGE__EDGE_END, newEdgeEnd);
	}

} //IfcEdgeImpl
