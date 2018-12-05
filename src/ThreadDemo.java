
public class ThreadDemo extends Thread{
	
	
	private String threadName;
	private Thread t;
	
	public ThreadDemo(String threadName) {
		this.threadName = threadName;
		t = null;
	}
	
	public void run() {
		System.out.println(this.threadName+" starting");
		
		try {
			for (int i = 0; i < 100; i++) {
				System.out.println(this.threadName+": "+i);
				Thread.sleep(50);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(this.threadName+" interupted");
		}
		System.out.println(this.threadName+" end");
	}
	
	public void start() {
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
	
	public static void main(String args[]) {
		ThreadDemo t1 = new ThreadDemo("demo_1");
		t1.start();
		
		ThreadDemo t2 = new ThreadDemo("demo_2");
		t2.start();
	}

}
