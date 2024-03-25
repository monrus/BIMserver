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
import org.bimserver.models.ifc4x3.IfcCovering;
import org.bimserver.models.ifc4x3.IfcRelCoversSpaces;
import org.bimserver.models.ifc4x3.IfcSpace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Covers Spaces</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4x3.impl.IfcRelCoversSpacesImpl#getRelatingSpace <em>Relating Space</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4x3.impl.IfcRelCoversSpacesImpl#getRelatedCoverings <em>Related Coverings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcRelCoversSpacesImpl extends IfcRelConnectsImpl implements IfcRelCoversSpaces {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelCoversSpacesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4x3Package.Literals.IFC_REL_COVERS_SPACES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfcSpace getRelatingSpace() {
		return (IfcSpace) eGet(Ifc4x3Package.Literals.IFC_REL_COVERS_SPACES__RELATING_SPACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelatingSpace(IfcSpace newRelatingSpace) {
		eSet(Ifc4x3Package.Literals.IFC_REL_COVERS_SPACES__RELATING_SPACE, newRelatingSpace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<IfcCovering> getRelatedCoverings() {
		return (EList<IfcCovering>) eGet(Ifc4x3Package.Literals.IFC_REL_COVERS_SPACES__RELATED_COVERINGS, true);
	}

} //IfcRelCoversSpacesImpl