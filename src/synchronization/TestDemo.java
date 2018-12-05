package synchronization;

public class TestDemo {
	
	public static void main(String[] args) {
		PrintDemo p1 = new PrintDemo();
		PrintDemo p2 = new PrintDemo();
		ThreadDemo t1 = new ThreadDemo(p1, "Thread 1");
		
		ThreadDemo t2 = new ThreadDemo(p1, "Thread 2");
		
		t1.start();
		t2.start();
		
		// wait for threads to end
		// join wait for both threads to finish before executing
		
//	      try {
//	         t1.join();
//	         t2.join();
//	         System.out.println("Both thread finish HERE");
//	      } catch (Exception e) {
//	         System.out.println("Interrupted");
//	      }
	      
	      System.out.println("Both thread have not finished HERE");
	}
	
}
