package d0620_01_Collection1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformanceDemo {

	public static void main(String[] args) {
		
		// List<Integer> li = new ArrayList<>(); // new 다음 <>에는 타입을 써도 되고 안써도 된다.
		ArrayList<Integer> al = new ArrayList<>();
		LinkedList<Integer> ll = new LinkedList<>();
		
		long start =System.nanoTime();
		for(int i = 0 ; i < 100000 ; i++ ) al.add(0, i);
		long end = System.nanoTime();
		long duration = end - start;
		System.out.println("ArrayList로 처리 시간 : " + duration);
		
		start =System.nanoTime();
		for(int i = 0 ; i < 100000 ; i++) ll.add(0, i);
		end = System.nanoTime();
		duration = end - start;
		System.out.println("LinkedList로 처리 시간 : " + duration);
		
		// 업데이트가 많고 추가가 많고 수정이 많다면 LinkedList를 사용하는 것이 맞고
		// 수정이 많지 않고 검색을 많이 해야 한다 그러면 ArrayList가 맞다. LinkedList는 추가하는것에 최적화가 되어 있다.
		
		System.out.println("=".repeat(20));
		
		
	    start =System.currentTimeMillis();
		for(int i = 0 ; i < 100000 ; i++ ) al.add(0, i);
		end = System.currentTimeMillis();
		duration = end - start;
		System.out.println("ArrayList로 처리 시간 : " + duration);
		
		start =System.currentTimeMillis();
		for(int i = 0 ; i < 100000 ; i++) ll.add(0, i);
		end = System.currentTimeMillis();
		duration = end - start;
		System.out.println("LinkedList로 처리 시간 : " + duration);
		
		
		System.out.println("=".repeat(20));
		
		// 값을 가져오는 get으로 50000을 주고나서 Array와 Linked의 차이점을 살펴보았다.
		// 값을 가져오거나 검색을 하는 get으로 하였을때 Array가 Linked 보다 압도적으로 빠른걸 볼 수 있다.
		// https://wakestand.tistory.com/106
		
		
		start =System.currentTimeMillis();
		for(int i = 0 ; i < 100000 ; i++) al.get(50000);
		end = System.currentTimeMillis();
		duration = end - start;
		System.out.println("ArrayList로 처리 시간 : " + duration);
		
		start =System.currentTimeMillis();
		for(int i = 0 ; i < 100000 ; i++) ll.get(50000);
		end = System.currentTimeMillis();
		duration = end - start;
		System.out.println("LinkedList로 처리 시간 : " + duration);
		
	}
}
