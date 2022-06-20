package d0620_04_Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PracTest2 {

	public static void main(String[] args) {
		Map<String, String> dic = new HashMap<>();
		dic.put("cat", "괭이");
		dic.put("head", "머가리");
		dic.put("anut", "이모");
		dic.put("noodle", "국시");
		dic.put("teacher", "쌤");
		dic.put("child", "얼라");
		
		dic.values().iterator();
		Iterator<String> iter = dic.keySet().iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key + " : " + dic.get(key));
		}
		
		System.out.println();
		
		dic.forEach((k,v) -> System.out.println(k + " = " + v + " "));
		Collection<String> c1 = dic.values();
		List<String> list = new ArrayList<>(c1);
		Collections.shuffle(list);
		System.out.println(list);
		
		
		
	}

}
