package CollectionsDemo;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		/*
		 * is a class
		 * implementing Set Interface
		 * order is not maintained
		 * random order
		 * duplicates are not allowed
		 */
		
		HashSet<String> set = new HashSet<>();
		set.add("Apple");
		set.add("Mango");
		set.add("Banana");
		set.add("O");
		set.add("Y");
		System.out.println(set);
		HashSet<Integer> ids = new HashSet<>();
		ids.add(101);
		ids.add(104);
		ids.add(102);
		System.out.println(ids);
		
		set.add("Y");
		System.out.println(set);
		/*
		 * Convert arraylist to array
		 * convert array to arraylist
		 * sort ascending a collection object
		 * sort descending a collection object
		 * 
		 */
	}
}
