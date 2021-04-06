package Exercise2;

public class AccountHolder extends Thread{
	
	private Account accountOwner;
	
	public AccountHolder(Account a) {
		
		accountOwner = a;
	}

	@Override
	public void run() {
		
		accountOwner.withdraw(100);
		accountOwner.deposit(200);
	}

	
	
}
