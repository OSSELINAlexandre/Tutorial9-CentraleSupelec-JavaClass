package Exercise2;

public class Main {
	


// Possible issue with a non synchronized type runnable is the interleaving of threads, and therefore 
//
// changes in the runnable attibutes. It is therefore possible to have an issue in the withdrawal 
//
// if for instance the two threads interleave when the first line of code, it is possible that the total balance 
//
// is below 0. In other words, even if at each operation only 100 is withdrawed and 200 are deposited (meaning that 
//
// the acocunt should never be in negativ starting at 100$), it could be in negative stating at 100$, because both treads 
//
//execute the first withdraw, meaning that the second thread cannot continue the operation and stops.
//
// In the end; it would lead to a false balance in the account.

// For the deposit operation, it would always be good, because no condition are defined in the runnable. 

//The sole issue is regarding the withdrawal method. 
	
	
	public static void main(String[] args) {

	AccountSynchronized as = new AccountSynchronized(50);
	
	
	AccountHolderSynchronized Alexandre = new AccountHolderSynchronized(as, "Alexandre");
	AccountHolderSynchronized Pierre = new AccountHolderSynchronized(as, "Pierre");
	AccountHolderSynchronized Robert = new AccountHolderSynchronized(as, "Robert");
	AccountHolderSynchronized Charles = new AccountHolderSynchronized(as, "Charles");
	AccountHolderSynchronized Ezra = new AccountHolderSynchronized(as, "Ezra");
	AccountHolderSynchronized Catherine = new AccountHolderSynchronized(as, "Catherine");
	AccountHolderSynchronized Charlotte = new AccountHolderSynchronized(as, "Charlotte");
	AccountHolderSynchronized Jordan = new AccountHolderSynchronized(as, "Jordan");
	AccountHolderSynchronized Kevin = new AccountHolderSynchronized(as, "Kevin");
	
	
	Alexandre.start();
	Pierre.start();
	Robert.start();
	Charles.start();
	Ezra.start();
	Catherine.start();
	Charlotte.start();
	Jordan.start();
	Kevin.start();

	
}	

}

