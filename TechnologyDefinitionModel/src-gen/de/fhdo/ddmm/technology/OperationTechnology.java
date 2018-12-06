/**
 */
package de.fhdo.ddmm.technology;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Technology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Abstract superclass of technologies specific to service operation
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fhdo.ddmm.technology.OperationTechnology#getName <em>Name</em>}</li>
 *   <li>{@link de.fhdo.ddmm.technology.OperationTechnology#getOperationEnvironments <em>Operation Environments</em>}</li>
 *   <li>{@link de.fhdo.ddmm.technology.OperationTechnology#getServiceProperties <em>Service Properties</em>}</li>
 * </ul>
 *
 * @see de.fhdo.ddmm.technology.TechnologyPackage#getOperationTechnology()
 * @model abstract="true"
 * @generated
 */
public interface OperationTechnology extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.fhdo.ddmm.technology.TechnologyPackage#getOperationTechnology_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.fhdo.ddmm.technology.OperationTechnology#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Operation Environments</b></em>' containment reference list.
	 * The list contents are of type {@link de.fhdo.ddmm.technology.OperationEnvironment}.
	 * It is bidirectional and its opposite is '{@link de.fhdo.ddmm.technology.OperationEnvironment#getOperationTechnology <em>Operation Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Environments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Environments</em>' containment reference list.
	 * @see de.fhdo.ddmm.technology.TechnologyPackage#getOperationTechnology_OperationEnvironments()
	 * @see de.fhdo.ddmm.technology.OperationEnvironment#getOperationTechnology
	 * @model opposite="operationTechnology" containment="true" required="true"
	 * @generated
	 */
	EList<OperationEnvironment> getOperationEnvironments();

	/**
	 * Returns the value of the '<em><b>Service Properties</b></em>' containment reference list.
	 * The list contents are of type {@link de.fhdo.ddmm.technology.TechnologySpecificProperty}.
	 * It is bidirectional and its opposite is '{@link de.fhdo.ddmm.technology.TechnologySpecificProperty#getOperationTechnology <em>Operation Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Properties</em>' containment reference list.
	 * @see de.fhdo.ddmm.technology.TechnologyPackage#getOperationTechnology_ServiceProperties()
	 * @see de.fhdo.ddmm.technology.TechnologySpecificProperty#getOperationTechnology
	 * @model opposite="operationTechnology" containment="true"
	 * @generated
	 */
	EList<TechnologySpecificProperty> getServiceProperties();

} // OperationTechnology
