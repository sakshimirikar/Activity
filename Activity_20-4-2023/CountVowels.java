

package Srings;

import java.util.Scanner;

public class CountVowels {
	
//	public static int countVowel(char[] arr)
	public static int countVowel(String str){
          int count=0;
          
//          for(int i=0 ; i<arr.length ; i++)
          for(int i=0 ; i<str.length(); i++) {
        	  char c=str.charAt(i);
        	  
//        	  char c = arr[i];
        	  
        	  if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
        		  count++;
        	  }
        	  
              //switch(c)
//        	  {
//        		  case 'A' :
//        		  case 'E' :
//        		  case 'I' :
//        		  case 'O' :
//        		  case 'U' :
//        			  count++;
//        			  break;
//        			  
//        		
//        	  }
        	  
          }
          return count;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String st=sc.nextLine().toLowerCase();
		
//		char[] ch=sc.nextLine().toLowerCase().toCharArray();
		
		System.out.println("No. of Vowels " + st + " is : " + countVowel(st));
//		System.out.println("No. of Vowels is : " + countVowel(ch));
		
		
		

	}

}
