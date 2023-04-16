
package Arrays;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
	    //initializing position as -1 as the first element on an array is store on index 0
		
//		int pos=-1;
		int i;
		int count=0;
		
		//boolean flag=true;
		System.out.println("Enter size of array");
		
		int size=sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the elements");
		
		for(i=0 ; i<arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter element you want to Search : ");
		int search = sc.nextInt();
		
		//searching for element
		for(i=0 ; i<arr.length ; i++) {
			if(arr[i] == search) {
			    
				count++;
//				pos=i;
//				flag=true;
				System.out.println("Element " + search + " is present at position " + (i+1));
				break;
			}
		}
		
		
		
		if(count<0) {
			System.out.println("Element not found!");
		}
		
//		if(pos!=i) {
//			System.out.println("Element not found");
//		}
//		if(flag==true) {
//			System.out.println("Element " + search + " is present at position " + (i+1));
//		}
//		else
//			System.out.println("Element not found !");
			
			
		
 	}

}
