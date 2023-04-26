
package FileHandling;

import java.io.*;

//FileInputStream used to read a file 
public class FileInputStreamDemo {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("D:/JAVA Training/Notes//demo.txt");
			
			System.out.println("Remaining bytes : " + fis.available());
			int i; //['w' , 'e' , '1' , ...]
			
			while((i=fis.read())!=-1) {
				System.out.println((char)i);
			}
			
			System.out.println();
			System.out.println("Remaining bytes : "+ i);
			
		
		
		}
		
		catch(Exception e) {
			
		}
	}

}
