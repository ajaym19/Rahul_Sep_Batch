package StringsDemo;

public class StringsDemo {

	public static void main(String[] args) {

		/*
		 * String String is a non primitive data type String is a class String is a
		 * final class We cannot modify/update the objects of final class String Objects
		 * are immutable
		 * 
		 * String Builder its objects are mutable
		 * 
		 * String Buffer
		 * 
		 * Builder vs buffer
		 * Builder support MultiThreading
		 * Buffer does not support Multi threading
		 * 
		 * Builder is fast compared to Buffer
		 * Buffer is thread safe and builder is not
		 * 
		 * 
		 */

		int id = 2;
		System.out.println(id); // 2
		id = 4;
		System.out.println(id); // 4
		String name = "Ajay";
		System.out.println(name); // Ajay
		name = name.concat(" Trainer");
		System.out.println(name); // AjayTrainer

		StringBuilder builder = new StringBuilder("Hello");
		System.out.println(builder); // Hello
		builder.append(" World");
		System.out.println(builder); //
		System.out.println(builder.reverse());
		System.out.println(builder.length());

		StringBuffer buffer = new StringBuffer("Core");
		buffer.append("Java");
		System.out.println(buffer);
		
		//reverse a string without using inbuilt method

		String s1 = "Ajay";
		String s2 = new String("Ajay");
		
		//== compares the object reference
		//are these 2 varaibles poiting to same object?
		// .equals method checks the value of the string
		
		System.out.println("Comparing with == "+s1 == s2);
		System.out.println("Comparing with .equals "+s1.contentEquals(s2));
		
		int a = 10;
		int b = 10;
		System.out.println(a == b);
		
		
		for (int i = 1; i <= 10; i++) {
			
			
		}
		
	}
}
