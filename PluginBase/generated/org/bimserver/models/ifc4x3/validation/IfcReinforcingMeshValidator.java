/**
 *
 * $Id$
 */
package org.bimserver.models.ifc4x3.validation;

import org.bimserver.models.ifc4x3.IfcReinforcingMeshTypeEnum;

/**
 * A sample validator interface for {@link org.bimserver.models.ifc4x3.IfcReinforcingMesh}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface IfcReinforcingMeshValidator {
	boolean validate();

	boolean validateMeshLength(double value);

	boolean validateMeshLengthAsString(String value);

	boolean validateMeshWidth(double value);

	boolean validateMeshWidthAsString(String value);

	boolean validateLongitudinalBarNominalDiameter(double value);

	boolean validateLongitudinalBarNominalDiameterAsString(String value);

	boolean validateTransverseBarNominalDiameter(double value);

	boolean validateTransverseBarNominalDiameterAsString(String value);

	boolean validateLongitudinalBarCrossSectionArea(double value);

	boolean validateLongitudinalBarCrossSectionAreaAsString(String value);

	boolean validateTransverseBarCrossSectionArea(double value);

	boolean validateTransverseBarCrossSectionAreaAsString(String value);

	boolean validateLongitudinalBarSpacing(double value);

	boolean validateLongitudinalBarSpacingAsString(String value);

	boolean validateTransverseBarSpacing(double value);

	boolean validateTransverseBarSpacingAsString(String value);

	boolean validatePredefinedType(IfcReinforcingMeshTypeEnum value);
}
