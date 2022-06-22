package d0621_05_Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracTest2 {
	public enum Gender{
		남, 여
	}
	public static void main(String[] args) {
	
		List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);
		List<Gender> genders = List.of(Gender.남, Gender.여, Gender.남, Gender.남, Gender.남, Gender.여);
		
		int sum1 = ages.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum1);
	    
		System.out.println(ages.stream().max((x, y) -> x.compareTo(y)).get());
		
		System.out.println(ages.stream().collect(Collectors.averagingDouble(x -> x.doubleValue())));
		
	}
}
