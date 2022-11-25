package company;

public class cwh_69_72_Multithreading {

	public static void main(String[] args) {
		
		/* 
		  Multi-processing and multi-threading both are used to achieve multitasking.
		   
		  In a nut shell:
		  -threads are shared memory area.
		  -Threads --> faster context switching.
		  -a thread is light-weight whereas a process is heavy-weight.
		   
		  Example:  A word processor can have one thread running in foreground as an editor 
		   			 and another in the background auto-saving the document.
		   			 
		  Creating a thread:
		  There are two ways to create a thread in Java-
		  1> By extending Thread class.
		  2> By implementing Runnable interface.
		  
		  Life cycle of a thread:
		  1. New --> Instance of thread created which is not yet started by invoking start().
		  2. Runnable --> After invocation of start() & before it is selected to be run by the scheduler.
		  3. Running --> After thread scheduler has selected it.
		  4. New Runnable --> Thread alive, not eligible to run.
		  5. Terminated --> run() method has exited.
		  */
	}

}
