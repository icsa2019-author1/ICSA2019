/**
 */
package de.fhdo.ddmm.data;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see de.fhdo.ddmm.data.DataFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='de.fhdo.ddmm'"
 * @generated
 */
public interface DataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "data";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "de.fhdo.ddmm.data";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "data";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataPackage eINSTANCE = de.fhdo.ddmm.data.impl.DataPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.data.impl.DataModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.data.impl.DataModelImpl
	 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getDataModel()
	 * @generated
	 */
	int DATA_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Complex Type Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__COMPLEX_TYPE_IMPORTS = 0;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__VERSIONS = 1;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__CONTEXTS = 2;

	/**
	 * The feature id for the '<em><b>Complex Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__COMPLEX_TYPES = 3;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get Contained Complex Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL___GET_CONTAINED_COMPLEX_TYPES = 0;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.data.impl.ComplexTypeImportImpl <em>Complex Type Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.data.impl.ComplexTypeImportImpl
	 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getComplexTypeImport()
	 * @generated
	 */
	int COMPLEX_TYPE_IMPORT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_IMPORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_IMPORT__IMPORT_URI = 1;

	/**
	 * The feature id for the '<em><b>Data Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_IMPORT__DATA_MODEL = 2;

	/**
	 * The number of structural features of the '<em>Complex Type Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_IMPORT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Complex Type Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.data.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.data.impl.VersionImpl
	 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Complex Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__COMPLEX_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__CONTEXTS = 2;

	/**
	 * The feature id for the '<em><b>Data Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__DATA_MODEL = 3;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get Contained Complex Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION___GET_CONTAINED_COMPLEX_TYPES = 0;

	/**
	 * The operation id for the '<em>Get Qualified Name Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION___GET_QUALIFIED_NAME_PARTS = 1;

	/**
	 * The number of operations of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.data.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.data.impl.ContextImpl
	 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Complex Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__COMPLEX_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Data Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__DATA_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__VERSION = 3;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get Qualified Name Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___GET_QUALIFIED_NAME_PARTS = 0;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.data.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.data.impl.TypeImpl
	 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 4;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.data.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.data.impl.PrimitiveTypeImpl
	 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__TYPE_NAME = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__TYPE_SIZE = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Size Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE___SIZE_COMPARE__PRIMITIVETYPE = TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE___IS_COMPATIBLE_WITH__PRIMITIVETYPE = TYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Builtin Primitive Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE___GET_BUILTIN_PRIMITIVE_TYPES = TYPE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.data.impl.PrimitiveBooleanImpl <em>Primitive Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.data.impl.PrimitiveBooleanImpl
	 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getPrimitiveBoolean()
	 * @generated
	 */
	int PRIMITIVE_BOOLEAN = 6;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BOOLEAN__TYPE_NAME = PRIMITIVE_TYPE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BOOLEAN__TYPE_SIZE = PRIMITIVE_TYPE__TYPE_SIZE;

	/**
	 * The number of structural features of the '<em>Primitive Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BOOLEAN_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Size Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BOOLEAN___SIZE_COMPARE__PRIMITIVETYPE = PRIMITIVE_TYPE___SIZE_COMPARE__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BOOLEAN___IS_COMPATIBLE_WITH__PRIMITIVETYPE = PRIMITIVE_TYPE___IS_COMPATIBLE_WITH__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Get Builtin Primitive Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BOOLEAN___GET_BUILTIN_PRIMITIVE_TYPES = PRIMITIVE_TYPE___GET_BUILTIN_PRIMITIVE_TYPES;

	/**
	 * The number of operations of the '<em>Primitive Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BOOLEAN_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.data.impl.PrimitiveByteImpl <em>Primitive Byte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.data.impl.PrimitiveByteImpl
	 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getPrimitiveByte()
	 * @generated
	 */
	int PRIMITIVE_BYTE = 7;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BYTE__TYPE_NAME = PRIMITIVE_TYPE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BYTE__TYPE_SIZE = PRIMITIVE_TYPE__TYPE_SIZE;

	/**
	 * The number of structural features of the '<em>Primitive Byte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BYTE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Size Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BYTE___SIZE_COMPARE__PRIMITIVETYPE = PRIMITIVE_TYPE___SIZE_COMPARE__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BYTE___IS_COMPATIBLE_WITH__PRIMITIVETYPE = PRIMITIVE_TYPE___IS_COMPATIBLE_WITH__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Get Builtin Primitive Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BYTE___GET_BUILTIN_PRIMITIVE_TYPES = PRIMITIVE_TYPE___GET_BUILTIN_PRIMITIVE_TYPES;

	/**
	 * The number of operations of the '<em>Primitive Byte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BYTE_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.data.impl.PrimitiveCharacterImpl <em>Primitive Character</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.data.impl.PrimitiveCharacterImpl
	 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getPrimitiveCharacter()
	 * @generated
	 */
	int PRIMITIVE_CHARACTER = 8;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_CHARACTER__TYPE_NAME = PRIMITIVE_TYPE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_CHARACTER__TYPE_SIZE = PRIMITIVE_TYPE__TYPE_SIZE;

	/**
	 * The number of structural features of the '<em>Primitive Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_CHARACTER_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Size Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_CHARACTER___SIZE_COMPARE__PRIMITIVETYPE = PRIMITIVE_TYPE___SIZE_COMPARE__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_CHARACTER___IS_COMPATIBLE_WITH__PRIMITIVETYPE = PRIMITIVE_TYPE___IS_COMPATIBLE_WITH__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Get Builtin Primitive Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_CHARACTER___GET_BUILTIN_PRIMITIVE_TYPES = PRIMITIVE_TYPE___GET_BUILTIN_PRIMITIVE_TYPES;

	/**
	 * The number of operations of the '<em>Primitive Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_CHARACTER_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.data.impl.PrimitiveDateImpl <em>Primitive Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.data.impl.PrimitiveDateImpl
	 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getPrimitiveDate()
	 * @generated
	 */
	int PRIMITIVE_DATE = 9;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATE__TYPE_NAME = PRIMITIVE_TYPE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATE__TYPE_SIZE = PRIMITIVE_TYPE__TYPE_SIZE;

	/**
	 * The number of structural features of the '<em>Primitive Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Size Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATE___SIZE_COMPARE__PRIMITIVETYPE = PRIMITIVE_TYPE___SIZE_COMPARE__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATE___IS_COMPATIBLE_WITH__PRIMITIVETYPE = PRIMITIVE_TYPE___IS_COMPATIBLE_WITH__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Get Builtin Primitive Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATE___GET_BUILTIN_PRIMITIVE_TYPES = PRIMITIVE_TYPE___GET_BUILTIN_PRIMITIVE_TYPES;

	/**
	 * The number of operations of the '<em>Primitive Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATE_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.data.impl.PrimitiveDoubleImpl <em>Primitive Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.data.impl.PrimitiveDoubleImpl
	 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getPrimitiveDouble()
	 * @generated
	 */
	int PRIMITIVE_DOUBLE = 10;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DOUBLE__TYPE_NAME = PRIMITIVE_TYPE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DOUBLE__TYPE_SIZE = PRIMITIVE_TYPE__TYPE_SIZE;

	/**
	 * The number of structural features of the '<em>Primitive Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DOUBLE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Size Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DOUBLE___SIZE_COMPARE__PRIMITIVETYPE = PRIMITIVE_TYPE___SIZE_COMPARE__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DOUBLE___IS_COMPATIBLE_WITH__PRIMITIVETYPE = PRIMITIVE_TYPE___IS_COMPATIBLE_WITH__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Get Builtin Primitive Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DOUBLE___GET_BUILTIN_PRIMITIVE_TYPES = PRIMITIVE_TYPE___GET_BUILTIN_PRIMITIVE_TYPES;

	/**
	 * The number of operations of the '<em>Primitive Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DOUBLE_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.data.impl.PrimitiveFloatImpl <em>Primitive Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.data.impl.PrimitiveFloatImpl
	 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getPrimitiveFloat()
	 * @generated
	 */
	int PRIMITIVE_FLOAT = 11;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FLOAT__TYPE_NAME = PRIMITIVE_TYPE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FLOAT__TYPE_SIZE = PRIMITIVE_TYPE__TYPE_SIZE;

	/**
	 * The number of structural features of the '<em>Primitive Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FLOAT_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Size Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FLOAT___SIZE_COMPARE__PRIMITIVETYPE = PRIMITIVE_TYPE___SIZE_COMPARE__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FLOAT___IS_COMPATIBLE_WITH__PRIMITIVETYPE = PRIMITIVE_TYPE___IS_COMPATIBLE_WITH__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Get Builtin Primitive Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FLOAT___GET_BUILTIN_PRIMITIVE_TYPES = PRIMITIVE_TYPE___GET_BUILTIN_PRIMITIVE_TYPES;

	/**
	 * The number of operations of the '<em>Primitive Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FLOAT_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.data.impl.PrimitiveIntegerImpl <em>Primitive Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.data.impl.PrimitiveIntegerImpl
	 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getPrimitiveInteger()
	 * @generated
	 */
	int PRIMITIVE_INTEGER = 12;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INTEGER__TYPE_NAME = PRIMITIVE_TYPE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INTEGER__TYPE_SIZE = PRIMITIVE_TYPE__TYPE_SIZE;

	/**
	 * The number of structural features of the '<em>Primitive Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INTEGER_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Size Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INTEGER___SIZE_COMPARE__PRIMITIVETYPE = PRIMITIVE_TYPE___SIZE_COMPARE__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INTEGER___IS_COMPATIBLE_WITH__PRIMITIVETYPE = PRIMITIVE_TYPE___IS_COMPATIBLE_WITH__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Get Builtin Primitive Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INTEGER___GET_BUILTIN_PRIMITIVE_TYPES = PRIMITIVE_TYPE___GET_BUILTIN_PRIMITIVE_TYPES;

	/**
	 * The number of operations of the '<em>Primitive Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INTEGER_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.data.impl.PrimitiveLongImpl <em>Primitive Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.data.impl.PrimitiveLongImpl
	 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getPrimitiveLong()
	 * @generated
	 */
	int PRIMITIVE_LONG = 13;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_LONG__TYPE_NAME = PRIMITIVE_TYPE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_LONG__TYPE_SIZE = PRIMITIVE_TYPE__TYPE_SIZE;

	/**
	 * The number of structural features of the '<em>Primitive Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_LONG_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Size Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_LONG___SIZE_COMPARE__PRIMITIVETYPE = PRIMITIVE_TYPE___SIZE_COMPARE__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_LONG___IS_COMPATIBLE_WITH__PRIMITIVETYPE = PRIMITIVE_TYPE___IS_COMPATIBLE_WITH__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Get Builtin Primitive Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_LONG___GET_BUILTIN_PRIMITIVE_TYPES = PRIMITIVE_TYPE___GET_BUILTIN_PRIMITIVE_TYPES;

	/**
	 * The number of operations of the '<em>Primitive Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_LONG_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.data.impl.PrimitiveShortImpl <em>Primitive Short</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.data.impl.PrimitiveShortImpl
	 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getPrimitiveShort()
	 * @generated
	 */
	int PRIMITIVE_SHORT = 14;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SHORT__TYPE_NAME = PRIMITIVE_TYPE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SHORT__TYPE_SIZE = PRIMITIVE_TYPE__TYPE_SIZE;

	/**
	 * The number of structural features of the '<em>Primitive Short</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SHORT_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Size Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SHORT___SIZE_COMPARE__PRIMITIVETYPE = PRIMITIVE_TYPE___SIZE_COMPARE__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SHORT___IS_COMPATIBLE_WITH__PRIMITIVETYPE = PRIMITIVE_TYPE___IS_COMPATIBLE_WITH__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Get Builtin Primitive Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SHORT___GET_BUILTIN_PRIMITIVE_TYPES = PRIMITIVE_TYPE___GET_BUILTIN_PRIMITIVE_TYPES;

	/**
	 * The number of operations of the '<em>Primitive Short</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SHORT_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.data.impl.PrimitiveStringImpl <em>Primitive String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.data.impl.PrimitiveStringImpl
	 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getPrimitiveString()
	 * @generated
	 */
	int PRIMITIVE_STRING = 15;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_STRING__TYPE_NAME = PRIMITIVE_TYPE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_STRING__TYPE_SIZE = PRIMITIVE_TYPE__TYPE_SIZE;

	/**
	 * The number of structural features of the '<em>Primitive String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_STRING_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Size Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_STRING___SIZE_COMPARE__PRIMITIVETYPE = PRIMITIVE_TYPE___SIZE_COMPARE__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_STRING___IS_COMPATIBLE_WITH__PRIMITIVETYPE = PRIMITIVE_TYPE___IS_COMPATIBLE_WITH__PRIMITIVETYPE;

	/**
	 * The operation id for the '<em>Get Builtin Primitive Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_STRING___GET_BUILTIN_PRIMITIVE_TYPES = PRIMITIVE_TYPE___GET_BUILTIN_PRIMITIVE_TYPES;

	/**
	 * The number of operations of the '<em>Primitive String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_STRING_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.data.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.data.impl.ComplexTypeImpl
	 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getComplexType()
	 * @generated
	 */
	int COMPLEX_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__NAME = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__DATA_MODEL = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__VERSION = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__CONTEXT = TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__IS_STRUCTURE = TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Primitive List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__IS_PRIMITIVE_LIST = TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Structured List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__IS_STRUCTURED_LIST = TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Qualified Name Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE___GET_QUALIFIED_NAME_PARTS = TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Compare Field Counts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE___COMPARE_FIELD_COUNTS__ELIST_ELIST = TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.data.impl.PossiblyImportedComplexTypeImpl <em>Possibly Imported Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.data.impl.PossiblyImportedComplexTypeImpl
	 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getPossiblyImportedComplexType()
	 * @generated
	 */
	int POSSIBLY_IMPORTED_COMPLEX_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_COMPLEX_TYPE__IMPORT = 0;

	/**
	 * The feature id for the '<em><b>Complex Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_COMPLEX_TYPE__COMPLEX_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Data Field</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_COMPLEX_TYPE__DATA_FIELD = 2;

	/**
	 * The number of structural features of the '<em>Possibly Imported Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_COMPLEX_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Possibly Imported Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBLY_IMPORTED_COMPLEX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.data.impl.DataStructureImpl <em>Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.data.impl.DataStructureImpl
	 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getDataStructure()
	 * @generated
	 */
	int DATA_STRUCTURE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__NAME = COMPLEX_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Data Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__DATA_MODEL = COMPLEX_TYPE__DATA_MODEL;

	/**
	 * The feature id for the '<em><b>Version</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__VERSION = COMPLEX_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__CONTEXT = COMPLEX_TYPE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__IS_STRUCTURE = COMPLEX_TYPE__IS_STRUCTURE;

	/**
	 * The feature id for the '<em><b>Is Primitive List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__IS_PRIMITIVE_LIST = COMPLEX_TYPE__IS_PRIMITIVE_LIST;

	/**
	 * The feature id for the '<em><b>Is Structured List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__IS_STRUCTURED_LIST = COMPLEX_TYPE__IS_STRUCTURED_LIST;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__SUPER = COMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__DATA_FIELDS = COMPLEX_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE_FEATURE_COUNT = COMPLEX_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Qualified Name Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE___GET_QUALIFIED_NAME_PARTS = COMPLEX_TYPE___GET_QUALIFIED_NAME_PARTS;

	/**
	 * The operation id for the '<em>Compare Field Counts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE___COMPARE_FIELD_COUNTS__ELIST_ELIST = COMPLEX_TYPE___COMPARE_FIELD_COUNTS__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Effective Fields</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE___GET_EFFECTIVE_FIELDS = COMPLEX_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Extension Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE___IS_EXTENSION_OF__DATASTRUCTURE = COMPLEX_TYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Compare Field Counts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE___COMPARE_FIELD_COUNTS__DATASTRUCTURE = COMPLEX_TYPE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE_OPERATION_COUNT = COMPLEX_TYPE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.data.impl.ListTypeImpl <em>List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.data.impl.ListTypeImpl
	 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getListType()
	 * @generated
	 */
	int LIST_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__NAME = COMPLEX_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Data Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__DATA_MODEL = COMPLEX_TYPE__DATA_MODEL;

	/**
	 * The feature id for the '<em><b>Version</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__VERSION = COMPLEX_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__CONTEXT = COMPLEX_TYPE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__IS_STRUCTURE = COMPLEX_TYPE__IS_STRUCTURE;

	/**
	 * The feature id for the '<em><b>Is Primitive List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__IS_PRIMITIVE_LIST = COMPLEX_TYPE__IS_PRIMITIVE_LIST;

	/**
	 * The feature id for the '<em><b>Is Structured List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__IS_STRUCTURED_LIST = COMPLEX_TYPE__IS_STRUCTURED_LIST;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__PRIMITIVE_TYPE = COMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__DATA_FIELDS = COMPLEX_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE_FEATURE_COUNT = COMPLEX_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Qualified Name Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE___GET_QUALIFIED_NAME_PARTS = COMPLEX_TYPE___GET_QUALIFIED_NAME_PARTS;

	/**
	 * The operation id for the '<em>Compare Field Counts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE___COMPARE_FIELD_COUNTS__ELIST_ELIST = COMPLEX_TYPE___COMPARE_FIELD_COUNTS__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Compare Field Counts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE___COMPARE_FIELD_COUNTS__LISTTYPE = COMPLEX_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE_OPERATION_COUNT = COMPLEX_TYPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.data.impl.DataFieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.data.impl.DataFieldImpl
	 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getDataField()
	 * @generated
	 */
	int DATA_FIELD = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__HIDDEN = 1;

	/**
	 * The feature id for the '<em><b>Complex Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__COMPLEX_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__PRIMITIVE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Data Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__DATA_STRUCTURE = 4;

	/**
	 * The feature id for the '<em><b>List Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__LIST_TYPE = 5;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Get Effective Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD___GET_EFFECTIVE_TYPE = 0;

	/**
	 * The operation id for the '<em>Get Qualified Name Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD___GET_QUALIFIED_NAME_PARTS = 1;

	/**
	 * The operation id for the '<em>Find Eponymous Super Field</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD___FIND_EPONYMOUS_SUPER_FIELD = 2;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.fhdo.ddmm.data.impl.PrimitiveValueImpl <em>Primitive Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fhdo.ddmm.data.impl.PrimitiveValueImpl
	 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getPrimitiveValue()
	 * @generated
	 */
	int PRIMITIVE_VALUE = 21;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE__STRING_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE__BOOLEAN_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Numeric Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE__NUMERIC_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Primitive Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Is In Closed Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___IS_IN_CLOSED_SET__BIGDECIMAL_BIGDECIMAL = 0;

	/**
	 * The operation id for the '<em>Has Decimals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___HAS_DECIMALS = 1;

	/**
	 * The operation id for the '<em>Is Of Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___IS_OF_TYPE__PRIMITIVETYPE = 2;

	/**
	 * The operation id for the '<em>Has No Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___HAS_NO_VALUE = 3;

	/**
	 * The operation id for the '<em>As Value Of Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___AS_VALUE_OF_TYPE__PRIMITIVETYPE = 4;

	/**
	 * The operation id for the '<em>As Boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___AS_BOOLEAN = 5;

	/**
	 * The operation id for the '<em>As Byte</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___AS_BYTE = 6;

	/**
	 * The operation id for the '<em>As Character</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___AS_CHARACTER = 7;

	/**
	 * The operation id for the '<em>As Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___AS_DATE = 8;

	/**
	 * The operation id for the '<em>As Double</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___AS_DOUBLE = 9;

	/**
	 * The operation id for the '<em>As Float</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___AS_FLOAT = 10;

	/**
	 * The operation id for the '<em>As Integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___AS_INTEGER = 11;

	/**
	 * The operation id for the '<em>As Long</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___AS_LONG = 12;

	/**
	 * The operation id for the '<em>As Short</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___AS_SHORT = 13;

	/**
	 * The operation id for the '<em>As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE___AS_STRING = 14;

	/**
	 * The number of operations of the '<em>Primitive Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE_OPERATION_COUNT = 15;


	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.data.DataModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see de.fhdo.ddmm.data.DataModel
	 * @generated
	 */
	EClass getDataModel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.data.DataModel#getComplexTypeImports <em>Complex Type Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Type Imports</em>'.
	 * @see de.fhdo.ddmm.data.DataModel#getComplexTypeImports()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_ComplexTypeImports();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.data.DataModel#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Versions</em>'.
	 * @see de.fhdo.ddmm.data.DataModel#getVersions()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_Versions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.data.DataModel#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see de.fhdo.ddmm.data.DataModel#getContexts()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_Contexts();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.data.DataModel#getComplexTypes <em>Complex Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Types</em>'.
	 * @see de.fhdo.ddmm.data.DataModel#getComplexTypes()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_ComplexTypes();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.data.DataModel#getContainedComplexTypes() <em>Get Contained Complex Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contained Complex Types</em>' operation.
	 * @see de.fhdo.ddmm.data.DataModel#getContainedComplexTypes()
	 * @generated
	 */
	EOperation getDataModel__GetContainedComplexTypes();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.data.ComplexTypeImport <em>Complex Type Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type Import</em>'.
	 * @see de.fhdo.ddmm.data.ComplexTypeImport
	 * @generated
	 */
	EClass getComplexTypeImport();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.data.ComplexTypeImport#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.fhdo.ddmm.data.ComplexTypeImport#getName()
	 * @see #getComplexTypeImport()
	 * @generated
	 */
	EAttribute getComplexTypeImport_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.data.ComplexTypeImport#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see de.fhdo.ddmm.data.ComplexTypeImport#getImportURI()
	 * @see #getComplexTypeImport()
	 * @generated
	 */
	EAttribute getComplexTypeImport_ImportURI();

	/**
	 * Returns the meta object for the container reference '{@link de.fhdo.ddmm.data.ComplexTypeImport#getDataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Model</em>'.
	 * @see de.fhdo.ddmm.data.ComplexTypeImport#getDataModel()
	 * @see #getComplexTypeImport()
	 * @generated
	 */
	EReference getComplexTypeImport_DataModel();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.data.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see de.fhdo.ddmm.data.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.data.Version#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.fhdo.ddmm.data.Version#getName()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.data.Version#getComplexTypes <em>Complex Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Types</em>'.
	 * @see de.fhdo.ddmm.data.Version#getComplexTypes()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_ComplexTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.data.Version#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see de.fhdo.ddmm.data.Version#getContexts()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_Contexts();

	/**
	 * Returns the meta object for the container reference '{@link de.fhdo.ddmm.data.Version#getDataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Model</em>'.
	 * @see de.fhdo.ddmm.data.Version#getDataModel()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_DataModel();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.data.Version#getContainedComplexTypes() <em>Get Contained Complex Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contained Complex Types</em>' operation.
	 * @see de.fhdo.ddmm.data.Version#getContainedComplexTypes()
	 * @generated
	 */
	EOperation getVersion__GetContainedComplexTypes();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.data.Version#getQualifiedNameParts() <em>Get Qualified Name Parts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Qualified Name Parts</em>' operation.
	 * @see de.fhdo.ddmm.data.Version#getQualifiedNameParts()
	 * @generated
	 */
	EOperation getVersion__GetQualifiedNameParts();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.data.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see de.fhdo.ddmm.data.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.data.Context#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.fhdo.ddmm.data.Context#getName()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.data.Context#getComplexTypes <em>Complex Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Types</em>'.
	 * @see de.fhdo.ddmm.data.Context#getComplexTypes()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_ComplexTypes();

	/**
	 * Returns the meta object for the container reference '{@link de.fhdo.ddmm.data.Context#getDataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Model</em>'.
	 * @see de.fhdo.ddmm.data.Context#getDataModel()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_DataModel();

	/**
	 * Returns the meta object for the container reference '{@link de.fhdo.ddmm.data.Context#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Version</em>'.
	 * @see de.fhdo.ddmm.data.Context#getVersion()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Version();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.data.Context#getQualifiedNameParts() <em>Get Qualified Name Parts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Qualified Name Parts</em>' operation.
	 * @see de.fhdo.ddmm.data.Context#getQualifiedNameParts()
	 * @generated
	 */
	EOperation getContext__GetQualifiedNameParts();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.data.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see de.fhdo.ddmm.data.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.data.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see de.fhdo.ddmm.data.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.data.PrimitiveType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see de.fhdo.ddmm.data.PrimitiveType#getTypeName()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EAttribute getPrimitiveType_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.data.PrimitiveType#getTypeSize <em>Type Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Size</em>'.
	 * @see de.fhdo.ddmm.data.PrimitiveType#getTypeSize()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EAttribute getPrimitiveType_TypeSize();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.data.PrimitiveType#sizeCompare(de.fhdo.ddmm.data.PrimitiveType) <em>Size Compare</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Size Compare</em>' operation.
	 * @see de.fhdo.ddmm.data.PrimitiveType#sizeCompare(de.fhdo.ddmm.data.PrimitiveType)
	 * @generated
	 */
	EOperation getPrimitiveType__SizeCompare__PrimitiveType();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.data.PrimitiveType#isCompatibleWith(de.fhdo.ddmm.data.PrimitiveType) <em>Is Compatible With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Compatible With</em>' operation.
	 * @see de.fhdo.ddmm.data.PrimitiveType#isCompatibleWith(de.fhdo.ddmm.data.PrimitiveType)
	 * @generated
	 */
	EOperation getPrimitiveType__IsCompatibleWith__PrimitiveType();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.data.PrimitiveType#getBuiltinPrimitiveTypes() <em>Get Builtin Primitive Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Builtin Primitive Types</em>' operation.
	 * @see de.fhdo.ddmm.data.PrimitiveType#getBuiltinPrimitiveTypes()
	 * @generated
	 */
	EOperation getPrimitiveType__GetBuiltinPrimitiveTypes();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.data.PrimitiveBoolean <em>Primitive Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Boolean</em>'.
	 * @see de.fhdo.ddmm.data.PrimitiveBoolean
	 * @generated
	 */
	EClass getPrimitiveBoolean();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.data.PrimitiveByte <em>Primitive Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Byte</em>'.
	 * @see de.fhdo.ddmm.data.PrimitiveByte
	 * @generated
	 */
	EClass getPrimitiveByte();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.data.PrimitiveCharacter <em>Primitive Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Character</em>'.
	 * @see de.fhdo.ddmm.data.PrimitiveCharacter
	 * @generated
	 */
	EClass getPrimitiveCharacter();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.data.PrimitiveDate <em>Primitive Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Date</em>'.
	 * @see de.fhdo.ddmm.data.PrimitiveDate
	 * @generated
	 */
	EClass getPrimitiveDate();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.data.PrimitiveDouble <em>Primitive Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Double</em>'.
	 * @see de.fhdo.ddmm.data.PrimitiveDouble
	 * @generated
	 */
	EClass getPrimitiveDouble();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.data.PrimitiveFloat <em>Primitive Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Float</em>'.
	 * @see de.fhdo.ddmm.data.PrimitiveFloat
	 * @generated
	 */
	EClass getPrimitiveFloat();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.data.PrimitiveInteger <em>Primitive Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Integer</em>'.
	 * @see de.fhdo.ddmm.data.PrimitiveInteger
	 * @generated
	 */
	EClass getPrimitiveInteger();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.data.PrimitiveLong <em>Primitive Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Long</em>'.
	 * @see de.fhdo.ddmm.data.PrimitiveLong
	 * @generated
	 */
	EClass getPrimitiveLong();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.data.PrimitiveShort <em>Primitive Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Short</em>'.
	 * @see de.fhdo.ddmm.data.PrimitiveShort
	 * @generated
	 */
	EClass getPrimitiveShort();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.data.PrimitiveString <em>Primitive String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive String</em>'.
	 * @see de.fhdo.ddmm.data.PrimitiveString
	 * @generated
	 */
	EClass getPrimitiveString();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.data.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type</em>'.
	 * @see de.fhdo.ddmm.data.ComplexType
	 * @generated
	 */
	EClass getComplexType();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.data.ComplexType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.fhdo.ddmm.data.ComplexType#getName()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_Name();

	/**
	 * Returns the meta object for the container reference '{@link de.fhdo.ddmm.data.ComplexType#getDataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Model</em>'.
	 * @see de.fhdo.ddmm.data.ComplexType#getDataModel()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_DataModel();

	/**
	 * Returns the meta object for the container reference '{@link de.fhdo.ddmm.data.ComplexType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Version</em>'.
	 * @see de.fhdo.ddmm.data.ComplexType#getVersion()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_Version();

	/**
	 * Returns the meta object for the container reference '{@link de.fhdo.ddmm.data.ComplexType#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Context</em>'.
	 * @see de.fhdo.ddmm.data.ComplexType#getContext()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_Context();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.data.ComplexType#isIsStructure <em>Is Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Structure</em>'.
	 * @see de.fhdo.ddmm.data.ComplexType#isIsStructure()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_IsStructure();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.data.ComplexType#isIsPrimitiveList <em>Is Primitive List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Primitive List</em>'.
	 * @see de.fhdo.ddmm.data.ComplexType#isIsPrimitiveList()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_IsPrimitiveList();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.data.ComplexType#isIsStructuredList <em>Is Structured List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Structured List</em>'.
	 * @see de.fhdo.ddmm.data.ComplexType#isIsStructuredList()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_IsStructuredList();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.data.ComplexType#getQualifiedNameParts() <em>Get Qualified Name Parts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Qualified Name Parts</em>' operation.
	 * @see de.fhdo.ddmm.data.ComplexType#getQualifiedNameParts()
	 * @generated
	 */
	EOperation getComplexType__GetQualifiedNameParts();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.data.ComplexType#compareFieldCounts(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Compare Field Counts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compare Field Counts</em>' operation.
	 * @see de.fhdo.ddmm.data.ComplexType#compareFieldCounts(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getComplexType__CompareFieldCounts__EList_EList();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.data.PossiblyImportedComplexType <em>Possibly Imported Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Possibly Imported Complex Type</em>'.
	 * @see de.fhdo.ddmm.data.PossiblyImportedComplexType
	 * @generated
	 */
	EClass getPossiblyImportedComplexType();

	/**
	 * Returns the meta object for the reference '{@link de.fhdo.ddmm.data.PossiblyImportedComplexType#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import</em>'.
	 * @see de.fhdo.ddmm.data.PossiblyImportedComplexType#getImport()
	 * @see #getPossiblyImportedComplexType()
	 * @generated
	 */
	EReference getPossiblyImportedComplexType_Import();

	/**
	 * Returns the meta object for the reference '{@link de.fhdo.ddmm.data.PossiblyImportedComplexType#getComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Complex Type</em>'.
	 * @see de.fhdo.ddmm.data.PossiblyImportedComplexType#getComplexType()
	 * @see #getPossiblyImportedComplexType()
	 * @generated
	 */
	EReference getPossiblyImportedComplexType_ComplexType();

	/**
	 * Returns the meta object for the container reference '{@link de.fhdo.ddmm.data.PossiblyImportedComplexType#getDataField <em>Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Field</em>'.
	 * @see de.fhdo.ddmm.data.PossiblyImportedComplexType#getDataField()
	 * @see #getPossiblyImportedComplexType()
	 * @generated
	 */
	EReference getPossiblyImportedComplexType_DataField();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.data.DataStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure</em>'.
	 * @see de.fhdo.ddmm.data.DataStructure
	 * @generated
	 */
	EClass getDataStructure();

	/**
	 * Returns the meta object for the reference '{@link de.fhdo.ddmm.data.DataStructure#getSuper <em>Super</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super</em>'.
	 * @see de.fhdo.ddmm.data.DataStructure#getSuper()
	 * @see #getDataStructure()
	 * @generated
	 */
	EReference getDataStructure_Super();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.data.DataStructure#getDataFields <em>Data Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Fields</em>'.
	 * @see de.fhdo.ddmm.data.DataStructure#getDataFields()
	 * @see #getDataStructure()
	 * @generated
	 */
	EReference getDataStructure_DataFields();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.data.DataStructure#getEffectiveFields() <em>Get Effective Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effective Fields</em>' operation.
	 * @see de.fhdo.ddmm.data.DataStructure#getEffectiveFields()
	 * @generated
	 */
	EOperation getDataStructure__GetEffectiveFields();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.data.DataStructure#isExtensionOf(de.fhdo.ddmm.data.DataStructure) <em>Is Extension Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Extension Of</em>' operation.
	 * @see de.fhdo.ddmm.data.DataStructure#isExtensionOf(de.fhdo.ddmm.data.DataStructure)
	 * @generated
	 */
	EOperation getDataStructure__IsExtensionOf__DataStructure();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.data.DataStructure#compareFieldCounts(de.fhdo.ddmm.data.DataStructure) <em>Compare Field Counts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compare Field Counts</em>' operation.
	 * @see de.fhdo.ddmm.data.DataStructure#compareFieldCounts(de.fhdo.ddmm.data.DataStructure)
	 * @generated
	 */
	EOperation getDataStructure__CompareFieldCounts__DataStructure();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.data.ListType <em>List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Type</em>'.
	 * @see de.fhdo.ddmm.data.ListType
	 * @generated
	 */
	EClass getListType();

	/**
	 * Returns the meta object for the containment reference '{@link de.fhdo.ddmm.data.ListType#getPrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primitive Type</em>'.
	 * @see de.fhdo.ddmm.data.ListType#getPrimitiveType()
	 * @see #getListType()
	 * @generated
	 */
	EReference getListType_PrimitiveType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fhdo.ddmm.data.ListType#getDataFields <em>Data Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Fields</em>'.
	 * @see de.fhdo.ddmm.data.ListType#getDataFields()
	 * @see #getListType()
	 * @generated
	 */
	EReference getListType_DataFields();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.data.ListType#compareFieldCounts(de.fhdo.ddmm.data.ListType) <em>Compare Field Counts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compare Field Counts</em>' operation.
	 * @see de.fhdo.ddmm.data.ListType#compareFieldCounts(de.fhdo.ddmm.data.ListType)
	 * @generated
	 */
	EOperation getListType__CompareFieldCounts__ListType();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.data.DataField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see de.fhdo.ddmm.data.DataField
	 * @generated
	 */
	EClass getDataField();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.data.DataField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.fhdo.ddmm.data.DataField#getName()
	 * @see #getDataField()
	 * @generated
	 */
	EAttribute getDataField_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.data.DataField#isHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see de.fhdo.ddmm.data.DataField#isHidden()
	 * @see #getDataField()
	 * @generated
	 */
	EAttribute getDataField_Hidden();

	/**
	 * Returns the meta object for the containment reference '{@link de.fhdo.ddmm.data.DataField#getComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Type</em>'.
	 * @see de.fhdo.ddmm.data.DataField#getComplexType()
	 * @see #getDataField()
	 * @generated
	 */
	EReference getDataField_ComplexType();

	/**
	 * Returns the meta object for the containment reference '{@link de.fhdo.ddmm.data.DataField#getPrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primitive Type</em>'.
	 * @see de.fhdo.ddmm.data.DataField#getPrimitiveType()
	 * @see #getDataField()
	 * @generated
	 */
	EReference getDataField_PrimitiveType();

	/**
	 * Returns the meta object for the container reference '{@link de.fhdo.ddmm.data.DataField#getDataStructure <em>Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Structure</em>'.
	 * @see de.fhdo.ddmm.data.DataField#getDataStructure()
	 * @see #getDataField()
	 * @generated
	 */
	EReference getDataField_DataStructure();

	/**
	 * Returns the meta object for the container reference '{@link de.fhdo.ddmm.data.DataField#getListType <em>List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>List Type</em>'.
	 * @see de.fhdo.ddmm.data.DataField#getListType()
	 * @see #getDataField()
	 * @generated
	 */
	EReference getDataField_ListType();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.data.DataField#getEffectiveType() <em>Get Effective Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Effective Type</em>' operation.
	 * @see de.fhdo.ddmm.data.DataField#getEffectiveType()
	 * @generated
	 */
	EOperation getDataField__GetEffectiveType();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.data.DataField#getQualifiedNameParts() <em>Get Qualified Name Parts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Qualified Name Parts</em>' operation.
	 * @see de.fhdo.ddmm.data.DataField#getQualifiedNameParts()
	 * @generated
	 */
	EOperation getDataField__GetQualifiedNameParts();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.data.DataField#findEponymousSuperField() <em>Find Eponymous Super Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Eponymous Super Field</em>' operation.
	 * @see de.fhdo.ddmm.data.DataField#findEponymousSuperField()
	 * @generated
	 */
	EOperation getDataField__FindEponymousSuperField();

	/**
	 * Returns the meta object for class '{@link de.fhdo.ddmm.data.PrimitiveValue <em>Primitive Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Value</em>'.
	 * @see de.fhdo.ddmm.data.PrimitiveValue
	 * @generated
	 */
	EClass getPrimitiveValue();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.data.PrimitiveValue#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Value</em>'.
	 * @see de.fhdo.ddmm.data.PrimitiveValue#getStringValue()
	 * @see #getPrimitiveValue()
	 * @generated
	 */
	EAttribute getPrimitiveValue_StringValue();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.data.PrimitiveValue#getBooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean Value</em>'.
	 * @see de.fhdo.ddmm.data.PrimitiveValue#getBooleanValue()
	 * @see #getPrimitiveValue()
	 * @generated
	 */
	EAttribute getPrimitiveValue_BooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link de.fhdo.ddmm.data.PrimitiveValue#getNumericValue <em>Numeric Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numeric Value</em>'.
	 * @see de.fhdo.ddmm.data.PrimitiveValue#getNumericValue()
	 * @see #getPrimitiveValue()
	 * @generated
	 */
	EAttribute getPrimitiveValue_NumericValue();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.data.PrimitiveValue#isInClosedSet(java.math.BigDecimal, java.math.BigDecimal) <em>Is In Closed Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is In Closed Set</em>' operation.
	 * @see de.fhdo.ddmm.data.PrimitiveValue#isInClosedSet(java.math.BigDecimal, java.math.BigDecimal)
	 * @generated
	 */
	EOperation getPrimitiveValue__IsInClosedSet__BigDecimal_BigDecimal();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.data.PrimitiveValue#hasDecimals() <em>Has Decimals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Decimals</em>' operation.
	 * @see de.fhdo.ddmm.data.PrimitiveValue#hasDecimals()
	 * @generated
	 */
	EOperation getPrimitiveValue__HasDecimals();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.data.PrimitiveValue#isOfType(de.fhdo.ddmm.data.PrimitiveType) <em>Is Of Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Of Type</em>' operation.
	 * @see de.fhdo.ddmm.data.PrimitiveValue#isOfType(de.fhdo.ddmm.data.PrimitiveType)
	 * @generated
	 */
	EOperation getPrimitiveValue__IsOfType__PrimitiveType();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.data.PrimitiveValue#hasNoValue() <em>Has No Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has No Value</em>' operation.
	 * @see de.fhdo.ddmm.data.PrimitiveValue#hasNoValue()
	 * @generated
	 */
	EOperation getPrimitiveValue__HasNoValue();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.data.PrimitiveValue#asValueOfType(de.fhdo.ddmm.data.PrimitiveType) <em>As Value Of Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As Value Of Type</em>' operation.
	 * @see de.fhdo.ddmm.data.PrimitiveValue#asValueOfType(de.fhdo.ddmm.data.PrimitiveType)
	 * @generated
	 */
	EOperation getPrimitiveValue__AsValueOfType__PrimitiveType();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.data.PrimitiveValue#asBoolean() <em>As Boolean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As Boolean</em>' operation.
	 * @see de.fhdo.ddmm.data.PrimitiveValue#asBoolean()
	 * @generated
	 */
	EOperation getPrimitiveValue__AsBoolean();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.data.PrimitiveValue#asByte() <em>As Byte</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As Byte</em>' operation.
	 * @see de.fhdo.ddmm.data.PrimitiveValue#asByte()
	 * @generated
	 */
	EOperation getPrimitiveValue__AsByte();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.data.PrimitiveValue#asCharacter() <em>As Character</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As Character</em>' operation.
	 * @see de.fhdo.ddmm.data.PrimitiveValue#asCharacter()
	 * @generated
	 */
	EOperation getPrimitiveValue__AsCharacter();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.data.PrimitiveValue#asDate() <em>As Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As Date</em>' operation.
	 * @see de.fhdo.ddmm.data.PrimitiveValue#asDate()
	 * @generated
	 */
	EOperation getPrimitiveValue__AsDate();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.data.PrimitiveValue#asDouble() <em>As Double</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As Double</em>' operation.
	 * @see de.fhdo.ddmm.data.PrimitiveValue#asDouble()
	 * @generated
	 */
	EOperation getPrimitiveValue__AsDouble();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.data.PrimitiveValue#asFloat() <em>As Float</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As Float</em>' operation.
	 * @see de.fhdo.ddmm.data.PrimitiveValue#asFloat()
	 * @generated
	 */
	EOperation getPrimitiveValue__AsFloat();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.data.PrimitiveValue#asInteger() <em>As Integer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As Integer</em>' operation.
	 * @see de.fhdo.ddmm.data.PrimitiveValue#asInteger()
	 * @generated
	 */
	EOperation getPrimitiveValue__AsInteger();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.data.PrimitiveValue#asLong() <em>As Long</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As Long</em>' operation.
	 * @see de.fhdo.ddmm.data.PrimitiveValue#asLong()
	 * @generated
	 */
	EOperation getPrimitiveValue__AsLong();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.data.PrimitiveValue#asShort() <em>As Short</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As Short</em>' operation.
	 * @see de.fhdo.ddmm.data.PrimitiveValue#asShort()
	 * @generated
	 */
	EOperation getPrimitiveValue__AsShort();

	/**
	 * Returns the meta object for the '{@link de.fhdo.ddmm.data.PrimitiveValue#asString() <em>As String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As String</em>' operation.
	 * @see de.fhdo.ddmm.data.PrimitiveValue#asString()
	 * @generated
	 */
	EOperation getPrimitiveValue__AsString();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataFactory getDataFactory();

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
		 * The meta object literal for the '{@link de.fhdo.ddmm.data.impl.DataModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.data.impl.DataModelImpl
		 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getDataModel()
		 * @generated
		 */
		EClass DATA_MODEL = eINSTANCE.getDataModel();

		/**
		 * The meta object literal for the '<em><b>Complex Type Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__COMPLEX_TYPE_IMPORTS = eINSTANCE.getDataModel_ComplexTypeImports();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__VERSIONS = eINSTANCE.getDataModel_Versions();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__CONTEXTS = eINSTANCE.getDataModel_Contexts();

		/**
		 * The meta object literal for the '<em><b>Complex Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__COMPLEX_TYPES = eINSTANCE.getDataModel_ComplexTypes();

		/**
		 * The meta object literal for the '<em><b>Get Contained Complex Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_MODEL___GET_CONTAINED_COMPLEX_TYPES = eINSTANCE.getDataModel__GetContainedComplexTypes();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.data.impl.ComplexTypeImportImpl <em>Complex Type Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.data.impl.ComplexTypeImportImpl
		 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getComplexTypeImport()
		 * @generated
		 */
		EClass COMPLEX_TYPE_IMPORT = eINSTANCE.getComplexTypeImport();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE_IMPORT__NAME = eINSTANCE.getComplexTypeImport_Name();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE_IMPORT__IMPORT_URI = eINSTANCE.getComplexTypeImport_ImportURI();

		/**
		 * The meta object literal for the '<em><b>Data Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE_IMPORT__DATA_MODEL = eINSTANCE.getComplexTypeImport_DataModel();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.data.impl.VersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.data.impl.VersionImpl
		 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getVersion()
		 * @generated
		 */
		EClass VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__NAME = eINSTANCE.getVersion_Name();

		/**
		 * The meta object literal for the '<em><b>Complex Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION__COMPLEX_TYPES = eINSTANCE.getVersion_ComplexTypes();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION__CONTEXTS = eINSTANCE.getVersion_Contexts();

		/**
		 * The meta object literal for the '<em><b>Data Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION__DATA_MODEL = eINSTANCE.getVersion_DataModel();

		/**
		 * The meta object literal for the '<em><b>Get Contained Complex Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERSION___GET_CONTAINED_COMPLEX_TYPES = eINSTANCE.getVersion__GetContainedComplexTypes();

		/**
		 * The meta object literal for the '<em><b>Get Qualified Name Parts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERSION___GET_QUALIFIED_NAME_PARTS = eINSTANCE.getVersion__GetQualifiedNameParts();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.data.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.data.impl.ContextImpl
		 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__NAME = eINSTANCE.getContext_Name();

		/**
		 * The meta object literal for the '<em><b>Complex Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__COMPLEX_TYPES = eINSTANCE.getContext_ComplexTypes();

		/**
		 * The meta object literal for the '<em><b>Data Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__DATA_MODEL = eINSTANCE.getContext_DataModel();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__VERSION = eINSTANCE.getContext_Version();

		/**
		 * The meta object literal for the '<em><b>Get Qualified Name Parts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___GET_QUALIFIED_NAME_PARTS = eINSTANCE.getContext__GetQualifiedNameParts();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.data.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.data.impl.TypeImpl
		 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.data.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.data.impl.PrimitiveTypeImpl
		 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE__TYPE_NAME = eINSTANCE.getPrimitiveType_TypeName();

		/**
		 * The meta object literal for the '<em><b>Type Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE__TYPE_SIZE = eINSTANCE.getPrimitiveType_TypeSize();

		/**
		 * The meta object literal for the '<em><b>Size Compare</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_TYPE___SIZE_COMPARE__PRIMITIVETYPE = eINSTANCE.getPrimitiveType__SizeCompare__PrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Is Compatible With</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_TYPE___IS_COMPATIBLE_WITH__PRIMITIVETYPE = eINSTANCE.getPrimitiveType__IsCompatibleWith__PrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Get Builtin Primitive Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_TYPE___GET_BUILTIN_PRIMITIVE_TYPES = eINSTANCE.getPrimitiveType__GetBuiltinPrimitiveTypes();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.data.impl.PrimitiveBooleanImpl <em>Primitive Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.data.impl.PrimitiveBooleanImpl
		 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getPrimitiveBoolean()
		 * @generated
		 */
		EClass PRIMITIVE_BOOLEAN = eINSTANCE.getPrimitiveBoolean();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.data.impl.PrimitiveByteImpl <em>Primitive Byte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.data.impl.PrimitiveByteImpl
		 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getPrimitiveByte()
		 * @generated
		 */
		EClass PRIMITIVE_BYTE = eINSTANCE.getPrimitiveByte();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.data.impl.PrimitiveCharacterImpl <em>Primitive Character</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.data.impl.PrimitiveCharacterImpl
		 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getPrimitiveCharacter()
		 * @generated
		 */
		EClass PRIMITIVE_CHARACTER = eINSTANCE.getPrimitiveCharacter();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.data.impl.PrimitiveDateImpl <em>Primitive Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.data.impl.PrimitiveDateImpl
		 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getPrimitiveDate()
		 * @generated
		 */
		EClass PRIMITIVE_DATE = eINSTANCE.getPrimitiveDate();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.data.impl.PrimitiveDoubleImpl <em>Primitive Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.data.impl.PrimitiveDoubleImpl
		 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getPrimitiveDouble()
		 * @generated
		 */
		EClass PRIMITIVE_DOUBLE = eINSTANCE.getPrimitiveDouble();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.data.impl.PrimitiveFloatImpl <em>Primitive Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.data.impl.PrimitiveFloatImpl
		 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getPrimitiveFloat()
		 * @generated
		 */
		EClass PRIMITIVE_FLOAT = eINSTANCE.getPrimitiveFloat();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.data.impl.PrimitiveIntegerImpl <em>Primitive Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.data.impl.PrimitiveIntegerImpl
		 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getPrimitiveInteger()
		 * @generated
		 */
		EClass PRIMITIVE_INTEGER = eINSTANCE.getPrimitiveInteger();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.data.impl.PrimitiveLongImpl <em>Primitive Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.data.impl.PrimitiveLongImpl
		 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getPrimitiveLong()
		 * @generated
		 */
		EClass PRIMITIVE_LONG = eINSTANCE.getPrimitiveLong();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.data.impl.PrimitiveShortImpl <em>Primitive Short</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.data.impl.PrimitiveShortImpl
		 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getPrimitiveShort()
		 * @generated
		 */
		EClass PRIMITIVE_SHORT = eINSTANCE.getPrimitiveShort();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.data.impl.PrimitiveStringImpl <em>Primitive String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.data.impl.PrimitiveStringImpl
		 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getPrimitiveString()
		 * @generated
		 */
		EClass PRIMITIVE_STRING = eINSTANCE.getPrimitiveString();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.data.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.data.impl.ComplexTypeImpl
		 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getComplexType()
		 * @generated
		 */
		EClass COMPLEX_TYPE = eINSTANCE.getComplexType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE__NAME = eINSTANCE.getComplexType_Name();

		/**
		 * The meta object literal for the '<em><b>Data Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE__DATA_MODEL = eINSTANCE.getComplexType_DataModel();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE__VERSION = eINSTANCE.getComplexType_Version();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE__CONTEXT = eINSTANCE.getComplexType_Context();

		/**
		 * The meta object literal for the '<em><b>Is Structure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE__IS_STRUCTURE = eINSTANCE.getComplexType_IsStructure();

		/**
		 * The meta object literal for the '<em><b>Is Primitive List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE__IS_PRIMITIVE_LIST = eINSTANCE.getComplexType_IsPrimitiveList();

		/**
		 * The meta object literal for the '<em><b>Is Structured List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE__IS_STRUCTURED_LIST = eINSTANCE.getComplexType_IsStructuredList();

		/**
		 * The meta object literal for the '<em><b>Get Qualified Name Parts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_TYPE___GET_QUALIFIED_NAME_PARTS = eINSTANCE.getComplexType__GetQualifiedNameParts();

		/**
		 * The meta object literal for the '<em><b>Compare Field Counts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEX_TYPE___COMPARE_FIELD_COUNTS__ELIST_ELIST = eINSTANCE.getComplexType__CompareFieldCounts__EList_EList();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.data.impl.PossiblyImportedComplexTypeImpl <em>Possibly Imported Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.data.impl.PossiblyImportedComplexTypeImpl
		 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getPossiblyImportedComplexType()
		 * @generated
		 */
		EClass POSSIBLY_IMPORTED_COMPLEX_TYPE = eINSTANCE.getPossiblyImportedComplexType();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSSIBLY_IMPORTED_COMPLEX_TYPE__IMPORT = eINSTANCE.getPossiblyImportedComplexType_Import();

		/**
		 * The meta object literal for the '<em><b>Complex Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSSIBLY_IMPORTED_COMPLEX_TYPE__COMPLEX_TYPE = eINSTANCE.getPossiblyImportedComplexType_ComplexType();

		/**
		 * The meta object literal for the '<em><b>Data Field</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSSIBLY_IMPORTED_COMPLEX_TYPE__DATA_FIELD = eINSTANCE.getPossiblyImportedComplexType_DataField();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.data.impl.DataStructureImpl <em>Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.data.impl.DataStructureImpl
		 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getDataStructure()
		 * @generated
		 */
		EClass DATA_STRUCTURE = eINSTANCE.getDataStructure();

		/**
		 * The meta object literal for the '<em><b>Super</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_STRUCTURE__SUPER = eINSTANCE.getDataStructure_Super();

		/**
		 * The meta object literal for the '<em><b>Data Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_STRUCTURE__DATA_FIELDS = eINSTANCE.getDataStructure_DataFields();

		/**
		 * The meta object literal for the '<em><b>Get Effective Fields</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_STRUCTURE___GET_EFFECTIVE_FIELDS = eINSTANCE.getDataStructure__GetEffectiveFields();

		/**
		 * The meta object literal for the '<em><b>Is Extension Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_STRUCTURE___IS_EXTENSION_OF__DATASTRUCTURE = eINSTANCE.getDataStructure__IsExtensionOf__DataStructure();

		/**
		 * The meta object literal for the '<em><b>Compare Field Counts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_STRUCTURE___COMPARE_FIELD_COUNTS__DATASTRUCTURE = eINSTANCE.getDataStructure__CompareFieldCounts__DataStructure();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.data.impl.ListTypeImpl <em>List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.data.impl.ListTypeImpl
		 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getListType()
		 * @generated
		 */
		EClass LIST_TYPE = eINSTANCE.getListType();

		/**
		 * The meta object literal for the '<em><b>Primitive Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_TYPE__PRIMITIVE_TYPE = eINSTANCE.getListType_PrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Data Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_TYPE__DATA_FIELDS = eINSTANCE.getListType_DataFields();

		/**
		 * The meta object literal for the '<em><b>Compare Field Counts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIST_TYPE___COMPARE_FIELD_COUNTS__LISTTYPE = eINSTANCE.getListType__CompareFieldCounts__ListType();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.data.impl.DataFieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.data.impl.DataFieldImpl
		 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getDataField()
		 * @generated
		 */
		EClass DATA_FIELD = eINSTANCE.getDataField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FIELD__NAME = eINSTANCE.getDataField_Name();

		/**
		 * The meta object literal for the '<em><b>Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FIELD__HIDDEN = eINSTANCE.getDataField_Hidden();

		/**
		 * The meta object literal for the '<em><b>Complex Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FIELD__COMPLEX_TYPE = eINSTANCE.getDataField_ComplexType();

		/**
		 * The meta object literal for the '<em><b>Primitive Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FIELD__PRIMITIVE_TYPE = eINSTANCE.getDataField_PrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Data Structure</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FIELD__DATA_STRUCTURE = eINSTANCE.getDataField_DataStructure();

		/**
		 * The meta object literal for the '<em><b>List Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FIELD__LIST_TYPE = eINSTANCE.getDataField_ListType();

		/**
		 * The meta object literal for the '<em><b>Get Effective Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FIELD___GET_EFFECTIVE_TYPE = eINSTANCE.getDataField__GetEffectiveType();

		/**
		 * The meta object literal for the '<em><b>Get Qualified Name Parts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FIELD___GET_QUALIFIED_NAME_PARTS = eINSTANCE.getDataField__GetQualifiedNameParts();

		/**
		 * The meta object literal for the '<em><b>Find Eponymous Super Field</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FIELD___FIND_EPONYMOUS_SUPER_FIELD = eINSTANCE.getDataField__FindEponymousSuperField();

		/**
		 * The meta object literal for the '{@link de.fhdo.ddmm.data.impl.PrimitiveValueImpl <em>Primitive Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fhdo.ddmm.data.impl.PrimitiveValueImpl
		 * @see de.fhdo.ddmm.data.impl.DataPackageImpl#getPrimitiveValue()
		 * @generated
		 */
		EClass PRIMITIVE_VALUE = eINSTANCE.getPrimitiveValue();

		/**
		 * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_VALUE__STRING_VALUE = eINSTANCE.getPrimitiveValue_StringValue();

		/**
		 * The meta object literal for the '<em><b>Boolean Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_VALUE__BOOLEAN_VALUE = eINSTANCE.getPrimitiveValue_BooleanValue();

		/**
		 * The meta object literal for the '<em><b>Numeric Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_VALUE__NUMERIC_VALUE = eINSTANCE.getPrimitiveValue_NumericValue();

		/**
		 * The meta object literal for the '<em><b>Is In Closed Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___IS_IN_CLOSED_SET__BIGDECIMAL_BIGDECIMAL = eINSTANCE.getPrimitiveValue__IsInClosedSet__BigDecimal_BigDecimal();

		/**
		 * The meta object literal for the '<em><b>Has Decimals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___HAS_DECIMALS = eINSTANCE.getPrimitiveValue__HasDecimals();

		/**
		 * The meta object literal for the '<em><b>Is Of Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___IS_OF_TYPE__PRIMITIVETYPE = eINSTANCE.getPrimitiveValue__IsOfType__PrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Has No Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___HAS_NO_VALUE = eINSTANCE.getPrimitiveValue__HasNoValue();

		/**
		 * The meta object literal for the '<em><b>As Value Of Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___AS_VALUE_OF_TYPE__PRIMITIVETYPE = eINSTANCE.getPrimitiveValue__AsValueOfType__PrimitiveType();

		/**
		 * The meta object literal for the '<em><b>As Boolean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___AS_BOOLEAN = eINSTANCE.getPrimitiveValue__AsBoolean();

		/**
		 * The meta object literal for the '<em><b>As Byte</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___AS_BYTE = eINSTANCE.getPrimitiveValue__AsByte();

		/**
		 * The meta object literal for the '<em><b>As Character</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___AS_CHARACTER = eINSTANCE.getPrimitiveValue__AsCharacter();

		/**
		 * The meta object literal for the '<em><b>As Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___AS_DATE = eINSTANCE.getPrimitiveValue__AsDate();

		/**
		 * The meta object literal for the '<em><b>As Double</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___AS_DOUBLE = eINSTANCE.getPrimitiveValue__AsDouble();

		/**
		 * The meta object literal for the '<em><b>As Float</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___AS_FLOAT = eINSTANCE.getPrimitiveValue__AsFloat();

		/**
		 * The meta object literal for the '<em><b>As Integer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___AS_INTEGER = eINSTANCE.getPrimitiveValue__AsInteger();

		/**
		 * The meta object literal for the '<em><b>As Long</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___AS_LONG = eINSTANCE.getPrimitiveValue__AsLong();

		/**
		 * The meta object literal for the '<em><b>As Short</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___AS_SHORT = eINSTANCE.getPrimitiveValue__AsShort();

		/**
		 * The meta object literal for the '<em><b>As String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_VALUE___AS_STRING = eINSTANCE.getPrimitiveValue__AsString();

	}

} //DataPackage
