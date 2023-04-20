package Srings;

public class StringBasics {

	public static void main(String[] args) {
		
		//create string using string literal
		//we use it mainly to save memory so
		//that new memories are not created for the same string
		
		String name="Sakshi";
		String name1="Sakshi"; //It dosen't create a new instance
		
		String str="Welcome";
		System.out.println(name=name1); // returns true
		
		//checking if name is same as str since it is different the o/p will return false
		System.out.println(name==str);
		
		//joining 2 strings using concat function
		name=name.concat(" Mirikar");
		System.out.println(name);
		
		System.out.println();
		String message="Good morning";
		
		int index=11;
		char ch = message.charAt(index);
		
		System.out.println(index + " th character : " + ch);
		
		//By using new keyword
		String str1 = new String("Welcome");
		String str2 = new String ("Welcome");
		
		System.out.println(str1==str2); //comparing the reference
		System.out.println(str1.equals(str2)); //comparision of values
		
		String s1="hello";
		String s2="hello";
		String s3="meklo";
		String s4="hemlo";
		String s5="flag";
		
		System.out.println(s1.compareTo(s2));//equal 0
		System.out.println(s1.compareTo(s3)); //-5
		System.out.println(s3.compareTo(s1));//5
		System.out.println(s1.compareTo(s4));//-1
		System.out.println(s1.compareTo(s5));//2
		
		System.out.println();
		
		//UpperCase
		String high ="king";
		System.out.println(high.toUpperCase());
		
		//LowerCase
		String low = "KING";
		System.out.println(low.toLowerCase());
		
		System.out.println();

		//String Buffer-mutable
		StringBuffer buffer = new StringBuffer("Hello Java"); //default capacity of String Buffer is 16
		System.out.println(buffer.capacity()); //27
		
		buffer.append("world this is a welcome message "); //appending or adding the string
		System.out.println(buffer);
		
		System.out.println(buffer.capacity()); //(27*2)+2 = 56
		System.out.println(buffer.charAt(4));
		
		System.out.println(buffer.indexOf("ello")); //checking the index of the word
		
		
	    //substring is used in two ways 
		//1) by giving the starting index it will print rest of the string
		
		System.out.println(buffer.substring(6));
		System.out.println();
		
		//2) by giving the start index and the end index -1 
		System.out.println(buffer.substring(6,10));
		System.out.println();

		//it will delete the string present in index(in our case it was Java)
		buffer.delete(6, 10);
		System.out.println(buffer);

		
		//String Builder
		StringBuilder builder = new StringBuilder("java 20");
		System.out.println("String Builder : " + builder);
		builder.append(" latest version");
		System.out.println(builder);
		System.out.println();
		
		builder.insert(7 ,  " is the"); //insert a string from the index which is provided
		System.out.println(builder);
		System.out.println();

		builder.reverse(); //to reverse your string builder
		System.out.println(builder);
		System.out.println();
		
		System.out.println(builder.indexOf("avaj")); //finding the position of avaj
		System.out.println();
		
		
		builder.replace(25, 29, "java"); //replacing avaj by java using index
		System.out.println(builder);
				

	}

}
