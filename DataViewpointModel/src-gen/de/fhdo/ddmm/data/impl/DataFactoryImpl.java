/**
 */
package de.fhdo.ddmm.data.impl;

import de.fhdo.ddmm.data.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataFactoryImpl extends EFactoryImpl implements DataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataFactory init() {
		try {
			DataFactory theDataFactory = (DataFactory)EPackage.Registry.INSTANCE.getEFactory(DataPackage.eNS_URI);
			if (theDataFactory != null) {
				return theDataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DataPackage.DATA_MODEL: return createDataModel();
			case DataPackage.COMPLEX_TYPE_IMPORT: return createComplexTypeImport();
			case DataPackage.VERSION: return createVersion();
			case DataPackage.CONTEXT: return createContext();
			case DataPackage.PRIMITIVE_BOOLEAN: return createPrimitiveBoolean();
			case DataPackage.PRIMITIVE_BYTE: return createPrimitiveByte();
			case DataPackage.PRIMITIVE_CHARACTER: return createPrimitiveCharacter();
			case DataPackage.PRIMITIVE_DATE: return createPrimitiveDate();
			case DataPackage.PRIMITIVE_DOUBLE: return createPrimitiveDouble();
			case DataPackage.PRIMITIVE_FLOAT: return createPrimitiveFloat();
			case DataPackage.PRIMITIVE_INTEGER: return createPrimitiveInteger();
			case DataPackage.PRIMITIVE_LONG: return createPrimitiveLong();
			case DataPackage.PRIMITIVE_SHORT: return createPrimitiveShort();
			case DataPackage.PRIMITIVE_STRING: return createPrimitiveString();
			case DataPackage.POSSIBLY_IMPORTED_COMPLEX_TYPE: return createPossiblyImportedComplexType();
			case DataPackage.DATA_STRUCTURE: return createDataStructure();
			case DataPackage.LIST_TYPE: return createListType();
			case DataPackage.DATA_FIELD: return createDataField();
			case DataPackage.PRIMITIVE_VALUE: return createPrimitiveValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModel createDataModel() {
		DataModelImpl dataModel = new DataModelImpl();
		return dataModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexTypeImport createComplexTypeImport() {
		ComplexTypeImportImpl complexTypeImport = new ComplexTypeImportImpl();
		return complexTypeImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version createVersion() {
		VersionImpl version = new VersionImpl();
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveBoolean createPrimitiveBoolean() {
		PrimitiveBooleanImpl primitiveBoolean = new PrimitiveBooleanImpl();
		return primitiveBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveByte createPrimitiveByte() {
		PrimitiveByteImpl primitiveByte = new PrimitiveByteImpl();
		return primitiveByte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveCharacter createPrimitiveCharacter() {
		PrimitiveCharacterImpl primitiveCharacter = new PrimitiveCharacterImpl();
		return primitiveCharacter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveDate createPrimitiveDate() {
		PrimitiveDateImpl primitiveDate = new PrimitiveDateImpl();
		return primitiveDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveDouble createPrimitiveDouble() {
		PrimitiveDoubleImpl primitiveDouble = new PrimitiveDoubleImpl();
		return primitiveDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveFloat createPrimitiveFloat() {
		PrimitiveFloatImpl primitiveFloat = new PrimitiveFloatImpl();
		return primitiveFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveInteger createPrimitiveInteger() {
		PrimitiveIntegerImpl primitiveInteger = new PrimitiveIntegerImpl();
		return primitiveInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveLong createPrimitiveLong() {
		PrimitiveLongImpl primitiveLong = new PrimitiveLongImpl();
		return primitiveLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveShort createPrimitiveShort() {
		PrimitiveShortImpl primitiveShort = new PrimitiveShortImpl();
		return primitiveShort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveString createPrimitiveString() {
		PrimitiveStringImpl primitiveString = new PrimitiveStringImpl();
		return primitiveString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PossiblyImportedComplexType createPossiblyImportedComplexType() {
		PossiblyImportedComplexTypeImpl possiblyImportedComplexType = new PossiblyImportedComplexTypeImpl();
		return possiblyImportedComplexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStructure createDataStructure() {
		DataStructureImpl dataStructure = new DataStructureImpl();
		return dataStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListType createListType() {
		ListTypeImpl listType = new ListTypeImpl();
		return listType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataField createDataField() {
		DataFieldImpl dataField = new DataFieldImpl();
		return dataField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveValue createPrimitiveValue() {
		PrimitiveValueImpl primitiveValue = new PrimitiveValueImpl();
		return primitiveValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPackage getDataPackage() {
		return (DataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataPackage getPackage() {
		return DataPackage.eINSTANCE;
	}

} //DataFactoryImpl
