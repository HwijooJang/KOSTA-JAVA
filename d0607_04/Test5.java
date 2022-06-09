package d0607_04;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	    System.out.print("0~999 까지 숫자 세자리를 적어주세요 : ");
		
		String[] str = br.readLine().split("");
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		int C = Integer.parseInt(str[2]);
		
		
		System.out.println("세자리 숫자를 더 한 값 : " + (A + B + C));
		

	}

}
