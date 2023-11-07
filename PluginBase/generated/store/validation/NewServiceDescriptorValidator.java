/**
 *
 * $Id$
 */
package store.validation;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link store.NewServiceDescriptor}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface NewServiceDescriptorValidator {
	boolean validate();

	boolean validateName(String value);

	boolean validateDescription(String value);

	boolean validateProvider(String value);

	boolean validateAuthorizationUrl(String value);

	boolean validateTokenUrl(String value);

	boolean validateResourceUrl(String value);

	boolean validateRegisterUrl(String value);

	boolean validateInputs(EList<String> value);

	boolean validateOutputs(EList<String> value);
}
