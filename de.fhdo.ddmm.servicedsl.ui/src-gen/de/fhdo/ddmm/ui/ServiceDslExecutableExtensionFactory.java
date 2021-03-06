/*
 * generated by Xtext 2.12.0
 */
package de.fhdo.ddmm.ui;

import com.google.inject.Injector;
import de.fhdo.ddmm.servicedsl.ui.internal.ServicedslActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ServiceDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ServicedslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ServicedslActivator.getInstance().getInjector(ServicedslActivator.DE_FHDO_DDMM_SERVICEDSL);
	}
	
}
