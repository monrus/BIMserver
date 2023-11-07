/**
 *
 * $Id$
 */
package org.bimserver.models.ifc4x3.validation;

import org.bimserver.models.ifc4x3.IfcCurve;
import org.bimserver.models.ifc4x3.IfcGrid;
import org.bimserver.models.ifc4x3.IfcVirtualGridIntersection;
import org.bimserver.models.ifc4x3.Tristate;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link org.bimserver.models.ifc4x3.IfcGridAxis}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface IfcGridAxisValidator {
	boolean validate();

	boolean validateAxisTag(String value);

	boolean validateAxisCurve(IfcCurve value);

	boolean validateSameSense(Tristate value);

	boolean validatePartOfW(EList<IfcGrid> value);

	boolean validatePartOfV(EList<IfcGrid> value);

	boolean validatePartOfU(EList<IfcGrid> value);

	boolean validateHasIntersections(EList<IfcVirtualGridIntersection> value);
}
