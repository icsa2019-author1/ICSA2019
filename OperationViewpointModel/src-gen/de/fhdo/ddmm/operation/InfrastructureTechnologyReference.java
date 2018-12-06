/**
 */
package de.fhdo.ddmm.operation;

import de.fhdo.ddmm.service.Import;

import de.fhdo.ddmm.technology.InfrastructureTechnology;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure Technology Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Reference to an infrastructure technology
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fhdo.ddmm.operation.InfrastructureTechnologyReference#getImport <em>Import</em>}</li>
 *   <li>{@link de.fhdo.ddmm.operation.InfrastructureTechnologyReference#getInfrastructureTechnology <em>Infrastructure Technology</em>}</li>
 *   <li>{@link de.fhdo.ddmm.operation.InfrastructureTechnologyReference#getInfrastructureNode <em>Infrastructure Node</em>}</li>
 * </ul>
 *
 * @see de.fhdo.ddmm.operation.OperationPackage#getInfrastructureTechnologyReference()
 * @model
 * @generated
 */
public interface InfrastructureTechnologyReference extends EObject {
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
	 * @see de.fhdo.ddmm.operation.OperationPackage#getInfrastructureTechnologyReference_Import()
	 * @model
	 * @generated
	 */
	Import getImport();

	/**
	 * Sets the value of the '{@link de.fhdo.ddmm.operation.InfrastructureTechnologyReference#getImport <em>Import</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import</em>' reference.
	 * @see #getImport()
	 * @generated
	 */
	void setImport(Import value);

	/**
	 * Returns the value of the '<em><b>Infrastructure Technology</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infrastructure Technology</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infrastructure Technology</em>' reference.
	 * @see #setInfrastructureTechnology(InfrastructureTechnology)
	 * @see de.fhdo.ddmm.operation.OperationPackage#getInfrastructureTechnologyReference_InfrastructureTechnology()
	 * @model
	 * @generated
	 */
	InfrastructureTechnology getInfrastructureTechnology();

	/**
	 * Sets the value of the '{@link de.fhdo.ddmm.operation.InfrastructureTechnologyReference#getInfrastructureTechnology <em>Infrastructure Technology</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infrastructure Technology</em>' reference.
	 * @see #getInfrastructureTechnology()
	 * @generated
	 */
	void setInfrastructureTechnology(InfrastructureTechnology value);

	/**
	 * Returns the value of the '<em><b>Infrastructure Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.fhdo.ddmm.operation.InfrastructureNode#getInfrastructureTechnology <em>Infrastructure Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infrastructure Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infrastructure Node</em>' container reference.
	 * @see #setInfrastructureNode(InfrastructureNode)
	 * @see de.fhdo.ddmm.operation.OperationPackage#getInfrastructureTechnologyReference_InfrastructureNode()
	 * @see de.fhdo.ddmm.operation.InfrastructureNode#getInfrastructureTechnology
	 * @model opposite="infrastructureTechnology" transient="false"
	 * @generated
	 */
	InfrastructureNode getInfrastructureNode();

	/**
	 * Sets the value of the '{@link de.fhdo.ddmm.operation.InfrastructureTechnologyReference#getInfrastructureNode <em>Infrastructure Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infrastructure Node</em>' container reference.
	 * @see #getInfrastructureNode()
	 * @generated
	 */
	void setInfrastructureNode(InfrastructureNode value);

} // InfrastructureTechnologyReference
