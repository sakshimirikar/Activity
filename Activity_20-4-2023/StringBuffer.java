
package Srings;

import java.util.Scanner;

public class StringBuffer {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		str=str.toLowerCase();
		
		StringBuilder builder = new StringBuilder(str);
		String rev = builder.reverse().toString();
		
		if(str.equals(rev))
         {
			System.out.println("Palindrome");
		 }
		
		else{
			System.out.println("Not a Palindrome");
		}
		
		sc.close();
	}

}
