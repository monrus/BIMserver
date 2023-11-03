/**
 *
 * $Id$
 */
package org.bimserver.models.ifc4x3.validation;

import org.bimserver.models.ifc4x3.IfcCurve;
import org.bimserver.models.ifc4x3.IfcCurveMeasureSelect;

/**
 * A sample validator interface for {@link org.bimserver.models.ifc4x3.IfcDirectrixCurveSweptAreaSolid}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface IfcDirectrixCurveSweptAreaSolidValidator {
	boolean validate();

	boolean validateDirectrix(IfcCurve value);

	boolean validateStartParam(IfcCurveMeasureSelect value);

	boolean validateEndParam(IfcCurveMeasureSelect value);
}
