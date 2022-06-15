package d0615_03_ex3;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
		Date now = new Date();
		Date now1 = new Date();
		System.out.println(now); // 이거는 date 클래스이다
		System.out.println(System.identityHashCode(now));
		System.out.println(System.identityHashCode(now1));
		
		System.out.println("=".repeat(15));
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		System.out.println(c1 == c2);
		
		System.out.println(System.identityHashCode(c1));
		System.out.println(System.identityHashCode(c2));
		
		System.out.println("=".repeat(15));
		System.out.println(c1.get(Calendar.YEAR));
		System.out.println(c1.get(Calendar.MONTH)+ 1);
		System.out.println(c1.get(Calendar.DAY_OF_MONTH));
		System.out.println(c1.get(Calendar.DAY_OF_WEEK));
		System.out.println(c1.get(Calendar.SUNDAY));
	}

}
