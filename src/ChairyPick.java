import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;


public class ChairyPick {

	private JFrame frame;
	private JTextField txtNumpeople;
	private JTextField textField;

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
		
		JTextArea txtrAvailableFlights = new JTextArea();
		txtrAvailableFlights.setEditable(false);
		txtrAvailableFlights.setFont(new Font("Orator Std", Font.PLAIN, 25));
		txtrAvailableFlights.setText("Available Flights");
		txtrAvailableFlights.setBounds(94, 32, 263, 42);
		panelMenu.add(txtrAvailableFlights);
		
		ImageIcon icon = new ImageIcon("Flight1.png");
		JButton flight1 = new JButton(new ImageIcon(ChairyPick.class.getResource("/img/flight-1.png")));
		flight1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenu.setVisible(false);
				panelPreferences.setVisible(true);
			}
		});
		flight1.setBounds(30, 97, 390, 127);
		panelMenu.add(flight1);
		
		JButton flight2 = new JButton("flight2");
		flight2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
				panelMenu.setVisible(false);
				panelPreferences.setVisible(true);
			}
		});
		flight3.setIcon(new ImageIcon(ChairyPick.class.getResource("/img/flight-3.png")));
		flight3.setBounds(30, 433, 390, 127);
		frame.setBounds(100, 100, 450, 640);
		panelMenu.add(flight3);
		
		JLabel lblNumberOfPeople = new JLabel("Number of People:");
		lblNumberOfPeople.setFont(new Font("Orator Std", Font.PLAIN, 18));
		lblNumberOfPeople.setBounds(25, 105, 194, 40);
		panelPreferences.add(lblNumberOfPeople);
		
		JLabel lblChildren = new JLabel("How many are children?");
		lblChildren.setBounds(25, 177, 250, 40);
		lblChildren.setFont(new Font("Orator Std", Font.PLAIN, 18));
		panelPreferences.add(lblChildren);
		
		JCheckBox chckbxBusinessClass = new JCheckBox("Business Class");
		chckbxBusinessClass.setFont(new Font("Orator Std", Font.PLAIN, 16));
		chckbxBusinessClass.setBounds(25, 255, 182, 23);
		panelPreferences.add(chckbxBusinessClass);
		
		JCheckBox chckbxEconomyClass = new JCheckBox("Economy Class");
		chckbxEconomyClass.setFont(new Font("Orator Std", Font.PLAIN, 16));
		chckbxEconomyClass.setBounds(219, 244, 194, 46);
		panelPreferences.add(chckbxEconomyClass);
		
		txtNumpeople = new JTextField();
		txtNumpeople.setBounds(231, 107, 134, 28);
		panelPreferences.add(txtNumpeople);
		txtNumpeople.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(288, 179, 61, 28);
		panelPreferences.add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxHandicapped = new JCheckBox("Handicapped");
		chckbxHandicapped.setFont(new Font("Orator Std", Font.PLAIN, 16));
		chckbxHandicapped.setBounds(106, 323, 205, 37);
		panelPreferences.add(chckbxHandicapped);
		
		JCheckBox chckbxWindowSeat = new JCheckBox("Window Seat");
		chckbxWindowSeat.setFont(new Font("Orator Std", Font.PLAIN, 16));
		chckbxWindowSeat.setBounds(106, 386, 217, 42);
		panelPreferences.add(chckbxWindowSeat);
		
		JLabel lblSeatPreferences = new JLabel("Seat Preferences");
		lblSeatPreferences.setFont(new Font("Orator Std", Font.PLAIN, 24));
		lblSeatPreferences.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeatPreferences.setBounds(95, 40, 279, 40);
		panelPreferences.add(lblSeatPreferences);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon(ChairyPick.class.getResource("/img/search.png")));
		btnNewButton.setBounds(62, 489, 303, 70);
		panelPreferences.add(btnNewButton);
		
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
		
		JPanel panelChart = new JPanel();
		frame.getContentPane().add(panelChart, "name_1446238420814244000");
		
		JPanel panelCheckout = new JPanel();
		frame.getContentPane().add(panelCheckout, "name_1446238423153284000");
		
		JPanel panelFlights = new JPanel();
		frame.getContentPane().add(panelFlights, "name_1446238425531267000");
		
		JPanel panelTicket = new JPanel();
		frame.getContentPane().add(panelTicket, "name_1446238611138342000");
		
		
		frame.setBounds(100, 100, 450, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
