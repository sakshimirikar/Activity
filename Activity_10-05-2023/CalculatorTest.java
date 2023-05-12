package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;

import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;




 

public class CalculatorTest {
	
	Calculator cal;
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Before All : This will execute before all test cases.");
	}
	
	@AfterAll
	static void AfterAll() {
		System.out.println("After All : This will execute after all test cases. ");
		
	}
	
	@BeforeEach
	void beforeEach(){
		cal = new Calculator();
		
	}
	
	@AfterEach
	void afterEach() {
		cal=null; //null referencing
		System.out.println("Clean Up ....");
	}
	
	
	@Test
	void testAddition() {
		//Calculator cal = new Calculator
		assertEquals(11, cal.addition(6, 5));
	}
	
	@Test
	
	@DisplayName("Testing Subtraction Method")
	//we are disabling this test to run on Mac OS
	@DisabledOnOs(value = {OS.MAC})
	
	//we are enabling this test to run only on system that has
	//JRE between 11 and 19
	@EnabledForJreRange(min=JRE.JAVA_11 , max=JRE.JAVA_19)
	//we are disabling this test for those who have JAVA_9 in the system
	
	@DisabledOnJre(value = JRE.JAVA_9)
	
	void testSubtraction() {
		
		assertEquals(4, cal.subtraction(10, 6));
	}
	
//	@Test
//	@DisplayName("Testing Division M")
//	void TestDivision() {
//		assertEquals(5 , cal.division(25, 5));
//	}
	
	@Test
	@DisplayName("Testing Division Method")
	void testDivision()
	{
		assertEquals(5 , cal.division(25, 5));
	}
	
	@Test
	void testDivisionWithException()
	{
		assertThrows(ArithmeticException.class , () -> cal.division(10,0));
	}
	
		
	
	@Test
	void TestMultiplicationMethod() {
		assertAll(
				
			() -> assertEquals(10 , cal.multiplication(5,2)),
			() -> assertEquals(100 , cal.multiplication(25,4)),
			() -> assertEquals(-2 , cal.multiplication(2,-1))
			
		);
	}
	
	@Test
	@DisplayName("Disabled Method")
	@Disabled
	void testDisabled()
	{
		fail("This test should be disabled");
	}
	
	@Nested
	@DisplayName("All Addition Methods")
	class TestAdd{
		
		@Test
		@DisplayName("Testing Addition Method")
		@EnabledOnOs(value = {OS.WINDOWS , OS.LINUX})
		void testAddition() {
			//Calculator call = new Calculator();
			assertEquals(11,cal.addition(6, 5));
		}
		
		
		@Test
		@DisplayName("Testing Positive Addition Method")
		void testPositive() {
			//Calculator call = new Calculator();
			assertEquals(25,cal.additionwithPositive(20, 5));
		}
		
		@Test
		@DisplayName("Testing Negative Addition Method")
		void testNegative() {
			//Calculator call = new Calculator();
			assertEquals(-5 ,cal.additionwithNegative(-3, -2));
		}
		
	} //end of nested class
	
	@Test
	void TestAssumption()
	{
		boolean flag= false;
		//assumeTrue(flag);
		assumeFalse(flag);
	}
	
	@Test
	@DisplayName("To check null/not and true/false")
	void test() {
		int num=6;
		String st1="hi";
		String st2=null;
		
		//check true condition
		assertTrue(num<10); //asserting the condition should be true
		
		//check false condition
		assertFalse(num>10); //asserting the condition should be false
		
		//checking for null 
		assertNull(st2); 
		
		//checking for not null
		assertNotNull(st1);
		
	}
	
	
	//Testing Factorail Method  
	
	@Test
	@DisplayName("Testing Factorail Method")
	void testFactorail() {
		assertEquals(120 , cal.factorial(5));
	}
	
	int[] arr = new int[] {2 , 5 , 56};
	
	//To get Maximum element in an array
	@Test
	@DisplayName("Max element of an Array!")
	void testMaxArray() {
		assertEquals(56, cal.maxValue(arr));
	}

	
	
}
