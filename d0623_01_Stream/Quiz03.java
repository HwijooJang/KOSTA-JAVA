package d0623_01_Stream;

import java.util.stream.Stream;

public class Quiz03 {
	
	public static void main(String[] args) {
		
		long count = Dish.menu.stream().count();
		System.out.println(count);
		
		int count2 = Stream.of(1,1,1,1,1,1,1,1,1,1).reduce(0, Integer::sum);
		System.out.println(count2);
		
		int count3 = Dish.menu.stream()
				.map(d -> 1).reduce(0, Integer::sum);
		System.out.println(count3);
		
	}

}
