
package Regex;

import java.util.regex.*;

public class EmailRegex {

	public static void main(String[] args) {
		
//		boolean b1 = Pattern.matches("[abc]?", "a");
		
		boolean b1 = Pattern.matches("[a-z0-9]+@[a-z.]+[a-z]{3}"  , "sakshimirikar26@gmail.com");

		boolean b2 = Pattern.matches("[a-z0-9]+@[a-z]+\\.[a-z]{3}", "sakshimirikar@outlook.com");
		
		
		
		
		System.out.println(b1 + " " + b2);
		

	}
}
