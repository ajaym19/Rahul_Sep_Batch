package basics;

public class ConstructorsDemo {

	/*
	 * Constructors: are used to define or initialize values There is a default
	 * constructor always in built
	 * whenever an object is created, constructor is called
	 * 
	 * 
	 * Two types:
	 * 1. No Parameter/default: 
	 * 2. parametrized: with some paramters
	 */

	float id;
	String name;
	
	public ConstructorsDemo() {
		System.out.println("I am in no parameter constructor");
		
	}
	
	public ConstructorsDemo(int id, String name) {
		this.id = id;
		this.name = name;
	}



	public void printValues() {
		System.out.println(this.id);
		System.out.println(name);
	
	}
	
	
	
	

}
