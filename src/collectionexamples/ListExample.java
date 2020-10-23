package collectionexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String args[]) { // default size of the array created is 10.
		List<Integer> a = new ArrayList<>(5);
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

		// System.out.println("Element stored at 4th index is "+ a.get(3));

//		for (Integer x: a) {
//			System.out.println(x);
//		}

		Iterator<Integer> iter = a.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
