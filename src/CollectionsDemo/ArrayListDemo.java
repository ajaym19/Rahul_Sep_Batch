package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		/*
		 * ArrayList
		 * is a class
		 * implementing List Interface
		 * to store multiple elements
		 * internally it is same as array
		 * but with dynamic in size
		 * 
		 * 1. Insertion Order is maintained
		 * 2. Duplicates are allowed
		 */
		
		

		ArrayList<Integer> list = new ArrayList<>();
		
		//how to add elements
		list.add(101);
		list.add(102);
		list.add(108);
		list.add(118);
		list.add(103);
		list.add(103);
		//list.add("sdff");
		list.add(1, 103);
		System.out.println(list);
		System.out.println("Size of the Array is "+list.size());
		//list.remove(10); will give an error
		System.out.println(list);
		
		//how to remove elements
		list.remove(3);
		System.out.println(list);
		
		//add all elements of new list to original list
		ArrayList<Integer> newList = new ArrayList<>();
		newList.add(201);
		newList.add(208);
		newList.add(204);
		
		//way1: u have to do
		//way 2: i will do
		
		//list.addAll(newList);
		list.addAll(1, newList);
		System.out.println(list);
		
		//how to get single element
		System.out.println(list.get(2));
		
		
		//for loop
		System.out.println("Printing each element using for loops");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//for each
		System.out.println("Using for each ");
		for(Integer a : list) {
			System.out.println(a);
		}
		
		System.out.println(list);
		System.out.println(list.isEmpty());
		//list.clear();
		System.out.println(list.isEmpty());
		System.out.println(list);
		System.out.println(list.contains(208));
		list.removeAll(newList);
		
		//check how many elements ar4e duplicate in list
		//Ip = {23,23,23,44,44,5,6,7,7}
		//OP = 3
		
		
		
		//List<Integer> l1 = new List<Integer>();
		ArrayList< Integer> l2 = new ArrayList<>();
		List<Integer> l3 = new ArrayList<>();
		
		
		/*
		 * Interface: 2 methods
		 * Class: 2 methods:
		 * Interface obj = new class
		 * class obj = new class
		 */
		
		System.out.println("Learning using Iterator");
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//webdriver = new firefoxdriver();
		
		
	}
}
