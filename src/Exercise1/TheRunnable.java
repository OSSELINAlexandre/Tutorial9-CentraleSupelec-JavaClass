package Exercise1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TheRunnable implements Runnable{
	
	private Lock theLock;
	
	
	public TheRunnable() {
		theLock = new ReentrantLock();
	}

	@Override
	public void run() {
		
		theLock.lock();
	    try {
	         for(int i = 5; i > 0; i--) {
	            System.out.println(Thread.currentThread().getName() + " Counter   ---   "  + i );
	         }
	         
	     } catch (Exception e) {
	         System.out.println("Thread  interrupted.");
	     }
	    theLock.unlock();
	   }
	
		
}

