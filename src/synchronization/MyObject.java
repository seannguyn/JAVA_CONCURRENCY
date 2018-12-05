package synchronization;

public class MyObject {
	
	public MyObject() {
		
	}
	
	synchronized public void foo(String thread) {
		try {
			for (int i = 0; i < 3; i++) {
				System.out.println(thread+" : " + i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
