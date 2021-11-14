package InheritanceAndpolymorphism;

public class Application {

	public static void main(String[] args) {
		ParentDemo objParent = new ParentDemo();
		objParent.showInfo();
		
		
		//Object Class
		ChildDemo objChild = new ChildDemo();
		objChild.showInfo();
		objChild.childM1();
		objChild.parentM1();
		
		Class9 obj = new Class9();
		obj.browserSetUp();
		
		MethodOverloadingDemo objOverloading = new MethodOverloadingDemo();
		objOverloading.sum(10, 20);
		objOverloading.sum(1, 2, 3);
		int num1 = 2;
		int num2 = 3;
		int num3 = 4;
		
		
		
	}
}
