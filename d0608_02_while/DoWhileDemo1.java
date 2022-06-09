package d0608_02_while;

public class DoWhileDemo1 {

	public static void main(String[] args) {
		
		int i = 1;
		
		do {
			System.out.println(i);
			i++;
		} while(i < 5);
		
		i = 10;
		while (i < 5) {
			i++;
		}
		System.out.println("프로그램 종료");
	}

}
