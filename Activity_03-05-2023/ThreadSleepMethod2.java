package threads;

import java.lang.Thread;
import java.io.*;

public class ThreadSleepMethod2 {
	
	
//	public void run() {
//		
//	}
	
	
    //main method
	public static void main(String[] args) {
		
		try {
			for(int j=0 ; j<5 ; j++) {
				
				//The main thread sleeps for the 1000 milliseconds ie; 1 sec
				Thread.sleep(1000);
				
				//displaying the value of variable
				System.out.println(j);
			}
		}
		catch(Exception e) {
			System.out.println(e);
			
		}		

		
		
		
		
	}

}
