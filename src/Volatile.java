

public class Volatile {
	
	/*
	 * 
	 * 		Volatile is used to make sure that when threads modify a variable, that modification is saved in the main memory.
	 * 
	 * 		Normally, each thread has CPU cache, making a resource volatile allows other threads to read the latest modification in main memory 
	 * 
	 * 		guarantee visibility of change across many threads
	 * 
	 * 		JAVA also guarantee full volatile visibility:
	 * 		
	 * 			1. every variable immediately before writing to the volatile variable will also be available to other thread
	 * 
	 * 			2. when thread A read from memory, then all variable read by thread A will be re-read from main memory 
	 * 			
	 * 
	 * 		public class MyClass {
			    private int years;
			    private int months
			    private volatile int days;
			
			    public int totalDays() {
			        int total = this.days;
			        total += months * 30;
			        total += years * 365;
			        return total;
			    }
			
			    public void update(int years, int months, int days){
			        this.years  = years;
			        this.months = months;
			        this.days   = days;
			    }
			}
			
			We can see that although only variable day is volatile, variable month and year, which is available to other thread, as it is written immediately before changing variable day
	 */
	
}
