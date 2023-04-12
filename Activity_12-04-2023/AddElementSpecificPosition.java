
package Arrays;

import java.util.Scanner;

public class AddElementSpecificPosition {

	public static void main(String[] args) {
		
		int i;
		int arr[] = new int[20];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size upto " + (arr.length-1) + ":");
		int size = sc.nextInt();
		
		if(size<(arr.length-1)) {
			System.out.println("Enter " + size + " elements");
			for(i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
		}
		else // if size > (arr.length-1)
		{
			System.out.println("Size cannot be greater than length of array !!");
			System.exit(0);
		}
		
		System.out.println("Array before Insertion : ");
		
		for(i=0;i<size;i++) {
			System.out.println(arr[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Enter element you want to Insert : ");
		int num = sc.nextInt();
		
		System.out.println("Enter the Position you want to Insert : ");
		int pos = sc.nextInt();
		
		if(pos<size+1 && pos>0) {
			
			//making new room for element : shifting
			for(i=size;i>=pos;i--) {
				arr[i] = arr[i-1]; //shifting elements to right side
			}
			
//			for(i=pos-1;i<=size;i++) {
//		       arr[i] = arr[i+1]; //shifting elements to left
//		       break;
//		    
//		}
			
			
			//inserting new element at the given position
			arr[pos-1]=num;
			
			for(i=0;i<=size;i++) {
				System.out.println(arr[i] + " ");
			}
			System.out.println();
					
			
		}

	}

}
