package d0615_01_ex1;

public class ClassDemo {

	public ClassDemo() {
	}

	public static void main(String[] args) {
	
		Mouse m1 = new Mouse("Logitech");
		Mouse m2 = new Mouse("Logitech");
		Mouse m3 = m1;
		Keyboard k1 = new Keyboard("Microsoft");
		Keyboard k2 = new Keyboard("Microsoft");
		// k2 = (Keyboard)(Object)m1;
		
		System.out.println(m1.toString());
		System.out.println(m2);
		System.out.println(m3);
		
		System.out.println(k1.toString());
		System.out.println(k2);
		
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));

		System.out.println(k1.equals(k2));

	}

}
