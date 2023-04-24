
package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowkeywordDemo {
		
		static void validateAge(int age) throws AgeValidationException
		{
			if(age>=18) {
				System.out.println("Eligible to vote !! ");
				
			}
			
			else {
				throw new AgeValidationException("Not eligible to vote.");
			}
		}



        public static void main(String[] args) {
        	
        	try(Scanner sc = new Scanner(System.in)){
        		
        		System.out.println("Enter your age : ");
        		int age =sc.nextInt();
        		validateAge(age);
        		
        	}
        	
        	catch(InputMismatchException e) {
        		System.out.println("Please give correct input !");
        	}
        	catch(AgeValidationException e) {
        		System.out.println(e.getMessage());
        	}
	
	
       }

}

//make a seperate class to handle Exception

package ExceptionHandling;

public class AgeValidationException extends RuntimeException  {

	public AgeValidationException(String message) {
		super(message);
	}
}

