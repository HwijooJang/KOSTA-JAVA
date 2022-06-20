package d0620_04_Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test4 {
	
	public static void main(String[] args) {
		Set<String> a1 = new HashSet<>();
		a1.addAll(Arrays.asList("독수리", "나비", "염소", "고양이", "개미", "여우"));
		System.out.println("hashset" + a1);
		
		TreeSet<String> t1 = new TreeSet<String>();
		t1.addAll(a1);
		
		System.out.println("treeset" + t1);
		System.out.println("첫 번째 동물 : " + t1.first());
		System.out.println("마지막 동물 : " + t1.last());
		System.out.println("나비 앞에 있는 동물 : " + t1.lower("나비"));
		
	}

}
