package d0615_03_ex3;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class FormatDemo {
	
	public static void main(String[] args) {
		DecimalFormat f1 = new DecimalFormat("#");
		System.out.println(f1.format(123.890));
	    DecimalFormat f2 = new DecimalFormat("#.0000");
	    System.out.println(f2.format(123.890));
	    DecimalFormat f3 = new DecimalFormat("###,###.000");
	    System.out.println(f3.format(12345678.77));
	    
	    SimpleDateFormat s1 = new SimpleDateFormat("yyyy-mm-dd");
	    System.out.println(s1.format(new Date()));
	    
	    Calendar c = Calendar.getInstance();
	    
	    SimpleDateFormat s2 = new SimpleDateFormat("E yyyy-mm-dd", Locale.KOREA);
	    System.out.println(s2.format(c.getTime()
	    		));
	    
	}

}
