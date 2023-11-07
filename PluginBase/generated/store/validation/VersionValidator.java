/**
 *
 * $Id$
 */
package store.validation;

import java.util.Date;

/**
 * A sample validator interface for {@link store.Version}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface VersionValidator {
	boolean validate();

	boolean validateMajor(Integer value);

	boolean validateMinor(Integer value);

	boolean validateRevision(Integer value);

	boolean validateFullString(String value);

	boolean validateDate(Date value);

	boolean validateDownloadUrl(String value);

	boolean validateSupportUrl(String value);

	boolean validateSupportEmail(String value);
}
