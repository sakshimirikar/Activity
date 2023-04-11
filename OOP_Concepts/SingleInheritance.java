package oop;

class User{
	int id;
	String name , address ;
	
	public void setData(int id , String name , String address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public void display(){
		System.out.println("Id : " + this.id);
		System.out.println("Name : " + this.name);
		
	}
	
}

class Employee1 extends User {
	
	double salary;
	String designation;
	
	public void setData(int id , String name , String address, 
			double salary, String designation) {
		super.setData(id, name, address);
		this.salary=salary;
		this.designation=designation;
	}
	
	public void display() {
		super.display(); // calling display() method of Parent class using super() keyword
		System.out.println("Salary : " + this.salary);
		System.out.println("Designation : " + this.designation);
	}   
}


public class SingleInheritance {

	public static void main(String[] args) {
		Employee1 emp1 = new Employee1();
		
		emp1.setData(111, "Sakshi", "Bangalore");
		emp1.display();
		emp1.setData(112, "Sakshi Mirikar", "Banaglore", 200000, "Java Developer");
		emp1.display();
		
		User user1 = new User();
		user1.setData(101, "Hello" , "Pune");
		user1.display();

	}

}
