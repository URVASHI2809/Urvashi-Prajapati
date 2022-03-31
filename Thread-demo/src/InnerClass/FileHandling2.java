package InnerClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;


public class FileHandling2 {
	
		public static void main(String[] args) throws IOException {
			readfile();
			writefile("output.txt", "this is some text");
		}
		private static void readfile() throws IOException{
			FileReader reader = new FileReader("output.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line = bufferedReader.readLine();
			System.out.println(line);
	}
		
		private static void writefile(String file, String data) {
			
		}
}

