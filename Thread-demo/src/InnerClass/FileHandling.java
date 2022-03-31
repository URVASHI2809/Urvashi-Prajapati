package InnerClass;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) throws IOException {
		readfile();
	}
	private static void readfile() throws IOException{
		FileReader reader = new FileReader("input.txt");
		BufferedReader bufferedReader = new BufferedReader(reader);
		String line = bufferedReader.readLine();
		System.out.println(line);
}
}
