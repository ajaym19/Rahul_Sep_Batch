package LoopingConcept;

public class LoopingDemo {

	public static void main(String[] args) {

		// anything which has to be done again and again
		// can be achieved by using loops

		/*
		 * for loop has 3 paramters initialization, starting point conditions, where to
		 * stop increment/decrement i++ is same as i = i+1;
		 * 
		 * if the condition does not meet, it will come out of the for loop
		 */

		// print from 1 to 10

		// print your name 10 times
		// how many times? 10 times
		// 0 to 7, exclusing 7?
		// 10 to 4
		for (int i = 10; i >= 4; i--) {
			// System.out.println(i);
		}

		// print 1 to 10, skipping one value
		// 1, 3, 5, 7, 9

		for (int i = 1; i <= 10; i++) {
			// System.out.println(i);
			i++;
		}

		// 1 to 10, but if 6 is printed, stop

		for (int i = 1; i <= 10; i++) {
			// System.out.println(i);

			// conditional statements

			if (i == 6) {
				break;
			}

		}

		/*
		 * print 1 to 10 if i = 2: print ajay if i = 3: print shilpi if i = 7: print
		 * Richa if i = 9: print Kamlesh
		 * 
		 * if you print Richa , you cannot proceed furhter
		 */

		for (int i = 1; i <= 10; i++) {

			if (i == 2) {
				// System.out.println("Ajay");
			} else if (i == 3) {
				// System.out.println("Shilpi");
			} else if (i == 7) {
				// System.out.println("Richa");
				break;
			} else if (i == 9) {
				// System.out.println("Kamlesh");
			} else {
				// System.out.println(i);
			}
		}

		// sometimes there is a contion
		// you dont know how many elements are presetn
		// what is the upper limit
		// 10 students
		// peon
		// while loop is used in such cases
		// IT KEEPS on executing till it gets true
		// first it checks the condition and then proceeds

		// 1 to 10
		int i = 11;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		int j = 15;
		while (j == 5) {
			// System.out.println("Ajay");
		}

		// do-while loop
		// it first executes and then check the condition
		int z = 21;
		do {
			// System.out.println("Z value is " + z);
			z--;
		} while (z > 2);

		/*
		 * Print days based on day value 1 = MOnday 2 = Tuesday 7 = Sunday
		 */

		// cases where the conditions are more
		// we go for switch

		int day = 9;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Please enter value between 1-7");
		}
		
		
		/*
		 * for each
		 * iterators
		 */
		
		/*
		 * 1. print numbers from 1 to 10;
		 * if its even print even
		 * if odd print odd
		 * 
		 * Print a Menu
		 * 
		 * 1: Indian 
		 * 2: Italian
		 * ask user for some menu number
		 * and print the corresponsing name
		 * if user enters something else
		 * give warning message
		 * 
		 * print below pattern
		 * 
		 *  *
		 *  * *
		 *  * * *
		 *  * * * *
		 *  * * * * *
		 *  
		 *  
		 *  2 ways
		 *  1. copy the code from google and execute
		 *  2. understand the logic and write on own
		 * 
		 */
		
	}

}
