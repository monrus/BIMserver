/**
 *
 * $Id$
 */
package store.validation;

/**
 * A sample validator interface for {@link store.LongCheckinActionState}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LongCheckinActionStateValidator {
	boolean validate();

	boolean validateRoid(long value);

	boolean validateDeserializeErrorCode(int value);
}
