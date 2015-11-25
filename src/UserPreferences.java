
public class UserPreferences {
	public int people;
	public int child;
	public boolean eco;
	public boolean handicap;
	
	public UserPreferences(int people, int child, boolean eco, boolean handicap){
		this.people = people;
		this.child = child;
		this.eco = eco;
		this.handicap = handicap;
	}
	public void setPeople(int p){
		people = p;
	}
	public void setChildren(int c){
		 child = c;
	}
	public void isEconomy(boolean e){
		 eco = e;
	}
	public void setHandicap(boolean h){
		handicap = h;
	}
}
