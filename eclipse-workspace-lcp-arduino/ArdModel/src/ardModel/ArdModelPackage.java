/**
 */
package ardModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ardModel.ArdModelFactory
 * @model kind="package"
 * @generated
 */
public interface ArdModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ardModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ardModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ardModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArdModelPackage eINSTANCE = ardModel.impl.ArdModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link ardModel.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ardModel.impl.ScenarioImpl
	 * @see ardModel.impl.ArdModelPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 0;

	/**
	 * The feature id for the '<em><b>Board</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__BOARD = 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__APPLICATION = 1;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ardModel.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ardModel.impl.ApplicationImpl
	 * @see ardModel.impl.ArdModelPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 1;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ardModel.impl.DescriptedImpl <em>Descripted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ardModel.impl.DescriptedImpl
	 * @see ardModel.impl.ArdModelPackageImpl#getDescripted()
	 * @generated
	 */
	int DESCRIPTED = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTED__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTED__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Descripted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTED_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Descripted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ardModel.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ardModel.impl.BoardImpl
	 * @see ardModel.impl.ArdModelPackageImpl#getBoard()
	 * @generated
	 */
	int BOARD = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__NAME = DESCRIPTED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__DESCRIPTION = DESCRIPTED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__CONNECTIONS = DESCRIPTED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pin List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__PIN_LIST = DESCRIPTED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_FEATURE_COUNT = DESCRIPTED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_OPERATION_COUNT = DESCRIPTED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ardModel.impl.PinImpl <em>Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ardModel.impl.PinImpl
	 * @see ardModel.impl.ArdModelPackageImpl#getPin()
	 * @generated
	 */
	int PIN = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__NAME = DESCRIPTED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__DESCRIPTION = DESCRIPTED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__TYPE = DESCRIPTED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signal Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__SIGNAL_TYPE = DESCRIPTED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_FEATURE_COUNT = DESCRIPTED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_OPERATION_COUNT = DESCRIPTED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ardModel.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ardModel.impl.ConnectionImpl
	 * @see ardModel.impl.ArdModelPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = DESCRIPTED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DESCRIPTION = DESCRIPTED__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = DESCRIPTED_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = DESCRIPTED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ardModel.impl.WifiImpl <em>Wifi</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ardModel.impl.WifiImpl
	 * @see ardModel.impl.ArdModelPackageImpl#getWifi()
	 * @generated
	 */
	int WIFI = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI__NAME = DESCRIPTED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI__DESCRIPTION = DESCRIPTED__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Wifi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_FEATURE_COUNT = DESCRIPTED_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Wifi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_OPERATION_COUNT = DESCRIPTED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ardModel.impl.EthernetImpl <em>Ethernet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ardModel.impl.EthernetImpl
	 * @see ardModel.impl.ArdModelPackageImpl#getEthernet()
	 * @generated
	 */
	int ETHERNET = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET__NAME = DESCRIPTED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET__DESCRIPTION = DESCRIPTED__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Ethernet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_FEATURE_COUNT = DESCRIPTED_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ethernet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_OPERATION_COUNT = DESCRIPTED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ardModel.PinType <em>Pin Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ardModel.PinType
	 * @see ardModel.impl.ArdModelPackageImpl#getPinType()
	 * @generated
	 */
	int PIN_TYPE = 8;

	/**
	 * The meta object id for the '{@link ardModel.SignalType <em>Signal Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ardModel.SignalType
	 * @see ardModel.impl.ArdModelPackageImpl#getSignalType()
	 * @generated
	 */
	int SIGNAL_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link ardModel.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see ardModel.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the reference '{@link ardModel.Scenario#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Board</em>'.
	 * @see ardModel.Scenario#getBoard()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Board();

	/**
	 * Returns the meta object for the reference '{@link ardModel.Scenario#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Application</em>'.
	 * @see ardModel.Scenario#getApplication()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Application();

	/**
	 * Returns the meta object for class '{@link ardModel.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see ardModel.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for class '{@link ardModel.Descripted <em>Descripted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descripted</em>'.
	 * @see ardModel.Descripted
	 * @generated
	 */
	EClass getDescripted();

	/**
	 * Returns the meta object for the attribute '{@link ardModel.Descripted#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ardModel.Descripted#getName()
	 * @see #getDescripted()
	 * @generated
	 */
	EAttribute getDescripted_Name();

	/**
	 * Returns the meta object for the attribute '{@link ardModel.Descripted#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ardModel.Descripted#getDescription()
	 * @see #getDescripted()
	 * @generated
	 */
	EAttribute getDescripted_Description();

	/**
	 * Returns the meta object for class '{@link ardModel.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see ardModel.Board
	 * @generated
	 */
	EClass getBoard();

	/**
	 * Returns the meta object for the reference '{@link ardModel.Board#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connections</em>'.
	 * @see ardModel.Board#getConnections()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Connections();

	/**
	 * Returns the meta object for the containment reference list '{@link ardModel.Board#getPinList <em>Pin List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pin List</em>'.
	 * @see ardModel.Board#getPinList()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_PinList();

	/**
	 * Returns the meta object for class '{@link ardModel.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin</em>'.
	 * @see ardModel.Pin
	 * @generated
	 */
	EClass getPin();

	/**
	 * Returns the meta object for the attribute '{@link ardModel.Pin#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ardModel.Pin#getType()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_Type();

	/**
	 * Returns the meta object for the attribute '{@link ardModel.Pin#getSignalType <em>Signal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal Type</em>'.
	 * @see ardModel.Pin#getSignalType()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_SignalType();

	/**
	 * Returns the meta object for class '{@link ardModel.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see ardModel.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for class '{@link ardModel.Wifi <em>Wifi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wifi</em>'.
	 * @see ardModel.Wifi
	 * @generated
	 */
	EClass getWifi();

	/**
	 * Returns the meta object for class '{@link ardModel.Ethernet <em>Ethernet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ethernet</em>'.
	 * @see ardModel.Ethernet
	 * @generated
	 */
	EClass getEthernet();

	/**
	 * Returns the meta object for enum '{@link ardModel.PinType <em>Pin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pin Type</em>'.
	 * @see ardModel.PinType
	 * @generated
	 */
	EEnum getPinType();

	/**
	 * Returns the meta object for enum '{@link ardModel.SignalType <em>Signal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Signal Type</em>'.
	 * @see ardModel.SignalType
	 * @generated
	 */
	EEnum getSignalType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArdModelFactory getArdModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ardModel.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ardModel.impl.ScenarioImpl
		 * @see ardModel.impl.ArdModelPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Board</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__BOARD = eINSTANCE.getScenario_Board();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__APPLICATION = eINSTANCE.getScenario_Application();

		/**
		 * The meta object literal for the '{@link ardModel.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ardModel.impl.ApplicationImpl
		 * @see ardModel.impl.ArdModelPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '{@link ardModel.impl.DescriptedImpl <em>Descripted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ardModel.impl.DescriptedImpl
		 * @see ardModel.impl.ArdModelPackageImpl#getDescripted()
		 * @generated
		 */
		EClass DESCRIPTED = eINSTANCE.getDescripted();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTED__NAME = eINSTANCE.getDescripted_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTED__DESCRIPTION = eINSTANCE.getDescripted_Description();

		/**
		 * The meta object literal for the '{@link ardModel.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ardModel.impl.BoardImpl
		 * @see ardModel.impl.ArdModelPackageImpl#getBoard()
		 * @generated
		 */
		EClass BOARD = eINSTANCE.getBoard();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__CONNECTIONS = eINSTANCE.getBoard_Connections();

		/**
		 * The meta object literal for the '<em><b>Pin List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__PIN_LIST = eINSTANCE.getBoard_PinList();

		/**
		 * The meta object literal for the '{@link ardModel.impl.PinImpl <em>Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ardModel.impl.PinImpl
		 * @see ardModel.impl.ArdModelPackageImpl#getPin()
		 * @generated
		 */
		EClass PIN = eINSTANCE.getPin();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__TYPE = eINSTANCE.getPin_Type();

		/**
		 * The meta object literal for the '<em><b>Signal Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__SIGNAL_TYPE = eINSTANCE.getPin_SignalType();

		/**
		 * The meta object literal for the '{@link ardModel.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ardModel.impl.ConnectionImpl
		 * @see ardModel.impl.ArdModelPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '{@link ardModel.impl.WifiImpl <em>Wifi</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ardModel.impl.WifiImpl
		 * @see ardModel.impl.ArdModelPackageImpl#getWifi()
		 * @generated
		 */
		EClass WIFI = eINSTANCE.getWifi();

		/**
		 * The meta object literal for the '{@link ardModel.impl.EthernetImpl <em>Ethernet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ardModel.impl.EthernetImpl
		 * @see ardModel.impl.ArdModelPackageImpl#getEthernet()
		 * @generated
		 */
		EClass ETHERNET = eINSTANCE.getEthernet();

		/**
		 * The meta object literal for the '{@link ardModel.PinType <em>Pin Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ardModel.PinType
		 * @see ardModel.impl.ArdModelPackageImpl#getPinType()
		 * @generated
		 */
		EEnum PIN_TYPE = eINSTANCE.getPinType();

		/**
		 * The meta object literal for the '{@link ardModel.SignalType <em>Signal Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ardModel.SignalType
		 * @see ardModel.impl.ArdModelPackageImpl#getSignalType()
		 * @generated
		 */
		EEnum SIGNAL_TYPE = eINSTANCE.getSignalType();

	}

} //ArdModelPackage
