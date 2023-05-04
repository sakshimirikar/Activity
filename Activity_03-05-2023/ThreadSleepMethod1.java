package threads;



public class ThreadSleepMethod1 extends Thread{
	
	
	public void run() {
		int i;
		
		for( i=0 ; i<5 ; i++) {
			//the thread will sleep for 500 milliseconds
			try {
				Thread.sleep(500);
				
				System.out.println("In try : " + i);
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
			
			
		}
		
	}

	public static void main(String[] args) {
		
		ThreadSleepMethod1 t1 = new ThreadSleepMethod1();
//		ThreadSleepMethod1 t2 = new ThreadSleepMethod1();
		
		t1.start();
//		t2.start();

	}

}
