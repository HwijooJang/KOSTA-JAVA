package d0608_06_Method;

public class MethodDemo2 {

	public static void main(String[] args) {
		
		System.out.println("0~10 더한 수 : " + sumMethod(0,10));
		System.out.println("10~100 더한 수 : " + sumMethod(10,100));
		System.out.println("100~1000 더한 수 : " + sumMethod(100,1000));
		
	}
		public static int sumMethod(int start, int end) {
			
			int sum = 0;
			for(int i = start ; i <= end ; i++) {
				sum += i;
			}
			return sum;
		}

	

}
