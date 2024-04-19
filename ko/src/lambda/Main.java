package lambda;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kangoroo dany = new Kangoroo();
		makeItJump(dany);
		makeItJump(()-> System.out.println("i'm jumpingg") );
	}

	
	static void makeItJump(Jumpable it) {
		it.jump();
	}
}
