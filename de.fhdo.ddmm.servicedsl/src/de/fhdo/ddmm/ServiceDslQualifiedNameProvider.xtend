package de.fhdo.ddmm

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import de.fhdo.ddmm.service.Microservice
import org.eclipse.xtext.naming.QualifiedName

/**
 * Custom qualified name provider.
 *
 * 
 */
class ServiceDslQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
    /**
     * Consider possible version as prefix of a microservice's name
     */
    def qualifiedName(Microservice microservice) {
        return QualifiedName.create(microservice.qualifiedNameParts)
    }
}