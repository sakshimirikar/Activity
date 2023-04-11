package oop;

class User1{
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

class Employee11 extends User1 {
	
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

class Employee2 extends Employee11{
	
        long phone;
        int years;
        
        public void setData(int id , String name , String address, 
			double salary, String designation,long phone , int years) 
        {
        	super.setData(id, name, address,salary,designation);
        	this.phone=phone;
        	this.years=years;
        	
        }
        public void display() {
        	super.display();
        	System.out.println("Contact : " + this.phone );
        	System.out.println("Years in Org : " + this.years);
        	
        	
        }

}

class Employee3 extends Employee2{
	
	int increment;
    int birthday;
    
    public void setData(int id , String name , String address, 
		double salary, String designation,long phone , int years
		, int increment , int birthday) 
    {
    	super.setData(id, name, address,salary,designation,phone,years);
    	this.increment=increment;
    	this.birthday=birthday;
    	
    }
    public void display() {
    	super.display();
    	System.out.println("Increment : " + this.increment );
    	System.out.println("Birthdate : " + this.birthday);
    	
    	
    }
	
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Employee3 emp3 = new Employee3();
		
		emp3.setData(111, "Sakshi", "Bangalore", 200000 , "Java Developer", 123456789, 2, 30000, 26);
		emp3.display();
		
		
 
	}

}
