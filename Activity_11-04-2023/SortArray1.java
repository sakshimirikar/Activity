package Arrays;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;


public class SortArray1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer arr[] = new Integer[5];
		System.out.println("Enter 5 Array elements : ");
		
		for(int i=0 ; i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Sorting elements in Ascending Order : ");
		Arrays.sort(arr);//sorting array
		
		//using for-each loop to print sorted array
		for(int ele : arr) {
			System.out.println(ele);
			
		}	
		System.out.println();
			
		System.out.println("Sorting elements of array in Descending : ");
		Arrays.sort(arr,Collections.reverseOrder());
		
		for(int ele :arr) {
			System.out.println(ele);
		}	
		

	}

}
