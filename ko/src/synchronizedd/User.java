package synchronizedd;

public class User {
	private String name;
	private double cash;
	
	
	
	public User(String name, double cash) {
		this.name = name;
		this.cash = cash;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCash() {
		return cash;
	}
	public void setCash(double cash) {
		this.cash = cash;
	}
	
	public String toString() {
		return  String.format("%s has %.2f in his/her balance!", name, cash); 
	}
}
