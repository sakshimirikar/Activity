package Arrays;

import java.util.Scanner;

public class SortArray2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int temp=0;
		int[] arr = {90,45,22,1,45,6,13};
		
		System.out.println("1) Ascending 2) Descending  " );
	    int choice = sc.nextInt();

	    switch(choice) {
	    
	    case 1:
	    	
	    	for(int i=0 ; i<arr.length ; i++) {
	    		for(int j=i+1 ; j<arr.length ; j++) {
	    			
	    			if(arr[i]>arr[j]) {
	    				
	    				temp=arr[i];
	    				arr[i]=arr[j];
	    				arr[j]=temp;
	    			}
	    			
	    		}
	    	}
	    	
	    	System.out.println("Sorted Array (Ascending Order) :");
	    	for(int ele : arr) {
	    		System.out.println(ele+" ");
	    	}
	    	System.out.println();
	    	break;
	    	
	    case 2:
	    	
	    	for(int i=0 ; i<arr.length ; i++) {
	    		for(int j=i+1 ; j<arr.length ; j++) {
	    			
	    			if(arr[i]<arr[j]) {
	    				
	    				temp=arr[i];
	    				arr[i]=arr[j];
	    				arr[j]=temp;
	    			}
	    			
	    		}
	    	}
	    	
	    	System.out.println("Sorted Array (Descending Order) :");
	    	for(int ele : arr) {
	    		System.out.println(ele);
	    	}
	    	System.out.println();
	    	
	    	
	    	break;
	    
	    }

	}

}
