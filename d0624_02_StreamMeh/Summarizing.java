package d0624_02_StreamMeh;

import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.Collectors;

public class Summarizing {

	public static void main(String[] args) {
		
		// 요리 총 갯수
		long hmd = Dish.menu.stream().count();
		System.out.println(hmd);
		
		long hmd2 = Dish.menu.stream().collect(Collectors.counting());
		System.out.println(hmd2);
		
		Optional<Dish> od =
		Dish.menu.stream().collect(Collectors.reducing((d1, d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2));
		System.out.println(od.get());
		
		int ctc =
		Dish.menu.stream().collect(Collectors.summingInt(Dish::getCalories));
		System.out.println(ctc);
		
		IntSummaryStatistics iss = Dish.menu.stream().collect(Collectors.summarizingInt(d -> d.getCalories()));
		
		String gsm = 
				Dish.menu.stream().map(Dish::getName).collect(Collectors.joining());
		String gsm2 = 
				Dish.menu.stream().map(Dish::getName).collect(Collectors.joining(", "));
		System.out.println(gsm);
		System.out.println(gsm2);
		
		
		
	}
}
