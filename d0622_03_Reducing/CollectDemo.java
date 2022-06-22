package d0622_03_Reducing;

import java.util.IntSummaryStatistics;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import d0621_05_Test.Nation;

public class CollectDemo {

	public static void main(String[] args) {
		Stream<Nation> sn = Nation.nations.stream();
		// 인구 평균
		double pop_avg = sn.collect(Collectors.averagingDouble(n -> n.getPopulation()));
		// long count = sn.count();
		// sn.collect(Collectors.counting());
		
		Nation.nations.stream().map(n -> n.getName()).forEach(Util::print);
		
		System.out.println();
		
		String Nations = Nation.nations.stream().map(n -> n.getName()).limit(4).collect(Collectors.joining(", "));
		System.out.println(Nations);
		
		String Nations1 = Nation.nations.stream().limit(4).collect(Collectors.mapping(Nation::getName, Collectors.joining(", ")));
		System.out.println(Nations1);
		
	    IntSummaryStatistics sta = 
		Nation.nations.stream().collect(Collectors.summarizingInt(s -> s.getGdpRank()));
	    System.out.println(sta);
	
	
	
	
	
	}
}
