/**
 *
 * $Id$
 */
package store.validation;

import org.eclipse.emf.common.util.EList;

import store.ObjectType;
import store.PluginBundleVersion;
import store.PluginConfiguration;

/**
 * A sample validator interface for {@link store.PluginDescriptor}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PluginDescriptorValidator {
	boolean validate();

	boolean validateName(String value);

	boolean validatePluginClassName(String value);

	boolean validateDescription(String value);

	boolean validateLocation(String value);

	boolean validateEnabled(Boolean value);

	boolean validatePluginInterfaceClassName(String value);

	boolean validateConfigurations(EList<PluginConfiguration> value);

	boolean validateIdentifier(String value);

	boolean validateInstallForNewUsers(boolean value);

	boolean validatePluginBundleVersion(PluginBundleVersion value);

	boolean validateSettings(ObjectType value);
}
