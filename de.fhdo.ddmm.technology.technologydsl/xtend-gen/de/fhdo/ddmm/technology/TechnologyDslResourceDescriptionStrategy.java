package de.fhdo.ddmm.technology;

import de.fhdo.ddmm.technology.OperationAspect;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;

/**
 * Custom resource description strategy for the Technology DSL.
 */
@SuppressWarnings("all")
public class TechnologyDslResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
  /**
   * Export selected EObjects from DSL models
   */
  @Override
  public boolean createEObjectDescriptions(final EObject eObject, final IAcceptor<IEObjectDescription> acceptor) {
    if ((eObject instanceof OperationAspect)) {
      acceptor.accept(EObjectDescription.create(((OperationAspect)eObject).getName(), eObject));
      return true;
    }
    return super.createEObjectDescriptions(eObject, acceptor);
  }
}
