package d0615_02_ex2;

import java.util.ArrayList;
import java.util.List;

public class WrapperDemo {
	
	public static void main(String[] args) {
		
		Integer bi1 = 10; Integer.valueOf(0);;
		int i1 = bi1.intValue();
		
		double d = bi1.doubleValue();
		
		Integer bi2 = 20;
		int i2 = bi2 + 20;
		
		String s1 = Double.toString(12.24);
		
		Float pi = Float.parseFloat("3.14");
		
		Integer bi3 = Integer.valueOf("11", 5);
		System.out.println(bi3);
		
		List<Integer> mylist = new ArrayList<>();
		mylist.add(10);
		mylist.add(80);
		mylist.add(90);
		
		mylist.forEach((e) -> System.out.print(e +" "));
		

	
	
	}

}
