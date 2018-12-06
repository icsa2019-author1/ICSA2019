package de.fhdo.ddmm.data;

import de.fhdo.ddmm.data.ComplexTypeImport;
import de.fhdo.ddmm.data.PrimitiveType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;

/**
 * Custom resource description strategy for the DataDsl.
 */
@SuppressWarnings("all")
public class DataDslResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
  /**
   * Export selected EObjects from DSL models
   */
  @Override
  public boolean createEObjectDescriptions(final EObject eObject, final IAcceptor<IEObjectDescription> acceptor) {
    boolean _matched = false;
    if (eObject instanceof ComplexTypeImport) {
      _matched=true;
    }
    if (!_matched) {
      if (eObject instanceof PrimitiveType) {
        _matched=true;
      }
    }
    if (_matched) {
      return false;
    }
    return super.createEObjectDescriptions(eObject, acceptor);
  }
}
