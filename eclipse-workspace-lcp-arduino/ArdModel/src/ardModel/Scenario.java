/**
 */
package ardModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ardModel.Scenario#getBoard <em>Board</em>}</li>
 *   <li>{@link ardModel.Scenario#getApplication <em>Application</em>}</li>
 * </ul>
 *
 * @see ardModel.ArdModelPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Board</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' reference.
	 * @see #setBoard(Board)
	 * @see ardModel.ArdModelPackage#getScenario_Board()
	 * @model required="true"
	 * @generated
	 */
	Board getBoard();

	/**
	 * Sets the value of the '{@link ardModel.Scenario#getBoard <em>Board</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board</em>' reference.
	 * @see #getBoard()
	 * @generated
	 */
	void setBoard(Board value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' reference.
	 * @see #setApplication(Application)
	 * @see ardModel.ArdModelPackage#getScenario_Application()
	 * @model required="true"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link ardModel.Scenario#getApplication <em>Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

} // Scenario
