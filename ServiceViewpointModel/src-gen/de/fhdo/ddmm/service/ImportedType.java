/**
 */
package de.fhdo.ddmm.service;

import de.fhdo.ddmm.data.Type;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imported Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Represents a type imported from a data or technology model
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fhdo.ddmm.service.ImportedType#getImport <em>Import</em>}</li>
 *   <li>{@link de.fhdo.ddmm.service.ImportedType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.fhdo.ddmm.service.ServicePackage#getImportedType()
 * @model
 * @generated
 */
public interface ImportedType extends EObject {
	/**
	 * Returns the value of the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' reference.
	 * @see #setImport(Import)
	 * @see de.fhdo.ddmm.service.ServicePackage#getImportedType_Import()
	 * @model
	 * @generated
	 */
	Import getImport();

	/**
	 * Sets the value of the '{@link de.fhdo.ddmm.service.ImportedType#getImport <em>Import</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import</em>' reference.
	 * @see #getImport()
	 * @generated
	 */
	void setImport(Import value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see de.fhdo.ddmm.service.ServicePackage#getImportedType_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link de.fhdo.ddmm.service.ImportedType#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // ImportedType
