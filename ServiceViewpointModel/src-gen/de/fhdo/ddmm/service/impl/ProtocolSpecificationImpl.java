/**
 */
package de.fhdo.ddmm.service.impl;

import de.fhdo.ddmm.service.ImportedProtocolAndDataFormat;
import de.fhdo.ddmm.service.ProtocolSpecification;
import de.fhdo.ddmm.service.ServicePackage;

import de.fhdo.ddmm.technology.CommunicationType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fhdo.ddmm.service.impl.ProtocolSpecificationImpl#getCommunicationType <em>Communication Type</em>}</li>
 *   <li>{@link de.fhdo.ddmm.service.impl.ProtocolSpecificationImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtocolSpecificationImpl extends MinimalEObjectImpl.Container implements ProtocolSpecification {
	/**
	 * The default value of the '{@link #getCommunicationType() <em>Communication Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationType()
	 * @generated
	 * @ordered
	 */
	protected static final CommunicationType COMMUNICATION_TYPE_EDEFAULT = CommunicationType.SYNCHRONOUS;

	/**
	 * The cached value of the '{@link #getCommunicationType() <em>Communication Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationType()
	 * @generated
	 * @ordered
	 */
	protected CommunicationType communicationType = COMMUNICATION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected ImportedProtocolAndDataFormat protocol;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.PROTOCOL_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationType getCommunicationType() {
		return communicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationType(CommunicationType newCommunicationType) {
		CommunicationType oldCommunicationType = communicationType;
		communicationType = newCommunicationType == null ? COMMUNICATION_TYPE_EDEFAULT : newCommunicationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.PROTOCOL_SPECIFICATION__COMMUNICATION_TYPE, oldCommunicationType, communicationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportedProtocolAndDataFormat getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtocol(ImportedProtocolAndDataFormat newProtocol, NotificationChain msgs) {
		ImportedProtocolAndDataFormat oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePackage.PROTOCOL_SPECIFICATION__PROTOCOL, oldProtocol, newProtocol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(ImportedProtocolAndDataFormat newProtocol) {
		if (newProtocol != protocol) {
			NotificationChain msgs = null;
			if (protocol != null)
				msgs = ((InternalEObject)protocol).eInverseRemove(this, ServicePackage.IMPORTED_PROTOCOL_AND_DATA_FORMAT__SPECIFICATION, ImportedProtocolAndDataFormat.class, msgs);
			if (newProtocol != null)
				msgs = ((InternalEObject)newProtocol).eInverseAdd(this, ServicePackage.IMPORTED_PROTOCOL_AND_DATA_FORMAT__SPECIFICATION, ImportedProtocolAndDataFormat.class, msgs);
			msgs = basicSetProtocol(newProtocol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.PROTOCOL_SPECIFICATION__PROTOCOL, newProtocol, newProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.PROTOCOL_SPECIFICATION__PROTOCOL:
				if (protocol != null)
					msgs = ((InternalEObject)protocol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePackage.PROTOCOL_SPECIFICATION__PROTOCOL, null, msgs);
				return basicSetProtocol((ImportedProtocolAndDataFormat)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.PROTOCOL_SPECIFICATION__PROTOCOL:
				return basicSetProtocol(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePackage.PROTOCOL_SPECIFICATION__COMMUNICATION_TYPE:
				return getCommunicationType();
			case ServicePackage.PROTOCOL_SPECIFICATION__PROTOCOL:
				return getProtocol();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ServicePackage.PROTOCOL_SPECIFICATION__COMMUNICATION_TYPE:
				setCommunicationType((CommunicationType)newValue);
				return;
			case ServicePackage.PROTOCOL_SPECIFICATION__PROTOCOL:
				setProtocol((ImportedProtocolAndDataFormat)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ServicePackage.PROTOCOL_SPECIFICATION__COMMUNICATION_TYPE:
				setCommunicationType(COMMUNICATION_TYPE_EDEFAULT);
				return;
			case ServicePackage.PROTOCOL_SPECIFICATION__PROTOCOL:
				setProtocol((ImportedProtocolAndDataFormat)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ServicePackage.PROTOCOL_SPECIFICATION__COMMUNICATION_TYPE:
				return communicationType != COMMUNICATION_TYPE_EDEFAULT;
			case ServicePackage.PROTOCOL_SPECIFICATION__PROTOCOL:
				return protocol != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (communicationType: ");
		result.append(communicationType);
		result.append(')');
		return result.toString();
	}

} //ProtocolSpecificationImpl
