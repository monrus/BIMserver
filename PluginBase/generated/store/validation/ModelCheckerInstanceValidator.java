/**
 *
 * $Id$
 */
package store.validation;

/**
 * A sample validator interface for {@link store.ModelCheckerInstance}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ModelCheckerInstanceValidator {
	boolean validate();

	boolean validateName(String value);

	boolean validateDescription(String value);

	boolean validateCode(String value);

	boolean validateCompiled(byte[] value);

	boolean validateValid(boolean value);

	boolean validateModelCheckerPluginClassName(String value);
}
