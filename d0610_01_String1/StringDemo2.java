package d0610_01_String1;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String s1 = "Hi, Java!";
		String s2 = new String("Hi, Java!");
		String s3 = "Hi, code";
		String s4 = "Hi, java!";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4) + "\n");
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println((int)'J' - (int)'c');
		System.out.println(s1.compareToIgnoreCase(s4));
		System.out.println(s3.compareTo(s4));
		System.out.println((int)'c' - (int)'j' + "\n");
		
		System.out.println("문자열의 길이 'Hi,' : " + "Hi, ".length());
		System.out.println("문자열의 길이 'Hi,'의 두번째 문자 :  : " + "Hi, ".charAt(1));
		System.out.println("I like ".concat(s2) + "!!!!");
		
		String s5 = s1.substring(0);
		String s6 = new String(s1.concat(s4));

		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s6.substring(4, 8));
		
		System.out.println(" ".isBlank());
		System.out.println(" ".isEmpty());
		System.out.println("=".repeat(20));
		
		System.out.println(s5.indexOf('a'));


	}

}
