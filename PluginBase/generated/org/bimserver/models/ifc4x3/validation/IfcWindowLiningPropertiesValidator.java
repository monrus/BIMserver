/**
 *
 * $Id$
 */
package org.bimserver.models.ifc4x3.validation;

import org.bimserver.models.ifc4x3.IfcShapeAspect;

/**
 * A sample validator interface for {@link org.bimserver.models.ifc4x3.IfcWindowLiningProperties}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface IfcWindowLiningPropertiesValidator {
	boolean validate();

	boolean validateLiningDepth(double value);

	boolean validateLiningDepthAsString(String value);

	boolean validateLiningThickness(double value);

	boolean validateLiningThicknessAsString(String value);

	boolean validateTransomThickness(double value);

	boolean validateTransomThicknessAsString(String value);

	boolean validateMullionThickness(double value);

	boolean validateMullionThicknessAsString(String value);

	boolean validateFirstTransomOffset(double value);

	boolean validateFirstTransomOffsetAsString(String value);

	boolean validateSecondTransomOffset(double value);

	boolean validateSecondTransomOffsetAsString(String value);

	boolean validateFirstMullionOffset(double value);

	boolean validateFirstMullionOffsetAsString(String value);

	boolean validateSecondMullionOffset(double value);

	boolean validateSecondMullionOffsetAsString(String value);

	boolean validateShapeAspectStyle(IfcShapeAspect value);

	boolean validateLiningOffset(double value);

	boolean validateLiningOffsetAsString(String value);

	boolean validateLiningToPanelOffsetX(double value);

	boolean validateLiningToPanelOffsetXAsString(String value);

	boolean validateLiningToPanelOffsetY(double value);

	boolean validateLiningToPanelOffsetYAsString(String value);
}
