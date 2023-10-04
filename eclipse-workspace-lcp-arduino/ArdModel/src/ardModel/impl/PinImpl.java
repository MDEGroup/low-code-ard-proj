/**
 */
package ardModel.impl;

import ardModel.ArdModelPackage;
import ardModel.Pin;
import ardModel.PinType;
import ardModel.SignalType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ardModel.impl.PinImpl#getType <em>Type</em>}</li>
 *   <li>{@link ardModel.impl.PinImpl#getSignalType <em>Signal Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PinImpl extends DescriptedImpl implements Pin {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PinType TYPE_EDEFAULT = PinType.INPUT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PinType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignalType() <em>Signal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalType()
	 * @generated
	 * @ordered
	 */
	protected static final SignalType SIGNAL_TYPE_EDEFAULT = SignalType.ANALOGIC;

	/**
	 * The cached value of the '{@link #getSignalType() <em>Signal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalType()
	 * @generated
	 * @ordered
	 */
	protected SignalType signalType = SIGNAL_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArdModelPackage.Literals.PIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PinType newType) {
		PinType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArdModelPackage.PIN__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalType getSignalType() {
		return signalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalType(SignalType newSignalType) {
		SignalType oldSignalType = signalType;
		signalType = newSignalType == null ? SIGNAL_TYPE_EDEFAULT : newSignalType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArdModelPackage.PIN__SIGNAL_TYPE, oldSignalType, signalType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArdModelPackage.PIN__TYPE:
				return getType();
			case ArdModelPackage.PIN__SIGNAL_TYPE:
				return getSignalType();
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
			case ArdModelPackage.PIN__TYPE:
				setType((PinType)newValue);
				return;
			case ArdModelPackage.PIN__SIGNAL_TYPE:
				setSignalType((SignalType)newValue);
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
			case ArdModelPackage.PIN__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ArdModelPackage.PIN__SIGNAL_TYPE:
				setSignalType(SIGNAL_TYPE_EDEFAULT);
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
			case ArdModelPackage.PIN__TYPE:
				return type != TYPE_EDEFAULT;
			case ArdModelPackage.PIN__SIGNAL_TYPE:
				return signalType != SIGNAL_TYPE_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", signalType: ");
		result.append(signalType);
		result.append(')');
		return result.toString();
	}

} //PinImpl
