package d0620_03_Collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class EtcDemo {
	
	public static void main(String[] args) {
		List<String> list1 = List.of("사과", "포도", "수박", "사과", "키위", "포도", "망고", "사과");
		HashSet<String> set = new HashSet<String>(list1); // 중복을 거룬뒤 제거를 하는 중복제거 문이다.
		System.out.println(set);
		
		List<String> list3 = new ArrayList<>(set);
		Collections.sort(list3); // 중복 상관없이 정렬만 해서 출력하는 문
		System.out.println(list3); 
		
		
		List<String> list2 = new ArrayList<>(list1);
		Collections.sort(list2); // 중복 상관없이 정렬만 해서 출력하는 문
		System.out.println(list2); 
		
		Map<String, Integer> map = new HashMap<>();
		for(String fruits : list2) {
		map.put(fruits, Collections.frequency(list1, fruits));// list1에 들어있는 과일의 갯수를 확인하는 문
		}
		System.out.println(map);
		
		
	}

}
