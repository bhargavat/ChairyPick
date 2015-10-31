/**
 * Flight seat class information accessible
 * window seats can be both business and economy
 * handicap seats can be window + economy seats
 */
public class Flight {
	private String description;
	int business, economy;
	public Flight(String description){
		this.description = description;
	}
	
	/**
	 * @param bus number of business class seats
	 * @param eco number of economy class seats
	 */
	public void setSeats( int bus, int eco){
		business = bus;
		economy = eco;
	}
	public void setDescription(String desc){
		description = desc;
	}
	public int getBusinessSeats(){
		return business;
	}
	public int getEconomySeats(){
		return economy;
	}
}
