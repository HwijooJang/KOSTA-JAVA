package d0615_03_ex3;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		
		Random r = new Random();
		for(int i = 0 ; i < 5 ; i++)
			System.out.print(r.nextInt(100) + " ");
		System.out.println("\n" + "=".repeat(15));
		for(int i = 0 ; i < 5 ; i++)
		System.out.print((int)(Math.random() * 10) + 1 + " ");
	}
}
