package Exercise1;

public class TestThreadDemo {
public static void main(String args[]) {	
//    PrintDemo PD = new PrintDemo();
//
//    ThreadDemo T1 = new ThreadDemo( "Thread - 1 ", PD );
//    ThreadDemo T2 = new ThreadDemo( "Thread - 2 ", PD ); // Teacher initial program in order to show the interleaving of threads.
//
//    T1.start();
//    T2.start();
//    
 
	
	
	TheRunnable TR = new TheRunnable();
	Thread NT1 = new Thread(TR);
	NT1.setName("First Thread");
	Thread NT2 = new Thread(TR);
	NT2.setName("Second Thread");

	NT1.start();
	NT2.start();

//    try {
////       T1.join();
////       T2.join();
//    } catch( Exception e) {
////       System.out.println("Interrupted");
//    }
}
}

// The printed Thread and Counter is random depending on the Run. It means that the threads interleaves regularly.
//
//Because our own Thread class is being instanciated, and because there is no common attribute, in this particular case
//
//the interleaving of threads isn't a big issue. It would have been if Threads where sharing a common Attribute
//
// (the balance sheet in a BankAccount for instance). A simple way to remedy to this paticular issue is simply to 
//
// synchronized the method as follow : public synchronized void printCount(String threadName) 
//
//
// -Thread Safeness means that only on thread can access a block of code at the time, in order for the attributes
//
//not to be mixed by different threads accessing and modifying. If particular ways of managing the runnable are needed, a Lock can be usefull.
//
//for instance, in a producer consumer pattern with Locks.
//

