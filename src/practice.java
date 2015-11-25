import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.Border;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;


public class practice {

	private JFrame frame;
	Color ecoColor = new Color(98, 148, 229); //blue
	Color busColor = new Color(125, 69, 216); //purple
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					practice window = new practice();
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
	public practice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * Seat id number has 3 characters: class (F,B,E); row (ex: 1st row = A); number (ex: 1st seat in row = 1)
	 * JPanels for each set of seats (left to right)
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 640);
		frame.setBackground(Color.WHITE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel pnlFir1 = new JPanel(); //panel for the 1st first-class set
		pnlFir1.setBounds(27, 27, 93, 85);
		frame.getContentPane().add(pnlFir1);
		pnlFir1.setLayout(new GridLayout(2, 2, 10, 10));
		
		String[]lblFir1 = {"FA1", "FA2", "FB1", "FB2"};
		JButton[] seats = new JButton[lblFir1.length];
		for(int i = 0; i < seats.length; i++){
		seats[i] = new JButton(lblFir1[i]);
		//seats[i].setFont(new Font("Arial", Font.PLAIN, 4));
		seats[i].setBackground(new Color(255, 195, 0));//yellow
		seats[i].setOpaque(true);
		seats[i].setBorder(null);
		seats[i].setBorderPainted(false);
		pnlFir1.add(seats[i]);
		}
		
		
		JPanel pnlFir2 = new JPanel();
		pnlFir2.setBounds(177, 27, 93, 85);
		frame.getContentPane().add(pnlFir2);
		pnlFir2.setLayout(new GridLayout(2, 2, 10, 10));
		
		String[]lblFir2 = {"FA3", "FA4", "FB3", "FB4"};
		JButton[] seats1 = new JButton[lblFir2.length];
		for(int i = 0; i < seats1.length; i++){
		seats1[i] = new JButton(lblFir2[i]);
		seats1[i].setBackground(new Color(255, 195, 0));//yellow
		seats1[i].setOpaque(true);
		seats1[i].setBorder(null);
		seats1[i].setBorderPainted(false);
		pnlFir2.add(seats1[i]);
		}
		
		JPanel pnlFir3 = new JPanel();
		pnlFir3.setBounds(322, 27, 93, 85);
		frame.getContentPane().add(pnlFir3);
		pnlFir3.setLayout(new GridLayout(2, 2, 10, 10));
		
		String[]lblFir3 = {"FA5", "FA6", "FB5", "FB6"};
		JButton[] seats2 = new JButton[lblFir2.length];
		for(int i = 0; i < seats2.length; i++){
		seats2[i] = new JButton(lblFir2[i]);
		seats2[i].setBackground(new Color(255, 195, 0));//yellow
		seats2[i].setOpaque(true);
		seats2[i].setBorder(null);
		seats2[i].setBorderPainted(false);
		pnlFir3.add(seats2[i]);
		}
		
		JPanel pnlBus1 = new JPanel();
		pnlBus1.setBounds(27, 135, 93, 151);
		frame.getContentPane().add(pnlBus1);
		pnlBus1.setLayout(new GridLayout(6, 2, 5, 5));
		
		String[]lblBus1 = {"BA1", "BA2","BB1", "BB2", "BC1","BC2", "BD1", "BD2","BE1","BE2","BF1","BF2"};
		JButton[] seats3 = new JButton[lblBus1.length];
		for(int i = 0; i < seats3.length; i++){
		seats3[i] = new JButton(lblBus1[i]);
		seats3[i].setBackground(new Color(125, 69, 216));//purple
		seats3[i].setOpaque(true);
		seats3[i].setBorder(null);
		seats3[i].setBorderPainted(false);
		pnlBus1.add(seats3[i]);
		}
		
		
		JPanel pnlBus2 = new JPanel();
		pnlBus2.setBounds(177, 135, 93, 151);
		frame.getContentPane().add(pnlBus2);
		pnlBus2.setLayout(new GridLayout(6, 2, 5, 5));
		
		String[]lblBus2 = {"BA3", "BA4","BB3", "BB4", "BC3","BC4", "BD3", "BD4","BE3","BE4","BF3","BF4"};
		JButton[] seats4 = new JButton[lblBus2.length];
		for(int i = 0; i < seats4.length; i++){
		seats4[i] = new JButton(lblBus2[i]);
		seats4[i].setBackground(busColor);//purple
		seats4[i].setOpaque(true);
		seats4[i].setBorder(null);
		seats4[i].setBorderPainted(false);
		pnlBus2.add(seats4[i]);
		}
		
		JPanel pnlBus3 = new JPanel();
		pnlBus3.setBounds(322, 135, 93, 151);
		frame.getContentPane().add(pnlBus3);
		pnlBus3.setLayout(new GridLayout(6, 2, 5, 5));
		
		String[]lblBus3 = {"BA5", "BA6","BB5", "BB6", "BC5","BC6", "BD5", "BD6","BE5","BE6","BF5","BF6"};
		JButton[] seats5 = new JButton[lblBus3.length];
		for(int i = 0; i < seats5.length; i++){
		seats5[i] = new JButton(lblBus3[i]);
		seats5[i].setBackground(busColor);//purple
		seats5[i].setOpaque(true);
		seats5[i].setBorder(null);
		seats5[i].setBorderPainted(false);
		pnlBus3.add(seats5[i]);
		}
		
		
		JPanel pnlEco1 = new JPanel();
		pnlEco1.setBounds(27, 309, 93, 261);
		frame.getContentPane().add(pnlEco1);
		pnlEco1.setLayout(new GridLayout(8, 3, 5, 5));
		
		String[]lblEco1 = {"EA1", "EA2","EA3", "EB1", "EB2","EB3", "EC1", 
							"EC2","EC3","ED1","ED2","ED3","EE1","EE2","EE3",
							"EF1","EF2","EF3","EG1","EG2","EG3","EH1","EH2","EH3"};
		JButton[] seats6 = new JButton[lblEco1.length];
		for(int i = 0; i < seats6.length; i++){
		seats6[i] = new JButton(lblEco1[i]);
		seats6[i].setBackground(ecoColor);//blue
		seats6[i].setOpaque(true);
		seats6[i].setBorder(null);
		seats6[i].setBorderPainted(false);
		pnlEco1.add(seats6[i]);
		}
		
		JPanel pnlEco2 = new JPanel();
		pnlEco2.setBounds(177, 309, 93, 261);
		frame.getContentPane().add(pnlEco2);
		pnlEco2.setLayout(new GridLayout(8, 3, 5, 5));
		
		String[]lblEco2 = {"EA4", "EA4","EA6", "EB4", "EB5","EB6", "EC4", 
				"EC5","EC6","ED4","ED5","ED6","EE4","EE5","EE6",
				"EF4","EF5","EF6","EG4","EG5","EG6","EH4","EH5","EH6"};
		JButton[] seats7 = new JButton[lblEco2.length];
		for(int i = 0; i < seats7.length; i++){
		seats7[i] = new JButton(lblEco2[i]);
		seats7[i].setBackground(ecoColor);//blue
		seats7[i].setOpaque(true);
		seats7[i].setBorder(null);
		seats7[i].setBorderPainted(false);
		pnlEco2.add(seats7[i]);
		}
		
		JPanel pnlEco3 = new JPanel();
		pnlEco3.setBounds(322, 309, 93, 261);
		frame.getContentPane().add(pnlEco3);
		pnlEco3.setLayout(new GridLayout(8, 3, 5, 5));
		
		String[]lblEco3 = {"EA4", "EA4","EA6", "EB4", "EB5","EB6", "EC4", 
				"EC5","EC6","ED4","ED5","ED6","EE4","EE5","EE6",
				"EF4","EF5","EF6","EG4","EG5","EG6","EH4","EH5","EH6"};
		JButton[] seats8 = new JButton[lblEco3.length];
		for(int i = 0; i < seats8.length; i++){
		seats8[i] = new JButton(lblEco2[i]);
		seats8[i].setBackground(ecoColor);//blue
		seats8[i].setOpaque(true);
		seats8[i].setBorder(null);
		seats8[i].setBorderPainted(false);
		pnlEco3.add(seats8[i]);
		}
		
	}
}
