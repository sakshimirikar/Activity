package threads;

//Performing MultiThreading by Implementing the runnable interface

class NewThread implements Runnable{
	
	    String name;
	    Thread thread;
	
	    NewThread(String name) {
		
		this.name=name;
		
	                //Thread (runnable target(obj) , String)
		thread = new Thread(this ,name);
		
		System.out.println("A New Thread " + thread + " is created ");
		
		thread.start();
	}	

	@Override
	public void run() {
		try {
			for(int j=5 ; j>0 ; j--) {
				System.out.println(name + " : " + j);
				Thread.sleep(1000);
				
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(name + "thread Interrupted");
		}
		
		System.out.println(name + "thread exiting");
	}
	
	
}

public class ThreadExample2 {

	public static void main(String[] args) {
		
		new NewThread("1st");
		new NewThread("2nd");
		new NewThread("3rd");
		
		try {
			Thread.sleep(8000);
		}
		catch(InterruptedException e) {
			System.out.println("Inturruption occurs in Main Thread ");
		}
		
		System.out.println("We are exiting from Main Thread");
		
		
	}

}
