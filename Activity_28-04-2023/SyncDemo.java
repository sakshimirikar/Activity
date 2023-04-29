
package threads;


class PrintData{
//	
//	//void multiplication(int n ) //method is not synchronised
//	
	synchronized void multiplication(int n)//method is synchronised
	{
		for(int i=1 ; i<=5 ; i++) {
		
			System.out.println(n + " * " + i + " = " + n*i);
			
			try {
				Thread.sleep(400);
				
		}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		
		
	 } //end for loop
		
	} //end of synchronisation
 }


//
//class Thread1 extends Thread
//{
//	PrintData t;
//	
//	public Thread1(PrintData t) {
//		this.t=t;
//	}
//	
//	public void run() {
//		t.multiplication(5);
//	}
//
//
//}

//
//class Thread2 extends Thread{
//	PrintData t;
//	
//	public Thread2(PrintData t) {
//		this.t=t;
//	}
//	
//	public void run() {
//		t.multiplication(100);
//	}
//}

public class SyncDemo {

	public static void main(String[] args) {
		PrintData pd = new PrintData();
		
//		Thread1 t1 = new Thread1(pd);
//		Thread t2 = new Thread2(pd);
		
		//anonymous class
		//using anonyms class we can reduce the size of the code
		
		Thread t1 = new Thread() {
			public void run() {
				pd.multiplication(5);
			}
		};
		
		Thread t2 = new Thread()
		{
			public void run() 
			{
				pd.multiplication(100);
			}
		};
		
		t1.start();
		t2.start();
		
	}

}
