package d0617_01_lambda1;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo2 {

	public static void main(String[] args) {
		String[] str = {"이클립스" , "스프링부트" , "구글"};
		
		for(String s : str) {
		System.out.println(s);
		}
		
		System.out.println("\n"+"=".repeat(15)+"\n");
		
		Arrays.sort(str);
		for(String s : str) {
			System.out.println(s);
			}
		
		System.out.println("\n"+"=".repeat(15)+"\n");
		
		Arrays.sort(str, (o1, o2) -> o1.length() - o2.length()); // 람다식으로 길이별 소트를 시켰다.		
		                 // object건 String이건 아무거나 상관은 없고 -> 다음에 정수형이 들어오면 된다.
		for(String s : str) {
		System.out.println(s);
		}
		
		System.out.println("\n"+"=".repeat(15)+"\n");
		
	}
}
