package d0610_03_Array2;

public class VarArgsDemo {

	public static void main(String[] args) {
		printSum(1,2,3,4);
	    printSum2(new int[] {1,2,3,4,5});			
	}
	
	public static void printSum(int... v) { /// ...으로 []를 대체할 수 있고 6행 처럼 줄일 수 있다.
		int sum = 0;
		for(int i : v) {
			sum += i;
		}	
		System.out.println(sum);
	}
	
	public static void printSum2(int[] v) {
		int sum = 0;
		for(int i : v) {
			sum += i;
		}
		System.out.println(sum);
	}
	
}
