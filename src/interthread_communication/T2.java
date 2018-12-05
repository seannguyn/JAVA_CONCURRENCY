package interthread_communication;

public class T2 implements Runnable{
	
	private Chat m1;
	private String[] answer= {"An investor", "A basketball player", "the Lakers"};
	
	public T2(Chat m) {
		this.m1 = m;
		Thread t = new Thread(this,"Answer");
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			for (String s : answer) {
				m1.Answer(s);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}