package threadLocal;

/*
 * 		Thread have local variables which is only visible to its own thread, and not other threads
 * 
 * 		to use ThreadLocal:
 * 		
 * 		1. initialize it like an array list: ThreadLocal <Integer> threadCounter = new ThreadLocal<Integer>();
 * 
 * 		2. use these methods: get, set, intValue, remove
 * 
 * 			example: if (threadCounter.get() == null) {
 * 						threadCounter.set(0);
 * 					} else {
 * 						threadCounter.set(threadCounter.get().intValue() + 1);
 * 					}
 * 
 */

public class RunnableDemo implements Runnable{
	
	private int counter;
	private ThreadLocal<Integer> threadCounter = new ThreadLocal<Integer>();
	
	public RunnableDemo() {
		this.counter = 1;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 3; i++) {
			
			if(threadCounter.get() != null) {
				threadCounter.set(threadCounter.get().intValue() + 1);
		      } else {
		    	  threadCounter.set(0);
		      }
						
			System.out.println("Common Counter: "+ counter);
			System.out.println("local thread Counter: "+threadCounter.get());
			counter++;
		}
		
	}
	
	public static void main(String args[]) {
		RunnableDemo rd = new RunnableDemo();
		
		Thread t1 = new Thread(rd);
		t1.start();
		
		Thread t2 = new Thread(rd);
		t2.start();
		
		Thread t3 = new Thread(rd);
		t3.start();
		
	}
	
	
}
