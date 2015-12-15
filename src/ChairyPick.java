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
import javax.swing.ButtonGroup;
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
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChairyPick {

	private JFrame frame;
	private JTextField txtNumpeople;
	private JTextField txtChild;
	private int selectedFlight = 0; // flight identifier
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
	private JCheckBox chckbxFirstClass;
	private JCheckBox chckbxBusinessClass;
	private JCheckBox chckbxWindowSeat;
	boolean ecoChecked = false;
	boolean firstChecked = false;
	boolean busChecked = false;
	String[] ecoClassSeats = new String[72];

	UserPreferences pref;
	private JTable table_2;
	private JTable table_3;

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
	public void initialize() {
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
		frame.getContentPane()
				.add(panelPreferences, "name_1446238417539194000");
		panelPreferences.setLayout(null);
		
		final JPanel panelCheckout = new JPanel();
		panelCheckout.setBackground(Color.WHITE);
		frame.getContentPane().add(panelCheckout, "name_1446238423153284000");
		panelCheckout.setLayout(null);
		
		final JPanel panelTicket = new JPanel();
		panelTicket.setBackground(Color.WHITE);
		frame.getContentPane().add(panelTicket, "name_1446238611138342000");
		panelTicket.setLayout(null);
		
		final JPanel panelPopup = new JPanel();
		panelPopup.setBackground(Color.WHITE);
		frame.getContentPane().add(panelPopup, "name_1449105130934574000");
		panelPopup.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("SFO to NYC Economy");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(6, 18, 438, 54);
		panelPopup.add(lblNewLabel_1);
		
		JLabel lblPleaseShowTo = new JLabel("Please show to ticket agent when boarding begins");
		lblPleaseShowTo.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblPleaseShowTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseShowTo.setBounds(6, 68, 438, 54);
		panelPopup.add(lblPleaseShowTo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new TitledBorder(null, "QR Code", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(6, 115, 438, 398);
		panelPopup.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(ChairyPick.class.getResource("/img/QR-code.png")));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(19, 26, 400, 353);
		panel_1.add(lblNewLabel_3);
		
		JButton btnMainMenu_2 = new JButton("Main Menu");
		btnMainMenu_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPopup.setVisible(false);
				panelMenu.setVisible(true);
				
			}
		});
		btnMainMenu_2.setFont(new Font("Orator Std", Font.PLAIN, 18));
		btnMainMenu_2.setBackground(Color.WHITE);
		btnMainMenu_2.setBounds(146, 525, 186, 67);
		panelPopup.add(btnMainMenu_2);
		
		JButton button_1 = new JButton("< Back");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPopup.setVisible(false);
				panelTicket.setVisible(true);
			}
		});
		button_1.setBounds(17, 546, 117, 29);
		panelPopup.add(button_1);
		
		
		JLabel lblMyTickets = new JLabel("My Tickets");
		lblMyTickets.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyTickets.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		lblMyTickets.setBounds(6, 20, 438, 54);
		panelTicket.add(lblMyTickets);
		
		JButton btnMainMenu_1 = new JButton("");
		btnMainMenu_1.setIcon(new ImageIcon(ChairyPick.class.getResource("/img/plus.png")));
		btnMainMenu_1.setBorder(null);
		btnMainMenu_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelTicket.setVisible(false);
				panelMenu.setVisible(true);
			}
		});
		btnMainMenu_1.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		btnMainMenu_1.setBounds(182, 516, 85, 72);
		panelTicket.add(btnMainMenu_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Flights", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(29, 83, 387, 404);
		panelTicket.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPopup.setVisible(true);
				panelTicket.setVisible(false);
				
			}
		});
		
		
		
		btnNewButton.setIcon(new ImageIcon(ChairyPick.class.getResource("/img/ticket.jpg")));
		btnNewButton.setBounds(41, 30, 300, 86);
		panel.add(btnNewButton);
		
				

		frame.setBounds(100, 100, 450, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final JPanel panelReview = new JPanel();
		panelReview.setBackground(Color.WHITE);
		frame.getContentPane().add(panelReview, "name_1449092920615969000");
		panelReview.setLayout(null);
		
	
	
		
		JLabel lblThankYouFor = new JLabel("Thank you for choosing");
		lblThankYouFor.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblThankYouFor.setHorizontalAlignment(SwingConstants.CENTER);
		lblThankYouFor.setBounds(40, 17, 369, 42);
		panelReview.add(lblThankYouFor);
		
		JLabel lblEnjoyYourFlight = new JLabel("Enjoy your flight!");
		lblEnjoyYourFlight.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		lblEnjoyYourFlight.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnjoyYourFlight.setBounds(6, 459, 438, 42);
		panelReview.add(lblEnjoyYourFlight);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ChairyPick.class.getResource("/img/chairy-pick.png")));
		lblNewLabel.setBounds(6, 64, 438, 100);
		panelReview.add(lblNewLabel);
		
		JLabel lblOrderConfirmation = new JLabel("Order Confirmation");
		lblOrderConfirmation.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		lblOrderConfirmation.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrderConfirmation.setBounds(6, 172, 438, 30);
		panelReview.add(lblOrderConfirmation);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(40, 279, 369, 150);
		panelReview.add(scrollPane);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(new Object[][] {
			{ "SFO to NYC Economy x2", "5", "$1135.96" }, }, new String[] {
			"Flight", "Quantity", "Price" }));
		
		
		scrollPane.setViewportView(table_2);
		
		JLabel lblCongratulationsTheFollowing = new JLabel("Congratulations!");
		lblCongratulationsTheFollowing.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblCongratulationsTheFollowing.setHorizontalAlignment(SwingConstants.CENTER);
		lblCongratulationsTheFollowing.setBounds(6, 214, 438, 30);
		panelReview.add(lblCongratulationsTheFollowing);
		
		JLabel lblTheFollowingTickets = new JLabel("The following tickets have been added to your passbook");
		lblTheFollowingTickets.setHorizontalAlignment(SwingConstants.CENTER);
		lblTheFollowingTickets.setBounds(6, 237, 438, 30);
		panelReview.add(lblTheFollowingTickets);
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelReview.setVisible(false);
				panelMenu.setVisible(true);
			}
		});
		btnMainMenu.setBounds(92, 513, 117, 50);
		panelReview.add(btnMainMenu);
		
		JButton btnMyTickets = new JButton("My Tickets");
		btnMyTickets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelTicket.setVisible(true);
				panelReview.setVisible(false);
			}
		});
		btnMyTickets.setBounds(243, 513, 117, 50);
		panelReview.add(btnMyTickets);

		String rowData[][] = {
				{ "Row1-Column1", "Row1-Column2", "Row1-Column3" },
				{ "Row2-Column1", "Row2-Column2", "Row2-Column3" } };
		String columnNames[] = { "Column One", "Column Two", "Column Three" };

		order = new JTable(rowData, columnNames);
		order.setModel(new DefaultTableModel(new Object[][] {
				{ "Item Description", "Quantity", "Price" },
				{ "SFO to NYC Economy x2", "5", "$1135.96" }, }, new String[] {
				"Column One", "Column Two", "Column Three" }));
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
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Visa",
				"MasterCard", "American Express", "Discover" }));
		comboBox.setBounds(202, 236, 139, 27);
		panelCheckout.add(comboBox);

		JLabel lblExpirationDate = new JLabel("Expiration Date:");
		lblExpirationDate.setBounds(27, 402, 132, 28);
		panelCheckout.add(lblExpirationDate);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "Month",
				"01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
				"11", "12" }));
		comboBox_1.setBounds(161, 404, 112, 27);
		panelCheckout.add(comboBox_1);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "Year",
				"2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022",
				"2023", "2024" }));
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
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCheckout.setVisible(false);
				panelReview.setVisible(true);
			}
		});
		button.setIcon(new ImageIcon(ChairyPick.class
				.getResource("/img/pay-button.png")));
		button.setBounds(151, 556, 122, 36);
		panelCheckout.add(button);

		JLabel lblCheckout = new JLabel("Checkout");
		lblCheckout.setFont(new Font("Orator Std", Font.PLAIN, 24));
		JButton back1 = new JButton("<<Back");

		back1.setBounds(22, 563, 117, 29);
		panelCheckout.add(back1);

		lblCheckout.setBounds(161, 36, 122, 28);
		panelCheckout.add(lblCheckout);

		JPanel panelFlights = new JPanel();
		frame.getContentPane().add(panelFlights, "name_1446238425531267000");

		

		final JPanel panelChart = new JPanel();
		panelMenu.setBackground(Color.WHITE);
		frame.getContentPane().add(panelChart, "name_1446238420814244000");
		panelChart.setLayout(null);
		
		back1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCheckout.setVisible(false);
				panelChart.setVisible(true);
			}
		}); 
		// frame = new JFrame();
		// frame.setBounds(100, 100, 450, 640);
		// frame.setBackground(Color.WHITE);
		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.getContentPane().setLayout(null);
		// panelChart.add(frame);

		JPanel pnlFir1 = new JPanel(); // panel for the 1st first-class set
		panelChart.add(pnlFir1);
		pnlFir1.setBounds(27, 27, 93, 85);
		pnlFir1.setLayout(new GridLayout(2, 2, 10, 10));

		JPanel pnlFir2 = new JPanel();
		panelChart.add(pnlFir2);
		pnlFir2.setBounds(177, 27, 93, 85);
		pnlFir2.setLayout(new GridLayout(2, 2, 10, 10));

		JPanel pnlFir3 = new JPanel();
		panelChart.add(pnlFir3);
		pnlFir3.setBounds(322, 27, 93, 85);
		pnlFir3.setLayout(new GridLayout(2, 2, 10, 10));

		JPanel pnlBus1 = new JPanel();
		panelChart.add(pnlBus1);
		pnlBus1.setBounds(27, 135, 93, 151);
		pnlBus1.setLayout(new GridLayout(6, 2, 5, 5));

		JPanel pnlBus2 = new JPanel();
		panelChart.add(pnlBus2);
		pnlBus2.setBounds(177, 135, 93, 151);
		pnlBus2.setLayout(new GridLayout(6, 2, 5, 5));

		JPanel pnlBus3 = new JPanel();
		panelChart.add(pnlBus3);
		pnlBus3.setBounds(322, 135, 93, 151);
		pnlBus3.setLayout(new GridLayout(6, 2, 5, 5));

		JPanel pnlEco1 = new JPanel();
		panelChart.add(pnlEco1);
		pnlEco1.setBounds(27, 309, 93, 261);
		pnlEco1.setLayout(new GridLayout(8, 3, 5, 5));

		JPanel pnlEco2 = new JPanel();
		panelChart.add(pnlEco2);
		pnlEco2.setBounds(177, 309, 93, 261);
		pnlEco2.setLayout(new GridLayout(8, 3, 5, 5));

		JPanel pnlEco3 = new JPanel();
		panelChart.add(pnlEco3);
		pnlEco3.setBounds(322, 309, 93, 261);
		pnlEco3.setLayout(new GridLayout(8, 3, 5, 5));
		
		JButton back2 = new JButton("<< Back");
		back2.setBounds(27, 582, 117, 29);
		panelChart.add(back2);
		back2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelChart.setVisible(false);
				panelPreferences.setVisible(true);
			}
		});
		
		JButton btnConfirmSeats = new JButton("Confirm Seats >>");
		btnConfirmSeats.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelChart.setVisible(false);
				panelCheckout.setVisible(true);
			}
		});
		btnConfirmSeats.setBounds(283, 583, 156, 29);
		panelChart.add(btnConfirmSeats);

		// *****************************************Flight Selection
		// Menu******************************************
		JTextArea txtrAvailableFlights = new JTextArea();
		txtrAvailableFlights.setEditable(false);
		txtrAvailableFlights.setFont(new Font("Orator Std", Font.PLAIN, 25));
		txtrAvailableFlights.setText("Available Flights");
		txtrAvailableFlights.setBounds(94, 32, 263, 42);
		panelMenu.add(txtrAvailableFlights);

		JButton flight1 = new JButton(new ImageIcon(
				ChairyPick.class.getResource("/img/flight-1.png")));
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
		flight2.setIcon(new ImageIcon(ChairyPick.class
				.getResource("/img/flight-2.png")));
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
		flight3.setIcon(new ImageIcon(ChairyPick.class
				.getResource("/img/flight-3.png")));
		flight3.setBounds(30, 433, 390, 127);
		frame.setBounds(100, 100, 450, 640);
		panelMenu.add(flight3);

		// *****************************************User
		// Preferences******************************************
		JLabel lblNumberOfPeople = new JLabel("Number of People:");
		lblNumberOfPeople.setFont(new Font("Orator Std", Font.PLAIN, 18));
		lblNumberOfPeople.setBounds(25, 131, 194, 40);
		panelPreferences.add(lblNumberOfPeople);

		JLabel lblChildren = new JLabel("How many are children?");
		lblChildren.setBounds(25, 197, 250, 40);
		lblChildren.setFont(new Font("Orator Std", Font.PLAIN, 18));
		panelPreferences.add(lblChildren);

		chckbxBusinessClass = new JCheckBox("Business Class");
		chckbxBusinessClass.setFont(new Font("Orator Std", Font.PLAIN, 16));
		chckbxBusinessClass.setBounds(25, 322, 182, 46);
		panelPreferences.add(chckbxBusinessClass);
		chckbxEconomyClass = new JCheckBox("Economy Class");
		chckbxEconomyClass.setFont(new Font("Orator Std", Font.PLAIN, 16));
		chckbxEconomyClass.setBounds(219, 322, 194, 46);
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
		chckbxHandicapped.setBounds(219, 382, 194, 37);
		panelPreferences.add(chckbxHandicapped);

		chckbxWindowSeat = new JCheckBox("Window Seat");
		chckbxWindowSeat.setFont(new Font("Orator Std", Font.PLAIN, 16));
		chckbxWindowSeat.setBounds(25, 385, 182, 33);
		panelPreferences.add(chckbxWindowSeat);

		chckbxFirstClass = new JCheckBox("First Class");
		chckbxFirstClass.setFont(new Font("Orator Std", Font.PLAIN, 16));
		chckbxFirstClass.setBounds(138, 260, 194, 40);
		panelPreferences.add(chckbxFirstClass);
		
		ButtonGroup classFlight = new ButtonGroup();
		classFlight.add(chckbxEconomyClass);
		classFlight.add(chckbxBusinessClass);
		classFlight.add(chckbxFirstClass);

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
				SeatArray test = new SeatArray(2, 6, 6, 6, 8, 9);
				boolean firstClass = chckbxFirstClass.isSelected();
				String[] firstClassSeats = new String[12];
				String[] busClassSeats = new String[36];
				if (firstClass) {
					firstChecked = true;
				}
				;
				boolean bus = chckbxBusinessClass.isEnabled();
				if (bus) {
					busChecked = true;
				}
				;
				boolean eco = chckbxEconomyClass.isSelected();
				if (eco) {
					ecoChecked = true;
				}
				// if (eco) {
				// int count = 0;
				// for (int i = 0; i < 8; i++){
				// for (int k = 0; k < 9; k++){
				// ecoClassSeats[count] = test.getSeatNumber(i, k, 3);
				// count++;
				// }
				// }
				// }

				;
				boolean handicap = chckbxHandicapped.isEnabled();
				String[] handicapSeatsFirst = new String[6];
				String[] handicapSeatsBus = new String[6];
				String[] handicapSeatsEco = new String[9];
				String[] handicapSeatsAll = new String[21];
				if (handicap && firstClass) {
					for (int i = 0; i < 6; i++) {
						handicapSeatsFirst[i] = test.getSeatNumber(0, i, 1);
					}
				} else if (handicap && bus) {
					for (int i = 0; i < 6; i++) {
						handicapSeatsBus[i] = test.getSeatNumber(0, i, 1);
					}
				} else if (handicap && eco) {
					for (int i = 0; i < 9; i++) {
						handicapSeatsEco[i] = test.getSeatNumber(0, i, 1);
					}
				} else if (handicap) {
					int count = 0;
					for (int i = 0; i < 6; i++) {
						handicapSeatsAll[count] = test.getSeatNumber(0, i, 1);
						count++;
					}
					for (int i = 0; i < 6; i++) {
						handicapSeatsAll[count] = test.getSeatNumber(0, i, 2);
						count++;
					}
					for (int i = 0; i < 9; i++) {
						handicapSeatsAll[count] = test.getSeatNumber(0, i, 3);
						count++;
					}
				}
				;
				boolean window = chckbxWindowSeat.isEnabled();
				String[] windowSeatsFirst = new String[4];
				int count = 0;
				if (window && firstClass) {
					for (int i = 0; i < 6; i = i + 6) {
						for (int k = 0; k < 2; k = k + 2) {
							windowSeatsFirst[count] = test.getSeatNumber(i, k,
									1);
							count++;
						}
					}
				}
				UserPreferences pref = new UserPreferences(people, child, eco,
						handicap);

			}
		});
		btnSearch.setIcon(new ImageIcon(ChairyPick.class
				.getResource("/img/search.png")));
		btnSearch.setBounds(62, 453, 303, 70);
		panelPreferences.add(btnSearch);

		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelChart.setVisible(true);
				panelPreferences.setVisible(false);

			}

		});

		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenu.setVisible(true);
				panelPreferences.setVisible(false);
			}
		});
		btnBack.setBorder(BorderFactory.createEmptyBorder());
		btnBack.setIcon(new ImageIcon(ChairyPick.class
				.getResource("/img/back.png")));
		btnBack.setBounds(6, 25, 80, 56);
		panelPreferences.add(btnBack);
		
		
		

		
		
		
		
		

		// *****************************************Plane
		// Chart******************************************
		Color ecoColor = new Color(98, 148, 229); // blue
		Color busColor = new Color(125, 69, 216); // purple
		Color firColor = new Color(255, 195, 0); // yellow

		String[] lblFir1 = { "FA1", "FA2", "FB1", "FB2" };
		JButton[] seats = new JButton[lblFir1.length];
		for (int i = 0; i < seats.length; i++) {
			seats[i] = new JButton(lblFir1[i]);
			// seats[i].setFont(new Font("Arial", Font.PLAIN, 4));
			seats[i].setBackground(firColor);
			seats[i].setOpaque(true);
			seats[i].setBorder(null);
			seats[i].setBorderPainted(false);
			pnlFir1.add(seats[i]);
			seats[i].addActionListener(new ActionListener() {
				int clicked = 0;
				Color firColor = new Color(255, 195, 0); // yellow

				public void actionPerformed(ActionEvent e) {
					clicked++;
					if (clicked % 2 == 1) {
						((JButton) e.getSource()).setBackground(Color.GREEN);
					} else if (clicked % 2 == 0) {
						((JButton) e.getSource()).setBackground(firColor);
					} else if (clicked > 1) {
						clicked = 0;
					}

				}
			});
		}
		seats[0].setBackground(Color.GRAY);
		seats[1].setBackground(Color.GRAY);
		String[] lblFir2 = { "FA3", "FA4", "FB3", "FB4" };
		JButton[] seats1 = new JButton[lblFir2.length];
		for (int i = 0; i < seats1.length; i++) {
			seats1[i] = new JButton(lblFir2[i]);
			seats1[i].setBackground(new Color(255, 195, 0));// yellow
			seats1[i].setOpaque(true);
			seats1[i].setBorder(null);
			seats1[i].setBorderPainted(false);
			pnlFir2.add(seats1[i]);
			seats1[i].addActionListener(new ActionListener() {
				int clicked = 0;
				Color firColor = new Color(255, 195, 0); // yellow

				public void actionPerformed(ActionEvent e) {
					clicked++;
					if (clicked % 2 == 1) {
						((JButton) e.getSource()).setBackground(Color.GREEN);
					} else if (clicked % 2 == 0) {
						((JButton) e.getSource()).setBackground(firColor);
					} else if (clicked > 1) {
						clicked = 0;
					}

				}
			});
		}
		seats1[0].setBackground(Color.GRAY);
		seats1[1].setBackground(Color.GRAY);
		seats1[2].setBackground(Color.GRAY);
		String[] lblFir3 = { "FA5", "FA6", "FB5", "FB6" };
		JButton[] seats2 = new JButton[lblFir3.length];
		for (int i = 0; i < seats2.length; i++) {
			seats2[i] = new JButton(lblFir3[i]);
			seats2[i].setBackground(new Color(255, 195, 0));// yellow
			seats2[i].setOpaque(true);
			seats2[i].setBorder(null);
			seats2[i].setBorderPainted(false);
			pnlFir3.add(seats2[i]);
			seats2[i].addActionListener(new ActionListener() {
				int clicked = 0;
				Color firColor = new Color(255, 195, 0); // yellow

				public void actionPerformed(ActionEvent e) {
					clicked++;
					if (clicked % 2 == 1) {
						((JButton) e.getSource()).setBackground(Color.GREEN);
					} else if (clicked % 2 == 0) {
						((JButton) e.getSource()).setBackground(firColor);
					} else if (clicked > 1) {
						clicked = 0;
					}

				}
			});
		}
		seats2[3].setBackground(Color.GRAY);
		seats2[1].setBackground(Color.GRAY);
		String[] lblBus1 = { "BA1", "BA2", "BB1", "BB2", "BC1", "BC2", "BD1",
				"BD2", "BE1", "BE2", "BF1", "BF2" };
		JButton[] seats3 = new JButton[lblBus1.length];
		for (int i = 0; i < seats3.length; i++) {
			seats3[i] = new JButton(lblBus1[i]);
			seats3[i].setBackground(new Color(125, 69, 216));// purple
			seats3[i].setOpaque(true);
			seats3[i].setBorder(null);
			seats3[i].setBorderPainted(false);
			pnlBus1.add(seats3[i]);
			seats3[i].addActionListener(new ActionListener() {
				int clicked = 0;
				Color firColor = new Color(125, 69, 216); // purple

				public void actionPerformed(ActionEvent e) {
					clicked++;
					if (clicked % 2 == 1) {
						((JButton) e.getSource()).setBackground(Color.GREEN);
					} else if (clicked % 2 == 0) {
						((JButton) e.getSource()).setBackground(firColor);
					} else if (clicked > 1) {
						clicked = 0;
					}

				}
			});
		}
		seats3[3].setBackground(Color.GRAY);
		seats3[4].setBackground(Color.GRAY);
		seats3[7].setBackground(Color.GRAY);
		seats3[10].setBackground(Color.GRAY);
		seats3[11].setBackground(Color.GRAY);
		seats3[5].setBackground(Color.GRAY);
		String[] lblBus2 = { "BA3", "BA4", "BB3", "BB4", "BC3", "BC4", "BD3",
				"BD4", "BE3", "BE4", "BF3", "BF4" };
		JButton[] seats4 = new JButton[lblBus2.length];
		for (int i = 0; i < seats4.length; i++) {
			seats4[i] = new JButton(lblBus2[i]);
			seats4[i].setBackground(busColor);// purple
			seats4[i].setOpaque(true);
			seats4[i].setBorder(null);
			seats4[i].setBorderPainted(false);
			pnlBus2.add(seats4[i]);
			seats4[i].addActionListener(new ActionListener() {
				int clicked = 0;
				Color firColor = new Color(125, 69, 216); // purple

				public void actionPerformed(ActionEvent e) {
					clicked++;
					if (clicked % 2 == 1) {
						((JButton) e.getSource()).setBackground(Color.GREEN);
					} else if (clicked % 2 == 0) {
						((JButton) e.getSource()).setBackground(firColor);
					} else if (clicked > 1) {
						clicked = 0;
					}

				}
			});
		}
		seats4[0].setBackground(Color.GRAY);
		seats4[1].setBackground(Color.GRAY);
		seats4[3].setBackground(Color.GRAY);
		seats4[5].setBackground(Color.GRAY);
		seats4[10].setBackground(Color.GRAY);
		seats4[11].setBackground(Color.GRAY);
		seats4[9].setBackground(Color.GRAY);
		seats4[2].setBackground(Color.GRAY);
		String[] lblBus3 = { "BA5", "BA6", "BB5", "BB6", "BC5", "BC6", "BD5",
				"BD6", "BE5", "BE6", "BF5", "BF6" };
		JButton[] seats5 = new JButton[lblBus3.length];
		for (int i = 0; i < seats5.length; i++) {
			seats5[i] = new JButton(lblBus3[i]);
			seats5[i].setBackground(busColor);// purple
			seats5[i].setOpaque(true);
			seats5[i].setBorder(null);
			seats5[i].setBorderPainted(false);
			pnlBus3.add(seats5[i]);
			seats5[i].addActionListener(new ActionListener() {
				// hi
				int clicked = 0;
				Color firColor = new Color(125, 69, 216); // purple

				public void actionPerformed(ActionEvent e) {
					clicked++;
					if (clicked % 2 == 1) {
						((JButton) e.getSource()).setBackground(Color.GREEN);
					} else if (clicked % 2 == 0) {
						((JButton) e.getSource()).setBackground(firColor);
					} else if (clicked > 1) {
						clicked = 0;
					}

				}
			});
		}
		seats5[1].setBackground(Color.GRAY);
		seats5[3].setBackground(Color.GRAY);
		seats5[4].setBackground(Color.GRAY);
		seats5[6].setBackground(Color.GRAY);
		seats5[9].setBackground(Color.GRAY);
		seats5[11].setBackground(Color.GRAY);
		seats5[10].setBackground(Color.GRAY);
		String[] lblEco1 = { "EA1", "EA2", "EA3", "EB1", "EB2", "EB3", "EC1",
				"EC2", "EC3", "ED1", "ED2", "ED3", "EE1", "EE2", "EE3", "EF1",
				"EF2", "EF3", "EG1", "EG2", "EG3", "EH1", "EH2", "EH3" };
		JButton[] seats6 = new JButton[lblEco1.length];
		for (int i = 0; i < seats6.length; i++) {
			seats6[i] = new JButton(lblEco1[i]);
			seats6[i].setBackground(ecoColor);// blue
			seats6[i].setOpaque(true);
			seats6[i].setBorder(null);
			seats6[i].setBorderPainted(false);
			pnlEco1.add(seats6[i]);
			seats6[i].addActionListener(new ActionListener() {
				// hi
				int clicked = 0;
				Color ecoColor = new Color(98, 148, 229); // blue

				public void actionPerformed(ActionEvent e) {
					clicked++;
					if (clicked % 2 == 1) {
						((JButton) e.getSource()).setBackground(Color.GREEN);
					} else if (clicked % 2 == 0) {
						((JButton) e.getSource()).setBackground(ecoColor);
					} else if (clicked > 1) {
						clicked = 0;
					}

				}
			});
		}
		seats6[16].setBackground(Color.GRAY);
		seats6[14].setBackground(Color.GRAY);
		seats6[10].setBackground(Color.GRAY);
		seats6[11].setBackground(Color.GRAY);
		seats6[7].setBackground(Color.GRAY);
		seats6[5].setBackground(Color.GRAY);
		seats6[17].setBackground(Color.GRAY);
		seats6[20].setBackground(Color.GRAY);
		seats6[21].setBackground(Color.GRAY);
		seats6[18].setBackground(Color.GRAY);
		for (int k = 0; k < seats6.length; k++) {
			if (k <5){
			seats6[k].setBackground(Color.GRAY);
			}
		}

		String[] lblEco2 = { "EA4", "EA4", "EA6", "EB4", "EB5", "EB6", "EC4",
				"EC5", "EC6", "ED4", "ED5", "ED6", "EE4", "EE5", "EE6", "EF4",
				"EF5", "EF6", "EG4", "EG5", "EG6", "EH4", "EH5", "EH6" };
		JButton[] seats7 = new JButton[lblEco2.length];
		for (int i = 0; i < seats7.length; i++) {
			seats7[i] = new JButton(lblEco2[i]);
			seats7[i].setBackground(ecoColor);// blue
			seats7[i].setOpaque(true);
			seats7[i].setBorder(null);
			seats7[i].setBorderPainted(false);
			pnlEco2.add(seats7[i]);
			seats7[i].addActionListener(new ActionListener() {
				// hi
				int clicked = 0;
				Color ecoColor = new Color(98, 148, 229); // blue

				public void actionPerformed(ActionEvent e) {
					clicked++;
					if (clicked % 2 == 1) {
						((JButton) e.getSource()).setBackground(Color.GREEN);
					} else if (clicked % 2 == 0) {
						((JButton) e.getSource()).setBackground(ecoColor);
					} else if (clicked > 1) {
						clicked = 0;
					}

				}
			});
		
		}
		seats7[3].setBackground(Color.GRAY);
		for (int k = 0; k < seats7.length; k++) {
			if (k % 2 == 0 || k % 3 == 0){
			seats7[k].setBackground(Color.GRAY);
			}
		}

		String[] lblEco3 = { "EA4", "EA4", "EA6", "EB4", "EB5", "EB6", "EC4",
				"EC5", "EC6", "ED4", "ED5", "ED6", "EE4", "EE5", "EE6", "EF4",
				"EF5", "EF6", "EG4", "EG5", "EG6", "EH4", "EH5", "EH6" };
		JButton[] seats8 = new JButton[lblEco3.length];
		for (int i = 0; i < seats8.length; i++) {
			seats8[i] = new JButton(lblEco2[i]);
			seats8[i].setBackground(ecoColor);// blue

			seats8[i].setOpaque(true);
			seats8[i].setBorder(null);

			seats8[i].setBorderPainted(false);
			pnlEco3.add(seats8[i]);

			seats8[i].addActionListener(new ActionListener() {
				// hi
				int clicked = 0;
				Color ecoColor = new Color(98, 148, 229); // blue

				public void actionPerformed(ActionEvent e) {
					clicked++;

					if (clicked % 2 == 1) {
						((JButton) e.getSource()).setBackground(Color.GREEN);
					} else if (clicked % 2 == 0 && ecoChecked) {
						Color color = new Color(255, 51, 152);
						((JButton) e.getSource()).setBackground(color);
					} else if (clicked % 2 == 0) {
						((JButton) e.getSource()).setBackground(ecoColor);
					} else if (clicked > 1) {
						clicked = 0;
					}

				}

			}

			);
		}
		Color color = new Color(255, 51, 152);
		for (int k = 0; k < seats8.length; k++) {
			if (k > 11){
			seats8[k].setBackground(Color.GRAY);
			}
		}
		seats8[3].setBackground(Color.GRAY);
		seats8[2].setBackground(Color.GRAY);
		seats8[7].setBackground(Color.GRAY);
		seats8[9].setBackground(Color.GRAY);
		seats8[0].setBackground(color);
		seats8[1].setBackground(color);
		seats8[4].setBackground(color);
		seats8[5].setBackground(color);
		seats8[6].setBackground(color);
		
		// *****************************************Order
		// Checkout******************************************
		
	}

	private void initializeChart() {

	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}