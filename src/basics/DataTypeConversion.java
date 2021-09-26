package basics;

public class DataTypeConversion {

	public static void main(String[] args) {
		
		/*
		 * there are chances that the representation of the data might be different in different project
		 * sometime we may have to assign data of one type to another
		 * 
		 * Big Bucket Theory:
		 * Bucket1 >> capacity >> 3L
		 * Bucket2 >> capacity >> 5L
		 * Bucket1 to Bucket2 >> Geetika says Yes
		 * Bucket2 to Bucket1 >> Prabhat
		 * 
		 * Smaller bucket to bigger >> No Problem
		 * Bigger bucket to smaller >> problem
		 * 
		 * casting is used
		 */
		
		int i1 = 45;
		long l1 = i1;
		
		
		long l2 = 456; //external project
		int i2 = (int) l2; 
		
		float f1 = 45.65f;
		int i3 = (int) f1;
		System.out.println(f1);
		System.out.println(i3);
		
		//double to float
		//short to  long
		//float to short
		
		//int to char
		int i4 = 66;
		char c4 = (char) i4;
		System.out.println("Integer value is " + i4);
		System.out.println("Character value is " + c4);
		
		//char to int
		char c5 = 'B';
		int i5 = c5;
		System.out.println("Integer value is " + i5);
		System.out.println("Character value is " + c5);
		
		
		//int to string
		int i6 = 123;
		String s1 = Integer.toString(i6);
		System.out.println("Integer is "+i6);
		System.out.println("String is "+s1);
		System.out.println(1+2); //3
		System.out.println(i6+10); //133
		System.out.println(s1+10); //123+10, 133, 12310
		
	
		//String to int
		String s2 = "123";
		//Float.parseFloat(s)
		//Float.toString(f)
		int i7 = Integer.parseInt(s2);
		System.out.println("Integer is "+i7); //
		System.out.println("String is "+s2);
		//string primt examples
		
		/*
		 * HW:
		 * convert below data types to each other
		 * byte, short, int, long, float, double
		 * 
		 * chat to others and others to char
		 * 
		 * string to others and others to string
		 */
		
		
		System.out.println("Ajay"+10);  //ajay10
		System.out.println(5+"Ajay"+10); //5ajay10
		System.out.println(10+20+"Ajay"+10); //30ajay10
		System.out.println("Ajay" + 10 + "Mishra"); //ajay10mishra
		
	}
}
