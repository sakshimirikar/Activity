package com.Emp.Servicetest;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.Emp.Exceptions.GlobalException;
import com.Emp.Services.EmployeeService;
import com.Emp.entity.Address;
import com.Emp.entity.Employee;
import com.Emp.entity.Employee.EmployeeBuilder;

public class EmployeeServiceTest {
	
	static EmployeeService empService;
	
	@BeforeEach
	void setUp() throws Exception{
		empService = new EmployeeService();
	}

	@AfterEach
	void tearDown() throws Exception{
		empService = null;
		System.out.println("Object is garbage collected");
		
	}
	
	@Test
	@DisplayName("Testing ass employee method")
	void testAddEmployee() {
		
		//1way
//		empService.addEmployee(101 , "Prashant" , 30000 , "Pune " , "India");
//		empService.addEmployee(111 , "Kalyani" , 35000 , "Bangalore" , "India");
//		
//		assertEquals( 2 , empService.lengthOfList());
		
		//2nd Way using Builder
		Address add = Address.builder().city("Pune").country("India").build();
		
		Employee emp = Employee.builder().empId(101).empName("Prashant").empSal(30000).address(add).build();
		
		empService.addEmp(emp);
		
		//assertEquals(1,empService.lengthOfList());
		int length = empService.lengthOfList();
//		assertThat(length>0).isTrue();
//		assertThat(length).isEqualTo(1);

		
		boolean flag = false;
		if(length >0) {
			flag=true;
		}
		
		assertTrue(flag);
		
	}
	
	@Test
	@DisplayName("Testing display Employee by Id ")
	void testDisplayEmpById() throws GlobalException
	{
		Address add = Address.builder().city("Bangalore").country("India").build();
		Employee emp = Employee.builder().empId(111).empName("Kalyani").empSal(35000).address(add).build();
		
		empService.addEmp(emp);
		Employee e = empService.displayEployeeId(111);
		assertEquals("Kalyani" , e.getEmpName());
		
	}
	
	@Test
	@DisplayName("Testing delete employee by Id")
	void testDeleteEmpById() throws GlobalException
	{
		Address add = Address.builder().city("Delhi").country("India").build();
		Employee emp = Employee.builder().empId(120).empName("Megha").empSal(40000).address(add).build();
		
		empService.addEmp(emp);
		//assertThat(empService.deleteEmployeeId(120))
		//isEqualTo("Employee details deleted");
		assertTrue(empService.deleteEmployeeId(120));

	
	}
	
	@Test
	@DisplayName("Testing Update employee")
	void testUpdateEmployee() throws GlobalException
	{
		empService.addEmployee(151, "Sub", 35000, "Sydney", "Australia");
		//Employee e = empService.findId(151);
		Employee e = empService.displayEployeeId(151);
		e.setEmpName("Shubham");
		
		Employee emp = empService.updateEmployee(0, e);
		assertEquals("Shubham", emp.getEmpName());

	}

	@Test
	void testDeleteAll() {
		empService.addEmployee(151 , "Sub" , 35000 , "Sydney" , "Australia");
		Address add = Address.builder().city("Delhi").country("India").build();
		Employee emp = Employee.builder().empId(120).empName("Megha").empSal(40000).address(add).build();
		
		empService.addEmp(emp);
		empService.deleteAllEmployees();
		assertNull(empService.findId(151));
		
//		assertEquals("All details deleted successfully!", empService.deleteAllEmployees());

	}
	
	//method to Calculate Appraisal Method
	@Test 
	@DisplayName("Testing Appraisal Method")
	void testAppraisal() throws GlobalException{
		
		empService.addEmployee(101, "Sakshi", 50000, "Bangalore", "India");
		
		
		assertEquals(3000, empService.appraisal(101));
		
	}
	
	//method to Calculate Salary Method
	@Test 
	@DisplayName("Testing Calculate Salary Method")
	void testCalculateSal() throws GlobalException {
		
		empService.addEmployee(101, "Sakshi", 20000 , "Bangalore", "India");
		empService.addEmployee(102, "Sakshi", 25000 , "Bangalore", "India");
		
		assertEquals(240000, empService.calulateSal(101));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
