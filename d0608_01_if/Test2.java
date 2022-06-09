package d0608_01_if;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등수 입력 : ");
		
		int i = sc.nextInt();
		String str;
		
		switch(i) {
		case 1 : str = "참 잘했어요"; 
		break;
		case 2 : str = "잘했어요";
		break;
		case 3 : str = "잘했어요";
		break;
		case 4 : str = "잘했어요";
		break;
		case 5 : str = "조금 잘했어요";
		break;
		case 6 : str = "노력하세요";
		break;
		default: str = "못했어요";
		}
	    System.out.println(str);
		
		
		
		
		
		

	}

}
