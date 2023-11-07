/**
 *
 * $Id$
 */
package org.bimserver.models.ifc4x3.validation;

import org.bimserver.models.ifc4x3.IfcDoorTypeEnum;
import org.bimserver.models.ifc4x3.IfcDoorTypeOperationEnum;
import org.bimserver.models.ifc4x3.Tristate;

/**
 * A sample validator interface for {@link org.bimserver.models.ifc4x3.IfcDoorType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface IfcDoorTypeValidator {
	boolean validate();

	boolean validatePredefinedType(IfcDoorTypeEnum value);

	boolean validateOperationType(IfcDoorTypeOperationEnum value);

	boolean validateParameterTakesPrecedence(Tristate value);

	boolean validateUserDefinedOperationType(String value);
}
