/**
 *
 * $Id$
 */
package org.bimserver.models.ifc4x3.validation;

import org.bimserver.models.ifc4x3.IfcTaskDurationEnum;
import org.bimserver.models.ifc4x3.IfcTimeOrRatioSelect;

/**
 * A sample validator interface for {@link org.bimserver.models.ifc4x3.IfcLagTime}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface IfcLagTimeValidator {
	boolean validate();

	boolean validateLagValue(IfcTimeOrRatioSelect value);

	boolean validateDurationType(IfcTaskDurationEnum value);
}
