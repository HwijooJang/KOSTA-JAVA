package d0608_01_if;

import java.util.Scanner;

public class NestedIfDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String grade;
		String Winner;
		
		System.out.print("점수 입력 : ");
		int i = sc.nextInt();
		
		if(i >= 90) {
			grade = "A"; 
			Winner = "W";
		} else if (i >= 80) {
			grade = "B";
			Winner = "W";
			System.out.println("학점 : " + grade + " 장학금 여부 : " + Winner);
		} else {
			Winner = "F";
			if(i >= 70) {
			grade = "C";
		} else if(i >= 60) {
			grade = "D"; 
		} else {
			grade = "F";
		}
		 System.out.println("학점 : " + grade + " 장학금 여부 : " + Winner);
		
	}
	}
}
