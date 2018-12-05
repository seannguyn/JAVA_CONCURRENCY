package lock;

import java.util.*;
import java.util.concurrent.locks.*;

public class DemoLock {
	
	private Lock lock = new ReentrantLock();
	private int counter;
	private Condition cond = lock.newCondition();
	
	public DemoLock() {
		this.counter = 0;
	}
	
	public void increment() {
		for (int i = 0; i < 10000; i++) {
			counter++;
		}
	}
	
	public void firstThread() throws InterruptedException {
		lock.lock();
		// call signal or await after you have acquired the lock
		System.out.println("Waiting...");
		cond.await();
		System.out.println("Woken up...");
		try {
			increment();
		} finally {
			lock.unlock();
		}
		
	}
	
	public void secondThread() {
		lock.lock();
		
		System.out.println("Please enter new line");
		new Scanner(System.in).nextLine();
		System.out.println("GOT IT");
		
		cond.signal();
		
		try {
			increment();
		} finally {
			lock.unlock();
		}
	}
	
	public void finisher() {
		System.out.println("counter: "+this.counter);
	}

}
