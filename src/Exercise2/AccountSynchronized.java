package Exercise2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AccountSynchronized {
	
	private double balance;
	private Lock theLock;
	
	public AccountSynchronized(double initialDeposit) {
		balance = initialDeposit;
		theLock = new ReentrantLock();
	}
	
	public double getBalance() {
		return balance;
	}
	

	public Lock getTheLock() {
		return theLock;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if(balance >= amount)
			balance -= amount;
		else {
			System.out.println("You could not withdraw the amount. Please deposit some money first.");
		}
	}
	

}
