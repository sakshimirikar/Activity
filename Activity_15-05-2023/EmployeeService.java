package com.Emp.Services;


import java.util.*;

import com.Emp.Exceptions.GlobalException;
import com.Emp.entity.Address;
import com.Emp.entity.Employee;

public class EmployeeService {
	
	private List<Employee> employee = new ArrayList<Employee>();
	
	
	//method to add emplyee details in array list
	public void addEmployee(int empId , String empName , double empSal , String city , String country)
	{
		
		Address add = new Address(city , country);
		//1st way
		//Employee emp = new Employee(empId , empName , empSal , add);
		//employee.add(emp);
		
		//2nd way
		employee.add(new Employee(empId , empName , empSal , add));
	}
	
	//for testing using builder annotation
	public void addEmp(Employee emp) {
		employee.add(emp);
	}
	
	public int lengthOfList() {
		return employee.size();
	}
	
	
	
	//method to display employee details using id 
		public Employee displayEployeeId(int id) throws GlobalException
		{
			boolean flag = false;
			
			for(int i=0 ; i<employee.size() ; i++) {
				
				if(employee.get(i).getEmpId()==id) {
					
//					System.out.println("Employee Id : " + employee.get(i).getEmpId());
//					System.out.println("Employee Name : " + );
//					System.out.println();
//					System.out.println();
//					System.out.println();
//					System.out.println();
					flag=true;
					return employee.get(i);
					
					
				}
			}
			
			if(flag!=true) {
				throw new GlobalException("Employee Id not found!!");
			}
			return null;
		}
		
		
		//method to delete employee details using id
		public boolean deleteEmployeeId(int id) throws GlobalException
		{
			boolean flag=false;
			for(int i=0 ; i<employee.size(); i++) {
				
				if(employee.get(i).getEmpId()==id) {
					employee.remove(i);
					flag=true;
					
					return flag;
				}
			}
			
			if(flag == false) {
				throw new GlobalException("Employee Id not found!!");
			}
			
			
			return flag;
		}
		
		//method to Update employee details using id 
		public void updateEmployeeById(int id) throws GlobalException{
			
			boolean flag= false;
			Scanner sc = new Scanner(System.in);
			
			for(int i=0 ; i<employee.size(); i++) {
				if(employee.get(i).getEmpId()==id) {
					
					System.out.println("Enter id  : ");
					int id1 = sc.nextInt();
					
					System.out.println("Enter Name :");
					String name = sc.nextLine();
					
					System.out.println("Enter Salary : ");
					double sal = sc.nextDouble();
					
					sc.nextLine();
					
					System.out.println("Enter city :");
					String city = sc.nextLine();
					
					System.out.println("Enter country : ");
					String country = sc.nextLine();
					
					Address add = new Address(city , country);
					employee.set(i, new Employee(id1 , name , sal , add));
					flag=true;
					break;

				}
			}
			if(flag==false) {
				throw new GlobalException("Employee Id not found");
			}
		}
		
		//way2 to update employee details
		public Employee updateEmployee(int index , Employee emp) {
			return employee.set(index ,  emp);
		}
		
		//method to find Id
		public Employee findId(int id) {
			Employee emp=null;
			for(int i=0 ; i<employee.size() ; i++) {
				if(employee.get(i).getEmpId()==id) {
					employee.get(i);
				}
			}
			return emp;
		}
		
		//method to delete all employee details
		public String deleteAllEmployees() {
			
			//employee.removeAll
			employee.clear();
			
			return "All details deleted successfully";
		}
		
		public int appraisal(int id) {
			int appraisal=0;
			
			for(int i=0 ; i<employee.size() ; i++) {
				
				if(employee.get(i).getEmpSal()>=30000) {
					appraisal=3000;
					System.out.println(appraisal);
				}
				else if(employee.get(i).getEmpSal() >=10000 || employee.get(i).getEmpSal() <= 20000 ) {
					appraisal=2000;
					System.out.println(appraisal);
				}
				else {
					appraisal=1000;
					System.out.println(appraisal);
				}
				
			}
			
			return appraisal;
			
		}
		
		double sal;
		public double calulateSal(int id) throws GlobalException {
			
			boolean flag=false;
			for(int i=0 ; i<employee.size() ; i++) {
				 
				 if(employee.get(i).getEmpId()==id) {
					 sal = employee.get(i).getEmpSal() * 12;
				 }
				 			
			}
			if(flag!=true) {
				throw new GlobalException("Employee Id not found!!");
			}
			
			
			return sal;
		}
	

}