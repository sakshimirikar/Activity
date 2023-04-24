

package ExceptionHandling;

import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) //try with resource
		//the scanner object will get closed automatically 
		{
			try {
				int a=30 , b=0;
				System.out.println("Division : " + (a/b));
			}
			catch(ArithmeticException e){
				System.out.println("Cannot be divided by zero.");
				System.out.println();
				
			}
			
			int arr[] = new int[5];
			arr[5]=78;
			
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception occured : Array Index Out of Bounds !");
			System.out.println();
			
		}
		//finally block is the last block the closing block which always gets executed
		//whether the exception is handled or not
		finally 
		{
			//sc.close(); //closing the scanner object
			System.out.println("Finally block always gets executed!");
 			
		}
	}

}
