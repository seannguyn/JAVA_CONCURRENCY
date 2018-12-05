package bank;

public class ThreadDemo extends Thread{

	private String threadName;
	private int amount;
	private BankAccount account;
	
	public ThreadDemo(String threadName, int amount, BankAccount account) {
		this.threadName = threadName;
		this.amount = amount;
		this.account = account;
	}
	
	public void run() {
		
		if (amount < 0) {
			account.withdraw(this.amount, this.threadName);
		} else if (amount > 0) {
			account.deposit(this.amount);
		}
		
	}
	
}
