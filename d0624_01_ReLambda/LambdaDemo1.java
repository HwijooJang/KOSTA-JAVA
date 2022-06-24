package d0624_01_ReLambda;

public class LambdaDemo1 {

	public static void main(String[] args) {
		Sum sum = new Sum() {

			public int sum(int a, int b) {
				return a + b;
			}
		};	
		
		sum.sum(10, 20);
		Sum sum2 = new MySumClass();
		sum2.sum(10, 29);
		
		Sum sum3 = (x,y) -> x + y;
		sum3.sum(10, 20);
		
		Sum sum4 = (x,y) -> {
			System.out.println("x : " + x + " Y : " + y);
			return x + y;
		};
		sum4.sum(20, 40);
		
	}

}
