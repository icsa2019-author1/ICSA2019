/**
 */
package de.fhdo.ddmm.service.impl;

import com.google.common.collect.Iterables;

import de.fhdo.ddmm.service.Import;
import de.fhdo.ddmm.service.Interface;
import de.fhdo.ddmm.service.Microservice;
import de.fhdo.ddmm.service.Operation;
import de.fhdo.ddmm.service.ReferredOperation;
import de.fhdo.ddmm.service.ServiceModel;
import de.fhdo.ddmm.service.ServicePackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fhdo.ddmm.service.impl.ServiceModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link de.fhdo.ddmm.service.impl.ServiceModelImpl#getMicroservices <em>Microservices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceModelImpl extends MinimalEObjectImpl.Container implements ServiceModel {
	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

	/**
	 * The cached value of the '{@link #getMicroservices() <em>Microservices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicroservices()
	 * @generated
	 * @ordered
	 */
	protected EList<Microservice> microservices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.SERVICE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentWithInverseEList<Import>(Import.class, this, ServicePackage.SERVICE_MODEL__IMPORTS, ServicePackage.IMPORT__SERVICE_MODEL);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Microservice> getMicroservices() {
		if (microservices == null) {
			microservices = new EObjectContainmentWithInverseEList<Microservice>(Microservice.class, this, ServicePackage.SERVICE_MODEL__MICROSERVICES, ServicePackage.MICROSERVICE__SERVICE_MODEL);
		}
		return microservices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getContainedOperations() {
		final Function1<Microservice, EList<Operation>> _function = new Function1<Microservice, EList<Operation>>() {
			public EList<Operation> apply(final Microservice it) {
				return it.getContainedOperations();
			}
		};
		return ECollections.<Operation>asEList(IterableExtensions.<Operation>toList(Iterables.<Operation>concat(XcoreEListExtensions.<Microservice, EList<Operation>>map(this.getMicroservices(), _function))));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferredOperation> getContainedReferredOperations() {
		final Function1<Microservice, EList<ReferredOperation>> _function = new Function1<Microservice, EList<ReferredOperation>>() {
			public EList<ReferredOperation> apply(final Microservice it) {
				return it.getContainedReferredOperations();
			}
		};
		return ECollections.<ReferredOperation>asEList(IterableExtensions.<ReferredOperation>toList(Iterables.<ReferredOperation>concat(XcoreEListExtensions.<Microservice, EList<ReferredOperation>>map(this.getMicroservices(), _function))));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getContainedInterfaces() {
		final Function1<Microservice, EList<Interface>> _function = new Function1<Microservice, EList<Interface>>() {
			public EList<Interface> apply(final Microservice it) {
				return it.getInterfaces();
			}
		};
		return ECollections.<Interface>asEList(IterableExtensions.<Interface>toList(Iterables.<Interface>concat(XcoreEListExtensions.<Microservice, EList<Interface>>map(this.getMicroservices(), _function))));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.SERVICE_MODEL__IMPORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImports()).basicAdd(otherEnd, msgs);
			case ServicePackage.SERVICE_MODEL__MICROSERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMicroservices()).basicAdd(otherEnd, msgs);
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
			case ServicePackage.SERVICE_MODEL__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case ServicePackage.SERVICE_MODEL__MICROSERVICES:
				return ((InternalEList<?>)getMicroservices()).basicRemove(otherEnd, msgs);
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
			case ServicePackage.SERVICE_MODEL__IMPORTS:
				return getImports();
			case ServicePackage.SERVICE_MODEL__MICROSERVICES:
				return getMicroservices();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ServicePackage.SERVICE_MODEL__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Import>)newValue);
				return;
			case ServicePackage.SERVICE_MODEL__MICROSERVICES:
				getMicroservices().clear();
				getMicroservices().addAll((Collection<? extends Microservice>)newValue);
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
			case ServicePackage.SERVICE_MODEL__IMPORTS:
				getImports().clear();
				return;
			case ServicePackage.SERVICE_MODEL__MICROSERVICES:
				getMicroservices().clear();
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
			case ServicePackage.SERVICE_MODEL__IMPORTS:
				return imports != null && !imports.isEmpty();
			case ServicePackage.SERVICE_MODEL__MICROSERVICES:
				return microservices != null && !microservices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ServicePackage.SERVICE_MODEL___GET_CONTAINED_OPERATIONS:
				return getContainedOperations();
			case ServicePackage.SERVICE_MODEL___GET_CONTAINED_REFERRED_OPERATIONS:
				return getContainedReferredOperations();
			case ServicePackage.SERVICE_MODEL___GET_CONTAINED_INTERFACES:
				return getContainedInterfaces();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ServiceModelImpl
