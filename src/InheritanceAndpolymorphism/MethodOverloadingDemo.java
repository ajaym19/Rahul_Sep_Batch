package InheritanceAndpolymorphism;

public class MethodOverloadingDemo {

	/*
	 * Method Overloading can be achieved by 2 ways 1. Different number of
	 * parameters 2. same parameters with diff data types
	 * 
	 * 3. return type: not possible
	 */

	public void sum(int a, int b) {
		System.out.println("Adding 2 int numbers");
	}

	public void sum(int a, int b, int c) {
		System.out.println("Adding 2 int numbers");
	}

	public void sum(float a, float b, float c) {
		System.out.println("Adding 2 int numbers");
	}

	
}
