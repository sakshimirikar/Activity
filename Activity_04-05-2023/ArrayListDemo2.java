package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str;
		ArrayList<String> al=new ArrayList<String>();
		System.out.println("How many elements you want to enter:");
		int ele=sc.nextInt();
		
		System.out.println("Enter string elements:");
		for(int i=0;i<ele;i++)
		{
			str=sc.next();
			al.add(str);
		}
		
		System.out.println("String are:");
		System.out.println(al);
		System.out.println();
		
		//using for loop
//		for(int i=0;i<ele;i++)
//		{
//			System.out.println(al.get(i)+" ");
//		}
		
		//sort using ascending order
		Collections.sort(al);
		System.out.println("sorting in ascending order");
		System.out.println(al);
	
		//sort using descending order
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("sorting in descending order");
		System.out.println(al);
		System.out.println();
		
		//to add a value in a given index
		System.out.println("Enter the index");
		int index=sc.nextInt();
		System.out.println("Enter the new string");
		String s=sc.next();
		al.add(index,s);
		System.out.println(al);
		
		//to remove the element
		System.out.println("Enter the index to remove:");
		int r=sc.nextInt();
		al.remove(r);
		System.out.println("After removing:"+al);
		System.out.println();
		
		//conver the arraylist into array
		System.out.println("Converting arraylist into array");
		String arr[]=new String[al.size()];
		for(int i=0;i<al.size();i++)
		{
			arr[i]=al.get(i);
		}
		
		//print the elements in array
		for(int i=0;i<al.size();i++)
		{
			System.out.println(arr[i]);
		}
		
		//convert array into arraylist
		String arr1[]= {"dog","cat","horse"};
		ArrayList<String> alist=new ArrayList<String>(Arrays.asList(arr1));
		alist.add("Monkey");
		alist.add("elephant");
		System.out.println();
		System.out.println("After converting arrylist into array");
		System.out.println(alist);
		System.out.println();
		
		//replace the string at a given index
		System.out.println("Replacing index at given index");
		alist.set(1,"tiger");
		System.out.println(alist);
		
	}

}