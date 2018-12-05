
public class RunnableDemo implements Runnable{

	private Thread t;
	private String threadName;
	private boolean suspended = false;
	
	public RunnableDemo(String threadName) {
		this.threadName = threadName;
		this.t = null;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(threadName+" starting");
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(threadName+": "+i);
				Thread.sleep(1000);
				synchronized(this) {
					while(suspended) {
						wait();
					}
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(threadName+" interrupted");
		}
		
		System.out.println(threadName+" ended");
	}
	
	public void start() {
		if (t == null) {
			t = new Thread(this, this.threadName);
			t.start();
		}
	}
	
	public void suspend() {
		
		this.suspended = true;
		System.out.println(this.threadName+" suspended ===========");
	}
	
	synchronized public void resume() {
		
		this.suspended = false;
		this.notify();
		System.out.println(this.threadName+" resume ===========");
	}
	
	public static void main(String args[]) {
		RunnableDemo r1 = new RunnableDemo("Demo 1");
		r1.start();
		
		RunnableDemo r2 = new RunnableDemo("Demo 2");
		r2.start();
		
		try {
			Thread.sleep(1000);
			r1.suspend();
			Thread.sleep(1000);
			r1.resume();
			
			r2.suspend();
			Thread.sleep(1000);
			r2.resume();
			
		} catch(InterruptedException e) {
			System.out.println("Main thread is Interrupted");
		} try {
			r1.t.join();
			r2.t.join();
		} catch (InterruptedException e) {
	         System.out.println("Main thread is Interrupted");
	    }
		
		System.out.println("Main thread exiting.");
	}
}
