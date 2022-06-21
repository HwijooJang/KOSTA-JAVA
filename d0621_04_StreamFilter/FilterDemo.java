package d0621_04_StreamFilter;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("a1","a2" ,"a1" ,"c3","c4","c5");
		
		Stream<String> s2 = s1.filter(s -> s.startsWith("c"));
		Stream<String> s3 = s2.skip(1);
		
		s3.forEach(Util::print);
		System.out.println();
		
		IntStream i1 = IntStream.of(1,2,1,3,3,2,4);
		IntStream i2 = i1.filter(i -> i % 2 == 0);
		IntStream i3 = i2.distinct();
		i3.forEach(Util::print);
		System.out.println();
		
		System.out.println("인구가 1억 이상인 나라 출력");
		Nation.nations.stream().filter(e -> e.getPopulation() > 100.0).forEach(Util::print);
		
		System.out.println();
		
		Nation.nations.stream().filter(e -> e.getPopulation() > 100.0)
		.forEach(n -> System.out.println(n.getName() + " : " + n.getPopulation()));
		System.out.println();
		
		Nation.nations.stream().filter(e -> e.getPopulation() > 100.0)
		.sorted(Comparator.comparing(Nation::getPopulation).reversed()).limit(2)
		.forEach(n -> System.out.println(n.getName() + " : " + n.getPopulation()));
		
		
	}

}
