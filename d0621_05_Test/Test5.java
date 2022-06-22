package d0621_05_Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test5 {
	
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
		
		System.out.println(stream.collect(Collectors.averagingInt(n -> n.intValue())));
		
		System.out.println();
		
		System.out.println(stream.collect(Collectors.averagingInt(n -> n*n.intValue())));
		
		stream.map().collect(Collectors.joining("-"));
	}

}
