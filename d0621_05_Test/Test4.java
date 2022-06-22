package d0621_05_Test;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import d0621_05_Test.Nation.Type;



public class Test4 {

	public static void main(String[] args) {
		
		//Stream<Nation> n1 = Nation.nations.stream();
		//Stream<d0621_05_Test.Nation.Type> s1 = n1.map(Nation::getType);
		
		System.out.print(Nation.nations.stream().filter(n -> n.getType() == Type.LAND).map(s -> s.getName()).collect(Collectors.joining(", ")));
		
		
		// Nation.nations.stream().filter(s -> s.getType()).forEach(n -> System.out.print(n + ", "));
	}
}
