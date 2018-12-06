/**
 */
package de.fhdo.ddmm.technology.mapping.util;

import de.fhdo.ddmm.technology.mapping.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.fhdo.ddmm.technology.mapping.MappingPackage
 * @generated
 */
public class MappingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MappingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingSwitch() {
		if (modelPackage == null) {
			modelPackage = MappingPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MappingPackage.TECHNOLOGY_MAPPING: {
				TechnologyMapping technologyMapping = (TechnologyMapping)theEObject;
				T result = caseTechnologyMapping(technologyMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.MICROSERVICE_MAPPING: {
				MicroserviceMapping microserviceMapping = (MicroserviceMapping)theEObject;
				T result = caseMicroserviceMapping(microserviceMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.IMPORTED_MICROSERVICE: {
				ImportedMicroservice importedMicroservice = (ImportedMicroservice)theEObject;
				T result = caseImportedMicroservice(importedMicroservice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.INTERFACE_MAPPING: {
				InterfaceMapping interfaceMapping = (InterfaceMapping)theEObject;
				T result = caseInterfaceMapping(interfaceMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.OPERATION_MAPPING: {
				OperationMapping operationMapping = (OperationMapping)theEObject;
				T result = caseOperationMapping(operationMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.REFERRED_OPERATION_MAPPING: {
				ReferredOperationMapping referredOperationMapping = (ReferredOperationMapping)theEObject;
				T result = caseReferredOperationMapping(referredOperationMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.PARAMETER_MAPPING: {
				ParameterMapping parameterMapping = (ParameterMapping)theEObject;
				T result = caseParameterMapping(parameterMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.PRIMITIVE_PARAMETER_MAPPING: {
				PrimitiveParameterMapping primitiveParameterMapping = (PrimitiveParameterMapping)theEObject;
				T result = casePrimitiveParameterMapping(primitiveParameterMapping);
				if (result == null) result = caseParameterMapping(primitiveParameterMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.COMPLEX_PARAMETER_MAPPING: {
				ComplexParameterMapping complexParameterMapping = (ComplexParameterMapping)theEObject;
				T result = caseComplexParameterMapping(complexParameterMapping);
				if (result == null) result = caseParameterMapping(complexParameterMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.TECHNOLOGY_SPECIFIC_DATA_FIELD_TYPE_MAPPING: {
				TechnologySpecificDataFieldTypeMapping technologySpecificDataFieldTypeMapping = (TechnologySpecificDataFieldTypeMapping)theEObject;
				T result = caseTechnologySpecificDataFieldTypeMapping(technologySpecificDataFieldTypeMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.DATA_FIELD_HIERARCHY: {
				DataFieldHierarchy dataFieldHierarchy = (DataFieldHierarchy)theEObject;
				T result = caseDataFieldHierarchy(dataFieldHierarchy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.TECHNOLOGY_SPECIFIC_PROTOCOL_SPECIFICATION: {
				TechnologySpecificProtocolSpecification technologySpecificProtocolSpecification = (TechnologySpecificProtocolSpecification)theEObject;
				T result = caseTechnologySpecificProtocolSpecification(technologySpecificProtocolSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.TECHNOLOGY_SPECIFIC_PROTOCOL: {
				TechnologySpecificProtocol technologySpecificProtocol = (TechnologySpecificProtocol)theEObject;
				T result = caseTechnologySpecificProtocol(technologySpecificProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.TECHNOLOGY_SPECIFIC_ENDPOINT: {
				TechnologySpecificEndpoint technologySpecificEndpoint = (TechnologySpecificEndpoint)theEObject;
				T result = caseTechnologySpecificEndpoint(technologySpecificEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.TECHNOLOGY_SPECIFIC_IMPORTED_SERVICE_ASPECT: {
				TechnologySpecificImportedServiceAspect technologySpecificImportedServiceAspect = (TechnologySpecificImportedServiceAspect)theEObject;
				T result = caseTechnologySpecificImportedServiceAspect(technologySpecificImportedServiceAspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technology Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technology Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnologyMapping(TechnologyMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microservice Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microservice Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicroserviceMapping(MicroserviceMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imported Microservice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imported Microservice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportedMicroservice(ImportedMicroservice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceMapping(InterfaceMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationMapping(OperationMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referred Operation Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referred Operation Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferredOperationMapping(ReferredOperationMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterMapping(ParameterMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Parameter Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Parameter Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveParameterMapping(PrimitiveParameterMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Parameter Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Parameter Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexParameterMapping(ComplexParameterMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technology Specific Data Field Type Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technology Specific Data Field Type Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnologySpecificDataFieldTypeMapping(TechnologySpecificDataFieldTypeMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Field Hierarchy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Field Hierarchy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFieldHierarchy(DataFieldHierarchy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technology Specific Protocol Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technology Specific Protocol Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnologySpecificProtocolSpecification(TechnologySpecificProtocolSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technology Specific Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technology Specific Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnologySpecificProtocol(TechnologySpecificProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technology Specific Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technology Specific Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnologySpecificEndpoint(TechnologySpecificEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technology Specific Imported Service Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technology Specific Imported Service Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnologySpecificImportedServiceAspect(TechnologySpecificImportedServiceAspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MappingSwitch
