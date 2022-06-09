package d0608_01_if;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElseDemo {

	public static void main(String[] args) throws IOException {
		// Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		System.out.print("숫자 입력 : ");
		String str = br.readLine();
		int i = Integer.parseInt(str);
		
		
		System.out.print("결과 : ");
		if(i % 2 == 0) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		
	}

}
