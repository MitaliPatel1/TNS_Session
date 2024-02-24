package javacourse;

public class Stack_pop_push_empty_main {

	public static void main(String[] args) {
		Stack_pop_push_empty s = new Stack_pop_push_empty(5);
		System.out.println("Is the stack empty ? "+s.isEmpty());
		
		System.out.println("\n Input some elements on the stack :");
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.display();
		System.out.println("\n Top element of the stack :"+s.peek());
		System.out.println("\nRemove two element from the stack :");
		s.pop();
		s.display();
		System.out.println("\nTop element of the stack after popping : "+s.peek());
		System.out.println("\nIs the stack empty ? "+s.isEmpty());

	}

}
