

package Regex;

import java.util.regex.Pattern;

public class Regex3 {

	public static void main(String[] args) {
		
		boolean b1 = Pattern.matches("[abc]?", "a");
		boolean b2 = Pattern.matches("[a-zA-Z0-9]{6}", "Shawin991234");
		
		//for phone number
		
		boolean phone = Pattern.matches("[6789]{1}[0-9]{9}", "6789123457");
		boolean phone1 = Pattern.matches("[6789][0-9]{9}","5976548902");
		
		
		System.out.println(b1 + " " + b2 + " " + phone + " " + phone1);
		

	}

}
