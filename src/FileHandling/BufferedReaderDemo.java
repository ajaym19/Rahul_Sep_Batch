package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		String filePath = "./src/FileHandling/TestData12";
		FileReader reader = null;
		try {
			reader = new FileReader(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to read the file! Please check the file name and location!");
		}
		
		//System.out.println(br.readLine());
		String line;
		try {
			BufferedReader br = new BufferedReader(reader);
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Not able to read the file!");
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Received Null Values");
		}
	}
	//Apache POI
}
