package oop;




interface B {
	void add(int a , int b); //abstract method
	
}

abstract class A{  // concrete method
	public void demo() {
		System.out.println("Abstract Class");
	}


abstract void display(); //abstract method

}



class Child extends A implements B{

	@Override
	public void add(int a, int b) {
		System.out.println("Sum : " + (a+b));
		
	}

	@Override
	void display() {
		System.out.println("Another way of acheiving multiple inheritance");
		
	}
	
}


public class MultipleInheritance2 {
	

	public static void main(String[] args) {
		Child child = new Child();
		child.add(10,5);
		child.display();
		child.demo();
		
		
	

	}

}
