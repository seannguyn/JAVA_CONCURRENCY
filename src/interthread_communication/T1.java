package interthread_communication;

public class T1 implements Runnable{
	
	private Chat m1;
	private String[] question= {"Who is WarrenBuffet?", "who is lebron james?", "what team does kobe play for?"};
	public T1(Chat m) {
		this.m1 = m;
		Thread t = new Thread(this,"Question");
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			for (String s : question) {
				m1.Question(s);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
