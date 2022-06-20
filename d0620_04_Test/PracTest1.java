package d0620_04_Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PracTest1 {
	
	public static void main(String[] args) {
		
		List<String> cap = new ArrayList<>();
		cap.add("서울");
		cap.add("워싱턴");
		cap.add("베이징");
		cap.add("파리");
		cap.add("마드리드");
		
		System.out.println(cap);
		
		cap.add("런던");
		
		Iterator<String> iter = cap.iterator(); // 반복자 
		while(iter.hasNext())
			System.out.print(iter.next() + " ");
		
		System.out.println();
		
		cap.removeIf(c -> c.length() >= 3);
		System.out.println(cap);
		cap.forEach(s -> System.out.print(s + " "));
	
	
	}

}
