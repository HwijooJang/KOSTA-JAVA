package d0620_01_Collection1;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		Stack<String> s1 = new Stack<String>(); // Stack 메모리의 정석은 push로 추가하고 pop으로 꺼내서 데이터를 삭제시키는게 정석이다.
		s1.push("사과");
		s1.add("오렌지");
		s1.push("바나나");
		s1.push("체리");
		
		System.out.println(s1);
		System.out.println(s1.peek()); // peek는 가장 마지막(위)에 있는 것을 제거하지 않고 꺼내본 다음 다시 원위치 시킨다.
		System.out.println(s1.pop()); // pop은 가장 마지막(위)에 있는 것을 꺼내서 쓰고 데이터를 없앤다.
		System.out.println(s1);
		
		System.out.println();
		
		Stack<Integer> s2 = new Stack<>();
		s2.add(10);
		s2.add(20);
		s2.add(1, 100); // 2번째 변수 위치에 100을 넣겠다는 ()이다
		
		System.out.println(s2);
		
		while(!s2.empty()) {
			System.out.println(s2.pop() + " "); // !s2.empty -> 즉 s2가 비어있지 않다면 비어있을때 까지
			                                    // pop을 사용해서 빈 배열이 나올 떄 까지 최상위 객체를 꺼내서 본 후 삭제시킨다
			
		}
		
		
	}

}
