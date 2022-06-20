package d0620_03_Collections1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchDemo {
	
	public static void main(String[] args) {
		String[] s = {"황금을", "돌", "같이", "보라"};
		List<String> list = Arrays.asList(s);
		
		Collections.sort(list);
		System.out.println(list);
		
		int i = Collections.binarySearch(list, "같이");
	    System.out.println(i); // int i 를 지정해준 이유는 배열 2번째에 위치해있기 때문에 배열 위치를 받을거면 int를 써도 된다.
	
	
	}

}
