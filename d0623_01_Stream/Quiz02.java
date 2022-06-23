package d0623_01_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Quiz02 {

	public static void main(String[] args) {
		// 1. 입력 받아서 [1,2,3,4,5] 값을 제곱결과 map
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		System.out.println(numbers.stream().map(w -> w*w).collect(Collectors.toList()));
		
	}
	
}
