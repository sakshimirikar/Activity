
package collections;

import java.util.*;



public class ComparatorDemo{

	public static void main(String[] args) {
		
		ArrayList<Student> alist = new ArrayList<Student>();
		
		//Student st1 = new Student(101 , "Sakshi" , 1);
		 
		
		//alist.add(st1);
		
		alist.add(new Student(101 , "Aishwarya" , 1));
		alist.add(new Student(105 , "Vishal" , 23));
		alist.add(new Student(109 , "Darshan" , 9));
		
		Collections.sort(alist , new NameComparator());
		
		Iterator itr = alist.iterator();
		System.out.println("Sorting using name : ");
		
		while(itr.hasNext()) {
			Student s = (Student) itr.next();
			System.out.println(s.id + " " + s.name + " " + s.roll);
		}
		
		System.out.println();
		
		
		System.out.println("Sorting using roll no. : ");
		Collections.sort(alist , new RollComparator());
		
		Iterator itr1 =alist.iterator();
		
		while(itr1.hasNext()) {
			Student s = (Student) itr1.next();
			System.out.println(s.id + " " + s.name + " " + s.roll);
			
		}
		
        System.out.println();
		
		
		System.out.println("Sorting using ID  : ");
		Collections.sort(alist , new IdComparator());
		
		Iterator itr2 =alist.iterator();
		
		while(itr2.hasNext()) {
			Student s = (Student) itr2.next();
			System.out.println(s.id + " " + s.name + " " + s.roll);
			
		}
	
	}

}

//seperate class NameComparator
package collections;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {


	@Override
	public int compare(Student o1, Student  o2) {
		
		return o1.name.compareTo(o2.name);
	}
}

//seperate class RollComparator
package collections;

import java.util.Comparator;


public class RollComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

        if(o1.roll == o1.roll)
        	return 0;
        else if ( o1.roll > o2.roll )
        	return 1;
        
        else 
        	return -1;
        
	}

}

//seperate class IdComparator
package collections;

import java.util.Comparator;


public class IdComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		if(o1.id == o2.id)
			return 0;
		else if (o1.id>o2.id)
			return 1;
		else
			return -1;
	}
	
	
	

}
