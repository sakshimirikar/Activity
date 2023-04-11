package oop;

interface University {
	
	void exam();
	
}

abstract class College{
	
	abstract void attendance();
	
	public int add(int a , int b) {
		
		return a+b;
	}
	
	
}

//Multiple Inheritance
class WIT extends College implements University {

	@Override
	public void exam() {
		System.out.println("Exam season ");
		
	}

	@Override
	void attendance() {

          System.out.println("75% attendance is compulsary");
		
	}
	
}

//Multi-level Inheritance

class Sakshi extends WIT {
	public void study(){
		
		System.out.println("Study Hard");
	}
}


class Student extends Sakshi{
	public void write() {
		System.out.println("writing");
	}
}


//Heirarchical Inheritance 
class Subclass implements University {
	public void subclass() {
		System.out.println("Heirarchical Inheritance");
	}

	@Override
	public void exam() {
		System.out.println("Exam season ");
		
	}
}


public class HybridInheritance {

	public static void main(String[] args) {
		
		//Multi-level
		System.out.println("Multi-level");
		Student st = new Student();
		st.write();
		st.study();
		
		System.out.println();
		
		//Heirarchical
		System.out.println("Heirarchical");
		Subclass sub = new Subclass();
		sub.exam();
		sub.subclass();
		
		System.out.println();
		
		//Multiple 
		System.out.println("Multiple");
		WIT wit = new WIT();
		wit.exam();
        wit.attendance();
		
		
		
		

	}

}
