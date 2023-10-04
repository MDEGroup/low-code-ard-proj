/**
 */
package ardModel.impl;

import ardModel.Application;
import ardModel.ArdModelPackage;
import ardModel.Board;
import ardModel.Scenario;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ardModel.impl.ScenarioImpl#getBoard <em>Board</em>}</li>
 *   <li>{@link ardModel.impl.ScenarioImpl#getApplication <em>Application</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario {
	/**
	 * The cached value of the '{@link #getBoard() <em>Board</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoard()
	 * @generated
	 * @ordered
	 */
	protected Board board;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected Application application;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArdModelPackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Board getBoard() {
		if (board != null && board.eIsProxy()) {
			InternalEObject oldBoard = (InternalEObject)board;
			board = (Board)eResolveProxy(oldBoard);
			if (board != oldBoard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArdModelPackage.SCENARIO__BOARD, oldBoard, board));
			}
		}
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Board basicGetBoard() {
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoard(Board newBoard) {
		Board oldBoard = board;
		board = newBoard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArdModelPackage.SCENARIO__BOARD, oldBoard, board));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application getApplication() {
		if (application != null && application.eIsProxy()) {
			InternalEObject oldApplication = (InternalEObject)application;
			application = (Application)eResolveProxy(oldApplication);
			if (application != oldApplication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArdModelPackage.SCENARIO__APPLICATION, oldApplication, application));
			}
		}
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application basicGetApplication() {
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(Application newApplication) {
		Application oldApplication = application;
		application = newApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArdModelPackage.SCENARIO__APPLICATION, oldApplication, application));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArdModelPackage.SCENARIO__BOARD:
				if (resolve) return getBoard();
				return basicGetBoard();
			case ArdModelPackage.SCENARIO__APPLICATION:
				if (resolve) return getApplication();
				return basicGetApplication();
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
			case ArdModelPackage.SCENARIO__BOARD:
				setBoard((Board)newValue);
				return;
			case ArdModelPackage.SCENARIO__APPLICATION:
				setApplication((Application)newValue);
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
			case ArdModelPackage.SCENARIO__BOARD:
				setBoard((Board)null);
				return;
			case ArdModelPackage.SCENARIO__APPLICATION:
				setApplication((Application)null);
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
			case ArdModelPackage.SCENARIO__BOARD:
				return board != null;
			case ArdModelPackage.SCENARIO__APPLICATION:
				return application != null;
		}
		return super.eIsSet(featureID);
	}

} //ScenarioImpl
