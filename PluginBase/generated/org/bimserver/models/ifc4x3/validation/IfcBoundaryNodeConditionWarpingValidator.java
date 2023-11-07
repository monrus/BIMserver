/**
 *
 * $Id$
 */
package org.bimserver.models.ifc4x3.validation;

import org.bimserver.models.ifc4x3.IfcWarpingStiffnessSelect;

/**
 * A sample validator interface for {@link org.bimserver.models.ifc4x3.IfcBoundaryNodeConditionWarping}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface IfcBoundaryNodeConditionWarpingValidator {
	boolean validate();

	boolean validateWarpingStiffness(IfcWarpingStiffnessSelect value);
}
