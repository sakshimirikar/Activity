package oop;

class ParentBank{
	public void loanInterest() {
		System.out.println(" 5% loan Interest");
	}
}

class ChildSBI extends ParentBank{
	public void loanInterest() {
		System.out.println("7% loan Interest");
	}
}

class ChildAxis extends ParentBank{
	public void loanInterest() {
		System.out.println("10% loan Interest");
	}
}


public class MethodOverriding {

	public static void main(String[] args) {
		
		ParentBank pbank; // reference variable
		pbank = new ChildSBI(); // using reference variable pbank
		                        // and calling child class 
		//This is called Upcasting.
		// It is used to show Method Overriding.
		
		pbank.loanInterest();
		
		ChildSBI child = new ChildSBI();
		child.loanInterest();

	}

}
