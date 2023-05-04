package threads;


//ABC class implements the interface Runnable
class ABC implements Runnable {
	public void run() {
		
		//try-catch block
		try 
		{
			//moving t2 to timed waiting state
			Thread.sleep(100); //100 milliseconds
	//ThreadState.t1.join(); //waiting for t1 to die
	           
		}
		catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		
		System.out.println("The state of thread t1 while it invoked the method join() - " + ThreadState.t1.getState());

        try {
     	Thread.sleep(200);
//        	ThreadState.t1.join();
        }
		
        catch(InterruptedException e) {
        	e.printStackTrace();
        }
        
        System.out.println("The state of thread t1 while it invoked the method sleep() - " + ThreadState.t1.getState());

        try {
			
			//waiting for thread t2 to complete its execution
			ThreadState.t1.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}

         System.out.println("The state of thread t1 when it has completed it's execution - " + ThreadState.t1.getState());
		
	
	}
}
//ThreadState implements Runnable

public class ThreadState  implements Runnable {
	
	public static Thread t1 ;
	public static ThreadState obj;
	
	
   //main method
	public static void main(String[] args) {
		
		//creating an object of the class ThreadState
		obj = new ThreadState();
		
		t1 = new Thread(obj);
		
		//thread t1 is spawned
		//The thread t1 is currently in the NEW state
		
		System.out.println("The state of thread t1 after spawing it - " + ThreadState.t1.getState() );
		
		//invoking the start() method on thread t1
		t1.start();
		
		//thread t1 is moved to Runnable state 
		System.out.println("The state of thread t1 after invoking the method start() on it - " + t1.getState() );
		
	}

  
//			@Override
			public void run() 
			{
					
				ABC myObj = new ABC();
				
				Thread t2 = new Thread(myObj);
				
				//thread t2 is created and is currently in the NEW state
				System.out.println("The state of thread t2 after spawing it - " + t2.getState() );
				
				t2.start();
				
				//invoking start() method on thread t2
				System.out.println("The state of Thread t2 after calling the mwthod start() on it - " + t2.getState());
				
				//try - catch for smooth flow of program
				
				try {
					//moving the thread t1 to the state timed waiting
					Thread.sleep(200);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("The state of thread t2 after invoking the method sleep() on it - " + t2.getState() );
				
				
				try {
					
					//waiting for thread t2 to complete its execution
					t2.join();
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("The state of thread t2 when it has completed it's execution - " + t2.getState() );
				
				System.out.println("The state of thread t1 when it has completed it's execution - " + t1.getState());
				


               
			    
				
			
}

}
