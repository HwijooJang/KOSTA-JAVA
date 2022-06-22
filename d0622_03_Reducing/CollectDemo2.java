package d0622_03_Reducing;

import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

import d0621_04_StreamFilter.Nation;
import d0621_04_StreamFilter.Nation.Type;

public class CollectDemo2 {

	public static void main(String[] args) {
		System.out.println(Nation.nations.stream()
				.map(n -> n.getName()).collect(Collectors.toList()));
		
		System.out.println(Nation.nations.stream().map(n -> n.getName()).limit(3).collect(Collectors.toSet()));
		
		Map<String, Double> map = Nation.nations.stream()
				.filter(n -> n.getType() == Type.ISLAND).collect(Collectors.toMap(Nation::getName, Nation::getPopulation));
		System.out.println(map);
	
		
		Nation.nations.stream()
		.filter(n -> n.getType() == Type.ISLAND).collect(Collectors.toCollection(() -> new HashSet<Nation>()));
		
		System.out.println(
		Nation.nations.stream()
		.filter(n -> n.getType() == Type.ISLAND).collect(Collectors.toCollection(HashSet<Nation>::new)));
	
	
	
	}

}
