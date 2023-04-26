
package FileHandling;

import java.io.*;

//FileOutputSttream is used to write a file.

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("D:/JAVA Training/Notes//demo.txt"); //create new txt documenet demo.txt -> copy the location and paste here.
			
//			fos.write(65);
			
			String s = "Welcome to Java Stream";
			byte b[] = s.getBytes(); //converting string into byte array
			
			fos.write(b);
			fos.close();
			
			System.out.println("Success");
			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}

