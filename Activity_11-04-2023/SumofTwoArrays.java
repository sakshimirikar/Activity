package Arrays;

import java.util.Scanner;

public class SumofTwoArrays {

	public static void main(String[] args) {

          
		Scanner sc = new Scanner(System.in);
		
		//array creation at run-time
		int arr1[] = new int[5];
		int arr2[] = new int[5];
		int sum[] = new int[5];
		
		    System.out.println();
	    
		    
		    System.out.println("Enter elements of 1st Array");
	    	for(int i=0 ; i<arr1.length;i++) {
	    	    arr1[i]=sc.nextInt(); //scanning elements of 1st Array
	    	
	    	}
	    	System.out.println("Enter elements of 2nd Array");
	    	for(int i=0 ; i<arr2.length;i++) {
	    	    arr2[i]=sc.nextInt(); //scanning elements of 2nd Array
	    	
	    	}
	    	for(int i=0 ; i<sum.length;i++) {
	    	    sum[i]=arr1[i] + arr2[i]; // adding elements of two arrays
	    	
	    	}
	    	System.out.println("Sum of arr1 and arr2 : ");
	    	
	    	//printing sum of two Arrays
	    	for(int i=0 ; i<sum.length;i++) {
	    	    System.out.println( arr1[i]+ " + " + arr2[i]+ " = " +  sum[i]);
	    	
	    	}
	   
	}

}
