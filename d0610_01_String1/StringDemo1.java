package d0610_01_String1;

public class StringDemo1 {

	public static void main(String[] args) {
		
		String s1 = "Hi, Java";
		String s2 = "Hi, Java";
		String s3 = new String("Hi, Java");
		String s4 = new String("Hi, Java");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
	}

}
