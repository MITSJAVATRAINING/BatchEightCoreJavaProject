package collectionexamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String args[]) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Shaleen", 25);
		map.put("Vaibhav", 26);
		map.put("Ramesh", 27);
		map.put("Vamshi", 28);
		map.put("Ramesh", 29);
		
		System.out.println(map.get("Ramesh"));
		
		Set<String> a = map.keySet();
		
		for (String name: a) {
			System.out.println("Key is " + name + " and value is " + map.get(name));
		}
	}
}
