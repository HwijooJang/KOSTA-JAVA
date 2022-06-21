package d0621_05_Test;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class PracTest1 {

	public static void main(String[] args) {
		List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
		
		names.stream().filter(n -> n.compareTo("이") < 0).forEach(n -> System.out.print(n + " "));
		
		System.out.println();
		
		names.stream().sorted().forEach(s -> System.out.print(s + " "));
		
		System.out.println();
		
		Optional<String> result = Optional.of("홍길동");
		System.out.println(result);
		result.stream().forEach(s -> System.out.println(s));
		
        System.out.println(names.stream().count());
		
	}

}
