
package Arrays;

import java.util.Scanner;

public class MaxMinElement {

	public static void main(String[] args) {
		
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of Array : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter " + size + " Elements : ");
		
		for(i=0 ; i<size ; i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		
		for(i=0 ; i<size ; i++) {
			if(arr[i]>max)
				max=arr[i];
			else if (arr[i]<min)
				min=arr[i];
		}
		System.out.println("Maximum Element : " + max);
		System.out.println("Minimum Element : " + min);	
		
	}

}
