package d0608_01_if;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String r, s, p;
		
		String str1 = sc.next();
		String c = "철수";
		System.out.println(c + str1);
		String str2 = sc.next();
		String y = "영희";

		System.out.println(y + str2);
		
		
		 // r > s, s > p, p > r
		if(str1.equals(str1)) {
			str2.equals("r");
			System.out.println("무승부");
		} else if(str2.equals("s")) {
			System.out.println("승리");
		} else if(str2.equals("p")) {
			System.out.println("패배");
		}
			
		

	}

}
