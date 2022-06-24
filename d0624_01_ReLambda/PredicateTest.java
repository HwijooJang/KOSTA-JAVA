package d0624_01_ReLambda;

import java.util.function.Predicate;

public class PredicateTest {
	
	static int[] arAge = {29, 30, 34, 32, 30, 31, 28, 31, 29, 30};

	public static void main(String[] args) {
		System.out.print("30살 이상인 사람 : ");
		PredicateTest.testPrint(new Over30());
		System.out.print("30살 이하인 사람 : ");
		PredicateTest.testPrint(new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				return t <= 30;
			}
			
		});
		System.out.print("29살 이상인 사람 : ");
		PredicateTest.testPrint(x -> x >= 29);
		
		System.out.print("30살이 아닌 사람 : ");
		PredicateTest.testPrint(x -> x != 30);
		
		System.out.println("29 ~ 30살인 사람 : ");
		PredicateTest.testPrint(x -> x >= 29 && x <= 30);
		
		
	}
	
	static void testPrint(Predicate<Integer> op) {
		for(int age : arAge) {
			if(op.test(age)) 
				System.out.print(age + " ");
		}
		System.out.println("\n" + "=".repeat(15));
		
	}
	
	
}
