package de.fhdo.ddmm;

import de.fhdo.ddmm.service.Microservice;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

/**
 * Custom qualified name provider.
 */
@SuppressWarnings("all")
public class ServiceDslQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
  /**
   * Consider possible version as prefix of a microservice's name
   */
  public QualifiedName qualifiedName(final Microservice microservice) {
    return QualifiedName.create(microservice.getQualifiedNameParts());
  }
}
