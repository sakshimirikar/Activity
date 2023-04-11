package oop;

// same method name add with different number of parameteres and different -> Method Overloading

class Addition{
	
	public void add(int a) {
		System.out.println("Addition of one parameter : " + (a+10));
		
	}
	
	public void add(int a , int b) {
		System.out.println("Addition of two parameter : " + (a+b));
		
	}
	public void add(int a , double b) {
		System.out.println("Addition of one int + one double : " + (a+b));
		
	}
	public void add(double a , double b) {
		System.out.println("Addition of both double parameter : " + (a+b));
		
	}
	public void add(int a , int b , int c) {
		System.out.println("Addition of three parameter : " + (a+b+c));
		
	}	
	
}

public class MethodOverloading {
	

	public static void main(String[] args) {
		
		Addition a = new Addition();
		
		a.add(12);
		a.add(20, 50);
		a.add(2.5, 7.2);
		a.add(20, 2.5);
		a.add(5, 10, 20);
		
	}

}
