
package threads;

public class ThreadExample1 extends Thread {
	
	
	
	//run() method to perform action of Thread
	public void run() {
		int a=10;
		int b=12;
		int result = a+b;
		
		System.out.println("Thread started running ....");
		System.out.println("Sum of two numbers is : " + result);
	}

	public static void main(String[] args) {
		
		//creating instance of class extending Thread class
		ThreadExample1 t1 = new ThreadExample1();
		
		//calling start method to execute the run() method of the Thread Class
		t1.start();
//		t1.run();
	}

}
