package d0607_04;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// OddEvenTest
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int i = sc.nextInt();
		System.out.println((i % 2 == 0) ? "짝수" : "홀수" );

	}

}
