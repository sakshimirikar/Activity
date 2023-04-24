//Question :  Develop a simple java application to calculate the tax for a particular employee based on his salary


package ExceptionHandling;

import java.util.Scanner;

class TaxCalculator {
	
	String empName;
	boolean isIndian=false;
	double empSal;
	
	//using constructor to construct values of object 
	TaxCalculator(String empName ,  double empSal , boolean isIndian){
		this.empName=empName;
		this.isIndian=isIndian;
		this.empSal=empSal;
		
	}
	
	
	public double calculateTax(double empSal) throws CountryNotValidException, TaxNotEligibleException, EmployeeNameInvalidException 
	{
			double taxAmount;	
			  
			if (isIndian==true){
				 
//				if(empName != null && empName != "")
				if(empName.equals(null) && empName.equals(" "))
				{
					if(empSal>100000 && isIndian==true) {
						taxAmount=empSal*8/100;				
					}
					else if(empSal>=50000 && empSal<=100000 && isIndian==true) {
						taxAmount=empSal*6/100;
					}
					else if(empSal<=30000 && empSal<=50000 && isIndian==true) {
						taxAmount=empSal*5/100;
						
					}
					else if (empSal>=10000 && empSal<=30000){
						taxAmount=empSal*4/100;
						
					}
					else {
						throw new TaxNotEligibleException("The employee does not need to pay tax");

					}
											
				}
				
				else {
					
					throw new EmployeeNameInvalidException("The employee name cannot be empty");
				}
						
				
			}
			
			else {
				throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
			}	
		
		return taxAmount;
		
		
		
	}
	
}

public class Calculator {

	public static void main(String[] args) throws TaxNotEligibleException, EmployeeNameInvalidException {
		
		
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.println("Enter Employee name :");
			String name=sc.nextLine();
			
			System.out.println("Enter employee Salary : ");
			double salary = sc.nextDouble();
			
			System.out.println("Enter true if the Employee is Indian : ");
			boolean indian = sc.nextBoolean();
			
			TaxCalculator tc = new TaxCalculator(name, salary , indian );
			
			System.out.println("Tax Amount : " + tc.calculateTax(salary));
			
			
		}
		catch(CountryNotValidException e){
			System.out.println(e.getMessage());
			
		}
		catch(EmployeeNameInvalidException e) {
			System.out.println(e.getMessage());
		}
		
		catch(TaxNotEligibleException e) {
			System.out.println(e.getMessage());
		}
		


	}

}

//making seperate class to handle exceptions

//class for CountryNotValidException  exception

package ExceptionHandling;

public class CountryNotValidException extends Exception {
	
	public CountryNotValidException(String message) {
		super(message);
	}
  
}


// class for EmployeeNameInvalidException exception

package ExceptionHandling;

public class EmployeeNameInvalidException extends Exception {
	
	public EmployeeNameInvalidException(String message) {
		super(message);
	}

}

//class TaxNotEligibleException exception

package ExceptionHandling;

public class TaxNotEligibleException extends Exception{
	
	public TaxNotEligibleException(String message) {
		super(message);
	}

}
