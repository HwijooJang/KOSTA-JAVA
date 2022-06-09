package d0608_01_if;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		int sum =0;

		System.out.println("정수 입력");
		
		do {
		
			Scanner in = new Scanner(System.in);
		
			int num = in.nextInt();
			if(num%2==0) {
			
				System.out.println("정수 입력");
				sum= sum + num;
			}
			else if(num%2==1) {
				System.out.println("정수 입력");
			}
				
			
			else if(num<0)
				break;
		
		
			
		}while(true);
		System.out.print(" 총 합 : ");
		System.out.printf( "%d", sum);


	}

}
