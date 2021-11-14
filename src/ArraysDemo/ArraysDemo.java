package ArraysDemo;

public class ArraysDemo {

	public static void main(String[] args) {
		/*
		 * Arrays:
		 * used to store multiple values
		 * of similar data type
		 * 
		 * 3 parts:
		 * Declaration
		 * Instantiation
		 * Initialization
		 * 
		 */
		
		int[] id; //Declaration
		id = new int[5]; //Instantiation
		System.out.println(id[2]);
		
		id[2] = 3;//Initialization
		System.out.println(id[2]);
		
		//Declaration and Instantiation
		int[] id1 = new int[5];
		id1[2] = 34;
		
		
		//Declaration and Instantiation and Initialization
		int[] id2 = {23,34,12};
		
		id[4] = 500;
		System.out.println(id[4]);
		//System.out.println(id[5]); this will give an exception
		
		System.out.println(id.length);
		
		/*
		 * HW:
		 * find the largest element of array
		 * find the second largest element of array
		 * find the first and second largest element of array
		 * 
		 * given an array of 0 and numbers, bring all 0 in start
		 * 
		 * ip: [2,0,13,0,5,0,8,0,0]
		 * op: [0,0,0,0,0,2,13,5,8]
		 */
		
		for(int i =0; i<id.length; i++) {
			System.out.println(id[i]);
		}
		
		//foreach
		for(int a:id) {
			System.out.println(a);
		}
		
		String[] fruits = {"Apple", "Orange", "Mango"};
		
		
		
		
		
		
		
		
		
	}
}
