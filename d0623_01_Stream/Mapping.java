package d0623_01_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import d0623_01_Stream.Dish;

public class Mapping {

	public static void main(String[] args) {

		java.util.List<String> dishNames = Dish.menu.stream().map(dish -> dish.getName()).collect(Collectors.toList());
		
		System.out.println(dishNames);
		System.out.println();
		
		List<String> words = Arrays.asList("Hello", "World");
		List<Integer> wordLengths = words.stream().map(w -> {return w.length();}).collect(Collectors.toList());
		
		System.out.println(words);
		System.out.println(wordLengths);
	    System.out.println();
		
	// 카디널리티 (Cardinality)
		words.stream().map(w -> w.split(" ")).distinct()
		.forEach(e -> {for(String w : e) System.out.println(w + " "); System.out.println();
		});
	
		words.stream().map(w -> w.split(" ")).flatMap(w -> Arrays.stream(w))
		.distinct().forEach(e -> System.out.println(e + " "));
		
		
		List<Integer> number1 = Arrays.asList(1,2,3,4,5);
		List<Integer> number2 = Arrays.asList(6,7,8);
		List<int[]> paris =
		number1.stream()
		.flatMap((Integer i) -> number2.stream().map((Integer j) -> new int[] {i,j}))
		.collect(Collectors.toList());
		
		System.out.println(paris.size());
		System.out.println(paris.get(0)[1]);
		
		for(int[] e : paris) {
			System.out.println(e[0] + " : " + e[1]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
