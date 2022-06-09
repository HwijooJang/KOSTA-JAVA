package d0607_04;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("직사각형의 가로 길이를 입력하세요 >>");
		int i = sc.nextInt();
		System.out.println("직사각형의 세로 길이를 입력하세요 >>");
		int j = sc.nextInt();
		
		System.out.println("직사각형의 넒이 = " + i * j);

	}

}
