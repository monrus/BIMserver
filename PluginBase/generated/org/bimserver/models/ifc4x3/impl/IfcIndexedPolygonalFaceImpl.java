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
import org.bimserver.models.ifc4x3.IfcIndexedPolygonalFace;
import org.bimserver.models.ifc4x3.IfcPolygonalFaceSet;
import org.bimserver.models.ifc4x3.IfcTextureCoordinateIndices;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Indexed Polygonal Face</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4x3.impl.IfcIndexedPolygonalFaceImpl#getCoordIndex <em>Coord Index</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3.impl.IfcIndexedPolygonalFaceImpl#getToFaceSet <em>To Face Set</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3.impl.IfcIndexedPolygonalFaceImpl#getHasTexCoords <em>Has Tex Coords</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcIndexedPolygonalFaceImpl extends IfcTessellatedItemImpl implements IfcIndexedPolygonalFace {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcIndexedPolygonalFaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4x3Package.Literals.IFC_INDEXED_POLYGONAL_FACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Long> getCoordIndex() {
		return (EList<Long>) eGet(Ifc4x3Package.Literals.IFC_INDEXED_POLYGONAL_FACE__COORD_INDEX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<IfcPolygonalFaceSet> getToFaceSet() {
		return (EList<IfcPolygonalFaceSet>) eGet(Ifc4x3Package.Literals.IFC_INDEXED_POLYGONAL_FACE__TO_FACE_SET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetToFaceSet() {
		eUnset(Ifc4x3Package.Literals.IFC_INDEXED_POLYGONAL_FACE__TO_FACE_SET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetToFaceSet() {
		return eIsSet(Ifc4x3Package.Literals.IFC_INDEXED_POLYGONAL_FACE__TO_FACE_SET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<IfcTextureCoordinateIndices> getHasTexCoords() {
		return (EList<IfcTextureCoordinateIndices>) eGet(
				Ifc4x3Package.Literals.IFC_INDEXED_POLYGONAL_FACE__HAS_TEX_COORDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHasTexCoords() {
		eUnset(Ifc4x3Package.Literals.IFC_INDEXED_POLYGONAL_FACE__HAS_TEX_COORDS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHasTexCoords() {
		return eIsSet(Ifc4x3Package.Literals.IFC_INDEXED_POLYGONAL_FACE__HAS_TEX_COORDS);
	}

} //IfcIndexedPolygonalFaceImpl
