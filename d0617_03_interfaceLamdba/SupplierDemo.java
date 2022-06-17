package d0617_03_interfaceLamdba;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<String> s1 = () -> "Apple"; // 문자열을 공급하는 Supplier 객체이다.
		System.out.println(s1.get());
		
		int[] x = { 0 };
		IntSupplier s2 = () -> x[0]++; // 공급할 때마다 0부터 1씩 증가하는 정수를 공급하는 supplier 객체이다.
	    for(int i = 0; i < 3 ; i++) {
	    	System.out.println(s2.getAsInt());
	    }
	    
	    DoubleSupplier s3 = () -> Math.random() * 10; // 난수를 공급한다.
	    System.out.println(s3.getAsDouble());
	    
	    SimpleDateFormat format = new SimpleDateFormat("MM월 dd일(E요일) a h:m:s");
	    Supplier<String> s4 = () -> format.format(new Date());
	    System.out.println(s4.get());
	    
	    
	}

}
