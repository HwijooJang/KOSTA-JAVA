package d0623_01_Stream;

import java.util.stream.Collectors;

import d0623_01_Stream.Dish.Type;

public class Quiz01 {
	
	public static void main(String[] args) {
		System.out.println(Dish.menu.stream()
				.filter(n -> n.getType() == Type.MEAT).limit(2).collect(Collectors.toList()));
		
	}

}
