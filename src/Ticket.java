public class Ticket {

	String gateNum = "A" + Integer.toString((int)(Math.random() * 1 + 10));
	String info; 
	String seatinfo;
	
	public String getGate()
	{
		return gateNum;
	}
	
	public String getSeat()
	{
		Seat seat = new Seat(seatinfo);
		seatinfo = seat.getSeat(seatinfo);
		return seatinfo;
	}
	
	public String getDescription()
	{
		Flight flight = new Flight(info);
		info = flight.description;
		return info;
		
	}
	
}