package collectionexamples;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String args[]) {
		
		Set<Integer> a = new HashSet<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(40);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(60);
		a.add(70);
		a.add(70);
		a.add(70);
		a.add(70);
		a.add(80);
		
		for (Integer x:a) {
			System.out.println(x);
		}
	}
}
