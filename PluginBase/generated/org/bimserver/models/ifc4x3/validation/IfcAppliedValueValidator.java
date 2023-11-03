/**
 *
 * $Id$
 */
package org.bimserver.models.ifc4x3.validation;

import org.bimserver.models.ifc4x3.IfcAppliedValue;
import org.bimserver.models.ifc4x3.IfcAppliedValueSelect;
import org.bimserver.models.ifc4x3.IfcArithmeticOperatorEnum;
import org.bimserver.models.ifc4x3.IfcExternalReferenceRelationship;
import org.bimserver.models.ifc4x3.IfcMeasureWithUnit;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link org.bimserver.models.ifc4x3.IfcAppliedValue}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface IfcAppliedValueValidator {
	boolean validate();

	boolean validateName(String value);

	boolean validateDescription(String value);

	boolean validateAppliedValue(IfcAppliedValueSelect value);

	boolean validateUnitBasis(IfcMeasureWithUnit value);

	boolean validateApplicableDate(String value);

	boolean validateFixedUntilDate(String value);

	boolean validateCategory(String value);

	boolean validateCondition(String value);

	boolean validateArithmeticOperator(IfcArithmeticOperatorEnum value);

	boolean validateComponents(EList<IfcAppliedValue> value);

	boolean validateHasExternalReference(EList<IfcExternalReferenceRelationship> value);
}
