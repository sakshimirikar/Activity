
package FileHandling;

//import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) {
		//write in a file
		try {
			FileWriter fw = new FileWriter("");
			fw.write("We are learning to use File Writer");
			
			fw.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		
		//read from a file
		try {
			FileReader fr = new FileReader("");
			int i;
			
			while((i=fr.read())!=-1) {
				System.out.println((char)i);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		System.out.println();
		System.out.println("Success");
		
	}

}
