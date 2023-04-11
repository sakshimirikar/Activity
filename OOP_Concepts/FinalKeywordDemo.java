package oop;


//if a class is declared final it cannot be inherited
class Bike{
	
	//if a method is declared final it cannot be overrriden / updated/changed.
	final void speed(){
		System.out.println("Speed is 60km/hr");
	}
}


public class FinalKeywordDemo extends Bike {
	
	final int a =100;

	public static void main(String[] args) {
		Bike bike = new Bike();
		FinalKeywordDemo demo = new FinalKeywordDemo();
		
		//demo.a=500; //final variable cannot be changed
		System.out.printf("Value of a :" + demo.a );
		System.out.println();
		bike.speed();
		

	}

}
