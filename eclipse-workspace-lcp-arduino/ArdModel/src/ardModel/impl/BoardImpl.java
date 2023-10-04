/**
 */
package ardModel.impl;

import ardModel.ArdModelPackage;
import ardModel.Board;
import ardModel.Pin;
import ardModel.Wifi;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ardModel.impl.BoardImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link ardModel.impl.BoardImpl#getPinList <em>Pin List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoardImpl extends DescriptedImpl implements Board {
	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected Wifi connections;

	/**
	 * The cached value of the '{@link #getPinList() <em>Pin List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinList()
	 * @generated
	 * @ordered
	 */
	protected EList<Pin> pinList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArdModelPackage.Literals.BOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wifi getConnections() {
		if (connections != null && connections.eIsProxy()) {
			InternalEObject oldConnections = (InternalEObject)connections;
			connections = (Wifi)eResolveProxy(oldConnections);
			if (connections != oldConnections) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArdModelPackage.BOARD__CONNECTIONS, oldConnections, connections));
			}
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wifi basicGetConnections() {
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnections(Wifi newConnections) {
		Wifi oldConnections = connections;
		connections = newConnections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArdModelPackage.BOARD__CONNECTIONS, oldConnections, connections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pin> getPinList() {
		if (pinList == null) {
			pinList = new EObjectContainmentEList<Pin>(Pin.class, this, ArdModelPackage.BOARD__PIN_LIST);
		}
		return pinList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArdModelPackage.BOARD__PIN_LIST:
				return ((InternalEList<?>)getPinList()).basicRemove(otherEnd, msgs);
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
			case ArdModelPackage.BOARD__CONNECTIONS:
				if (resolve) return getConnections();
				return basicGetConnections();
			case ArdModelPackage.BOARD__PIN_LIST:
				return getPinList();
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
			case ArdModelPackage.BOARD__CONNECTIONS:
				setConnections((Wifi)newValue);
				return;
			case ArdModelPackage.BOARD__PIN_LIST:
				getPinList().clear();
				getPinList().addAll((Collection<? extends Pin>)newValue);
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
			case ArdModelPackage.BOARD__CONNECTIONS:
				setConnections((Wifi)null);
				return;
			case ArdModelPackage.BOARD__PIN_LIST:
				getPinList().clear();
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
			case ArdModelPackage.BOARD__CONNECTIONS:
				return connections != null;
			case ArdModelPackage.BOARD__PIN_LIST:
				return pinList != null && !pinList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BoardImpl
