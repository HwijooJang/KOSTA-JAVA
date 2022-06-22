package d0622_02_MapStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo3 {
	
	public static void main(String[] args) {
		List<String> list1 = List.of("안녕", "자바!", "잘 가", "C++"	);
		Stream<String> s1 = list1.stream();
		// System.out.println(Arrays.asList(list.get(0).split(" ")));
		Stream<String> s2 = s1.flatMap(s -> Arrays.stream(s.split(" "))); // 문장으로 구성된 스트림에서 단어를 뽑아 단어로 구성된 스트림을 구성
		                 // 그룹 원소를 낱개 원소로 펼치는 평면화 작업을 수행
		s2.forEach(Util::PrintWithParenthesis);
		System.out.println();
		
		List<String> list2 = List.of("좋은 아침");
		List<String> list3 = List.of("안녕! 람다", "환영! 스트림");
		
		Stream<List<String>> s3 = Stream.of(list1, list2, list3);
		Stream<String> s4 = s3.flatMap(e -> {
			if(e.size() > 1) return e.stream();
			else return Stream.empty();
		});
		s4.forEach(Util::PrintWithParenthesis);
		
	}

}
