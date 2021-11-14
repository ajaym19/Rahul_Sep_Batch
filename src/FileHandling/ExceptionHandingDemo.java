package FileHandling;

import java.io.FileReader;

public class ExceptionHandingDemo {

	public static void main(String[] args) {
		/*
		 * Exception: Anything which is hampering your normal flow of execution is
		 * called as Exceptiopns Exception Types: 1. Compile Time 2. Run Time
		 * 
		 */

		String name = null;
		System.out.println(name);
		// System.out.println(name.length());

		int[] id = { 1, 2, 3 };
		// System.out.println(id[5]);

		int divisor = 0;
		try {
			System.out.println(4 / divisor);
		} catch (Exception e) {
			System.out.println("Found some exception");
		}

		System.out.println("I was able to execute as exception was caught");

		/*
		 * Connect to DB read the data close the connection
		 * 
		 * try: any risky code will come here catch: if there is an exception, this code
		 * will be executed finally: this will be executed every time
		 * 
		 */

		try {
			String filePath = "./src/FileHandling/TestData12";
			FileReader reader = new FileReader(filePath);
			System.out.println("Reading from remote file");
		} catch (Exception e) {
			System.out.println("Trying to read data from local file");

		} finally {
			System.out.println("Closing the Connections");
		}

	}
}
