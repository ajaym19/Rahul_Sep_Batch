package basics;

public class Application_Constructor {

	public static void main(String[] args) {
		
		ConstructorsDemo obj = new ConstructorsDemo();
		obj.printValues();
		ConstructorsDemo obj1 = new ConstructorsDemo(1, "AJay");
		obj1.printValues();
		
	}
}
