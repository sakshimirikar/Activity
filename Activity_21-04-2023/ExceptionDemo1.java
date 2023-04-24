

package ExceptionHandling;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		
//		int arr[] = new int[5];
//		arr[10] = 50; //ArrayIndexOutOfBoundsException
		
//		String str = null;
//		System.out.println(str.length()); //NullPointerException
		
//		int x=3/0; //ArithmeticException
//		System.out.println(x); 
		
//		String s1="hi";
//		
//		int y = Integer.parseInt(s1);  //NumberFormatException
//		System.out.println(y);
		
		try {
			int arr1[] = new int[5];
			arr1[10]=50;
			
			int x1=50/0;
			System.out.println("The value of x1 is : " + x1 );
//			String str=null;
//			System.out.println(str.length());
			
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e.getMessage());
//			System.out.println("Please Check the Index of the Array.");
			
		}
		catch(ArithmeticException e) {
			
			System.out.println(e.getMessage());
//			System.out.println("Value cannot be divided by zero ! ");
		}
		
		//Exception is like the parent class which contains all of the exceptions
		//if you do not know which exception is to be used we can simply do as below
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Rest of code");
		int a=10 , b=20;
		System.out.println("Addition : " + (a+b));
	
	}

}
