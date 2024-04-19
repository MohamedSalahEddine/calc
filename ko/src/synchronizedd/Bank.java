package synchronizedd;

public class Bank {
	private double balance;
	
	
	public Bank(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public synchronized void debit(double amount, User user) {
		if(this.balance >= amount) {
			user.setCash( user.getCash() + amount);
			this.setBalance( this.getBalance() - amount);
			System.out.printf("%.2f has been added to %s sucessfully!\n", amount, user.getName());
			System.out.println(toString());
		}else {
			System.out.println("we're running out of cash :/ ");
		}
	}
	
	public String toString() {
		return String.format("Remaining balance of our capital is : %.3f", this.balance);
	}
}
