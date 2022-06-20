package d0620_01_Collection1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		String[] fruits = {"사과", "바나나", "포토", "수박"};
		Set<String> h1 = new HashSet<>();
		List<String> a1 = new ArrayList<>();
	
		for(String s:fruits)
			System.out.print(s + " ");
		
		System.out.println();
		
		for(String s :fruits) {
			h1.add(s);
		    a1.add(s);
		}
		
		System.out.println(h1); // Set은 이 배열에서 다른 객체를 추가를 하면 들어가지 않는다.
		System.out.println(a1);
		System.out.println();
		
		h1.add("바나나");
		a1.add("바나나");
		System.out.println(h1);
		System.out.println(a1); // 결과를 보면 Set에는 바나나가 들어가지 않았고 List에는 바나나가 추가된것을 볼 수 있다.
		
		// h1.get(); // 이것은 불가능 하다 set은 읽긴 하지만 get을 받지 못한다.
		
		
	}

}
