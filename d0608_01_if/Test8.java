package d0608_01_if;

public class Test8 {

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
	static int factorial(int n) {
		int result =1;
		for(int i = n; i > 1; i--) {
			result = result * i;
			
		}
		return result;


	}

}
