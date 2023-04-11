package oop;


//In heirarchical Inheritance there is only one Parent class and 
// multiple child classes.

class Animal{
	public void eat() {
		System.out.println("eats");
	}
}
class Mammal extends Animal {
	public void sleep() {
		System.out.println("sleeps");
	}
}

class Humans extends Animal{
	public void Saksh(){
		System.out.println("repeats");
		
	}
}


public class HeirarchicalInheritance{
	public static void main(String[] args) {
		Humans hum = new Humans();
		hum.eat();
		hum.Saksh();
	}
	

}

