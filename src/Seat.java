public class Seat {
	
boolean available;
int seatType; //1 = business, 2 = first, 3 = economy
double price;

	public Seat(boolean seatAvailable, int classType){
		available = seatAvailable;
		seatType = classType;
	}

	public void setPrice(double seatPrice){
		price = seatPrice;
	}
	public String getPrice(){
		return "$" + price;
	}
	
	public void setAvailability(boolean seatAvailable){
		available = seatAvailable;
	}
	public boolean getAvailability(){
		return available;
	}
	
	public String getClassType(){
		if (seatType == 1) return "First Class";
		else if (seatType == 2) return "Business Class";
		else return "Economy Class";
	}
	
}