/**
 */
package de.fhdo.ddmm.technology.mapping.util;

import de.fhdo.ddmm.technology.mapping.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.fhdo.ddmm.technology.mapping.MappingPackage
 * @generated
 */
public class MappingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MappingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MappingPackage.eINSTANCE;
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
	protected MappingSwitch<Adapter> modelSwitch =
		new MappingSwitch<Adapter>() {
			@Override
			public Adapter caseTechnologyMapping(TechnologyMapping object) {
				return createTechnologyMappingAdapter();
			}
			@Override
			public Adapter caseMicroserviceMapping(MicroserviceMapping object) {
				return createMicroserviceMappingAdapter();
			}
			@Override
			public Adapter caseImportedMicroservice(ImportedMicroservice object) {
				return createImportedMicroserviceAdapter();
			}
			@Override
			public Adapter caseInterfaceMapping(InterfaceMapping object) {
				return createInterfaceMappingAdapter();
			}
			@Override
			public Adapter caseOperationMapping(OperationMapping object) {
				return createOperationMappingAdapter();
			}
			@Override
			public Adapter caseReferredOperationMapping(ReferredOperationMapping object) {
				return createReferredOperationMappingAdapter();
			}
			@Override
			public Adapter caseParameterMapping(ParameterMapping object) {
				return createParameterMappingAdapter();
			}
			@Override
			public Adapter casePrimitiveParameterMapping(PrimitiveParameterMapping object) {
				return createPrimitiveParameterMappingAdapter();
			}
			@Override
			public Adapter caseComplexParameterMapping(ComplexParameterMapping object) {
				return createComplexParameterMappingAdapter();
			}
			@Override
			public Adapter caseTechnologySpecificDataFieldTypeMapping(TechnologySpecificDataFieldTypeMapping object) {
				return createTechnologySpecificDataFieldTypeMappingAdapter();
			}
			@Override
			public Adapter caseDataFieldHierarchy(DataFieldHierarchy object) {
				return createDataFieldHierarchyAdapter();
			}
			@Override
			public Adapter caseTechnologySpecificProtocolSpecification(TechnologySpecificProtocolSpecification object) {
				return createTechnologySpecificProtocolSpecificationAdapter();
			}
			@Override
			public Adapter caseTechnologySpecificProtocol(TechnologySpecificProtocol object) {
				return createTechnologySpecificProtocolAdapter();
			}
			@Override
			public Adapter caseTechnologySpecificEndpoint(TechnologySpecificEndpoint object) {
				return createTechnologySpecificEndpointAdapter();
			}
			@Override
			public Adapter caseTechnologySpecificImportedServiceAspect(TechnologySpecificImportedServiceAspect object) {
				return createTechnologySpecificImportedServiceAspectAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.technology.mapping.TechnologyMapping <em>Technology Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fhdo.ddmm.technology.mapping.TechnologyMapping
	 * @generated
	 */
	public Adapter createTechnologyMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.technology.mapping.MicroserviceMapping <em>Microservice Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fhdo.ddmm.technology.mapping.MicroserviceMapping
	 * @generated
	 */
	public Adapter createMicroserviceMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.technology.mapping.ImportedMicroservice <em>Imported Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fhdo.ddmm.technology.mapping.ImportedMicroservice
	 * @generated
	 */
	public Adapter createImportedMicroserviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.technology.mapping.InterfaceMapping <em>Interface Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fhdo.ddmm.technology.mapping.InterfaceMapping
	 * @generated
	 */
	public Adapter createInterfaceMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.technology.mapping.OperationMapping <em>Operation Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fhdo.ddmm.technology.mapping.OperationMapping
	 * @generated
	 */
	public Adapter createOperationMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.technology.mapping.ReferredOperationMapping <em>Referred Operation Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fhdo.ddmm.technology.mapping.ReferredOperationMapping
	 * @generated
	 */
	public Adapter createReferredOperationMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.technology.mapping.ParameterMapping <em>Parameter Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fhdo.ddmm.technology.mapping.ParameterMapping
	 * @generated
	 */
	public Adapter createParameterMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.technology.mapping.PrimitiveParameterMapping <em>Primitive Parameter Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fhdo.ddmm.technology.mapping.PrimitiveParameterMapping
	 * @generated
	 */
	public Adapter createPrimitiveParameterMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.technology.mapping.ComplexParameterMapping <em>Complex Parameter Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fhdo.ddmm.technology.mapping.ComplexParameterMapping
	 * @generated
	 */
	public Adapter createComplexParameterMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificDataFieldTypeMapping <em>Technology Specific Data Field Type Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificDataFieldTypeMapping
	 * @generated
	 */
	public Adapter createTechnologySpecificDataFieldTypeMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.technology.mapping.DataFieldHierarchy <em>Data Field Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fhdo.ddmm.technology.mapping.DataFieldHierarchy
	 * @generated
	 */
	public Adapter createDataFieldHierarchyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificProtocolSpecification <em>Technology Specific Protocol Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificProtocolSpecification
	 * @generated
	 */
	public Adapter createTechnologySpecificProtocolSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificProtocol <em>Technology Specific Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificProtocol
	 * @generated
	 */
	public Adapter createTechnologySpecificProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificEndpoint <em>Technology Specific Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificEndpoint
	 * @generated
	 */
	public Adapter createTechnologySpecificEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.fhdo.ddmm.technology.mapping.TechnologySpecificImportedServiceAspect <em>Technology Specific Imported Service Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.fhdo.ddmm.technology.mapping.TechnologySpecificImportedServiceAspect
	 * @generated
	 */
	public Adapter createTechnologySpecificImportedServiceAspectAdapter() {
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

} //MappingAdapterFactory
