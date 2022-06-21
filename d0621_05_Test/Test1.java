package d0621_05_Test;

import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<String> ls = List.of("갈매기", "나비", "다람쥐", "라마");
		
		ls.stream().filter(s -> s.length() < 3).forEach(n -> System.out.println(n + " "));
		
	}
}
