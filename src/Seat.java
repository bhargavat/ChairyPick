import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class Seat {
	private String type; 
	/*
	 * @param type 1=free bus, 2=taken bus, 3=rec bus, 
	 * 4=free seat,5=taken seat, 6=rec seat
	 */
	public Seat(String type){
		this.type = type;
	}
	
	public void displaySeat(){
		if(type == "business-t"){
			JButton busSeat = new JButton("\n");
			busSeat.setIcon(new ImageIcon(ChairyPick.class.getResource("/img/seats/bus-takenseat.png")));
			busSeat.setBorder(BorderFactory.createEmptyBorder());
			//busSeat.setBounds(44, 66, 44, 35);
			//panelChart.add(busSeat);
		}
		
		
		
		
	}
	
}
