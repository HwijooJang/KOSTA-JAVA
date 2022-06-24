package d0623_02_Quiz;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import d0623_01_Stream.Dish;

public class Reducing {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3,4,5,1,2);
		
		int sum = numbers.stream().reduce(0, (a,b) -> a+ b);
		System.out.println(sum);
		
		int sum2 = numbers.stream().reduce(0, Integer::sum);
		System.out.println(sum2);
		
		int max = numbers.stream().reduce(0, (a, b) -> Integer.max(a, b));
		Optional<Integer> min = numbers.stream().reduce(Integer::min);
		System.out.println(max);
		System.out.println(min.get());
		
		int cal = Dish.menu.stream()
				.map(Dish::getCalories).reduce(0, Integer::sum);
		System.out.println(cal);
	}

}
