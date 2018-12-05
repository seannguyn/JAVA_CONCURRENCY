package synchronization;

public class PrintDemo {
	
	public PrintDemo() {
		
	}
	
	public void action(String threadName) {
		
		try {
			for (int i = 0; i < 4; i++) {
				Thread.sleep(2000);
				System.out.println(threadName+" : "+i);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		System.out.println(threadName+i);
		
	}
	
}
