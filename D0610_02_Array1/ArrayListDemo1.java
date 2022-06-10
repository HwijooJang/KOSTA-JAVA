package d0610_02_Array1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo1 {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	ArrayList<Integer> score = new ArrayList<>();
    	
    	int data = 0;
    	System.out.print("점수 : ");
    	while((data = sc.nextInt()) >=0 ) {
    		score.add(data);
    		System.out.print("점수 : ");
    		
    	}
    	System.out.println("=".repeat(20));
    	
    	int sum = 0;
    	for(int i = 0 ; i < score.size() ; i++) {
    		System.out.println(score.get(i) + " ");
    		
    		sum += score.get(i);
    	}
    	 System.out.printf("\n총점 : %d, 평균 : %d", sum , sum/score.size());
    	
    	
    }
}
