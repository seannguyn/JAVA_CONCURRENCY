package synchronization;

public class ThreadDemo extends Thread{
	
	PrintDemo pd;
	String threadName;
	
	public ThreadDemo(PrintDemo pd, String threadName) {
		this.pd = pd;
		this.threadName = threadName;
	}
	
	public void run() {
		synchronized(pd) {
			pd.action(threadName);
		}
	}
	
}	
