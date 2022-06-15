package d0615_02_ex2;

import d0615_01_ex1.Keyboard;

public class ClassDemo {
	
	public static void main(String[] args) {
		Keyboard k = new Keyboard("Logitech");
		
		Class c = k.getClass();
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
		System.out.println(c.getTypeName());
		System.out.println(c.getPackageName());
		
		
		
	}

}
