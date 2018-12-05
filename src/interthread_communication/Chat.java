package interthread_communication;
/**
 * 
 * @author seannguyen
 * 
 * 		This package demo a simple interthread communication, such as a Chat
 * 
 * 		there will be a thread asking question and a thread answering.
 * 
 * 		the answering thread is blocked until the question thread finish asking question
 * 
 * 		
 *
 */
public class Chat {
	private boolean QuestionFlag = true;
	
	synchronized public void Question(String msg) {
		
		if (QuestionFlag) {
			System.out.println(msg);
			QuestionFlag = false;
			notify();
		} else {
			try {
				wait();
			} catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	
	synchronized public void Answer(String ans) {
		if (!QuestionFlag) {
			System.out.println(ans);
			System.out.println();
			QuestionFlag = true;
			notify();
		} else {
			try {
				wait();
			} catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
