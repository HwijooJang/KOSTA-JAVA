package d0610_03_Array2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachDemo {

public static void main(String[] args) {

	int[] one2Five = {1,2,3,4,5};
	int sum = 0;
	for(int i = 0; i <one2Five.length ; i++) {
		one2Five[i] += 1;
	}
	
	for(int element : one2Five) {
		sum += element;
	}
	System.out.println("평균 = " + sum/one2Five.length);
	
	ArrayList<Integer> al = new ArrayList<Integer>();
	for(int element : one2Five) al.add(element);
	
	al.stream().forEach(System.out::print);
	
	}
	
	
}


