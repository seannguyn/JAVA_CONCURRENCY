package bank;

import java.util.ArrayList;

public class BankAccount {

	private ArrayList<String> users;
	private int balance;
	
	public BankAccount(int balance) {
		this.users = new ArrayList<String>();
		this.users.add("sean");
		this.users.add("bim");
		this.users.add("bum");
		this.users.add("cece");
		
		this.balance = balance;
	}
	
	synchronized public void withdraw(int amount, String name) {
		if (users.contains(name)) {
			if (this.balance - amount > 0) {
				System.out.println("Withdraw: "+amount);
				this.balance += amount;
				System.out.println("New balance: "+this.balance);
				System.out.println();
			} else {
				System.out.println("Withdraw DENIED "+amount);
				System.out.println("Current balance: "+this.balance);
				System.out.println();
			}
		} else {
			System.out.print("Unknown User");
		}
		
	}
	
	synchronized public void deposit(int amount) {
		System.out.println("Deposit: "+amount);
		this.balance += amount;
		System.out.println("New balance: "+this.balance);
		System.out.println();
	}
	
	public void finisher() {
		System.out.println("All transactions are completed");
	}
	
}
