package d0608_01_if;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		if(i >= 19) {
			System.out.println("성년");
		} else {
			System.out.println("미성년");
		}

	}

}
