

package threads;

public class DaemonDemo extends Thread {
	
	public void run()
	{
	   //checking if the thread is deamon or not
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread");
		}
		else {
			System.out.println("User Thread");
		}
	}

	public static void main(String[] args) {
		
		DaemonDemo d1 = new DaemonDemo();
		DaemonDemo d2 = new DaemonDemo();
		DaemonDemo d3 = new DaemonDemo();
		
		//setting demon to be true 
		d1.setDaemon(true);
		
		d1.start();
		d2.start();
		d3.start();
	}

}
