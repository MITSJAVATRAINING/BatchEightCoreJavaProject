package OopsConcepts;

public class PolymorphismDemo {

	/**
	 * Polymorphism :- It is representation of data in more than one form.
	 * 
	 * two types :-
	 * 
	 * 1) Method Overloading  or static polymorphism or compile time polymorphism
	 * 2) Method Overriding or dynamic polymorphism or run time polymorphism
	 * 
	 * 
	 * Abstraction :- Hiding details 
	 * 
	 * Encapsulation :- Wrapping of data and behaviour into a single unit.
	 * 
	 * 
	 * Inheritance :- 
	 * 
	 * **/
	
	private int substract(int a, int b) {
		return a-b;
	}
	public int sum(int a, int b) {
		return a+b;
	}
	
	public int sum(int a, int b, int c) {
		return a +b + c;
	}
	
	public static void main(String[] args) {
		PolymorphismDemo obj = new PolymorphismDemo();
		System.out.println(obj.sum(10, 20));
		System.out.println(obj.sum(10, 20, 30));
	}
}
