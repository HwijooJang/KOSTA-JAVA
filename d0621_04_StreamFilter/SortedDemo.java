package d0621_04_StreamFilter;

import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Stream;

public class SortedDemo {

	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("d2", "a2", "b1", "b3", "c");
		// s1.sorted(Comparator.reverseOrder()).forEach(e -> System.out.println(e + " "));
		
		s1.sorted((a, b) -> a.compareTo(b)).forEach(e -> System.out.print(e + " "));
		
		System.out.println("\n" + "---------------------" + "\n");
		
		//국가 이름 순으로 출력
		Nation.nations.stream().sorted((a, b) -> { return a.getName().compareTo(b.getName()); })
		.forEach(Util::print);
		
		System.out.println("\n" + "---------------------" + "\n");
		
		Nation.nations.stream().sorted((x, y) -> y.getName().compareTo(x.getName())).forEach(Util::print);
		
		Nation.nations.stream().sorted(Comparator.comparing(Nation::getName));
		
		System.out.println("\n" + "---------------------" + "\n");
		
		Function<Nation, String> funcName = n -> n.getName();
		Nation.nations.stream().sorted(Comparator.comparing(Nation::getName)).forEach(Util::print);
		
		System.out.println("\n" + "---------------------" + "\n");
		
		Nation.nations.stream().sorted(Comparator.comparing(Nation::getGdpRank))
		.forEach(e -> System.out.print(e.getName() + " : " + e.getGdpRank()));
		
		System.out.println("\n" + "---------------------" + "\n");
		
		Nation.nations.stream().sorted(Comparator.comparing(Nation::getPopulation))
		.forEach(e -> System.out.print(e.getName() + " : " + e.getPopulation()));
		
		System.out.println("\n" + "---------------------" + "\n");
		
		Nation.nations.stream().sorted(Comparator.comparing(Nation::getType))
		.forEach(e -> System.out.println(e.getType() + " : " + e.getName()));
		
		System.out.println("\n" + "---------------------" + "\n");
		
		Nation.nations.stream().sorted((x, y) -> x.getName().length() - y.getName().length())
		.forEach(Util::print);
		
		// 전부 Sort를 이용해서 배열을 나누는 방법이다. 길이, 글자, 타입 등으로 나눌 수 있으며 람다식을 이용, forEach를 통해 나타낸다.
		
		
	}
}
