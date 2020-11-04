package javaeightexamples;

import java.util.ArrayList;

public class JavaEightExample {

	public static void main(String args[]) {
//		Operation op = (int x)->x*x;
//		System.out.println(op.operation(10));
//		
//		Operation cube = (int x)->x*x*x;
//		System.out.println(cube.operation(10));
		
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		//list.stream().map(x -> x*x).collect(Collectors.toList()).forEach(n -> System.out.println(n));
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Shaleen");
		names.add("Vamshi");
		names.add("Vaibhav");
		
		//names.stream().filter(name -> name.startsWith("V")).collect(Collectors.toList()).forEach(n -> System.out.println(n));

		int n = list.stream().reduce(1,(ans,i)-> ans*i);
		System.out.println(n);
	}
}
