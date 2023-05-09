package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.TreeSet;


public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> hset = new HashSet<String>();
		
		hset.add("apple");
		hset.add("mango");
		hset.add("watermelon");
		hset.add("grapes");
		hset.add("orange");
//		hset.add(null);
		
		System.out.println(hset);
		hset.add("kiwi");
		
		System.out.println(hset);
		
		Iterator itr = hset.iterator();
		while(itr.hasNext()) {
			//hset.add("banana") //concurrentModificationException
			System.out.println(itr.next());
			
		}
		
		//creating an array
		System.out.println("Converting to an array :");
		String array[] = new String[hset.size()];
		hset.toArray(array);
		System.out.print("[");
		
		for(String s : array)
		{
			System.out.print(s + " ");
		}		
		System.out.println("]");
		
		
		System.out.println();
		//converting to ArrayList 
		ArrayList<String> alist = new ArrayList<String>(hset);
		
		Collections.sort(alist);
		System.out.println("Array List : ");
		System.out.print(alist);
		
		//TreeSet
		TreeSet<String> tset = new TreeSet<String>(hset);
		System.out.println("Tree Set : ");
		System.out.println(tset);
		
		System.out.println();
		
		//creating linked hash set
		LinkedHashSet<Integer> lhset = new LinkedHashSet<Integer>();
		
		lhset.add(89);
		lhset.add(46);
		lhset.add(84);
		lhset.add(55);
		
		System.out.println(lhset);
		
		
		
		
		
		
		
		
		

	}

}
