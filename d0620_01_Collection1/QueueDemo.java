package d0620_01_Collection1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		
		System.out.println(q.poll());
		q.offer("사과");
		q.offer("바나나");
		System.out.println(q);
		q.offer("딸기");
		System.out.println(q);
		q.remove();
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.peek());
		
	}
}
