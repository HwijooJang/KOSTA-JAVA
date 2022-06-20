package d0620_02_Collection2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = Map.of("사과", 5, "바나나", 3 , "포도", 10, "딸기" , 1);
		Map<String, Integer> fruits = new HashMap<String, Integer>(map);
		
		fruits.put("딸기", 20); // put은 동일한 이름의 인덱스 값을 변경을 해준다.
		System.out.println(fruits);
		System.out.println(fruits.get("바나나")); // get을 이용해서 입력된 인덱스의 값을 찾아서 불러온다.
		
		fruits.put("복숭아", 3);	// put은 값을 수정하는 것도 있지만 추가하는 기능도 넣을 수 있다.
		System.out.println(fruits);
		fruits.remove("포도");  // 다른것과 동일하게 remove를 사용하면 값이 삭제가 된다.
		
		System.out.println(fruits);
		
		fruits.keySet();
		fruits.values();
		fruits.entrySet();
		
		for(String k : fruits.keySet())
			if(k.equals("바나나"))
				fruits.put(k, 10);
		System.out.println(fruits); // fruits.keySet() 사용하는 법
		
		
		int sum = 0;
		for(Integer v : fruits.values())
		sum += v;
		
		System.out.println("총합 : " + sum + " 평균 : " + sum/fruits.size()); // fruits.values() 사용하는 법
		
			for(Entry<String, Integer> e : fruits.entrySet()) {
				System.out.println(e.getValue() + " : " + e.getKey());
			}
				
			
			
			
			
	}
	
}
