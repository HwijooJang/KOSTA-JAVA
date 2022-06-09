package d0607_04;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int i = sc.nextInt();
	    System.out.println("전공 이수 학점 입력 :" + i);
	    int j = sc.nextInt();
	    System.out.println("교양 이수 학점 입력 :" + j);
	    int y = sc.nextInt();
	    System.out.println("일반 이수 학점 입력 :" + y);
	    
	    
		if(i + j + y >= 140) {
			System.out.println("졸업 가능");
		} else {
			System.out.println("졸업 불가능");
		}

	}

}
