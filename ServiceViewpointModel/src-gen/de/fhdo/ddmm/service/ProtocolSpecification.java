/**
 */
package de.fhdo.ddmm.service;

import de.fhdo.ddmm.technology.CommunicationType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Protocol specification that combines a communication type with an imported protocol. Used to
 * specify, e.g., the default asynchronous and/or synchronous protocol of services, interfaces, and
 * operations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fhdo.ddmm.service.ProtocolSpecification#getCommunicationType <em>Communication Type</em>}</li>
 *   <li>{@link de.fhdo.ddmm.service.ProtocolSpecification#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @see de.fhdo.ddmm.service.ServicePackage#getProtocolSpecification()
 * @model
 * @generated
 */
public interface ProtocolSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Communication Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.fhdo.ddmm.technology.CommunicationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Type</em>' attribute.
	 * @see de.fhdo.ddmm.technology.CommunicationType
	 * @see #setCommunicationType(CommunicationType)
	 * @see de.fhdo.ddmm.service.ServicePackage#getProtocolSpecification_CommunicationType()
	 * @model unique="false"
	 * @generated
	 */
	CommunicationType getCommunicationType();

	/**
	 * Sets the value of the '{@link de.fhdo.ddmm.service.ProtocolSpecification#getCommunicationType <em>Communication Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Type</em>' attribute.
	 * @see de.fhdo.ddmm.technology.CommunicationType
	 * @see #getCommunicationType()
	 * @generated
	 */
	void setCommunicationType(CommunicationType value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.fhdo.ddmm.service.ImportedProtocolAndDataFormat#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference.
	 * @see #setProtocol(ImportedProtocolAndDataFormat)
	 * @see de.fhdo.ddmm.service.ServicePackage#getProtocolSpecification_Protocol()
	 * @see de.fhdo.ddmm.service.ImportedProtocolAndDataFormat#getSpecification
	 * @model opposite="specification" containment="true"
	 * @generated
	 */
	ImportedProtocolAndDataFormat getProtocol();

	/**
	 * Sets the value of the '{@link de.fhdo.ddmm.service.ProtocolSpecification#getProtocol <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' containment reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(ImportedProtocolAndDataFormat value);

} // ProtocolSpecification
