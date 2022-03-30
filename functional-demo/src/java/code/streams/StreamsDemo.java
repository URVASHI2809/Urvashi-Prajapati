package java.code.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(-1);
		
		Stream<Integer> stream = list.stream();
		Stream filtered = stream.filter(new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer arg0) {
				System.out.println(arg0);
				return arg0>0;
			}
		});
		List<Integer> finalvalue= (List<Integer>) filtered.collect(Collectors.toList());
		System.out.println(finalvalue);
	}
}
