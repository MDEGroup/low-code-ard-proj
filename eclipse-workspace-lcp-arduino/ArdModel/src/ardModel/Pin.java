/**
 */
package ardModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ardModel.Pin#getType <em>Type</em>}</li>
 *   <li>{@link ardModel.Pin#getSignalType <em>Signal Type</em>}</li>
 * </ul>
 *
 * @see ardModel.ArdModelPackage#getPin()
 * @model
 * @generated
 */
public interface Pin extends Descripted {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ardModel.PinType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ardModel.PinType
	 * @see #setType(PinType)
	 * @see ardModel.ArdModelPackage#getPin_Type()
	 * @model
	 * @generated
	 */
	PinType getType();

	/**
	 * Sets the value of the '{@link ardModel.Pin#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ardModel.PinType
	 * @see #getType()
	 * @generated
	 */
	void setType(PinType value);

	/**
	 * Returns the value of the '<em><b>Signal Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ardModel.SignalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Type</em>' attribute.
	 * @see ardModel.SignalType
	 * @see #setSignalType(SignalType)
	 * @see ardModel.ArdModelPackage#getPin_SignalType()
	 * @model
	 * @generated
	 */
	SignalType getSignalType();

	/**
	 * Sets the value of the '{@link ardModel.Pin#getSignalType <em>Signal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Type</em>' attribute.
	 * @see ardModel.SignalType
	 * @see #getSignalType()
	 * @generated
	 */
	void setSignalType(SignalType value);

} // Pin
