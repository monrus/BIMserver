package org.bimserver.changes;

/******************************************************************************
 * Copyright (C) 2009-2019  BIMserver.org
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
 * along with this program.  If not, see {@literal<http://www.gnu.org/licenses/>}.
 *****************************************************************************/

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc4.Ifc4Package;
import org.bimserver.models.ifc4x3.Ifc4x3Package;
import org.eclipse.emf.ecore.EClass;

public class ChangeHelper {
	private ChangeHelper() {}

	public static boolean canBeChanged(EClass eClass) {
		return eClass.getEPackage() == Ifc2x3tc1Package.eINSTANCE || eClass.getEPackage() == Ifc4Package.eINSTANCE || eClass.getEPackage() == Ifc4x3Package.eINSTANCE;
	}
}
