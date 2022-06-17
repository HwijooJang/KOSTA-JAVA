package d0617_03_interfaceLamdba;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		IntPredicate even = x -> x%2 == 0; // 2의 배수 여부에 따라 true/false를 반환하는 람다식으로 IntPredicate타입 변수 even의 test() 메서드를 구현한다.
		System.out.println(even.test(3)? "짝수" : "홀수");
	
	    IntPredicate one = x -> x == 1; 
	    IntPredicate oneOrEven = one.or(even); // 2개의 IntPredicate 타입 변수를 IntPredicate의 디폴트 메서드 or()로 연결한다.
	    
	    System.out.println( oneOrEven.test(1)? "1 혹은 짝수" : "1 아닌 홀수");
	
	    Predicate<String> p = Predicate.isEqual("Java Lambda"); // Predicate의 정적 메서드 isEqual()로 Predicate 타입 변수 p에 대입한다.
	    System.out.println(p.test("Java Lambda"));
	    System.out.println(p.test("JavaFx"));
	    
	    BiPredicate<Integer, Integer> bp = (x, y) -> x > y; // 2개의 매개변수를 사용하는 BiPredicate 타입 변수 bp를 정의
	    System.out.println(bp.test(2, 3));
	    System.out.println(bp.test(4, 3));
	    
	   
	}

}
