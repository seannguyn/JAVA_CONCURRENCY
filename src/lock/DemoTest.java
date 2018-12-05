package lock;

public class DemoTest {

	public static void main(String[] args) {
		
		DemoLock dm_1 = new DemoLock();
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					dm_1.firstThread();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				dm_1.secondThread();
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
			dm_1.finisher();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
