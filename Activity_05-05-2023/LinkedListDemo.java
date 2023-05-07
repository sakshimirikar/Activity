
package collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.List;



public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<String>();
		
		names.add("Santoshi");
		names.add("Riya");
		names.add("Larrisa");
		names.add("Pooja");
		
		//Printing linkedlist
		System.out.println(names);
		
		System.out.println("Using for-each loop : ");
		
		for( String str : names ) {
			System.out.println(str);
		}
		
		System.out.println();
		System.out.println("Using While loop : ");
		int i=0;
		
		while(i<names.size()) {
			System.out.println(names.get(i));
			i++;
		}
		
		System.out.println();
		
		System.out.println("Adding Operations : ");
		names.addFirst("Somya");//adding at first position
		names.addLast("Nilam"); //adding at last position
		names.add(3, "Sakshi"); //adding at index 2
		System.out.println(names);
		
		System.out.println();
		
		System.out.println("Removing Operations : ");
		names.removeFirst(); //removing from first position
		names.removeLast(); //removing from last position
		names.remove("Pooja"); //removing using the index

		System.out.println(names);
		
		//set and get 
		System.out.println();
		names.set(1 ,  "Riya Jain");
		names.set(2, "Sakshi Mirikar");
//		String name = names.get(1);
//		System.out.println(name);
		System.out.println(names);
		
		
		//to delete all elements from the list 
//		names.clear();
		
//		names.removeAll(names);
//		
//		System.out.println(names);
		
		System.out.println();
		//list Iterator
		ListIterator listit = names.listIterator();
		System.out.println("Forward Direction ");
		
		while(listit.hasNext()) {
			System.out.println(listit.next());
         }
		
		System.out.println();
		System.out.println("Backward Direction : "); //reverse Direction
		
		while(listit.hasPrevious()) {
			System.out.println(listit.previous());
		}
		
		System.out.println();
		//we can also reverse the linked list using iterator-descending
		System.out.println("Printing in reverse using Iterator-descending : ");
		
		Iterator itr = names.descendingIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		System.out.println();
		System.out.println("Checking if an element is in the linked list :");
		
		if(names.contains("Shawin")) {
			System.out.println("Data Present ");
		}
		else {
			System.out.println("Data not found ");
		}
		
		System.out.println()
		;
		names.add("Sakshi");
		System.out.println(names);
		System.out.println(names.lastIndexOf("Sakshi"));
		
		//adding the elements using push method
		//push inserts at the first of the list. It is similar to addFirst
		
		System.out.println();
		
		names.push("Shrutika");
		names.push("Megha");
		System.out.println(names);
		
		System.out.println()
		;
		//remove and return the first element of the list
		System.out.println("Element popped " + names.pop());
		System.out.println(names);
	
		
		System.out.println();
		
		//poll - Retrives and removes the head (first element ) of the list
		System.out.println("Element poll : " + names.poll());
		System.out.println(names);
		
		System.out.println();
		
		//pollFirst -Retrives and removes the first element of this list or returns null if this list is empty
		System.out.println("Element poll : " + names.pollFirst());
		System.out.println(names);
		
		System.out.println();
		
		//pollLast - Retrives and removes the last element of this list , or return null if this list is empty
		System.out.println("Element poll : " + names.pollLast());
		System.out.println(names);
		
		System.out.println();
		
		System.out.println(names);
		
		System.out.println();
		
		//convert linkedlist to arraylist
		
		System.out.println("Converting LinkedList to ArrayList");
		List<String> arrlist = new ArrayList<String>(names);
		
		System.out.println(arrlist);
		
		//convert linkedlist into array
		
		System.out.println();
		System.out.println("Converting LinkedList to Array : ");
		//using toArray() method
		
		String array[] = names.toArray(new String[names.size()]);
		
		for(int j=0 ; j<array.length; j++){
			System.out.println(array[j]);
		}	
		

	}

}
