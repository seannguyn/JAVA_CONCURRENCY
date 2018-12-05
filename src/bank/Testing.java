package bank;

public class Testing {

	public static void main(String[] args) {
		
		BankAccount z5055824 = new BankAccount(1000);
		
		ThreadDemo t1 = new ThreadDemo("sean",-200,z5055824);
		ThreadDemo t2 = new ThreadDemo("bim",-200,z5055824);
		ThreadDemo t3 = new ThreadDemo("bum",-200,z5055824);
		ThreadDemo t4 = new ThreadDemo("bim",100,z5055824);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			z5055824.finisher();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
