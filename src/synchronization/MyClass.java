package synchronization;

public class MyClass extends Thread {
	
	private MyObject obj;
	private String threadName;
	
	public MyClass(MyObject obj, String threadName) {
		this.obj = obj;
		this.threadName = threadName;
	}

	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		obj.foo(threadName);
	}
	
}
