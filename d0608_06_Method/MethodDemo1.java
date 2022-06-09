package d0608_06_Method;

public class MethodDemo1 {

	public static void main(String[] args) {
		// 0 ~ 10 합, 10 ~ 100 합, 100 ~ 1000 합
		int sum = 0;
		for(int i = 0 ; i <= 10 ; i++) {
			sum += i;
		}
		System.out.println("0 ~ 10 까지 합은 " + sum);

		sum = 0;
		for(int i = 10 ; i <= 100; i++) {
			sum += i;
		}
		System.out.println("10 ~ 100 까지 합은 " + sum);
	
	    sum = 0;
	    for(int i = 100 ; i <= 1000; i++) {
	    	sum += i;
	    }
	    System.out.println("100 ~ 1000 까지 합은 " + sum);

}
}