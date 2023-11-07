/**
 *
 * $Id$
 */
package org.bimserver.models.ifc4x3.validation;

import org.bimserver.models.ifc4x3.IfcConnectionGeometry;
import org.bimserver.models.ifc4x3.IfcElement;

/**
 * A sample validator interface for {@link org.bimserver.models.ifc4x3.IfcRelConnectsElements}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface IfcRelConnectsElementsValidator {
	boolean validate();

	boolean validateConnectionGeometry(IfcConnectionGeometry value);

	boolean validateRelatingElement(IfcElement value);

	boolean validateRelatedElement(IfcElement value);
}
