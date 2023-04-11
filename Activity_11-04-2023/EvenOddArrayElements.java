package Arrays;

import java.util.Scanner;

public class EvenOddArrayElements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array : ");
		int size = sc.nextInt();
		
		int even=0;
		int odd=0;
		
		int arr[] = new int[size];
		
		System.out.println("Enter " + size + " elements in Array : ");
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = sc.nextInt();	
			
	    }
		
		
		for(int ele :arr) {
			
			if(ele%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("Total even elements : " + even );
        System.out.println("Total odd elements : " + odd );
		
		

	}

}
