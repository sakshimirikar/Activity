
package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {

	public static void main(String[] args) {
	
		//1st way
		Pattern p = Pattern.compile("..s"); //.(dot) represents any single character
		Matcher m = p.matcher("zhs");
		boolean b1 = m.matches();
		
		//2nd way
		boolean b2 = Pattern.compile(".s").matcher("vs").matches();
		
		//3rd way
		boolean b3 = Pattern.matches("..s", "mns");
		
		System.out.println(b1+ " " + b2 + " " + b3);
		
		
		

	}

}
