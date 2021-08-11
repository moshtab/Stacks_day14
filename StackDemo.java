package day14_Stack;


public class StackDemo {

	public static void main(String[] args) {
		System.out.println("Welcome to the Stacks Computation Problem");
		
	    Stack<String> stack = new Stack<>(3);
		stack.push("70");
		stack.push("30");
		stack.push("56");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
}



}
