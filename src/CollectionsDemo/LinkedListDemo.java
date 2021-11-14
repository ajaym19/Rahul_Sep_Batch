package CollectionsDemo;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1000);
		list.add(1005);
		list.add(1003);
		System.out.println(list);
		list.addFirst(12);
		list.addLast(120);
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		

	}
}
