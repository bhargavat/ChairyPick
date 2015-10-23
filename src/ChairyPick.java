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
import javax.swing.Icon;
import javax.swing.JTextArea;


public class ChairyPick {

	private JFrame frame;

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
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);
		
		ImageIcon icon = new ImageIcon("Flight1.png");
		JButton flight1 = new JButton(new ImageIcon(ChairyPick.class.getResource("/img/flight-1.png")));
		flight1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		flight1.setBounds(34, 236, 390, 127);
		frame.getContentPane().add(flight1);
		
		
		JButton flight2 = new JButton("flight2");
		flight2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		flight2.setIcon(new ImageIcon(ChairyPick.class.getResource("/img/flight-2.png")));
		flight2.setBounds(34, 80, 390, 127);
		frame.getContentPane().add(flight2);
		
		JTextArea txtrAvailableFlights = new JTextArea();
		txtrAvailableFlights.setFont(new Font("Orator Std", Font.PLAIN, 25));
		txtrAvailableFlights.setText("Available Flights");
		txtrAvailableFlights.setBounds(94, 25, 263, 42);
		frame.getContentPane().add(txtrAvailableFlights);
		
		JButton flight3 = new JButton("flight3");
		flight3.setIcon(new ImageIcon(ChairyPick.class.getResource("/img/flight-3.png")));
		flight3.setBounds(34, 388, 390, 127);
		frame.getContentPane().add(flight3);
		frame.setBounds(100, 100, 450, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
