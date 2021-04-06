package Exercise2;

public class Account {
	
	private double balance;
	
	public Account(double initialDeposit) {
		balance = initialDeposit;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if(balance >= amount)
			balance -= amount;
	}
	
	

}



