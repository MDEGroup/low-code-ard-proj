/**
 */
package ardModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ardModel.Board#getConnections <em>Connections</em>}</li>
 *   <li>{@link ardModel.Board#getPinList <em>Pin List</em>}</li>
 * </ul>
 *
 * @see ardModel.ArdModelPackage#getBoard()
 * @model
 * @generated
 */
public interface Board extends Descripted {
	/**
	 * Returns the value of the '<em><b>Connections</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' reference.
	 * @see #setConnections(Wifi)
	 * @see ardModel.ArdModelPackage#getBoard_Connections()
	 * @model
	 * @generated
	 */
	Wifi getConnections();

	/**
	 * Sets the value of the '{@link ardModel.Board#getConnections <em>Connections</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connections</em>' reference.
	 * @see #getConnections()
	 * @generated
	 */
	void setConnections(Wifi value);

	/**
	 * Returns the value of the '<em><b>Pin List</b></em>' containment reference list.
	 * The list contents are of type {@link ardModel.Pin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin List</em>' containment reference list.
	 * @see ardModel.ArdModelPackage#getBoard_PinList()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pin> getPinList();

} // Board
