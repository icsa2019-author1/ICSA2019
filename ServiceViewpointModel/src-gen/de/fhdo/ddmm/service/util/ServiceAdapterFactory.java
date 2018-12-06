/**
 */
package de.fhdo.ddmm.service.util;

import de.fhdo.ddmm.service.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.fhdo.ddmm.service.ServicePackage
 * @generated
 */
public class ServiceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ServicePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ServicePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceSwitch<Adapter> modelSwitch =
		new ServiceSwitch<Adapter>() {
			@Override
			public Adapter caseServiceModel(ServiceModel object) {
				return createServiceModelAdapter();
			}
			@Override
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter caseMicroservice(Microservice object) {
				return createMicroserviceAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseReferredOperation(ReferredOperation object) {
				return createReferredOperationAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter casePossiblyImportedMicroservice(PossiblyImportedMicroservice object) {
				return createPossiblyImportedMicroserviceAdapter();
			}
			@Override
			public Adapter casePossiblyImportedInterface(PossiblyImportedInterface object) {
				return createPossiblyImportedInterfaceAdapter();
			}
			@Override
			public Adapter casePossiblyImportedOperation(PossiblyImportedOperation object) {
				return createPossiblyImportedOperationAdapter();
			}
			@Override
			public Adapter caseImportedType(ImportedType object) {
				return createImportedTypeAdapter();
			}
			@Override
			public Adapter caseImportedProtocolAndDataFormat(ImportedProtocolAndDataFormat object) {
				return createImportedProtocolAndDataFormatAdapter();
			}
			@Override
			public Adapter caseProtocolSpecification(ProtocolSpecification object) {
				return createProtocolSpecificationAdapter();
			}
			@Override
			public Adapter caseEndpoint(Endpoint object) {
				return createEndpointAdapter();
			}
			@Override
			public Adapter caseImportedServiceAspect(ImportedServiceAspect object) {
				return createImportedServiceAspectAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.service.ServiceModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fhdo.ddmm.service.ServiceModel
	 * @generated
	 */
	public Adapter createServiceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.service.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fhdo.ddmm.service.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.service.Microservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fhdo.ddmm.service.Microservice
	 * @generated
	 */
	public Adapter createMicroserviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.service.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fhdo.ddmm.service.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.service.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fhdo.ddmm.service.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.service.ReferredOperation <em>Referred Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fhdo.ddmm.service.ReferredOperation
	 * @generated
	 */
	public Adapter createReferredOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.service.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fhdo.ddmm.service.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.service.PossiblyImportedMicroservice <em>Possibly Imported Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fhdo.ddmm.service.PossiblyImportedMicroservice
	 * @generated
	 */
	public Adapter createPossiblyImportedMicroserviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.service.PossiblyImportedInterface <em>Possibly Imported Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fhdo.ddmm.service.PossiblyImportedInterface
	 * @generated
	 */
	public Adapter createPossiblyImportedInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.service.PossiblyImportedOperation <em>Possibly Imported Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fhdo.ddmm.service.PossiblyImportedOperation
	 * @generated
	 */
	public Adapter createPossiblyImportedOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.service.ImportedType <em>Imported Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fhdo.ddmm.service.ImportedType
	 * @generated
	 */
	public Adapter createImportedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.service.ImportedProtocolAndDataFormat <em>Imported Protocol And Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fhdo.ddmm.service.ImportedProtocolAndDataFormat
	 * @generated
	 */
	public Adapter createImportedProtocolAndDataFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.service.ProtocolSpecification <em>Protocol Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fhdo.ddmm.service.ProtocolSpecification
	 * @generated
	 */
	public Adapter createProtocolSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.service.Endpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fhdo.ddmm.service.Endpoint
	 * @generated
	 */
	public Adapter createEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.service.ImportedServiceAspect <em>Imported Service Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fhdo.ddmm.service.ImportedServiceAspect
	 * @generated
	 */
	public Adapter createImportedServiceAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ServiceAdapterFactory
