package basics;

public class Application_Employee {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.empName = "Ajay";
		
		
		Employee e2 = new Employee();
		e2.empName = "Richa";
		
		
		System.out.println("E1 Employee name is "+e1.empName);
		System.out.println("E1 Company Name is "+e1.companyName);
		System.out.println("E2 Employee name is "+e2.empName);
		System.out.println("E2 Company Name is "+e2.companyName);
		
		//accessing static variables using class name
		System.out.println(Employee.companyName);
		
		e1.companyName= "TCS";
		System.out.println(e1.companyName); //TCS
		System.out.println(e2.companyName); //TCS
		e2.companyName= "IBM";
		System.out.println(e1.companyName); //IBM
		System.out.println(e2.companyName); //IBM
		
		
		System.out.println(e1.dept); //null
		e1.dept = "HR";
		System.out.println(e1.dept);//HR
		System.out.println(e2.dept); //null
		e2.dept = "IT";
		System.out.println(e1.dept); //HR
		System.out.println(e2.dept); //IT
		System.out.println("-----------------");
		e1.m2();
		e1.m3();
		Employee.m3();
		
	}

}
