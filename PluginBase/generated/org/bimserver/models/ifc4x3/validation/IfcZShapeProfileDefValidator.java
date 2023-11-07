/**
 *
 * $Id$
 */
package org.bimserver.models.ifc4x3.validation;

/**
 * A sample validator interface for {@link org.bimserver.models.ifc4x3.IfcZShapeProfileDef}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface IfcZShapeProfileDefValidator {
	boolean validate();

	boolean validateDepth(double value);

	boolean validateDepthAsString(String value);

	boolean validateFlangeWidth(double value);

	boolean validateFlangeWidthAsString(String value);

	boolean validateWebThickness(double value);

	boolean validateWebThicknessAsString(String value);

	boolean validateFlangeThickness(double value);

	boolean validateFlangeThicknessAsString(String value);

	boolean validateFilletRadius(double value);

	boolean validateFilletRadiusAsString(String value);

	boolean validateEdgeRadius(double value);

	boolean validateEdgeRadiusAsString(String value);
}
