package d0609_02_OOP2;

public class LocalVariableDemo {

	public static void main(String[] args) {
		int a;
		Phone mp = new Phone();
		Phone yp = new Phone("iPhone", 100);

		mp.print();
		yp.print();
		
		mp.model = "갤럭시 폴드";
	    mp.val = 200;
	    mp.print();
	}

}

