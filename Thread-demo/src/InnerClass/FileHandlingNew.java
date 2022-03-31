package InnerClass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingNew {
	public static void main(String[] args) {
		readfile("input.txt");
		readfile("input1.txt");
	}
	
	private static void readfile(String filename) {
		File file = new File(filename);
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
