
package Arrays;

import java.util.Scanner;
import java.util.Arrays;


public class DuplicateElements {

	public static void main(String[] args) {
		
		int i,j;
		int count=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of an Array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter " + size + " Elements : " );
		
		for(i=0 ; i<size ; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println();
		
		Arrays.sort(arr);
		
//		for(i=1 ; i<size ; i++) {
//			if(arr[i]==arr[i-1])
//				count++;
//		}
//		System.out.println("Duplicate elements : " + count);
		
		
		for(i=0 ; i<size ; i++) {
			for(j=i+1 ; j<size ; j++) {
				if(arr[i]==arr[j]) {
					count++;
			    	break;	
				}
						
			}	
		}
		System.out.println("Duplicate elements : " + count);
				

	}

}
