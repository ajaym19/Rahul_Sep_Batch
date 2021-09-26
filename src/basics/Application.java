package basics;

public class Application {

	//this area, you can only delcare variables
	//and constructors
	//and methods
	
	public static void main(String[] args) {
		//how to create an object of a class
		int studentId = 10;
		StudentsDemo std1 = new StudentsDemo();
		System.out.println(std1.studentName);
		std1.studentName = "Ajay";
		System.out.println(std1.studentName);
		System.out.println(std1.studentId);
		std1.studentId = 1;
		System.out.println(std1.studentId);
		System.out.println(studentId);  //10
		
		StudentsDemo std2 = new StudentsDemo();
		System.out.println(std2.studentName);
		
		std1.doExercise();
		std1.showInfo();
		int num1 = 10;
		int num2 = 20;
		std1.sum(num1, num2);
		int total = std1.add3numbers(1, 2, 3);
		System.out.println(total);
		String length = std1.returnlengthofString("Ajay");
		System.out.println(length);
		
		
		
	}
}
