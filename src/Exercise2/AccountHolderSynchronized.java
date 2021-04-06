package Exercise2;



public class AccountHolderSynchronized extends Thread {

	private AccountSynchronized accountOwner;
	private String name;

	public AccountHolderSynchronized(AccountSynchronized a, String name) {

		this.accountOwner = a;
		this.name = name;
	}

	@Override
	public void run() {

		this.accountOwner.getTheLock().lock();
		accountOwner.withdraw(100);
		System.out.println("WITHDRAW ! Balance is of " + accountOwner.getBalance() + " : operation made by : " + this.name);
		try {
			Thread.currentThread();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		accountOwner.deposit(200);
		System.out.println("DEPOSIT ! Balance is of " + accountOwner.getBalance() + " : operation made by : " + this.name);
		this.accountOwner.getTheLock().unlock();

	}

	@Override
	public String toString() {

		return this.name;
	}

}
