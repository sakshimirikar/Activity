package collections;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer , String> hmap = new HashMap<Integer , String>();
		hmap.put(101 , "Sakshi");
		hmap.put(103, "Mayur");
		hmap.put(111, "Rushi");
		hmap.put(120, "Rahul");
		
		System.out.println(hmap);
		
//		Set<E> set = hmap.entrySet();
//		Iterator itr = set.iterator();
		
		Iterator itr = hmap.entrySet().iterator();
		
//		Iterable itr = hmap.entrySet();
		
		//Map.Entry Interface provides certain methods to access the entry
		// in the Map . By gaining the access of the entry of the map
		// we can easily manipulate them.
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			Map.Entry mentry = (Entry) itr.next();
			
			System.out.println("Key : " + mentry.getKey());
			System.out.println("value : " + mentry.getValue());
			
		}
		
		//get values based on key 
		String val=hmap.get(103);
		System.out.println("Values mapped with key" + val);
		
		//remove values based on key
		System.out.println("Removing using Key : " + hmap.remove(103));
		
		System.out.println();
		
		//printing using for each
		for(Map.Entry me : hmap.entrySet()) {
			System.out.println("Key : " + me.getKey() );
			System.out.println("Value : " + me.getValue());
		}
		
		System.out.println();

		//sorting hash map acc. to keu using TreeMap
		TreeMap<Integer , String> tmap = new TreeMap<Integer , String>(hmap);
		
		System.out.println("After sorting : ");
		
		for(Map.Entry me : tmap.entrySet()) {
			System.out.println("Key : " + me.getKey());
			System.out.println("Value : " + me.getValue());
			
		}
		
		//to check size of hashMap
		System.out.println("Size of Hashmap : " + hmap.size());
		
		//to check size of tree map
		System.out.println("Size of tree Map : " + tmap.size());
		
		System.out.println();
		
		hmap.clear(); //clear all the datas
		
		System.out.println("Empty ? -> " + hmap.isEmpty());
		System.out.println(hmap);
		
		
		
	}

}
