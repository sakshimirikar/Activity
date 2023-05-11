package java8Features;

//Functional Interface - an Interface that contains only one abstract method.
// It can have any number of default and static methods as well as any number of
//Object class methods.
//It is also known as SAM interface (Single Abstract Method Interface).


@FunctionalInterface
interface Message {
	
	void say(); // only one abstract method
//	void speak();
	
	//default method
	default void msg() {
		System.out.println("Default with method body . ");
	}
	
	//can contain any number of Object class methods
	int hashCode();
	String toString();
	boolean equals(Object obj);
	
}


public class FunctinalInterfaceDemo implements Message {
	
	@Override
	public void say() {
		System.out.println("Saying Hello!!");
	}
	
	

	public static void main(String[] args) {
		FunctinalInterfaceDemo demo = new FunctinalInterfaceDemo();

		demo.say();
		demo.msg();
	}

}
