package synchronizedd;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User salah = new User("salah", 5200);
		User tarek = new User("tarek", 3200);
		
		Bank bank = new Bank(100000.00);
		
		Thread t1 = new Thread(() -> {
			bank.debit(30000, tarek);
		});
		Thread t2 = new Thread(() -> {
			bank.debit(80000, salah);
			 
		});
		
		t1.start();
		t2.start();
		
	
		
		
		
		
		
		
	}

}
