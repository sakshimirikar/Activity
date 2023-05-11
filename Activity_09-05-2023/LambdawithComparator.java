package java8Features;
import java.util.*;

class Person{
	int id;
	String name;
	
	public Person(int id , String name ) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
}


public class LambdawithComparator {

	public static void main(String[] args)
	{
		ArrayList<Person> persons = new ArrayList<Person>();
		
		persons.add(new Person(101 , "Vishal"));
		persons.add(new Person(109 , "Kalyani"));
		persons.add(new Person(110 , "Arun"));
		
        System.out.println("Sorting using Names : ");
        
        Collections.sort(persons , (p1,p2) -> 
        {
        	return p1.name.compareTo(p2.name);
        });
        
        //foreach loop was introduces in java8
        persons.forEach(
        		
        		(p) -> {System.out.println(p);}     		
        		
        		);
		
		
	}

}
