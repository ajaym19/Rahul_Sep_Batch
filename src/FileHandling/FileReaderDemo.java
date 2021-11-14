package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		String filePath = "./src/FileHandling/TestData12";
		FileReader reader = new FileReader(filePath);
		//System.out.println((char)reader.read());
		//h >> 72
		//reads a single character
		int i;
		while((i = reader.read()) != -1) {
			System.out.print((char)i);
		}
		
		FileWriter writer = new FileWriter(filePath);
		writer.write("Ajay");
		writer.close();
	}
}
