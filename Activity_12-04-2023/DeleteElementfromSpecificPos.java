
package Arrays;

import java.util.Scanner;

public class DeleteElementfromSpecificPos {

	public static void main(String[] args) {
		
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of Array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		if(size>0) {
			
			System.out.println("Enter " + size + " Elememts :");
			
			for(i=0 ; i<size ; i++) {
				arr[i]=sc.nextInt();
			}
			
		    //Array before deletion
			for(i=0 ; i<size ; i++) {
				System.out.print(arr[i] + " ");
				
			}
			System.out.println();
			
			System.out.println("Enter Position : ");
			int pos = sc.nextInt();
			
			for(i=pos ; i<size-1 ; i++) {
				arr[i]=arr[i+1]; // shifting towards left
			}
			
			//delete element in array
			size--;
			
			//priting the updated array
			for(i=0;i<size;i++) {
				System.out.println(arr[i] + " ");
			}
			System.out.println();
			
		}
		else
			System.out.println("Array size cannot be 0 or less than 0 !!!!");
			

	}

}
