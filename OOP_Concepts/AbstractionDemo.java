package oop;

abstract class Bank{
	
	public void display() {
		System.out.println("Welcome to our Bank!!");
	}
	
	abstract void loan();
	
	abstract void account();
	
}

class Sbi extends Bank{

	@Override
	void loan() {
		System.out.println("Loan amount 35000");
		
	}

	@Override
	void account() {
		System.out.println("Account number 12345");
		
	}
		
}

class Hdfc extends Bank{
	
    void interest() {
    	System.out.println("Interest rate 9%");
    }

	@Override
	void loan() {
		System.out.println("Loan amount 50000");
		
	}

	@Override
	void account() {
		System.out.println("Account number 98765");
	}
	
}

public class AbstractionDemo {

	public static void main(String[] args) {
		Hdfc hdfc = new Hdfc();
		hdfc.interest();
		hdfc.loan();
		hdfc.account();
		
		System.out.println();
		
		Sbi sbi = new Sbi();
		sbi.loan();
		sbi.display();
		sbi.account();
		
		
		

	}

}
