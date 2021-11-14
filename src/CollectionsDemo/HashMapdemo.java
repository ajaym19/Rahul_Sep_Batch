package CollectionsDemo;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapdemo {

	/*
	 * HashMap
	 * is a class
	 * implementing Map Interface
	 * HashMap stores key and value pair
	 * A key and value together is called as a Bucket/Entry
	 * Collection of Entry is called as EntrySet
	 * 
	 * Rules:
	 * 1. Keys are always unique
	 * 2. Duplicate keys are not allowed
	 * 3. If u enter duplicate key, it will work as an Update
	 * 4. Only one null is allowed as a key
	 * 5. Duplicate Values are allowed
	 * 6. Multiple null values are allowed
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Ajay");
		map.put(2, "Rahul");
		map.put(3, "Nikhil");
		//map.put(3, "Nikhil-updated");
		map.put(null, "ABC");
		//map.put(null, "ABC123");
		System.out.println(map);
		map.put(4, "Ajay");
		map.put(5, null);
		map.put(6, null);
		System.out.println(map);

		System.out.println(map.containsKey(134));
		System.out.println(map.containsValue("Ajay"));
		System.out.println(map.keySet());
		System.out.println(map.putIfAbsent(12, "Kabir"));
		map.putIfAbsent(12, "Kabir");
		map.putIfAbsent(12, "Kabir123");
		System.out.println(map.putIfAbsent(12, "Kabir123"));
		System.out.println(map);
		
		map.remove(1);
		System.out.println(map);
		System.out.println(map.size());
		
		System.out.println("learning for loop");
		for(int i =0; i < map.size(); i++) {
			System.out.println(map.get(i));
		}
		System.out.println(map.entrySet());
		
		for(Entry<Integer, String> a : map.entrySet()) {
			System.out.println("Key is " + a.getKey() + " value is "+ a.getValue());
			
		}
		
		System.out.println("learning using iterator");
		
		
		
		
	}
}
