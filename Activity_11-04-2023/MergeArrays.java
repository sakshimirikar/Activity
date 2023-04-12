package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		int[] arr1 = new int[5];
		int len1=arr1.length;
		
		int[] arr2 = new int[5];
		int len2=arr2.length;
		
		
		int[] merged = new int[arr1.length + arr2.length];
		//merged array of size arr1 + arr2
		
		
		System.out.println("Enter 5 Array1 elements : ");
		for(int i=0 ; i<arr1.length ; i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter 5 Array2 elements : ");
		for(int i=0 ; i<arr2.length ; i++) {
			arr2[i] = sc.nextInt();
		}
		
		System.out.println("Merged Array : ");
		
			
      //System.arraycopy(object src , int srcPos ,Object desPos , int length)
	       System.arraycopy(arr1, 0, merged, 0, len1);
	       System.arraycopy(arr2, 0 , merged, len1 , len2);
	       System.out.println(Arrays.toString(merged));
			 
			
	  //arraycopy -  method of System class which belongs to java.lang package. 
	  //It copies an array from the specified source array to the 
	  //specified position of the destination array.
			
		
		
	}

}
