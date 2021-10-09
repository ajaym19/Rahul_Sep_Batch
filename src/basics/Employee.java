package basics;

public class Employee {

	int empId;
	String empName;
	String dept;
	static String companyName;
	
	
	public void m1() {
		int a = 0;
		System.out.println(a);
		System.out.println(empId);
	}
	
	public void m2() {
		//System.out.println(a); we cannot access local variables outside the scope
		System.out.println(empId);
		System.out.println(companyName);
		//can I call m3?
		System.out.println(" I am in m2 Method");
		m3();
	}
	
	public static void m3() {
		System.out.println(companyName);
		System.out.println(" I am in m3 Method");
		m4();
		//can I call m2?
		//if I want to call m2?
		//m2();
	}
	
	public static void m4() {
		System.out.println(" I am in m4 Method");
	}
}
