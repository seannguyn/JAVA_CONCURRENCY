
public class Overview {

	
	/*
	 * a thread is a lightweight process that shares memory with other threads of the same process
	 * 
	 * each thread can run parrallel to each other 
	 * 
	 * the main different between threads and process is that: process runs on different memory, which is allocated by the CPU
	 * In contrast, threads have it own callstack and share memory
	 * 
	 * 
	 * lifecycle of a thread
	 * 
	 * 		new	
	 * 		|
	 * 		|	start()
	 * 		|
	 * 		v
	 * 		runnable
	 *		|
	 * 		|	run()
	 * 		|
	 * 		v
	 * 		running
	 *		|
	 * 		|	sleep(), wait 
	 * 		|
	 * 		v
	 * 		wait
	 *		|
	 * 		|	
	 * 		|
	 * 		v
	 * 		dead
	 * 
	 * 		each thread in JAVA is given a priority from MIN_PRIORITY -> MAX_PRIORITY, 
	 * 		by default, threads are assigned a constant of 5.
	 * 
	 * 		threads with higher priority are allocated time before threads with lower priority
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 		There are two ways of implementing threads in JAVA, 
	 * 
	 * 			implements the Runnable interface, overriding the method run
	 * 
	 * 			extends thread class
	 * 
	 */
}
