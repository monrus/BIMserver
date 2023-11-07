/**
 *
 * $Id$
 */
package org.bimserver.models.ifc4x3.validation;

import org.bimserver.models.ifc4x3.IfcAssemblyPlaceEnum;
import org.bimserver.models.ifc4x3.IfcFurnitureTypeEnum;

/**
 * A sample validator interface for {@link org.bimserver.models.ifc4x3.IfcFurnitureType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface IfcFurnitureTypeValidator {
	boolean validate();

	boolean validateAssemblyPlace(IfcAssemblyPlaceEnum value);

	boolean validatePredefinedType(IfcFurnitureTypeEnum value);
}
