package d0607_04;

public class ComLogicDemo {

	public static void main(String[] args) {
		int x = 0, y = 1;
		//  <  >  >=  <=  ==  !=
		System.out.println((x < y) || (y-- < 1));
		System.out.println("x = " + x + " y = " + y);
		
		x = 0;
		y = 1;
		System.out.println((x < 1) | (y-- <1));
		System.out.println("x = " + x + " y = " + y);

	}

}
