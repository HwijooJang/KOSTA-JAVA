package d0622_02_MapStream;

import java.util.Optional;
import java.util.stream.Stream;

import d0621_04_StreamFilter.Nation;
import d0621_05_Test.Nation.Type;

public class MatchDemo {

	public static void main(String[] args) {
		boolean b1 = Stream.of("a1", "b2", "c3").anyMatch(s -> s.startsWith("c"));
	                             // 맞는지 틀리는지 답을 해주는 명령어
	System.out.println(b1);
	
	boolean b2 = Stream.of(10, 20, 30).allMatch(n -> n%3 == 0);
	System.out.println(b2);         // 스트림의 모든 객체가 조건에 맞는지 확인한다. 하나라도 틀리면 false를 뱉어내고 anyMatch를 사용하면 하나라도 맞으면 true를 뱉어낸다.
	
	boolean b3 = Stream.of(1, 2, 3).noneMatch(n -> n == 3);
	System.out.println(b3);     // 모든 객체가 조건식에 맞는지 확인 후 맞지 않다면 true 맞다면 false를 뱉어낸다.
	
	if (Nation.nations.stream().allMatch(n -> n.getPopulation() > 100.0))
		System.out.println("모든 국가 인구가 1억 이상");
	else 
		System.out.println("모든 국가는 인구가 1억이 넘지 않음");
	
	Optional<Nation> nation = Nation.nations.stream().findFirst();
	nation.ifPresentOrElse(Util::print , () -> System.out.println("없음"));
	System.out.println();
	
	nation = Nation.nations.stream().filter(e -> e.getType() == Nation.Type.ISLAND).findAny();
	nation.ifPresent(Util::print);
	
	
	
	
	}
}
