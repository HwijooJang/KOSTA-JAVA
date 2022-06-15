package d0615_03_ex3;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		String s = "of the people, by the people, for the people";
		StringTokenizer st = new StringTokenizer(s, ",");
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println("[ " + st.nextToken().trim() + " ]"); // ,를 기준으로 나눠서 각각 한개의 문자열을 나눠서 출력을 할 수 있다.
		}
		System.out.println("=".repeat(15));
		
		String strhi = "영희는 : 철수를 % 좋아 # 합니다.";
		String[] result = strhi.split("[:%#]");
		
		for(String e : result)
		System.out.println(e);
		
	}

}
