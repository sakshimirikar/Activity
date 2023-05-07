

package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ArrayListDemo {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		
		System.out.println("Array length before adding element : " + arr.length);
		arr[0]=1;
		System.out.println("Array length after adding element : " + arr.length);	
		
		System.out.println();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Size of ArrayList before :" + list.size());
		
		list.add(5);
		list.add(34);
		list.add(48);
		list.add(45);
		
		System.out.println("Size of ArrayList after : " + list.size());
		System.out.println(list);
		
		list.remove(2); //removing element in arraylist using index
		System.out.println(list);
		System.out.println("Size of ArrayList after : " + list.size());
		
		//using for loop
		for(int i=0 ; i<list.size() ; i++) {
			System.out.println(i + " ");
			
		}
		System.out.println();
		
		int i=0;
		//using while loop
		System.out.println("Using while loop ");
		while(i<list.size()) {
			System.out.println(list.get(i));
			i++;
		}
		System.out.println();
		
		//using for each loop
		System.out.println("Using for each loop");
		for(Integer r : list ) {
			System.out.println(r + " ");
		}
		System.out.println();
		
		//using Iterator loop 
		System.out.println("Using Iterator ");
		
        Iterator itr = list.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        
        //Sorting ArrayList in ascending order
        Collections.sort(list);
        System.out.println("After sorting the values: ");
        System.out.println(list);
        
        //sort arraylist descending order
        Collections.sort(list , Collections.reverseOrder());
        System.out.println("After sorting the values : ");
		System.out.println(list);
		
		System.out.println();
		list.add(1,100); //adding 100 element in index 1 
		System.out.println(list);
		
		System.out.println();
		//copy arraylist
		ArrayList<Integer> list1 = new ArrayList<Integer>();
//		System.out.println(list1);
		list1.addAll(list);
		System.out.println("Copied arraylist : " + list1);
		
		//sublist
		System.out.println(list.subList(1,3));
		
		List<Integer> sub = list.subList(1, 3);
		System.out.println(sub);
		
		//another way
		ArrayList<Integer> list2 = new ArrayList<Integer>(list.subList(1, 3));
		System.out.println(list2);
		
		//search element
		System.out.println(list.contains(100));
		
		
		
	}
	

}
