package d0620_01_Collection1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator; 

public class IteratorDemo {

	public static void main(String[] args) {
		Collection<String> list = Arrays.asList("다람쥐", "개구리", "나비");
		
		Iterator<String> i1 = list.iterator();
		
		while(i1.hasNext())
			System.out.print(i1.next() + "-");
		System.out.println();
		i1 = list.iterator();
	    while(i1.hasNext())
	    	System.out.print(i1.next() + "=");
		System.out.println();
	    
	    
		      // forEach 문은 간접적으로 next() 메서드를 호출한다.
		list.forEach((s) -> System.out.print(s + "+")); // 람다와 컬렉션의 결합이 된 것이다. 간단해서 이 문을 추천한다.
		
		

	}

}
