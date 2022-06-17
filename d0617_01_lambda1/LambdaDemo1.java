package d0617_01_lambda1;

import java.util.Arrays;

public class LambdaDemo1 {

	public static void main(String[] args) {
		String[] str = {"로마에 가면 로마법을 따르라", "시간은 금이에여", "펜은 칼보다 강하다"};
		
		for(String s : str) {
			System.out.println(s);
		}
		
		System.out.println("\n" + "=".repeat(15) + "\n");
		
		Arrays.sort(str, (f1, s2) -> f1.length() - s2.length());
		
		for(String s : str) {
			System.out.println(s);
		}
		
		System.out.println("\n" + "=".repeat(15) + "\n");
		                              // chatAt을 써서 length -1 을 하게 되면 맨 마지막 글자를 구하게 된다.
		Arrays.sort(str, (f1, s2) -> f1.charAt(f1.length() -1) - s2.charAt(s2.length() -1 )); // 마지막 글자로 정렬을 하겠다.
		for(String s : str) {
			System.out.println(s);
		}
		
	}

}
