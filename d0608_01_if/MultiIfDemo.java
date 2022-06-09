package d0608_01_if;

import java.util.Scanner;

public class MultiIfDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String grade;
		System.out.print("점수 입력 : ");
		
		 int i = sc.nextInt();
		 
		 if(i >= 90) {
			 grade = "A";
		 } else if(i >= 80) {
			 grade = "B";
		 } else if(i >= 70) {
			 grade = "C"; 
		 } else if(i >= 60) {
			 grade = "D";
		 } else {
			 grade = "F";
		 } System.out.println("학점 : " + grade);

	}

}
