
package collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<String> vec = new Vector<String>(5);
		
		//Capacity of Vector
		System.out.println(vec.capacity());
		
		vec.add("Omkar");
		vec.add("Smital");
		vec.add("Sakshi");
		vec.add("Padmasini");
		
		System.out.println(vec);
		
		
		vec.addElement("Abhijeet");
		vec.addElement("Prashant");
		
		System.out.println();
		
		System.out.println("Updated vector : " + vec);
		
		System.out.println("Size of Vector : " + vec.size() ); //6
		System.out.println("Capacity after adding elements :  " + vec.capacity()); //(5*2) = 10
		
		System.out.println();
		
		System.out.println("First Element : " + vec.firstElement());
		System.out.println("Last Element : " + vec.lastElement());
		
		System.out.println();
		//using contains you can check if the element is present or not
		if(vec.contains("Sakshi"))
		{
			System.out.println("Element present at index : " + vec.indexOf("Sakshi"));
			
		}
		else {
			System.out.println("Element not present!!");
		}
		
		
		
		

	}

}
