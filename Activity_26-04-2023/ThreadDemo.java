
package threads;

public class ThreadDemo extends Thread{
	
	
	public ThreadDemo(String name) 
	{
		super(name);
	}
	
	public void run() {
		System.out.println("Thread is running .." + Thread.currentThread().getName());
	}

	public static void main(String[] args) 
	{
		ThreadDemo t1 = new ThreadDemo("first"); //new state
		ThreadDemo t2 = new ThreadDemo("second");
		
		//ThreadDemo t1 = new ThreadDemo(); //new state
		//ThreadDemo t2 = new ThreadDemo();
		
		//set the name of the thread
		t1.setName("firstThread");
		t2.setName("secondThread");
		 
		t1.start(); //runnable state
		t2.start();
		
	
		
		
	}

}
