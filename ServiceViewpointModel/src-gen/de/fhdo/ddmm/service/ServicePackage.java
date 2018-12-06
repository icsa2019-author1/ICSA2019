/**
 */
package de.fhdo.ddmm.service;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.fhdo.ddmm.service.ServiceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='de.fhdo.ddmm'"
 * @generated
 */
public interface ServicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "service";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "de.fhdo.ddmm.service";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "service";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServicePackage eINSTANCE = de.fhdo.ddmm.service.impl.ServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.service.impl.ServiceModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.service.impl.ServiceModelImpl
	 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getServiceModel()
	 * @generated
	 */
	int SERVICE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MODEL__IMPORTS = 0;

	/**
	 * The feature id for the '<em><b>Microservices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MODEL__MICROSERVICES = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MODEL_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Contained Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MODEL___GET_CONTAINED_OPERATIONS = 0;

	/**
	 * The operation id for the '<em>Get Contained Referred Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MODEL___GET_CONTAINED_REFERRED_OPERATIONS = 1;

	/**
	 * The operation id for the '<em>Get Contained Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MODEL___GET_CONTAINED_INTERFACES = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MODEL_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.service.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.service.impl.ImportImpl
	 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORT_URI = 1;

	/**
	 * The feature id for the '<em><b>Import Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Service Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__SERVICE_MODEL = 3;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.service.impl.MicroserviceImpl <em>Microservice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.service.impl.MicroserviceImpl
	 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getMicroservice()
	 * @generated
	 */
	int MICROSERVICE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__VISIBILITY = 3;

	/**
	 * The feature id for the '<em><b>Technologies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__TECHNOLOGIES = 4;

	/**
	 * The feature id for the '<em><b>Endpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__ENDPOINTS = 5;

	/**
	 * The feature id for the '<em><b>Required Microservices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__REQUIRED_MICROSERVICES = 6;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__REQUIRED_INTERFACES = 7;

	/**
	 * The feature id for the '<em><b>Required Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__REQUIRED_OPERATIONS = 8;

	/**
	 * The feature id for the '<em><b>Protocols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__PROTOCOLS = 9;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__INTERFACES = 10;

	/**
	 * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__ASPECTS = 11;

	/**
	 * The feature id for the '<em><b>Service Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__SERVICE_MODEL = 12;

	/**
	 * The feature id for the '<em><b>Effectively Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__EFFECTIVELY_IMPLEMENTED = 13;

	/**
	 * The feature id for the '<em><b>Effective Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__EFFECTIVE_VISIBILITY = 14;

	/**
	 * The feature id for the '<em><b>Effectively Internal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__EFFECTIVELY_INTERNAL = 15;

	/**
	 * The number of structural features of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_FEATURE_COUNT = 16;

	/**
	 * The operation id for the '<em>Get Qualified Name Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE___GET_QUALIFIED_NAME_PARTS = 0;

	/**
	 * The operation id for the '<em>Get Contained Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE___GET_CONTAINED_OPERATIONS = 1;

	/**
	 * The operation id for the '<em>Get Contained Referred Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE___GET_CONTAINED_REFERRED_OPERATIONS = 2;

	/**
	 * The operation id for the '<em>Get Required Imports</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE___GET_REQUIRED_IMPORTS = 3;

	/**
	 * The operation id for the '<em>Get All Required Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE___GET_ALL_REQUIRED_OPERATIONS__IMPORT = 4;

	/**
	 * The operation id for the '<em>Get All Required Microservices</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE___GET_ALL_REQUIRED_MICROSERVICES = 5;

	/**
	 * The operation id for the '<em>Can Require</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE___CAN_REQUIRE__MICROSERVICE_BOOLEAN = 6;

	/**
	 * The operation id for the '<em>Can Require</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE___CAN_REQUIRE__INTERFACE_BOOLEAN = 7;

	/**
	 * The operation id for the '<em>Can Require</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE___CAN_REQUIRE__OPERATION_BOOLEAN = 8;

	/**
	 * The number of operations of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.service.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.service.impl.InterfaceImpl
	 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Not Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NOT_IMPLEMENTED = 1;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__VISIBILITY = 2;

	/**
	 * The feature id for the '<em><b>Endpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ENDPOINTS = 3;

	/**
	 * The feature id for the '<em><b>Protocols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__PROTOCOLS = 4;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__OPERATIONS = 5;

	/**
	 * The feature id for the '<em><b>Referred Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__REFERRED_OPERATIONS = 6;

	/**
	 * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ASPECTS = 7;

	/**
	 * The feature id for the '<em><b>Microservice</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__MICROSERVICE = 8;

	/**
	 * The feature id for the '<em><b>Effective Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__EFFECTIVE_VISIBILITY = 9;

	/**
	 * The feature id for the '<em><b>Effectively Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__EFFECTIVELY_IMPLEMENTED = 10;

	/**
	 * The feature id for the '<em><b>Effectively Internal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__EFFECTIVELY_INTERNAL = 11;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 12;

	/**
	 * The operation id for the '<em>Get Qualified Name Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___GET_QUALIFIED_NAME_PARTS = 0;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.service.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.service.impl.OperationImpl
	 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Not Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NOT_IMPLEMENTED = 1;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__VISIBILITY = 2;

	/**
	 * The feature id for the '<em><b>Endpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ENDPOINTS = 3;

	/**
	 * The feature id for the '<em><b>Protocols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PROTOCOLS = 4;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMETERS = 5;

	/**
	 * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ASPECTS = 6;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__INTERFACE = 7;

	/**
	 * The feature id for the '<em><b>Not Implemented By Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NOT_IMPLEMENTED_BY_CONTAINER = 8;

	/**
	 * The feature id for the '<em><b>Effectively Not Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__EFFECTIVELY_NOT_IMPLEMENTED = 9;

	/**
	 * The feature id for the '<em><b>Effective Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__EFFECTIVE_VISIBILITY = 10;

	/**
	 * The feature id for the '<em><b>Effectively Internal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__EFFECTIVELY_INTERNAL = 11;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 12;

	/**
	 * The operation id for the '<em>Get Qualified Name Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_QUALIFIED_NAME_PARTS = 0;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.service.impl.ReferredOperationImpl <em>Referred Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.service.impl.ReferredOperationImpl
	 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getReferredOperation()
	 * @generated
	 */
	int REFERRED_OPERATION = 5;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRED_OPERATION__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Endpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRED_OPERATION__ENDPOINTS = 1;

	/**
	 * The feature id for the '<em><b>Protocols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRED_OPERATION__PROTOCOLS = 2;

	/**
	 * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRED_OPERATION__ASPECTS = 3;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRED_OPERATION__INTERFACE = 4;

	/**
	 * The number of structural features of the '<em>Referred Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRED_OPERATION_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get Qualified Name Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRED_OPERATION___GET_QUALIFIED_NAME_PARTS = 0;

	/**
	 * The number of operations of the '<em>Referred Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRED_OPERATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.service.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.service.impl.ParameterImpl
	 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Exchange Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__EXCHANGE_PATTERN = 1;

	/**
	 * The feature id for the '<em><b>Communication Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__COMMUNICATION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Communicates Fault</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__COMMUNICATES_FAULT = 3;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OPTIONAL = 4;

	/**
	 * The feature id for the '<em><b>Initialized By Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__INITIALIZED_BY_OPERATION = 5;

	/**
	 * The feature id for the '<em><b>Imported Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__IMPORTED_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PRIMITIVE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ASPECTS = 8;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OPERATION = 9;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 10;

	/**
	 * The operation id for the '<em>Basically Initializable By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___BASICALLY_INITIALIZABLE_BY__OPERATION = 0;

	/**
	 * The operation id for the '<em>Get Effective Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_EFFECTIVE_TYPE = 1;

	/**
	 * The operation id for the '<em>Get Effective Type Qualified Name Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_EFFECTIVE_TYPE_QUALIFIED_NAME_PARTS = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.service.impl.PossiblyImportedMicroserviceImpl <em>Possibly Imported Microservice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.service.impl.PossiblyImportedMicroserviceImpl
	 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getPossiblyImportedMicroservice()
	 * @generated
	 */
	int POSSIBLY_IMPORTED_MICROSERVICE = 7;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_MICROSERVICE__IMPORT = 0;

	/**
	 * The feature id for the '<em><b>Microservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_MICROSERVICE__MICROSERVICE = 1;

	/**
	 * The feature id for the '<em><b>Requiring Microservice</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_MICROSERVICE__REQUIRING_MICROSERVICE = 2;

	/**
	 * The number of structural features of the '<em>Possibly Imported Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_MICROSERVICE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Possibly Imported Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_MICROSERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.service.impl.PossiblyImportedInterfaceImpl <em>Possibly Imported Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.service.impl.PossiblyImportedInterfaceImpl
	 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getPossiblyImportedInterface()
	 * @generated
	 */
	int POSSIBLY_IMPORTED_INTERFACE = 8;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_INTERFACE__IMPORT = 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_INTERFACE__INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Requiring Microservice</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_INTERFACE__REQUIRING_MICROSERVICE = 2;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_INTERFACE__REQUIRED = 3;

	/**
	 * The feature id for the '<em><b>Required By Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_INTERFACE__REQUIRED_BY_CONTAINER = 4;

	/**
	 * The number of structural features of the '<em>Possibly Imported Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_INTERFACE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Possibly Imported Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.service.impl.PossiblyImportedOperationImpl <em>Possibly Imported Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.service.impl.PossiblyImportedOperationImpl
	 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getPossiblyImportedOperation()
	 * @generated
	 */
	int POSSIBLY_IMPORTED_OPERATION = 9;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_OPERATION__IMPORT = 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_OPERATION__OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Requiring Microservice</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_OPERATION__REQUIRING_MICROSERVICE = 2;

	/**
	 * The feature id for the '<em><b>Initialized Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_OPERATION__INITIALIZED_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_OPERATION__REQUIRED = 4;

	/**
	 * The feature id for the '<em><b>Required By Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_OPERATION__REQUIRED_BY_INTERFACE = 5;

	/**
	 * The feature id for the '<em><b>Required By Microservice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_OPERATION__REQUIRED_BY_MICROSERVICE = 6;

	/**
	 * The feature id for the '<em><b>Required By Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_OPERATION__REQUIRED_BY_CONTAINER = 7;

	/**
	 * The number of structural features of the '<em>Possibly Imported Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_OPERATION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Possibly Imported Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.service.impl.ImportedTypeImpl <em>Imported Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.service.impl.ImportedTypeImpl
	 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getImportedType()
	 * @generated
	 */
	int IMPORTED_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_TYPE__IMPORT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_TYPE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Imported Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Imported Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.service.impl.ImportedProtocolAndDataFormatImpl <em>Imported Protocol And Data Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.service.impl.ImportedProtocolAndDataFormatImpl
	 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getImportedProtocolAndDataFormat()
	 * @generated
	 */
	int IMPORTED_PROTOCOL_AND_DATA_FORMAT = 11;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PROTOCOL_AND_DATA_FORMAT__IMPORT = 0;

	/**
	 * The feature id for the '<em><b>Imported Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PROTOCOL_AND_DATA_FORMAT__IMPORTED_PROTOCOL = 1;

	/**
	 * The feature id for the '<em><b>Data Format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PROTOCOL_AND_DATA_FORMAT__DATA_FORMAT = 2;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PROTOCOL_AND_DATA_FORMAT__SPECIFICATION = 3;

	/**
	 * The number of structural features of the '<em>Imported Protocol And Data Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PROTOCOL_AND_DATA_FORMAT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Imported Protocol And Data Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PROTOCOL_AND_DATA_FORMAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.service.impl.ProtocolSpecificationImpl <em>Protocol Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.service.impl.ProtocolSpecificationImpl
	 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getProtocolSpecification()
	 * @generated
	 */
	int PROTOCOL_SPECIFICATION = 12;

	/**
	 * The feature id for the '<em><b>Communication Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_SPECIFICATION__COMMUNICATION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_SPECIFICATION__PROTOCOL = 1;

	/**
	 * The number of structural features of the '<em>Protocol Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Protocol Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.service.impl.EndpointImpl <em>Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.service.impl.EndpointImpl
	 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getEndpoint()
	 * @generated
	 */
	int ENDPOINT = 13;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__ADDRESSES = 0;

	/**
	 * The feature id for the '<em><b>Protocols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__PROTOCOLS = 1;

	/**
	 * The feature id for the '<em><b>Microservice</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__MICROSERVICE = 2;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__OPERATION = 4;

	/**
	 * The feature id for the '<em><b>Referred Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT__REFERRED_OPERATION = 5;

	/**
	 * The number of structural features of the '<em>Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.service.impl.ImportedServiceAspectImpl <em>Imported Service Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.service.impl.ImportedServiceAspectImpl
	 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getImportedServiceAspect()
	 * @generated
	 */
	int IMPORTED_SERVICE_ASPECT = 14;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_SERVICE_ASPECT__IMPORT = 0;

	/**
	 * The feature id for the '<em><b>Imported Aspect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_SERVICE_ASPECT__IMPORTED_ASPECT = 1;

	/**
	 * The feature id for the '<em><b>Single Property Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_SERVICE_ASPECT__SINGLE_PROPERTY_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_SERVICE_ASPECT__VALUES = 3;

	/**
	 * The feature id for the '<em><b>Microservice</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_SERVICE_ASPECT__MICROSERVICE = 4;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_SERVICE_ASPECT__INTERFACE = 5;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_SERVICE_ASPECT__OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Referred Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_SERVICE_ASPECT__REFERRED_OPERATION = 7;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_SERVICE_ASPECT__PARAMETER = 8;

	/**
	 * The number of structural features of the '<em>Imported Service Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_SERVICE_ASPECT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Imported Service Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_SERVICE_ASPECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.service.ImportType <em>Import Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.service.ImportType
	 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getImportType()
	 * @generated
	 */
	int IMPORT_TYPE = 15;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.service.MicroserviceType <em>Microservice Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.service.MicroserviceType
	 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getMicroserviceType()
	 * @generated
	 */
	int MICROSERVICE_TYPE = 16;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.service.Visibility <em>Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.service.Visibility
	 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 17;

	/**
	 * The meta object id for the '<em>Microservice Import Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getMicroserviceImportMap()
	 * @generated
	 */
	int MICROSERVICE_IMPORT_MAP = 18;


	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.service.ServiceModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see de.fhdo.ddmm.service.ServiceModel
	 * @generated
	 */
	EClass getServiceModel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.service.ServiceModel#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see de.fhdo.ddmm.service.ServiceModel#getImports()
	 * @see #getServiceModel()
	 * @generated
	 */
	EReference getServiceModel_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.service.ServiceModel#getMicroservices <em>Microservices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Microservices</em>'.
	 * @see de.fhdo.ddmm.service.ServiceModel#getMicroservices()
	 * @see #getServiceModel()
	 * @generated
	 */
	EReference getServiceModel_Microservices();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.service.ServiceModel#getContainedOperations() <em>Get Contained Operations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contained Operations</em>' operation.
	 * @see de.fhdo.ddmm.service.ServiceModel#getContainedOperations()
	 * @generated
	 */
	EOperation getServiceModel__GetContainedOperations();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.service.ServiceModel#getContainedReferredOperations() <em>Get Contained Referred Operations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contained Referred Operations</em>' operation.
	 * @see de.fhdo.ddmm.service.ServiceModel#getContainedReferredOperations()
	 * @generated
	 */
	EOperation getServiceModel__GetContainedReferredOperations();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.service.ServiceModel#getContainedInterfaces() <em>Get Contained Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contained Interfaces</em>' operation.
	 * @see de.fhdo.ddmm.service.ServiceModel#getContainedInterfaces()
	 * @generated
	 */
	EOperation getServiceModel__GetContainedInterfaces();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.service.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see de.fhdo.ddmm.service.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.Import#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.fhdo.ddmm.service.Import#getName()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.Import#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see de.fhdo.ddmm.service.Import#getImportURI()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportURI();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.Import#getImportType <em>Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Type</em>'.
	 * @see de.fhdo.ddmm.service.Import#getImportType()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportType();

	/**
	 * Returns the meta object for the container reference '{@link de.fhdo.ddmm.service.Import#getServiceModel <em>Service Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Service Model</em>'.
	 * @see de.fhdo.ddmm.service.Import#getServiceModel()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_ServiceModel();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.service.Microservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microservice</em>'.
	 * @see de.fhdo.ddmm.service.Microservice
	 * @generated
	 */
	EClass getMicroservice();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.Microservice#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.fhdo.ddmm.service.Microservice#getName()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.Microservice#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.fhdo.ddmm.service.Microservice#getVersion()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_Version();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.Microservice#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.fhdo.ddmm.service.Microservice#getType()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.Microservice#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see de.fhdo.ddmm.service.Microservice#getVisibility()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_Visibility();

	/**
	 * Returns the meta object for the reference list '{@link de.fhdo.ddmm.service.Microservice#getTechnologies <em>Technologies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Technologies</em>'.
	 * @see de.fhdo.ddmm.service.Microservice#getTechnologies()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Technologies();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.service.Microservice#getEndpoints <em>Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Endpoints</em>'.
	 * @see de.fhdo.ddmm.service.Microservice#getEndpoints()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Endpoints();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.service.Microservice#getRequiredMicroservices <em>Required Microservices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Microservices</em>'.
	 * @see de.fhdo.ddmm.service.Microservice#getRequiredMicroservices()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_RequiredMicroservices();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.service.Microservice#getRequiredInterfaces <em>Required Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Interfaces</em>'.
	 * @see de.fhdo.ddmm.service.Microservice#getRequiredInterfaces()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_RequiredInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.service.Microservice#getRequiredOperations <em>Required Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Operations</em>'.
	 * @see de.fhdo.ddmm.service.Microservice#getRequiredOperations()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_RequiredOperations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.service.Microservice#getProtocols <em>Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocols</em>'.
	 * @see de.fhdo.ddmm.service.Microservice#getProtocols()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Protocols();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.service.Microservice#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see de.fhdo.ddmm.service.Microservice#getInterfaces()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.service.Microservice#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aspects</em>'.
	 * @see de.fhdo.ddmm.service.Microservice#getAspects()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Aspects();

	/**
	 * Returns the meta object for the container reference '{@link de.fhdo.ddmm.service.Microservice#getServiceModel <em>Service Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Service Model</em>'.
	 * @see de.fhdo.ddmm.service.Microservice#getServiceModel()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_ServiceModel();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.Microservice#isEffectivelyImplemented <em>Effectively Implemented</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effectively Implemented</em>'.
	 * @see de.fhdo.ddmm.service.Microservice#isEffectivelyImplemented()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_EffectivelyImplemented();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.Microservice#getEffectiveVisibility <em>Effective Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effective Visibility</em>'.
	 * @see de.fhdo.ddmm.service.Microservice#getEffectiveVisibility()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_EffectiveVisibility();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.Microservice#isEffectivelyInternal <em>Effectively Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effectively Internal</em>'.
	 * @see de.fhdo.ddmm.service.Microservice#isEffectivelyInternal()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_EffectivelyInternal();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.service.Microservice#getQualifiedNameParts() <em>Get Qualified Name Parts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Qualified Name Parts</em>' operation.
	 * @see de.fhdo.ddmm.service.Microservice#getQualifiedNameParts()
	 * @generated
	 */
	EOperation getMicroservice__GetQualifiedNameParts();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.service.Microservice#getContainedOperations() <em>Get Contained Operations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contained Operations</em>' operation.
	 * @see de.fhdo.ddmm.service.Microservice#getContainedOperations()
	 * @generated
	 */
	EOperation getMicroservice__GetContainedOperations();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.service.Microservice#getContainedReferredOperations() <em>Get Contained Referred Operations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contained Referred Operations</em>' operation.
	 * @see de.fhdo.ddmm.service.Microservice#getContainedReferredOperations()
	 * @generated
	 */
	EOperation getMicroservice__GetContainedReferredOperations();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.service.Microservice#getRequiredImports() <em>Get Required Imports</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Required Imports</em>' operation.
	 * @see de.fhdo.ddmm.service.Microservice#getRequiredImports()
	 * @generated
	 */
	EOperation getMicroservice__GetRequiredImports();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.service.Microservice#getAllRequiredOperations(de.fhdo.ddmm.service.Import) <em>Get All Required Operations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Required Operations</em>' operation.
	 * @see de.fhdo.ddmm.service.Microservice#getAllRequiredOperations(de.fhdo.ddmm.service.Import)
	 * @generated
	 */
	EOperation getMicroservice__GetAllRequiredOperations__Import();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.service.Microservice#getAllRequiredMicroservices() <em>Get All Required Microservices</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Required Microservices</em>' operation.
	 * @see de.fhdo.ddmm.service.Microservice#getAllRequiredMicroservices()
	 * @generated
	 */
	EOperation getMicroservice__GetAllRequiredMicroservices();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.service.Microservice#canRequire(de.fhdo.ddmm.service.Microservice, boolean) <em>Can Require</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Require</em>' operation.
	 * @see de.fhdo.ddmm.service.Microservice#canRequire(de.fhdo.ddmm.service.Microservice, boolean)
	 * @generated
	 */
	EOperation getMicroservice__CanRequire__Microservice_boolean();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.service.Microservice#canRequire(de.fhdo.ddmm.service.Interface, boolean) <em>Can Require</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Require</em>' operation.
	 * @see de.fhdo.ddmm.service.Microservice#canRequire(de.fhdo.ddmm.service.Interface, boolean)
	 * @generated
	 */
	EOperation getMicroservice__CanRequire__Interface_boolean();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.service.Microservice#canRequire(de.fhdo.ddmm.service.Operation, boolean) <em>Can Require</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Require</em>' operation.
	 * @see de.fhdo.ddmm.service.Microservice#canRequire(de.fhdo.ddmm.service.Operation, boolean)
	 * @generated
	 */
	EOperation getMicroservice__CanRequire__Operation_boolean();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.service.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see de.fhdo.ddmm.service.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.Interface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.fhdo.ddmm.service.Interface#getName()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.Interface#isNotImplemented <em>Not Implemented</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Implemented</em>'.
	 * @see de.fhdo.ddmm.service.Interface#isNotImplemented()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_NotImplemented();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.Interface#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see de.fhdo.ddmm.service.Interface#getVisibility()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Visibility();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.service.Interface#getEndpoints <em>Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Endpoints</em>'.
	 * @see de.fhdo.ddmm.service.Interface#getEndpoints()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Endpoints();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.service.Interface#getProtocols <em>Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocols</em>'.
	 * @see de.fhdo.ddmm.service.Interface#getProtocols()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Protocols();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.service.Interface#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see de.fhdo.ddmm.service.Interface#getOperations()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.service.Interface#getReferredOperations <em>Referred Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Referred Operations</em>'.
	 * @see de.fhdo.ddmm.service.Interface#getReferredOperations()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_ReferredOperations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.service.Interface#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aspects</em>'.
	 * @see de.fhdo.ddmm.service.Interface#getAspects()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Aspects();

	/**
	 * Returns the meta object for the container reference '{@link de.fhdo.ddmm.service.Interface#getMicroservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Microservice</em>'.
	 * @see de.fhdo.ddmm.service.Interface#getMicroservice()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Microservice();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.Interface#getEffectiveVisibility <em>Effective Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effective Visibility</em>'.
	 * @see de.fhdo.ddmm.service.Interface#getEffectiveVisibility()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_EffectiveVisibility();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.Interface#isEffectivelyImplemented <em>Effectively Implemented</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effectively Implemented</em>'.
	 * @see de.fhdo.ddmm.service.Interface#isEffectivelyImplemented()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_EffectivelyImplemented();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.Interface#isEffectivelyInternal <em>Effectively Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effectively Internal</em>'.
	 * @see de.fhdo.ddmm.service.Interface#isEffectivelyInternal()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_EffectivelyInternal();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.service.Interface#getQualifiedNameParts() <em>Get Qualified Name Parts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Qualified Name Parts</em>' operation.
	 * @see de.fhdo.ddmm.service.Interface#getQualifiedNameParts()
	 * @generated
	 */
	EOperation getInterface__GetQualifiedNameParts();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.service.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see de.fhdo.ddmm.service.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.fhdo.ddmm.service.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.Operation#isNotImplemented <em>Not Implemented</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Implemented</em>'.
	 * @see de.fhdo.ddmm.service.Operation#isNotImplemented()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_NotImplemented();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.Operation#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see de.fhdo.ddmm.service.Operation#getVisibility()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Visibility();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.service.Operation#getEndpoints <em>Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Endpoints</em>'.
	 * @see de.fhdo.ddmm.service.Operation#getEndpoints()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Endpoints();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.service.Operation#getProtocols <em>Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocols</em>'.
	 * @see de.fhdo.ddmm.service.Operation#getProtocols()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Protocols();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.service.Operation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see de.fhdo.ddmm.service.Operation#getParameters()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.service.Operation#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aspects</em>'.
	 * @see de.fhdo.ddmm.service.Operation#getAspects()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Aspects();

	/**
	 * Returns the meta object for the container reference '{@link de.fhdo.ddmm.service.Operation#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interface</em>'.
	 * @see de.fhdo.ddmm.service.Operation#getInterface()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Interface();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.Operation#isNotImplementedByContainer <em>Not Implemented By Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Implemented By Container</em>'.
	 * @see de.fhdo.ddmm.service.Operation#isNotImplementedByContainer()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_NotImplementedByContainer();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.Operation#isEffectivelyNotImplemented <em>Effectively Not Implemented</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effectively Not Implemented</em>'.
	 * @see de.fhdo.ddmm.service.Operation#isEffectivelyNotImplemented()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_EffectivelyNotImplemented();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.Operation#getEffectiveVisibility <em>Effective Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effective Visibility</em>'.
	 * @see de.fhdo.ddmm.service.Operation#getEffectiveVisibility()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_EffectiveVisibility();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.Operation#isEffectivelyInternal <em>Effectively Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effectively Internal</em>'.
	 * @see de.fhdo.ddmm.service.Operation#isEffectivelyInternal()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_EffectivelyInternal();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.service.Operation#getQualifiedNameParts() <em>Get Qualified Name Parts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Qualified Name Parts</em>' operation.
	 * @see de.fhdo.ddmm.service.Operation#getQualifiedNameParts()
	 * @generated
	 */
	EOperation getOperation__GetQualifiedNameParts();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.service.ReferredOperation <em>Referred Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referred Operation</em>'.
	 * @see de.fhdo.ddmm.service.ReferredOperation
	 * @generated
	 */
	EClass getReferredOperation();

	/**
	 * Returns the meta object for the reference '{@link de.fhdo.ddmm.service.ReferredOperation#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see de.fhdo.ddmm.service.ReferredOperation#getOperation()
	 * @see #getReferredOperation()
	 * @generated
	 */
	EReference getReferredOperation_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.service.ReferredOperation#getEndpoints <em>Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Endpoints</em>'.
	 * @see de.fhdo.ddmm.service.ReferredOperation#getEndpoints()
	 * @see #getReferredOperation()
	 * @generated
	 */
	EReference getReferredOperation_Endpoints();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.service.ReferredOperation#getProtocols <em>Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocols</em>'.
	 * @see de.fhdo.ddmm.service.ReferredOperation#getProtocols()
	 * @see #getReferredOperation()
	 * @generated
	 */
	EReference getReferredOperation_Protocols();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.service.ReferredOperation#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aspects</em>'.
	 * @see de.fhdo.ddmm.service.ReferredOperation#getAspects()
	 * @see #getReferredOperation()
	 * @generated
	 */
	EReference getReferredOperation_Aspects();

	/**
	 * Returns the meta object for the container reference '{@link de.fhdo.ddmm.service.ReferredOperation#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interface</em>'.
	 * @see de.fhdo.ddmm.service.ReferredOperation#getInterface()
	 * @see #getReferredOperation()
	 * @generated
	 */
	EReference getReferredOperation_Interface();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.service.ReferredOperation#getQualifiedNameParts() <em>Get Qualified Name Parts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Qualified Name Parts</em>' operation.
	 * @see de.fhdo.ddmm.service.ReferredOperation#getQualifiedNameParts()
	 * @generated
	 */
	EOperation getReferredOperation__GetQualifiedNameParts();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.service.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see de.fhdo.ddmm.service.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.fhdo.ddmm.service.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.Parameter#getExchangePattern <em>Exchange Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exchange Pattern</em>'.
	 * @see de.fhdo.ddmm.service.Parameter#getExchangePattern()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ExchangePattern();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.Parameter#getCommunicationType <em>Communication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication Type</em>'.
	 * @see de.fhdo.ddmm.service.Parameter#getCommunicationType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_CommunicationType();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.Parameter#isCommunicatesFault <em>Communicates Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communicates Fault</em>'.
	 * @see de.fhdo.ddmm.service.Parameter#isCommunicatesFault()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_CommunicatesFault();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.Parameter#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see de.fhdo.ddmm.service.Parameter#isOptional()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Optional();

	/**
	 * Returns the meta object for the containment reference '{@link de.fhdo.ddmm.service.Parameter#getInitializedByOperation <em>Initialized By Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initialized By Operation</em>'.
	 * @see de.fhdo.ddmm.service.Parameter#getInitializedByOperation()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_InitializedByOperation();

	/**
	 * Returns the meta object for the containment reference '{@link de.fhdo.ddmm.service.Parameter#getImportedType <em>Imported Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Type</em>'.
	 * @see de.fhdo.ddmm.service.Parameter#getImportedType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_ImportedType();

	/**
	 * Returns the meta object for the containment reference '{@link de.fhdo.ddmm.service.Parameter#getPrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primitive Type</em>'.
	 * @see de.fhdo.ddmm.service.Parameter#getPrimitiveType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_PrimitiveType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.service.Parameter#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aspects</em>'.
	 * @see de.fhdo.ddmm.service.Parameter#getAspects()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Aspects();

	/**
	 * Returns the meta object for the container reference '{@link de.fhdo.ddmm.service.Parameter#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operation</em>'.
	 * @see de.fhdo.ddmm.service.Parameter#getOperation()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Operation();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.service.Parameter#basicallyInitializableBy(de.fhdo.ddmm.service.Operation) <em>Basically Initializable By</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Basically Initializable By</em>' operation.
	 * @see de.fhdo.ddmm.service.Parameter#basicallyInitializableBy(de.fhdo.ddmm.service.Operation)
	 * @generated
	 */
	EOperation getParameter__BasicallyInitializableBy__Operation();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.service.Parameter#getEffectiveType() <em>Get Effective Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effective Type</em>' operation.
	 * @see de.fhdo.ddmm.service.Parameter#getEffectiveType()
	 * @generated
	 */
	EOperation getParameter__GetEffectiveType();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.service.Parameter#getEffectiveTypeQualifiedNameParts() <em>Get Effective Type Qualified Name Parts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effective Type Qualified Name Parts</em>' operation.
	 * @see de.fhdo.ddmm.service.Parameter#getEffectiveTypeQualifiedNameParts()
	 * @generated
	 */
	EOperation getParameter__GetEffectiveTypeQualifiedNameParts();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.service.PossiblyImportedMicroservice <em>Possibly Imported Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Possibly Imported Microservice</em>'.
	 * @see de.fhdo.ddmm.service.PossiblyImportedMicroservice
	 * @generated
	 */
	EClass getPossiblyImportedMicroservice();

	/**
	 * Returns the meta object for the reference '{@link de.fhdo.ddmm.service.PossiblyImportedMicroservice#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import</em>'.
	 * @see de.fhdo.ddmm.service.PossiblyImportedMicroservice#getImport()
	 * @see #getPossiblyImportedMicroservice()
	 * @generated
	 */
	EReference getPossiblyImportedMicroservice_Import();

	/**
	 * Returns the meta object for the reference '{@link de.fhdo.ddmm.service.PossiblyImportedMicroservice#getMicroservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Microservice</em>'.
	 * @see de.fhdo.ddmm.service.PossiblyImportedMicroservice#getMicroservice()
	 * @see #getPossiblyImportedMicroservice()
	 * @generated
	 */
	EReference getPossiblyImportedMicroservice_Microservice();

	/**
	 * Returns the meta object for the container reference '{@link de.fhdo.ddmm.service.PossiblyImportedMicroservice#getRequiringMicroservice <em>Requiring Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Requiring Microservice</em>'.
	 * @see de.fhdo.ddmm.service.PossiblyImportedMicroservice#getRequiringMicroservice()
	 * @see #getPossiblyImportedMicroservice()
	 * @generated
	 */
	EReference getPossiblyImportedMicroservice_RequiringMicroservice();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.service.PossiblyImportedInterface <em>Possibly Imported Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Possibly Imported Interface</em>'.
	 * @see de.fhdo.ddmm.service.PossiblyImportedInterface
	 * @generated
	 */
	EClass getPossiblyImportedInterface();

	/**
	 * Returns the meta object for the reference '{@link de.fhdo.ddmm.service.PossiblyImportedInterface#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import</em>'.
	 * @see de.fhdo.ddmm.service.PossiblyImportedInterface#getImport()
	 * @see #getPossiblyImportedInterface()
	 * @generated
	 */
	EReference getPossiblyImportedInterface_Import();

	/**
	 * Returns the meta object for the reference '{@link de.fhdo.ddmm.service.PossiblyImportedInterface#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see de.fhdo.ddmm.service.PossiblyImportedInterface#getInterface()
	 * @see #getPossiblyImportedInterface()
	 * @generated
	 */
	EReference getPossiblyImportedInterface_Interface();

	/**
	 * Returns the meta object for the container reference '{@link de.fhdo.ddmm.service.PossiblyImportedInterface#getRequiringMicroservice <em>Requiring Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Requiring Microservice</em>'.
	 * @see de.fhdo.ddmm.service.PossiblyImportedInterface#getRequiringMicroservice()
	 * @see #getPossiblyImportedInterface()
	 * @generated
	 */
	EReference getPossiblyImportedInterface_RequiringMicroservice();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.PossiblyImportedInterface#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see de.fhdo.ddmm.service.PossiblyImportedInterface#isRequired()
	 * @see #getPossiblyImportedInterface()
	 * @generated
	 */
	EAttribute getPossiblyImportedInterface_Required();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.PossiblyImportedInterface#isRequiredByContainer <em>Required By Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required By Container</em>'.
	 * @see de.fhdo.ddmm.service.PossiblyImportedInterface#isRequiredByContainer()
	 * @see #getPossiblyImportedInterface()
	 * @generated
	 */
	EAttribute getPossiblyImportedInterface_RequiredByContainer();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.service.PossiblyImportedOperation <em>Possibly Imported Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Possibly Imported Operation</em>'.
	 * @see de.fhdo.ddmm.service.PossiblyImportedOperation
	 * @generated
	 */
	EClass getPossiblyImportedOperation();

	/**
	 * Returns the meta object for the reference '{@link de.fhdo.ddmm.service.PossiblyImportedOperation#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import</em>'.
	 * @see de.fhdo.ddmm.service.PossiblyImportedOperation#getImport()
	 * @see #getPossiblyImportedOperation()
	 * @generated
	 */
	EReference getPossiblyImportedOperation_Import();

	/**
	 * Returns the meta object for the reference '{@link de.fhdo.ddmm.service.PossiblyImportedOperation#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see de.fhdo.ddmm.service.PossiblyImportedOperation#getOperation()
	 * @see #getPossiblyImportedOperation()
	 * @generated
	 */
	EReference getPossiblyImportedOperation_Operation();

	/**
	 * Returns the meta object for the container reference '{@link de.fhdo.ddmm.service.PossiblyImportedOperation#getRequiringMicroservice <em>Requiring Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Requiring Microservice</em>'.
	 * @see de.fhdo.ddmm.service.PossiblyImportedOperation#getRequiringMicroservice()
	 * @see #getPossiblyImportedOperation()
	 * @generated
	 */
	EReference getPossiblyImportedOperation_RequiringMicroservice();

	/**
	 * Returns the meta object for the container reference '{@link de.fhdo.ddmm.service.PossiblyImportedOperation#getInitializedParameter <em>Initialized Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Initialized Parameter</em>'.
	 * @see de.fhdo.ddmm.service.PossiblyImportedOperation#getInitializedParameter()
	 * @see #getPossiblyImportedOperation()
	 * @generated
	 */
	EReference getPossiblyImportedOperation_InitializedParameter();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.PossiblyImportedOperation#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see de.fhdo.ddmm.service.PossiblyImportedOperation#isRequired()
	 * @see #getPossiblyImportedOperation()
	 * @generated
	 */
	EAttribute getPossiblyImportedOperation_Required();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.PossiblyImportedOperation#isRequiredByInterface <em>Required By Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required By Interface</em>'.
	 * @see de.fhdo.ddmm.service.PossiblyImportedOperation#isRequiredByInterface()
	 * @see #getPossiblyImportedOperation()
	 * @generated
	 */
	EAttribute getPossiblyImportedOperation_RequiredByInterface();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.PossiblyImportedOperation#isRequiredByMicroservice <em>Required By Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required By Microservice</em>'.
	 * @see de.fhdo.ddmm.service.PossiblyImportedOperation#isRequiredByMicroservice()
	 * @see #getPossiblyImportedOperation()
	 * @generated
	 */
	EAttribute getPossiblyImportedOperation_RequiredByMicroservice();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.PossiblyImportedOperation#isRequiredByContainer <em>Required By Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required By Container</em>'.
	 * @see de.fhdo.ddmm.service.PossiblyImportedOperation#isRequiredByContainer()
	 * @see #getPossiblyImportedOperation()
	 * @generated
	 */
	EAttribute getPossiblyImportedOperation_RequiredByContainer();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.service.ImportedType <em>Imported Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imported Type</em>'.
	 * @see de.fhdo.ddmm.service.ImportedType
	 * @generated
	 */
	EClass getImportedType();

	/**
	 * Returns the meta object for the reference '{@link de.fhdo.ddmm.service.ImportedType#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import</em>'.
	 * @see de.fhdo.ddmm.service.ImportedType#getImport()
	 * @see #getImportedType()
	 * @generated
	 */
	EReference getImportedType_Import();

	/**
	 * Returns the meta object for the reference '{@link de.fhdo.ddmm.service.ImportedType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.fhdo.ddmm.service.ImportedType#getType()
	 * @see #getImportedType()
	 * @generated
	 */
	EReference getImportedType_Type();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.service.ImportedProtocolAndDataFormat <em>Imported Protocol And Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imported Protocol And Data Format</em>'.
	 * @see de.fhdo.ddmm.service.ImportedProtocolAndDataFormat
	 * @generated
	 */
	EClass getImportedProtocolAndDataFormat();

	/**
	 * Returns the meta object for the reference '{@link de.fhdo.ddmm.service.ImportedProtocolAndDataFormat#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import</em>'.
	 * @see de.fhdo.ddmm.service.ImportedProtocolAndDataFormat#getImport()
	 * @see #getImportedProtocolAndDataFormat()
	 * @generated
	 */
	EReference getImportedProtocolAndDataFormat_Import();

	/**
	 * Returns the meta object for the reference '{@link de.fhdo.ddmm.service.ImportedProtocolAndDataFormat#getImportedProtocol <em>Imported Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imported Protocol</em>'.
	 * @see de.fhdo.ddmm.service.ImportedProtocolAndDataFormat#getImportedProtocol()
	 * @see #getImportedProtocolAndDataFormat()
	 * @generated
	 */
	EReference getImportedProtocolAndDataFormat_ImportedProtocol();

	/**
	 * Returns the meta object for the reference '{@link de.fhdo.ddmm.service.ImportedProtocolAndDataFormat#getDataFormat <em>Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Format</em>'.
	 * @see de.fhdo.ddmm.service.ImportedProtocolAndDataFormat#getDataFormat()
	 * @see #getImportedProtocolAndDataFormat()
	 * @generated
	 */
	EReference getImportedProtocolAndDataFormat_DataFormat();

	/**
	 * Returns the meta object for the container reference '{@link de.fhdo.ddmm.service.ImportedProtocolAndDataFormat#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Specification</em>'.
	 * @see de.fhdo.ddmm.service.ImportedProtocolAndDataFormat#getSpecification()
	 * @see #getImportedProtocolAndDataFormat()
	 * @generated
	 */
	EReference getImportedProtocolAndDataFormat_Specification();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.service.ProtocolSpecification <em>Protocol Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol Specification</em>'.
	 * @see de.fhdo.ddmm.service.ProtocolSpecification
	 * @generated
	 */
	EClass getProtocolSpecification();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.service.ProtocolSpecification#getCommunicationType <em>Communication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication Type</em>'.
	 * @see de.fhdo.ddmm.service.ProtocolSpecification#getCommunicationType()
	 * @see #getProtocolSpecification()
	 * @generated
	 */
	EAttribute getProtocolSpecification_CommunicationType();

	/**
	 * Returns the meta object for the containment reference '{@link de.fhdo.ddmm.service.ProtocolSpecification#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Protocol</em>'.
	 * @see de.fhdo.ddmm.service.ProtocolSpecification#getProtocol()
	 * @see #getProtocolSpecification()
	 * @generated
	 */
	EReference getProtocolSpecification_Protocol();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.service.Endpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endpoint</em>'.
	 * @see de.fhdo.ddmm.service.Endpoint
	 * @generated
	 */
	EClass getEndpoint();

	/**
	 * Returns the meta object for the attribute list '{@link de.fhdo.ddmm.service.Endpoint#getAddresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Addresses</em>'.
	 * @see de.fhdo.ddmm.service.Endpoint#getAddresses()
	 * @see #getEndpoint()
	 * @generated
	 */
	EAttribute getEndpoint_Addresses();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.service.Endpoint#getProtocols <em>Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocols</em>'.
	 * @see de.fhdo.ddmm.service.Endpoint#getProtocols()
	 * @see #getEndpoint()
	 * @generated
	 */
	EReference getEndpoint_Protocols();

	/**
	 * Returns the meta object for the container reference '{@link de.fhdo.ddmm.service.Endpoint#getMicroservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Microservice</em>'.
	 * @see de.fhdo.ddmm.service.Endpoint#getMicroservice()
	 * @see #getEndpoint()
	 * @generated
	 */
	EReference getEndpoint_Microservice();

	/**
	 * Returns the meta object for the container reference '{@link de.fhdo.ddmm.service.Endpoint#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interface</em>'.
	 * @see de.fhdo.ddmm.service.Endpoint#getInterface()
	 * @see #getEndpoint()
	 * @generated
	 */
	EReference getEndpoint_Interface();

	/**
	 * Returns the meta object for the container reference '{@link de.fhdo.ddmm.service.Endpoint#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operation</em>'.
	 * @see de.fhdo.ddmm.service.Endpoint#getOperation()
	 * @see #getEndpoint()
	 * @generated
	 */
	EReference getEndpoint_Operation();

	/**
	 * Returns the meta object for the container reference '{@link de.fhdo.ddmm.service.Endpoint#getReferredOperation <em>Referred Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Referred Operation</em>'.
	 * @see de.fhdo.ddmm.service.Endpoint#getReferredOperation()
	 * @see #getEndpoint()
	 * @generated
	 */
	EReference getEndpoint_ReferredOperation();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.service.ImportedServiceAspect <em>Imported Service Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imported Service Aspect</em>'.
	 * @see de.fhdo.ddmm.service.ImportedServiceAspect
	 * @generated
	 */
	EClass getImportedServiceAspect();

	/**
	 * Returns the meta object for the reference '{@link de.fhdo.ddmm.service.ImportedServiceAspect#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import</em>'.
	 * @see de.fhdo.ddmm.service.ImportedServiceAspect#getImport()
	 * @see #getImportedServiceAspect()
	 * @generated
	 */
	EReference getImportedServiceAspect_Import();

	/**
	 * Returns the meta object for the reference '{@link de.fhdo.ddmm.service.ImportedServiceAspect#getImportedAspect <em>Imported Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imported Aspect</em>'.
	 * @see de.fhdo.ddmm.service.ImportedServiceAspect#getImportedAspect()
	 * @see #getImportedServiceAspect()
	 * @generated
	 */
	EReference getImportedServiceAspect_ImportedAspect();

	/**
	 * Returns the meta object for the containment reference '{@link de.fhdo.ddmm.service.ImportedServiceAspect#getSinglePropertyValue <em>Single Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Single Property Value</em>'.
	 * @see de.fhdo.ddmm.service.ImportedServiceAspect#getSinglePropertyValue()
	 * @see #getImportedServiceAspect()
	 * @generated
	 */
	EReference getImportedServiceAspect_SinglePropertyValue();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.service.ImportedServiceAspect#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see de.fhdo.ddmm.service.ImportedServiceAspect#getValues()
	 * @see #getImportedServiceAspect()
	 * @generated
	 */
	EReference getImportedServiceAspect_Values();

	/**
	 * Returns the meta object for the container reference '{@link de.fhdo.ddmm.service.ImportedServiceAspect#getMicroservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Microservice</em>'.
	 * @see de.fhdo.ddmm.service.ImportedServiceAspect#getMicroservice()
	 * @see #getImportedServiceAspect()
	 * @generated
	 */
	EReference getImportedServiceAspect_Microservice();

	/**
	 * Returns the meta object for the container reference '{@link de.fhdo.ddmm.service.ImportedServiceAspect#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interface</em>'.
	 * @see de.fhdo.ddmm.service.ImportedServiceAspect#getInterface()
	 * @see #getImportedServiceAspect()
	 * @generated
	 */
	EReference getImportedServiceAspect_Interface();

	/**
	 * Returns the meta object for the container reference '{@link de.fhdo.ddmm.service.ImportedServiceAspect#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operation</em>'.
	 * @see de.fhdo.ddmm.service.ImportedServiceAspect#getOperation()
	 * @see #getImportedServiceAspect()
	 * @generated
	 */
	EReference getImportedServiceAspect_Operation();

	/**
	 * Returns the meta object for the container reference '{@link de.fhdo.ddmm.service.ImportedServiceAspect#getReferredOperation <em>Referred Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Referred Operation</em>'.
	 * @see de.fhdo.ddmm.service.ImportedServiceAspect#getReferredOperation()
	 * @see #getImportedServiceAspect()
	 * @generated
	 */
	EReference getImportedServiceAspect_ReferredOperation();

	/**
	 * Returns the meta object for the container reference '{@link de.fhdo.ddmm.service.ImportedServiceAspect#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parameter</em>'.
	 * @see de.fhdo.ddmm.service.ImportedServiceAspect#getParameter()
	 * @see #getImportedServiceAspect()
	 * @generated
	 */
	EReference getImportedServiceAspect_Parameter();

	/**
	 * Returns the meta object for enum '{@link de.fhdo.ddmm.service.ImportType <em>Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Import Type</em>'.
	 * @see de.fhdo.ddmm.service.ImportType
	 * @generated
	 */
	EEnum getImportType();

	/**
	 * Returns the meta object for enum '{@link de.fhdo.ddmm.service.MicroserviceType <em>Microservice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Microservice Type</em>'.
	 * @see de.fhdo.ddmm.service.MicroserviceType
	 * @generated
	 */
	EEnum getMicroserviceType();

	/**
	 * Returns the meta object for enum '{@link de.fhdo.ddmm.service.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility</em>'.
	 * @see de.fhdo.ddmm.service.Visibility
	 * @generated
	 */
	EEnum getVisibility();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>Microservice Import Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Microservice Import Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map&lt;de.fhdo.ddmm.service.Microservice, de.fhdo.ddmm.service.Import&gt;"
	 * @generated
	 */
	EDataType getMicroserviceImportMap();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServiceFactory getServiceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.service.impl.ServiceModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.service.impl.ServiceModelImpl
		 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getServiceModel()
		 * @generated
		 */
		EClass SERVICE_MODEL = eINSTANCE.getServiceModel();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_MODEL__IMPORTS = eINSTANCE.getServiceModel_Imports();

		/**
		 * The meta object literal for the '<em><b>Microservices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_MODEL__MICROSERVICES = eINSTANCE.getServiceModel_Microservices();

		/**
		 * The meta object literal for the '<em><b>Get Contained Operations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_MODEL___GET_CONTAINED_OPERATIONS = eINSTANCE.getServiceModel__GetContainedOperations();

		/**
		 * The meta object literal for the '<em><b>Get Contained Referred Operations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_MODEL___GET_CONTAINED_REFERRED_OPERATIONS = eINSTANCE.getServiceModel__GetContainedReferredOperations();

		/**
		 * The meta object literal for the '<em><b>Get Contained Interfaces</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_MODEL___GET_CONTAINED_INTERFACES = eINSTANCE.getServiceModel__GetContainedInterfaces();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.service.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.service.impl.ImportImpl
		 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__NAME = eINSTANCE.getImport_Name();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

		/**
		 * The meta object literal for the '<em><b>Import Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORT_TYPE = eINSTANCE.getImport_ImportType();

		/**
		 * The meta object literal for the '<em><b>Service Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT__SERVICE_MODEL = eINSTANCE.getImport_ServiceModel();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.service.impl.MicroserviceImpl <em>Microservice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.service.impl.MicroserviceImpl
		 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getMicroservice()
		 * @generated
		 */
		EClass MICROSERVICE = eINSTANCE.getMicroservice();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__NAME = eINSTANCE.getMicroservice_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__VERSION = eINSTANCE.getMicroservice_Version();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__TYPE = eINSTANCE.getMicroservice_Type();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__VISIBILITY = eINSTANCE.getMicroservice_Visibility();

		/**
		 * The meta object literal for the '<em><b>Technologies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__TECHNOLOGIES = eINSTANCE.getMicroservice_Technologies();

		/**
		 * The meta object literal for the '<em><b>Endpoints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__ENDPOINTS = eINSTANCE.getMicroservice_Endpoints();

		/**
		 * The meta object literal for the '<em><b>Required Microservices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__REQUIRED_MICROSERVICES = eINSTANCE.getMicroservice_RequiredMicroservices();

		/**
		 * The meta object literal for the '<em><b>Required Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__REQUIRED_INTERFACES = eINSTANCE.getMicroservice_RequiredInterfaces();

		/**
		 * The meta object literal for the '<em><b>Required Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__REQUIRED_OPERATIONS = eINSTANCE.getMicroservice_RequiredOperations();

		/**
		 * The meta object literal for the '<em><b>Protocols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__PROTOCOLS = eINSTANCE.getMicroservice_Protocols();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__INTERFACES = eINSTANCE.getMicroservice_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__ASPECTS = eINSTANCE.getMicroservice_Aspects();

		/**
		 * The meta object literal for the '<em><b>Service Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__SERVICE_MODEL = eINSTANCE.getMicroservice_ServiceModel();

		/**
		 * The meta object literal for the '<em><b>Effectively Implemented</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__EFFECTIVELY_IMPLEMENTED = eINSTANCE.getMicroservice_EffectivelyImplemented();

		/**
		 * The meta object literal for the '<em><b>Effective Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__EFFECTIVE_VISIBILITY = eINSTANCE.getMicroservice_EffectiveVisibility();

		/**
		 * The meta object literal for the '<em><b>Effectively Internal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__EFFECTIVELY_INTERNAL = eINSTANCE.getMicroservice_EffectivelyInternal();

		/**
		 * The meta object literal for the '<em><b>Get Qualified Name Parts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MICROSERVICE___GET_QUALIFIED_NAME_PARTS = eINSTANCE.getMicroservice__GetQualifiedNameParts();

		/**
		 * The meta object literal for the '<em><b>Get Contained Operations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MICROSERVICE___GET_CONTAINED_OPERATIONS = eINSTANCE.getMicroservice__GetContainedOperations();

		/**
		 * The meta object literal for the '<em><b>Get Contained Referred Operations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MICROSERVICE___GET_CONTAINED_REFERRED_OPERATIONS = eINSTANCE.getMicroservice__GetContainedReferredOperations();

		/**
		 * The meta object literal for the '<em><b>Get Required Imports</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MICROSERVICE___GET_REQUIRED_IMPORTS = eINSTANCE.getMicroservice__GetRequiredImports();

		/**
		 * The meta object literal for the '<em><b>Get All Required Operations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MICROSERVICE___GET_ALL_REQUIRED_OPERATIONS__IMPORT = eINSTANCE.getMicroservice__GetAllRequiredOperations__Import();

		/**
		 * The meta object literal for the '<em><b>Get All Required Microservices</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MICROSERVICE___GET_ALL_REQUIRED_MICROSERVICES = eINSTANCE.getMicroservice__GetAllRequiredMicroservices();

		/**
		 * The meta object literal for the '<em><b>Can Require</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MICROSERVICE___CAN_REQUIRE__MICROSERVICE_BOOLEAN = eINSTANCE.getMicroservice__CanRequire__Microservice_boolean();

		/**
		 * The meta object literal for the '<em><b>Can Require</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MICROSERVICE___CAN_REQUIRE__INTERFACE_BOOLEAN = eINSTANCE.getMicroservice__CanRequire__Interface_boolean();

		/**
		 * The meta object literal for the '<em><b>Can Require</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MICROSERVICE___CAN_REQUIRE__OPERATION_BOOLEAN = eINSTANCE.getMicroservice__CanRequire__Operation_boolean();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.service.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.service.impl.InterfaceImpl
		 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Not Implemented</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__NOT_IMPLEMENTED = eINSTANCE.getInterface_NotImplemented();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__VISIBILITY = eINSTANCE.getInterface_Visibility();

		/**
		 * The meta object literal for the '<em><b>Endpoints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__ENDPOINTS = eINSTANCE.getInterface_Endpoints();

		/**
		 * The meta object literal for the '<em><b>Protocols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__PROTOCOLS = eINSTANCE.getInterface_Protocols();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__OPERATIONS = eINSTANCE.getInterface_Operations();

		/**
		 * The meta object literal for the '<em><b>Referred Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__REFERRED_OPERATIONS = eINSTANCE.getInterface_ReferredOperations();

		/**
		 * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__ASPECTS = eINSTANCE.getInterface_Aspects();

		/**
		 * The meta object literal for the '<em><b>Microservice</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__MICROSERVICE = eINSTANCE.getInterface_Microservice();

		/**
		 * The meta object literal for the '<em><b>Effective Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__EFFECTIVE_VISIBILITY = eINSTANCE.getInterface_EffectiveVisibility();

		/**
		 * The meta object literal for the '<em><b>Effectively Implemented</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__EFFECTIVELY_IMPLEMENTED = eINSTANCE.getInterface_EffectivelyImplemented();

		/**
		 * The meta object literal for the '<em><b>Effectively Internal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__EFFECTIVELY_INTERNAL = eINSTANCE.getInterface_EffectivelyInternal();

		/**
		 * The meta object literal for the '<em><b>Get Qualified Name Parts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERFACE___GET_QUALIFIED_NAME_PARTS = eINSTANCE.getInterface__GetQualifiedNameParts();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.service.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.service.impl.OperationImpl
		 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Not Implemented</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NOT_IMPLEMENTED = eINSTANCE.getOperation_NotImplemented();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__VISIBILITY = eINSTANCE.getOperation_Visibility();

		/**
		 * The meta object literal for the '<em><b>Endpoints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__ENDPOINTS = eINSTANCE.getOperation_Endpoints();

		/**
		 * The meta object literal for the '<em><b>Protocols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PROTOCOLS = eINSTANCE.getOperation_Protocols();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PARAMETERS = eINSTANCE.getOperation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__ASPECTS = eINSTANCE.getOperation_Aspects();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__INTERFACE = eINSTANCE.getOperation_Interface();

		/**
		 * The meta object literal for the '<em><b>Not Implemented By Container</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NOT_IMPLEMENTED_BY_CONTAINER = eINSTANCE.getOperation_NotImplementedByContainer();

		/**
		 * The meta object literal for the '<em><b>Effectively Not Implemented</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__EFFECTIVELY_NOT_IMPLEMENTED = eINSTANCE.getOperation_EffectivelyNotImplemented();

		/**
		 * The meta object literal for the '<em><b>Effective Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__EFFECTIVE_VISIBILITY = eINSTANCE.getOperation_EffectiveVisibility();

		/**
		 * The meta object literal for the '<em><b>Effectively Internal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__EFFECTIVELY_INTERNAL = eINSTANCE.getOperation_EffectivelyInternal();

		/**
		 * The meta object literal for the '<em><b>Get Qualified Name Parts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION___GET_QUALIFIED_NAME_PARTS = eINSTANCE.getOperation__GetQualifiedNameParts();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.service.impl.ReferredOperationImpl <em>Referred Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.service.impl.ReferredOperationImpl
		 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getReferredOperation()
		 * @generated
		 */
		EClass REFERRED_OPERATION = eINSTANCE.getReferredOperation();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERRED_OPERATION__OPERATION = eINSTANCE.getReferredOperation_Operation();

		/**
		 * The meta object literal for the '<em><b>Endpoints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERRED_OPERATION__ENDPOINTS = eINSTANCE.getReferredOperation_Endpoints();

		/**
		 * The meta object literal for the '<em><b>Protocols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERRED_OPERATION__PROTOCOLS = eINSTANCE.getReferredOperation_Protocols();

		/**
		 * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERRED_OPERATION__ASPECTS = eINSTANCE.getReferredOperation_Aspects();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERRED_OPERATION__INTERFACE = eINSTANCE.getReferredOperation_Interface();

		/**
		 * The meta object literal for the '<em><b>Get Qualified Name Parts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REFERRED_OPERATION___GET_QUALIFIED_NAME_PARTS = eINSTANCE.getReferredOperation__GetQualifiedNameParts();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.service.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.service.impl.ParameterImpl
		 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Exchange Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__EXCHANGE_PATTERN = eINSTANCE.getParameter_ExchangePattern();

		/**
		 * The meta object literal for the '<em><b>Communication Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__COMMUNICATION_TYPE = eINSTANCE.getParameter_CommunicationType();

		/**
		 * The meta object literal for the '<em><b>Communicates Fault</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__COMMUNICATES_FAULT = eINSTANCE.getParameter_CommunicatesFault();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__OPTIONAL = eINSTANCE.getParameter_Optional();

		/**
		 * The meta object literal for the '<em><b>Initialized By Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__INITIALIZED_BY_OPERATION = eINSTANCE.getParameter_InitializedByOperation();

		/**
		 * The meta object literal for the '<em><b>Imported Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__IMPORTED_TYPE = eINSTANCE.getParameter_ImportedType();

		/**
		 * The meta object literal for the '<em><b>Primitive Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__PRIMITIVE_TYPE = eINSTANCE.getParameter_PrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__ASPECTS = eINSTANCE.getParameter_Aspects();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__OPERATION = eINSTANCE.getParameter_Operation();

		/**
		 * The meta object literal for the '<em><b>Basically Initializable By</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___BASICALLY_INITIALIZABLE_BY__OPERATION = eINSTANCE.getParameter__BasicallyInitializableBy__Operation();

		/**
		 * The meta object literal for the '<em><b>Get Effective Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___GET_EFFECTIVE_TYPE = eINSTANCE.getParameter__GetEffectiveType();

		/**
		 * The meta object literal for the '<em><b>Get Effective Type Qualified Name Parts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___GET_EFFECTIVE_TYPE_QUALIFIED_NAME_PARTS = eINSTANCE.getParameter__GetEffectiveTypeQualifiedNameParts();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.service.impl.PossiblyImportedMicroserviceImpl <em>Possibly Imported Microservice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.service.impl.PossiblyImportedMicroserviceImpl
		 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getPossiblyImportedMicroservice()
		 * @generated
		 */
		EClass POSSIBLY_IMPORTED_MICROSERVICE = eINSTANCE.getPossiblyImportedMicroservice();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSSIBLY_IMPORTED_MICROSERVICE__IMPORT = eINSTANCE.getPossiblyImportedMicroservice_Import();

		/**
		 * The meta object literal for the '<em><b>Microservice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSSIBLY_IMPORTED_MICROSERVICE__MICROSERVICE = eINSTANCE.getPossiblyImportedMicroservice_Microservice();

		/**
		 * The meta object literal for the '<em><b>Requiring Microservice</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSSIBLY_IMPORTED_MICROSERVICE__REQUIRING_MICROSERVICE = eINSTANCE.getPossiblyImportedMicroservice_RequiringMicroservice();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.service.impl.PossiblyImportedInterfaceImpl <em>Possibly Imported Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.service.impl.PossiblyImportedInterfaceImpl
		 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getPossiblyImportedInterface()
		 * @generated
		 */
		EClass POSSIBLY_IMPORTED_INTERFACE = eINSTANCE.getPossiblyImportedInterface();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSSIBLY_IMPORTED_INTERFACE__IMPORT = eINSTANCE.getPossiblyImportedInterface_Import();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSSIBLY_IMPORTED_INTERFACE__INTERFACE = eINSTANCE.getPossiblyImportedInterface_Interface();

		/**
		 * The meta object literal for the '<em><b>Requiring Microservice</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSSIBLY_IMPORTED_INTERFACE__REQUIRING_MICROSERVICE = eINSTANCE.getPossiblyImportedInterface_RequiringMicroservice();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSSIBLY_IMPORTED_INTERFACE__REQUIRED = eINSTANCE.getPossiblyImportedInterface_Required();

		/**
		 * The meta object literal for the '<em><b>Required By Container</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSSIBLY_IMPORTED_INTERFACE__REQUIRED_BY_CONTAINER = eINSTANCE.getPossiblyImportedInterface_RequiredByContainer();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.service.impl.PossiblyImportedOperationImpl <em>Possibly Imported Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.service.impl.PossiblyImportedOperationImpl
		 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getPossiblyImportedOperation()
		 * @generated
		 */
		EClass POSSIBLY_IMPORTED_OPERATION = eINSTANCE.getPossiblyImportedOperation();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSSIBLY_IMPORTED_OPERATION__IMPORT = eINSTANCE.getPossiblyImportedOperation_Import();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSSIBLY_IMPORTED_OPERATION__OPERATION = eINSTANCE.getPossiblyImportedOperation_Operation();

		/**
		 * The meta object literal for the '<em><b>Requiring Microservice</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSSIBLY_IMPORTED_OPERATION__REQUIRING_MICROSERVICE = eINSTANCE.getPossiblyImportedOperation_RequiringMicroservice();

		/**
		 * The meta object literal for the '<em><b>Initialized Parameter</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSSIBLY_IMPORTED_OPERATION__INITIALIZED_PARAMETER = eINSTANCE.getPossiblyImportedOperation_InitializedParameter();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSSIBLY_IMPORTED_OPERATION__REQUIRED = eINSTANCE.getPossiblyImportedOperation_Required();

		/**
		 * The meta object literal for the '<em><b>Required By Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSSIBLY_IMPORTED_OPERATION__REQUIRED_BY_INTERFACE = eINSTANCE.getPossiblyImportedOperation_RequiredByInterface();

		/**
		 * The meta object literal for the '<em><b>Required By Microservice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSSIBLY_IMPORTED_OPERATION__REQUIRED_BY_MICROSERVICE = eINSTANCE.getPossiblyImportedOperation_RequiredByMicroservice();

		/**
		 * The meta object literal for the '<em><b>Required By Container</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSSIBLY_IMPORTED_OPERATION__REQUIRED_BY_CONTAINER = eINSTANCE.getPossiblyImportedOperation_RequiredByContainer();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.service.impl.ImportedTypeImpl <em>Imported Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.service.impl.ImportedTypeImpl
		 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getImportedType()
		 * @generated
		 */
		EClass IMPORTED_TYPE = eINSTANCE.getImportedType();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_TYPE__IMPORT = eINSTANCE.getImportedType_Import();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_TYPE__TYPE = eINSTANCE.getImportedType_Type();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.service.impl.ImportedProtocolAndDataFormatImpl <em>Imported Protocol And Data Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.service.impl.ImportedProtocolAndDataFormatImpl
		 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getImportedProtocolAndDataFormat()
		 * @generated
		 */
		EClass IMPORTED_PROTOCOL_AND_DATA_FORMAT = eINSTANCE.getImportedProtocolAndDataFormat();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_PROTOCOL_AND_DATA_FORMAT__IMPORT = eINSTANCE.getImportedProtocolAndDataFormat_Import();

		/**
		 * The meta object literal for the '<em><b>Imported Protocol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_PROTOCOL_AND_DATA_FORMAT__IMPORTED_PROTOCOL = eINSTANCE.getImportedProtocolAndDataFormat_ImportedProtocol();

		/**
		 * The meta object literal for the '<em><b>Data Format</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_PROTOCOL_AND_DATA_FORMAT__DATA_FORMAT = eINSTANCE.getImportedProtocolAndDataFormat_DataFormat();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_PROTOCOL_AND_DATA_FORMAT__SPECIFICATION = eINSTANCE.getImportedProtocolAndDataFormat_Specification();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.service.impl.ProtocolSpecificationImpl <em>Protocol Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.service.impl.ProtocolSpecificationImpl
		 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getProtocolSpecification()
		 * @generated
		 */
		EClass PROTOCOL_SPECIFICATION = eINSTANCE.getProtocolSpecification();

		/**
		 * The meta object literal for the '<em><b>Communication Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL_SPECIFICATION__COMMUNICATION_TYPE = eINSTANCE.getProtocolSpecification_CommunicationType();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL_SPECIFICATION__PROTOCOL = eINSTANCE.getProtocolSpecification_Protocol();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.service.impl.EndpointImpl <em>Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.service.impl.EndpointImpl
		 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getEndpoint()
		 * @generated
		 */
		EClass ENDPOINT = eINSTANCE.getEndpoint();

		/**
		 * The meta object literal for the '<em><b>Addresses</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT__ADDRESSES = eINSTANCE.getEndpoint_Addresses();

		/**
		 * The meta object literal for the '<em><b>Protocols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINT__PROTOCOLS = eINSTANCE.getEndpoint_Protocols();

		/**
		 * The meta object literal for the '<em><b>Microservice</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINT__MICROSERVICE = eINSTANCE.getEndpoint_Microservice();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINT__INTERFACE = eINSTANCE.getEndpoint_Interface();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINT__OPERATION = eINSTANCE.getEndpoint_Operation();

		/**
		 * The meta object literal for the '<em><b>Referred Operation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINT__REFERRED_OPERATION = eINSTANCE.getEndpoint_ReferredOperation();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.service.impl.ImportedServiceAspectImpl <em>Imported Service Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.service.impl.ImportedServiceAspectImpl
		 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getImportedServiceAspect()
		 * @generated
		 */
		EClass IMPORTED_SERVICE_ASPECT = eINSTANCE.getImportedServiceAspect();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_SERVICE_ASPECT__IMPORT = eINSTANCE.getImportedServiceAspect_Import();

		/**
		 * The meta object literal for the '<em><b>Imported Aspect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_SERVICE_ASPECT__IMPORTED_ASPECT = eINSTANCE.getImportedServiceAspect_ImportedAspect();

		/**
		 * The meta object literal for the '<em><b>Single Property Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_SERVICE_ASPECT__SINGLE_PROPERTY_VALUE = eINSTANCE.getImportedServiceAspect_SinglePropertyValue();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_SERVICE_ASPECT__VALUES = eINSTANCE.getImportedServiceAspect_Values();

		/**
		 * The meta object literal for the '<em><b>Microservice</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_SERVICE_ASPECT__MICROSERVICE = eINSTANCE.getImportedServiceAspect_Microservice();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_SERVICE_ASPECT__INTERFACE = eINSTANCE.getImportedServiceAspect_Interface();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_SERVICE_ASPECT__OPERATION = eINSTANCE.getImportedServiceAspect_Operation();

		/**
		 * The meta object literal for the '<em><b>Referred Operation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_SERVICE_ASPECT__REFERRED_OPERATION = eINSTANCE.getImportedServiceAspect_ReferredOperation();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_SERVICE_ASPECT__PARAMETER = eINSTANCE.getImportedServiceAspect_Parameter();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.service.ImportType <em>Import Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.service.ImportType
		 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getImportType()
		 * @generated
		 */
		EEnum IMPORT_TYPE = eINSTANCE.getImportType();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.service.MicroserviceType <em>Microservice Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.service.MicroserviceType
		 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getMicroserviceType()
		 * @generated
		 */
		EEnum MICROSERVICE_TYPE = eINSTANCE.getMicroserviceType();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.service.Visibility <em>Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.service.Visibility
		 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getVisibility()
		 * @generated
		 */
		EEnum VISIBILITY = eINSTANCE.getVisibility();

		/**
		 * The meta object literal for the '<em>Microservice Import Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see de.fhdo.ddmm.service.impl.ServicePackageImpl#getMicroserviceImportMap()
		 * @generated
		 */
		EDataType MICROSERVICE_IMPORT_MAP = eINSTANCE.getMicroserviceImportMap();

	}

} //ServicePackage
