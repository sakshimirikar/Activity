package oop;


public class Employee {
	
	private int empId;
	private String empName;
	private double salary;
	
	private Address address;

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getsalary() {
		return salary;
	}

	public Address getAddress() {
		return address;
	}
	

	public Employee(int empId, String empName, int salary, Address address) {
		super();
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		this.address=address;
     	
	}

}


public class Address {
		
		private String city , state , country;
		private int pincode;
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public int getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		
		
		public Address(String city , String state , String country , int pincode) {
			super();
			this.city=city;
			this.country=country;
			this.state=state;
			this.pincode=pincode;
			
			
		}
}


public class AggregationDemo {

	public static void main(String[] args) {
		
		Address add1 = new Address("Bangalore", "Karnataka", "India", 2345);
		Address add2 = new Address("Newyork city ", "Newyork", "USA", 4567);
		
		Employee emp1 = new Employee(101, "Sakshi", 80000 , add2);
		Employee emp2 = new Employee(102 ,"Aadish" , 90000 , add1);
//		Employee emp1 = new Employee(222, "sakshi", 45555, add2);
		
		System.out.println("Employee1 Name : " + emp1.getEmpName());
		System.out.println("Employee1 Address(city) : " + emp1.getAddress().getCity());
		System.out.println("Employee1 Address(country) : " + emp1.getAddress().getCountry());
		
		System.out.println("");
		
		System.out.println("Employee2 Name :" + emp2.getEmpName());
		System.out.println("Employee2 Address(city) : " + emp2.getAddress().getCity());
		System.out.println("Employee2 Address(country) : " + emp2.getAddress().getCountry())  
		
		
	}

}
