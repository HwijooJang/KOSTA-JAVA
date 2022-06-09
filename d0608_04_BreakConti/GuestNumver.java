package d0608_04_BreakConti;

import java.util.Random;
import java.util.Scanner;

public class GuestNumver {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int card;
		
		while(true) {
		int i = 1;
		int low = 0;
		int high = 99;
		
		card = r.nextInt(100);
		System.out.println("숫자를 맞춰보세요.");
		System.out.println("기회는 5번 입니다.\n");
		
		int cou = 0;
		while(cou < 10
				) {
		System.out.println("<" + low + " - " + high + ">");
		System.out.print(i + ">>");
		i++;
		int num = sc.nextInt(); 
		cou++;
		
		if(card > num) {
			low = num;
			System.out.println("Up\n");
		} else if(card < num) {
			high = num;
			System.out.println("Down\n");
		} else if(card == num) {
			System.out.println("맞췄습니다 축하합니다.\n"); break;
		} 
		}
		
		System.out.println("정답은 " + card + "\n");
		
		System.out.println("다시 하시겠습니까? (y/n)");
		if(sc.next().equals("n")) break;
		}		
		System.out.println("게임이 종료되었습니다.");
	}

}
