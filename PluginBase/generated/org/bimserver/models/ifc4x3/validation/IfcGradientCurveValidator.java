/**
 *
 * $Id$
 */
package org.bimserver.models.ifc4x3.validation;

import org.bimserver.models.ifc4x3.IfcBoundedCurve;
import org.bimserver.models.ifc4x3.IfcPlacement;

/**
 * A sample validator interface for {@link org.bimserver.models.ifc4x3.IfcGradientCurve}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface IfcGradientCurveValidator {
	boolean validate();

	boolean validateBaseCurve(IfcBoundedCurve value);

	boolean validateEndPoint(IfcPlacement value);
}
