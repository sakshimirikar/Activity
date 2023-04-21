
package Srings;

import java.util.Scanner;

public class StringPalindrome1 {

	public static void main(String[] args) {
		
		//String Palindrome using String
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		
		String rev="";
		
		//using a backward loop to reverse string
		for(int i=str.length()-1 ; i>=0 ; i--) {
			
			rev = rev + str.charAt(i);
		}
		
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
         }
		else {
			System.out.println("Not a Palindrome");
		}
		
		
		

	}

}
