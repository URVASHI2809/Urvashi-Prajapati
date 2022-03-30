import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> names = new TreeSet<>(); //set don't save elements in a particular order.
		for(int i=0; i<100; i++) {
			names.add("Ram" +i);
		}
		names.add("Ram0");
		System.out.println(names);
	}

}
