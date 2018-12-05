package synchronization;

public class MyTest {

	/*
	 * 		the use of the word synchronize is used to restrict the access of shared resources
	 * 
	 * 		we have to used the synchronized word IN the run method. DO NOT wrap the word synchronize around the run methoc
	 * 
	 *  	Can 2 instances of MyClass call foo at the same time?
	 *  
	 *  		It depends, if it has separate reference of MyOject, than yes
	 *  
	 *  		if both MyClass points to the same MyObject, then NO
	 *  
	 *  	Another solution to synchronize is use the JOIN method
	 *  
	 */
	
	public static void main(String[] args) {
		
//		// Test 1
//		MyObject obj_1 = new MyObject();
//		MyObject obj_2 = new MyObject();
//		MyClass class_1 = new MyClass(obj_1,"thread_1");
//		MyClass class_2 = new MyClass(obj_2,"thread_2");
//		
//		class_1.start();
//		class_2.start();
		
		// Test 2
		MyObject obj_1 = new MyObject();
		MyObject obj_2 = new MyObject();
		MyClass class_1 = new MyClass(obj_1,"thread_1");
		MyClass class_2 = new MyClass(obj_1,"thread_2");
		
		class_1.start();
		class_2.start();
	}
}
