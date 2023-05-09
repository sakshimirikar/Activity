
package collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		
		System.out.println(stack.empty());
		
		stack.push(12);
		stack.push(57);
		stack.push(98);
		stack.push(85);
		stack.push(7);
		
		System.out.println("Original Stack : ");
		System.out.println(stack);
		
		System.out.println("Popping top element : " + stack.pop());
        
		System.out.println(stack);
		
		System.out.println();
		
		System.out.println("Position of 98 : " + stack.search(98));
		
		System.out.println("Top element : " + stack.peek());
		
		System.out.println(stack);
		

	}

}
