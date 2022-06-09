package d0608_01_if;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleIfDemo2 {

	public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
      System.out.print("숫자 입력 : ");
      
      String str = br.readLine();
      
      int i = Integer.parseInt(str);
      
      if(i % 2 == 0) {
    	  System.out.println("짝수!");
      }
      if(i % 2 != 0) {
    	  System.out.println("홀수!");
      }
		
		
	}

}
