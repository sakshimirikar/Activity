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

}