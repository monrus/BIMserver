/**
 *
 * $Id$
 */
package org.bimserver.models.ifc4x3.validation;

import org.bimserver.models.ifc4x3.IfcDistributionControlElement;
import org.bimserver.models.ifc4x3.IfcDistributionFlowElement;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link org.bimserver.models.ifc4x3.IfcRelFlowControlElements}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface IfcRelFlowControlElementsValidator {
	boolean validate();

	boolean validateRelatedControlElements(EList<IfcDistributionControlElement> value);

	boolean validateRelatingFlowElement(IfcDistributionFlowElement value);
}
