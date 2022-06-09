package d0608_01_if;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		for(int a = 1; a <= 18; a++) {
			for(int b = 1; b <= 20-a; b++) {
				for(int c = 1; c <= 20-a-b; c++) {
					
					
					if(c*c == a*a + b*b) {
						System.out.println(a + " " + b + " "+ c + " 각변의 합 " + (a+b+c));
					}
				}
			}
		}

			}
		
		
}