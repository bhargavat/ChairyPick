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


public class ChairyPick {

	private JFrame frame;
	private JButton btnNewButton;

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
		JButton flight1 = new JButton(new ImageIcon("/Users/komalis/Documents/Honey/ChairyPick/src/img/Flight1.png"));
		flight1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		flight1.setBounds(93, 218, 284, 97);
		frame.getContentPane().add(flight1);
		
		btnNewButton = new JButton("New button");
		btnNewButton.setBounds(90, 127, 117, 29);
		frame.getContentPane().add(btnNewButton);
		frame.setBounds(100, 100, 450, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
