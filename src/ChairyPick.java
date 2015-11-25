import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.GridLayout;


public class ChairyPick{

	private JFrame frame;
	private JTextField txtNumpeople;
	private JTextField txtChild;
	private int selectedFlight = 0; //flight identifier 
	private String flight1 = "San Francisco to New York City";
	private String flight2 = "San Francisco to Miami";
	private String flight3 = "San Francisco to Las Vegas";
	private JTable table;
	private JTable table_1;
	private JTable order;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtCreditCardNumber;
	private JTextField txtStreetAddress;
	private JTextField txtCvc;
	private JTextField txtCity;
	private JTextField txtState;
	private JTextField txtZipCode;
	private JCheckBox chckbxEconomyClass;
	private JCheckBox chckbxHandicapped;
	
	UserPreferences pref; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChairyPick window = new ChairyPick();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ChairyPick() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		final JPanel panelMenu = new JPanel();
		panelMenu.setBackground(Color.WHITE);
		frame.getContentPane().add(panelMenu, "name_1446238410875293000");
		panelMenu.setLayout(null);
		
		final JPanel panelPreferences = new JPanel();
		panelPreferences.setBackground(Color.WHITE);
		frame.getContentPane().add(panelPreferences, "name_1446238417539194000");
		panelPreferences.setLayout(null);
		
		
		//*****************************************Flight Selection Menu******************************************	
		JTextArea txtrAvailableFlights = new JTextArea();
		txtrAvailableFlights.setEditable(false);
		txtrAvailableFlights.setFont(new Font("Orator Std", Font.PLAIN, 25));
		txtrAvailableFlights.setText("Available Flights");
		txtrAvailableFlights.setBounds(94, 32, 263, 42);
		panelMenu.add(txtrAvailableFlights);
		
		JButton flight1 = new JButton(new ImageIcon(ChairyPick.class.getResource("/img/flight-1.png")));
		flight1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedFlight = 1;
				panelMenu.setVisible(false);
				panelPreferences.setVisible(true);
			}
		});
		flight1.setBounds(30, 97, 390, 127);
		panelMenu.add(flight1);
		
		JButton flight2 = new JButton("flight2");
		flight2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedFlight = 2;
				panelMenu.setVisible(false);
				panelPreferences.setVisible(true);
			}
		});
		flight2.setIcon(new ImageIcon(ChairyPick.class.getResource("/img/flight-2.png")));
		flight2.setBounds(30, 266, 390, 127);
		panelMenu.add(flight2);
		
		JButton flight3 = new JButton("flight3");
		flight3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedFlight = 3;
				panelMenu.setVisible(false);
				panelPreferences.setVisible(true);
			}
		});
		flight3.setIcon(new ImageIcon(ChairyPick.class.getResource("/img/flight-3.png")));
		flight3.setBounds(30, 433, 390, 127);
		frame.setBounds(100, 100, 450, 640);
		panelMenu.add(flight3);
		
		
		//*****************************************User Preferences******************************************	
		JLabel lblNumberOfPeople = new JLabel("Number of People:");
		lblNumberOfPeople.setFont(new Font("Orator Std", Font.PLAIN, 18));
		lblNumberOfPeople.setBounds(25, 131, 194, 40);
		panelPreferences.add(lblNumberOfPeople);
		
		JLabel lblChildren = new JLabel("How many are children?");
		lblChildren.setBounds(25, 197, 250, 40);
		lblChildren.setFont(new Font("Orator Std", Font.PLAIN, 18));
		panelPreferences.add(lblChildren);
		
		JCheckBox chckbxBusinessClass = new JCheckBox("Business Class");
		chckbxBusinessClass.setFont(new Font("Orator Std", Font.PLAIN, 16));
		chckbxBusinessClass.setBounds(25, 281, 182, 23);
		panelPreferences.add(chckbxBusinessClass);
		
		chckbxEconomyClass = new JCheckBox("Economy Class");
		chckbxEconomyClass.setFont(new Font("Orator Std", Font.PLAIN, 16));
		chckbxEconomyClass.setBounds(219, 270, 194, 46);
		panelPreferences.add(chckbxEconomyClass);
		
		txtNumpeople = new JTextField();
		txtNumpeople.setBounds(231, 133, 80, 28);
		panelPreferences.add(txtNumpeople);
		txtNumpeople.setColumns(10);
		
		txtChild = new JTextField();
		txtChild.setBounds(288, 199, 61, 28);
		panelPreferences.add(txtChild);
		txtChild.setColumns(1);
		
		chckbxHandicapped = new JCheckBox("Handicapped");
		chckbxHandicapped.setFont(new Font("Orator Std", Font.PLAIN, 16));
		chckbxHandicapped.setBounds(131, 345, 205, 37);
		panelPreferences.add(chckbxHandicapped);
		
		JLabel lblSeatPreferences = new JLabel("Seat Preferences");
		lblSeatPreferences.setFont(new Font("Orator Std", Font.PLAIN, 24));
		lblSeatPreferences.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeatPreferences.setBounds(95, 40, 279, 40);
		panelPreferences.add(lblSeatPreferences);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int people = Integer.parseInt(txtNumpeople.getText());
				int child = Integer.parseInt(txtChild.getText());
				boolean eco = chckbxEconomyClass.isEnabled();
				boolean handicap = chckbxHandicapped.isEnabled();
				UserPreferences pref = new UserPreferences(people,child,eco,handicap);
			}
		});
		btnSearch.setIcon(new ImageIcon(ChairyPick.class.getResource("/img/search.png")));
		btnSearch.setBounds(62, 453, 303, 70);
		panelPreferences.add(btnSearch);
		
		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenu.setVisible(true);
				panelPreferences.setVisible(false);
			}
		});
		btnBack.setBorder(BorderFactory.createEmptyBorder());
		btnBack.setIcon(new ImageIcon(ChairyPick.class.getResource("/img/back.png")));
		btnBack.setBounds(6, 25, 80, 56);
		panelPreferences.add(btnBack);
	//*****************************************Plane Chart******************************************	
		JPanel panelChart = new JPanel(); 
		frame.getContentPane().add(panelChart, "name_1446238420814244000");
		panelChart.setLayout(null);
		
		
	//*****************************************Order Checkout******************************************
		JPanel panelCheckout = new JPanel();
		panelCheckout.setBackground(Color.WHITE);
		frame.getContentPane().add(panelCheckout, "name_1446238423153284000");
		panelCheckout.setLayout(null);
		
	    String rowData[][] = { { "Row1-Column1", "Row1-Column2", "Row1-Column3" },
	            { "Row2-Column1", "Row2-Column2", "Row2-Column3" } };
	        String columnNames[] = { "Column One", "Column Two", "Column Three" };
		
		order = new JTable(rowData, columnNames);
		order.setModel(new DefaultTableModel(
			new Object[][] {
				{"Item Description", "Quantity", "Price"},
				{"SFO to NYC Economy x2", "2", "$400"},
			},
			new String[] {
				"Column One", "Column Two", "Column Three"
			}
		));
		order.setBorder(new LineBorder(new Color(0, 0, 0)));
		order.setBounds(37, 86, 400, 45);
		panelCheckout.add(order);
		
		JLabel lblPaymentOption = new JLabel("Payment Option:");
		lblPaymentOption.setBounds(37, 226, 132, 45);
		panelCheckout.add(lblPaymentOption);
		
		txtFirstName = new JTextField();
		txtFirstName.setText("First Name");
		txtFirstName.setBounds(27, 290, 173, 28);
		panelCheckout.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setText("Last Name");
		txtLastName.setBounds(212, 290, 172, 28);
		panelCheckout.add(txtLastName);
		txtLastName.setColumns(10);
		
		txtCreditCardNumber = new JTextField();
		txtCreditCardNumber.setText("Credit Card Number");
		txtCreditCardNumber.setBounds(27, 352, 275, 28);
		panelCheckout.add(txtCreditCardNumber);
		txtCreditCardNumber.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Visa", "MasterCard", "American Express", "Discover"}));
		comboBox.setBounds(202, 236, 139, 27);
		panelCheckout.add(comboBox);
		
		JLabel lblExpirationDate = new JLabel("Expiration Date:");
		lblExpirationDate.setBounds(27, 402, 132, 28);
		panelCheckout.add(lblExpirationDate);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		comboBox_1.setBounds(161, 404, 112, 27);
		panelCheckout.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Year", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024"}));
		comboBox_2.setBounds(297, 404, 85, 27);
		panelCheckout.add(comboBox_2);
		
		JLabel lblBillingAddress = new JLabel("Billing Address:");
		lblBillingAddress.setBounds(27, 442, 112, 28);
		panelCheckout.add(lblBillingAddress);
		
		txtStreetAddress = new JTextField();
		txtStreetAddress.setText("Street Address");
		txtStreetAddress.setBounds(161, 442, 220, 28);
		panelCheckout.add(txtStreetAddress);
		txtStreetAddress.setColumns(10);
		
		txtCvc = new JTextField();
		txtCvc.setText("CVC");
		txtCvc.setBounds(325, 352, 59, 28);
		panelCheckout.add(txtCvc);
		txtCvc.setColumns(10);
		
		txtCity = new JTextField();
		txtCity.setText("City");
		txtCity.setBounds(27, 494, 134, 28);
		panelCheckout.add(txtCity);
		txtCity.setColumns(10);
		
		txtState = new JTextField();
		txtState.setText("State");
		txtState.setBounds(171, 494, 79, 28);
		panelCheckout.add(txtState);
		txtState.setColumns(10);
		
		txtZipCode = new JTextField();
		txtZipCode.setText("Zip Code");
		txtZipCode.setBounds(262, 494, 122, 28);
		panelCheckout.add(txtZipCode);
		txtZipCode.setColumns(10);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(ChairyPick.class.getResource("/img/pay-button.png")));
		button.setBounds(151, 556, 122, 36);
		panelCheckout.add(button);
		
		JLabel lblCheckout = new JLabel("Checkout");
		lblCheckout.setFont(new Font("Orator Std", Font.PLAIN, 24));
		lblCheckout.setBounds(161, 36, 122, 28);
		panelCheckout.add(lblCheckout);
		
		
		JPanel panelFlights = new JPanel();
		frame.getContentPane().add(panelFlights, "name_1446238425531267000");
		
		JPanel panelTicket = new JPanel();
		frame.getContentPane().add(panelTicket, "name_1446238611138342000");
		
		frame.setBounds(100, 100, 450, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void initializeChart(){

	}
}
