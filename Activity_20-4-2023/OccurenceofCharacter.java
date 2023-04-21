
package Srings;

import java.util.Scanner;

public class OccurenceofCharacter {
	
	public static int occurence(String str , char ch) {
		
		int count=0;

		for(int i=0 ; i<str.length() ; i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		return count;
		
		
	}

	public static void main(String[] args) {
		//WAP to count the number of occurance 
		//of a character using a method
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String st = sc.nextLine();
		st = st.toLowerCase();
		
		System.out.println("Enter a character(lowercase) to check its occurence  : ");
		char c = sc.next().charAt(0);
		
		System.out.println("Occurence of " + c + " : " + occurence(st,c));
		

	}

}
