import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaUsage {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(-5);
		list.add(15);
		
		list.forEach((Integer element) -> {
			System.out.println(element);
		});
		
		System.out.println("-----------------sorting---------------");
		
//		list.sort(new Comparator<Integer>() {
//		@Override
//		public int compare(Integer arg0, Integer arg1) {
//			return (arg0 - arg1);
//		}
//		});
		
		Comparator <? super Integer> sortLamda = (Integer arg1, Integer arg2) ->  arg1 - arg2;
		list.sort(sortLamda);
		System.out.println(list);
	}
	
}
