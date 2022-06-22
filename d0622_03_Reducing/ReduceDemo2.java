package d0622_03_Reducing;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.stream.Stream;

import d0621_05_Test.Nation;


public class ReduceDemo2 {

	public static void main(String[] args) {
		Stream<Nation> s1 = Nation.nations.stream();
		
	//	s1.max(Comparator.comparingDouble(x -> x.getPopulation())).ifPresent(System.out::println);
		
	//	s1.max(Comparator.comparing(Nation::getPopulation)).ifPresent(System.out::println);
		
		s1.reduce((n1, n2) -> n1.getPopulation() > n2.getPopulation() ? n1 : n2).ifPresent(System.out::println);
		
		// GDP가 20위 이내의 나라의 인구 총합
		
		double total = Nation.nations.stream().filter(x -> x.getGdpRank() <= 20).mapToDouble(n -> n.getPopulation()).reduce(0.0, (a, b) -> a+ b);
		System.out.println(total);
		    
		//Double형으로 통계를 구하는 문이다. 출력을 하면 Population 의 통계가 전체적으로 나온다.
		
		DoubleSummaryStatistics ds = Nation.nations.stream()
		.mapToDouble(n -> n.getPopulation()).summaryStatistics();
		System.out.println(ds);                // 통계를 구하는 문이다. 
		
		
		
		
	}
}
