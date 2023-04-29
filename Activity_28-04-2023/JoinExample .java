
package threads;

public class JoinExample extends Thread {
	
	
	public void run() {
		for(int i=1 ; i<=4 ; i++) {
			
			try {
				Thread.sleep(1500 , 300);
			}
			
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.println(i + " " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		JoinExample j1 = new JoinExample();
		JoinExample j2 = new JoinExample();
		JoinExample j3 = new JoinExample();
		
		j1.setName("Thread 1");
		j2.setName("Thread 2");
		j3.setName("Thread 3");
		
		j1.start();
		
		try {
			j1.join();
			
		}
		catch( Exception e) {
			System.out.println(e.getMessage());
		}
		
		j2.start();
		j3.start();
		
		

	}

}
