/**
 *
 * $Id$
 */
package org.bimserver.models.ifc4x3.validation;

import org.bimserver.models.ifc4x3.IfcCartesianPoint;

/**
 * A sample validator interface for {@link org.bimserver.models.ifc4x3.IfcLightSourcePositional}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface IfcLightSourcePositionalValidator {
	boolean validate();

	boolean validatePosition(IfcCartesianPoint value);

	boolean validateRadius(double value);

	boolean validateRadiusAsString(String value);

	boolean validateConstantAttenuation(double value);

	boolean validateConstantAttenuationAsString(String value);

	boolean validateDistanceAttenuation(double value);

	boolean validateDistanceAttenuationAsString(String value);

	boolean validateQuadricAttenuation(double value);

	boolean validateQuadricAttenuationAsString(String value);
}
