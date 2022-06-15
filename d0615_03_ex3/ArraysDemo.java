package d0615_03_ex3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArraysDemo {

	public static void main(String[] args) {
		char[] a1 = {'J','a', 'v', 'a'};
		char[] a2 = Arrays.copyOf(a1, a1.length); // 배열을 복사한다.
		System.out.println(a2);
		
		String[] sa = {"케이크", "사과", "바나나", "사탕"};
		print(sa);
		
		Arrays.sort(sa); // 배열을 정렬시키는 문
		print(sa);
		Arrays.sort(sa, Collections.reverseOrder()); // 배열을 꺼꾸로 정렬 시키는 법 Collections을 사용
		System.out.println("어쩔");
		
		System.out.println(Arrays.binarySearch(sa, "사과")); //사과가 위치한 번호를 서치함
		Arrays.fill(sa, 2, 4, "기타"); // 2부터 4까지 기타로 바꿈
		print(sa);
		
		List<String> mylist = Arrays.asList(sa); // 배열을 리스트로 만듬.
		mylist.toArray(); // 리스트를 배열로 만듬
		
	}
		static void print(Object[] oa) {
			for(Object e : oa) 
				System.out.print(e + " \n");
				System.out.println("=".repeat(15));
	
	

		}
}
