package d0609_05_OOP5;

public class OneToTenDemo {

	static int sumOneToTen;
	
	static {
		int sum = 0;
		for(int i = 0 ; i< 11 ; i++) {
			sum += i;
		}
		OneToTenDemo.sumOneToTen = sum;
	}
	
	public static void main(String[] args) {
		
		System.out.println(OneToTenDemo.sumOneToTen);
		

	}

}
