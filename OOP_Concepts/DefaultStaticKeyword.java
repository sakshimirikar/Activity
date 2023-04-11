
package oop;

interface Drawing
{
	void draw(); // abstract methods
	void paint();
	
	default void message() {
		 // default method introduced in Java8
		System.out.println(" Java 8 , default method was introduced");
	}
	
	static int multiply(int a , int b) {
		return a*b;
	}
}

class Circle implements Drawing
{
   
	@Override
	public void draw() {
		System.out.println("Drwaing Circle");
		
	}

	@Override
	public void paint() {
		System.out.println("Painting Circle");
		
	}
	
}



public class DefaultStaticKeyword {
	
	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.draw(); // implementing abstract methods
		circle.paint();
		circle.message();
		
		//calling static method declared in Drwaing Interface
		System.out.println("Multiplication :" + Drawing.multiply(5, 5));
		
		
	}

}
