package d0617_03_interfaceLamdba;

import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class OperatorDemo {

	public static void main(String[] args) {
		IntUnaryOperator add2 = x -> x+2;
		System.out.println(add2.applyAsInt(3)); // Int타입을 위한 Operator 인터페이스로 applyAsint() 라는 추상메서드를 가진다.
		
		UnaryOperator<Integer> add2again = x -> x+2; // Integer 타입을 위한 Operator 인터페이스로 apply() 라는 추상메서드를 가진다.
		
		System.out.println(add2again.apply(3));
		
		IntBinaryOperator add = (x,y) -> x+ y;
		System.out.println(add.applyAsInt(10, 20));
	}

}
