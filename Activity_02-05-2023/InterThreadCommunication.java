
package threads;



class Account {
	//initial account balance
	int balance = 50000;
	
	//synchronised withdraw method
	synchronized void withdraw(int amount) {
		
		System.out.println("Start withdrawing ...");
		
		
		if(this.balance < amount) {
			System.out.println("Insufficient balance : Please make a deposit!");
			System.out.println();
			
			try {
				wait();
			}
			catch(InterruptedException e) {
				
				System.out.println(e.getMessage());
				
			}
			this.balance = balance-amount;
			System.out.println("Rs. " + amount + "has been withdrawn successfully");
			
					
		}
		
	}
	
	
	
	//synchronized deposit method
	
	synchronized void deposit(int amount) {
		System.out.println("Starting deposit ...");
		this.balance = balance + amount ;
		System.out.println("Rs. " + amount + " has been deposited successfully");
		System.out.println();
//		notifyAll();
		notify();
		
	
	}
	
	//synchronized display method
			synchronized void display() {
				System.out.println("Display Balance : " + balance  );
				
				try {
					wait(500);
				}
				catch(InterruptedException e) {
					
					System.out.println(e.getMessage());
					
				}	
					
				
       }	
}

public class InterThreadCommunication {

	public static void main(String[] args) {
		
		Account acc = new Account(); //declaring object for account class
		
		//declaration of announymous class
		
		new Thread() {
			public void run() {
				
				acc.withdraw(60000);
				
			}
		}.start();
		
		new Thread() {
			public void run() {
				acc.deposit(15000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				acc.display();
				
			}
		}.start();
			
		
	}

}
