package d0621_04_StreamFilter;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapDemo1 {

	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("a1", "b1", "b2", "c1", "c2");
		// s1.map(e -> e.toUpperCase()).forEach(System.out::print ); // 람다식을 이용해서 s1에 들어있는 객체들은 대문자로 바꾸는 진행 작업
		s1.map(String::toUpperCase).forEach(Util::print);
		
		System.out.println();
		
		Stream<Integer> il = Stream.of(1, 2, 2, 3, 1, 4, 3, 4);
		il.map(n -> n * 2).forEach(Util::print);
		
		System.out.println();
		
		// s1.mapToInt(e -> ) // function을 이용해 int로 바꾸는 구문
		 
		Stream<String> s3 = Stream.of("a1", "a2", "a3");
		Stream<String> s4 = s3.map(s -> s.substring(1)); // 1 뒤로 있는 인덱스를 가져오는 구문
		// IntStream i3 = s4.mapToInt(e -> Integer.parseInt(e)); // s4의 객체들을 int로 바꾸는 구문이다. 
		IntStream i3 = s4.mapToInt(Integer::parseInt);          // mapToInt를 사용해 Integer.parseInt를 사용해 String -> Integer로 변경
		
		Stream<String> s5 = i3.mapToObj(i -> "b" + i); // i3에서 int로 변경된 객체들을 object로 바꾸는 구문이다. (String으로 cast 되었다.)
		s5.forEach(Util::print);     // 문자열 b를 IntStream의 객체에 결합하여 Stream<String>을 생성한다. (a -> b 변경)
		
	}
}
