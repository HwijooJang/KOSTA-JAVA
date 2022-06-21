package d0621_05_Test;

import java.util.stream.IntStream;

public class Test3 {
	public static void main(String[] args) {
		
		IntStream.rangeClosed(1, 10).mapToObj(i -> "A" + i).forEach(s -> System.out.print(s + " "));
		//rangeClosed 는 마지막 10까지 포함해 생성을 한다는 명령문
	}
	
}
		