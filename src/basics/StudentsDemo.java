package basics;

public class StudentsDemo {

	// properties in java are defined as variables
	int studentId;
	String studentName;
	int standard;
	char division;
	int rollNo;
	String bloodGroup;
	String address;

	// behavior in java are defined as Methods
	// accessmodifiers, static or instance, return type, name
	public void learn() {
		System.out.println("Students are learning");
	}

	public void doExercise() {
		System.out.println("Students are doing exercise");
	}

	
	public void giveExams() {
		System.out.println("Students are giving exams");
	}
	
	//method with no parameters and no return type
	public void showInfo() {
		System.out.println("Printing some information");
	}
	
	//method with  paremters and no return type
	public void sum(int num1, int num2) {
		int total = num1 + num2;
		System.out.println(total);
	}
	
	public int add3numbers(int a, int b, int c) {
		int total = a+b+c;
		return total;
		
	}
	
	public String returnlengthofString(String name) {
		return name.concat("Ajay");
	}

}
