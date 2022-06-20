package d0620_03_Collections1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {
		String[] fruits = {"포도", "수박", "사과", "키위", "망고"};
		
		List<String> list = Arrays.asList(fruits);
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder()); // 주어진 배열 안 인자값의 순서를 꺼꾸로 부터 
		System.out.println(list);
		
		Collections.shuffle(list); // 주어진 배열 안 인자값의 순서를 섞는것
		System.out.println(list);
			
		Collections.rotate(list, 3); // 3을 기점으로 로테이션을 돌리는것
		System.out.println(list);
		
	}
}
