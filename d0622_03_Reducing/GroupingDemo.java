package d0622_03_Reducing;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import d0621_05_Test.Nation;
import d0621_05_Test.Nation.Type;

public class GroupingDemo {

	public static void main(String[] args) {
		
		Map<Type, List<Nation>> m1= 
		Nation.nations.stream().collect(Collectors.groupingBy(n -> n.getType()));
		
		System.out.println(m1.get(Type.ISLAND));
		System.out.println(m1.get(Type.LAND));
		System.out.println();
		
		Map<Type, Long> m2=
		Nation.nations.stream().collect(Collectors.groupingBy(n -> n.getType(), Collectors.counting()));
		System.out.println(m2.get(Type.ISLAND));
		System.out.println(m2.get(Type.LAND));
		System.out.println();
		
		for(Type t : m2.keySet())
			System.out.println(t + " : " + m2.get(t));
		System.out.println();
		
		Map<Type, String> m3 =
		Nation.nations.stream()
		.collect(Collectors.groupingBy(n -> n.getType(), Collectors.mapping(Nation::getName, Collectors.joining(", "))));
		
		for(Type t : m3.keySet())
			System.out.println(t + " : " + m3.get(t));
		
	//	Nation.nations.stream()
		//.collect(Collectors.groupingBy(n -> n.getType(), Collectors.m))
		
		
		
		
	}
}
