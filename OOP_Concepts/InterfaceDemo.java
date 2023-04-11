package oop;

interface Printable{
	//it is like a class but not a class.
	
	//everything inside a interface is 
	//public , static and final by default
	int x=100;
	
	void display(); // abstract methods
	void fun();
}

//interface to -> interface :  extends 
// abstract class to -> class : extends
// interface to -> class : implements  class implements interface)
//interface -> interface : extends


interface Drawable extends Printable{
	
	int x=200;
	
	void draw();
	void paint();
}

interface Sayable 
{
//	int x=300;
	 void say();
	 void draw();
}

//using Interface we can acheive multiple inheritance in JAVA 
// a class can implement any number of interafces
//MULTIPLE INHERITANCE 
class Print implements Drawable , Sayable
{

	@Override
	public void display() {
		System.out.println(" Display ");
		
	}

	@Override
	public void fun() {
		System.out.println(" Fun ");
		
	}

	@Override
	public void say() {
		System.out.println(" Say ");
		
	}

	@Override
	public void draw() {
		System.out.println(" Draw ");
		
	}

	@Override
	public void paint() {
		System.out.println(" Paint ");
		
	}	

}


public class InterfaceDemo {

	public static void main(String[] args) {
		
		Print print = new Print();
		System.out.println( print.x);
		print.display();
		print.fun();
		print.draw();
        print.say();

	}

}
