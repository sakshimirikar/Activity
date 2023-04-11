package oop;

class Bakery{
	
	public void eat(){
		System.out.println("Welcome to our Bakery");
		
	} 
}

class Cake extends Bakery {

	public void yummy(){
		System.out.println("Cake is Yummy");
		
	}
}

//MultiLevel Inheritance - levels of Inheritance  
class ChocolateCake extends Cake{
	public void favourite(){
		System.out.println("My favourite Cake is Chocolate Cake");
		
	}
}

//Heirarchical Inheritance - one Parent and Multiple Child Classes.
class Pastry extends Bakery{
	
	public void small(){
		System.out.println("Pineapple Pastry");
		
	}
}

//class Biscuits extends Bakery{
//	
//	
//}
//
//class CreamB extends Biscuits	{
//	
//}


//WAP - Multilevel and Heirarchical Inheritance in one program
public class MultilevelHeirarchical {

	public static void main(String[] args) {

		System.out.println("Multiple Inheritance ");
	    //MultiLevel Inheritance 
		ChocolateCake cc = new ChocolateCake();
		cc.favourite(); // can call its own method as well as  
		                //the methods of Parent Class and its Grandparent class
		cc.yummy();
		cc.eat();
		
		System.out.println(" ");
		
		System.out.println("Heirarchical Inheritance ");
		//Heirarchical Inheritance 
		Pastry pastry = new Pastry();
		pastry.small(); // can only call the methods of own class and Parent class
		pastry.eat();   // from which it is getting Inherited.
		
		


	}

}
