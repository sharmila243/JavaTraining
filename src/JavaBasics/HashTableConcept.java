package JavaBasics;

import java.util.Hashtable;

public class HashTableConcept { ///Collection - Dynamic array

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		
		h.put("A", "test");
		h.put("B", "Hello");
		h.put("C", "World");

		System.out.println(h.size());
		
		h.put(1, 100);
		h.put(2, 200);
		
		System.out.println(h.get(2));
		System.out.println(h.get("B"));
		System.out.println(h.get(4)); //null value
		System.out.println(h.get("D")); //null value
		
		h.put(1, "Sharmila");
		
		System.out.println(h.get(1)); // Object value will be replaced 
		
		//if we want to restrict
		
		Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
		h1.put(1, 100);
		// h1.put(2, "Sharmila"); // not allowed

		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
		h2.put(1, "Sharmila");
		h2.put(2, "Bhargav");
		

		
		 
		
		
	}

}
