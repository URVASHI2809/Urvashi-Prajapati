package com.tata;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Optional;
	import java.util.stream.Stream;
	public class Streams {
	
		public static void main(String[] args) {
			List<Integer> list = new ArrayList<>();
			list.add(3);
			list.add(-1);
			list.add(10);
			Stream<Integer> s1 = list.stream();
			Stream<Integer> filtered = s1.filter((Integer arg0) -> arg0 > 0); 
				
			Optional<Integer> reduced = filtered.reduce((Integer previous, Integer current) -> previous + current);
				
			System.out.println(reduced.get());
			
//			List<Integer> finalvalue= (List<Integer>) filtered.collect(Collectors.toList());
//			System.out.println(finalvalue);
		}
	}

