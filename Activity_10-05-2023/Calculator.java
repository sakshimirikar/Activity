
package com.junit;


public class Calculator {
	
	int fact=1;
	
	public int addition(int a , int b) 
	{
		return a+b;	
	}
	
	public int additionwithPositive(int a , int b) 
	{
		return a+b;	
	}
	public int additionwithNegative(int a , int b) 
	{
		return a+b;	
	}
	public int division(int a , int b) 
	{
		return a/b;	
	}
	public int multiplication(int a , int b) 
	{
		return a*b;	
	}
	
	public int subtraction(int a , int b)
	{
		return a-b;
	}
	
	public int factorial(int a)
	{
		while(a !=0) {
			fact=fact*a;
			a--;
		}
		
		return fact;
	}
	
	public int maxValue(int arr[]) {
		

        if (arr.length <= 0) {
            throw new IllegalArgumentException("Array is empty.");
        }
		
		
		int max=arr[0];
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
			
		return max;
	}

	
//	public void method1() {
//		Student st = new Student(101 , "Sakshi");
//		st.setId(111);
//		st.getId();
//		
//		
//	}


	
}
