package d0617_03_interfaceLamdba;

import java.util.function.Function;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToDoubleBiFunction;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<Integer, Integer> add2 = x -> x+2;
		Function<Integer, Integer> mul2 = x -> x*3;
		System.out.println(add2.apply(2));
		System.out.println(mul2.apply(3));
		System.out.println(add2.andThen(mul2).apply(3)); // andThen은 정방향으로 연결해준다.
		System.out.println(add2.compose(mul2).apply(2)); // compose는 역방향으로 연결해준다.
		
		IntToDoubleFunction half = x -> x/2.0; // 입력은 int로 출력은 double로 하는 것이다.
		System.out.println(half.applyAsDouble(5));
		
		ToDoubleBiFunction<String, Integer> circleArea = (s, i) -> Double.parseDouble(s) * i * i ; // String과 Integer 값을 받아 Double로 반환
		System.out.println(circleArea.applyAsDouble("3.14", 5));
	
	
	}

}
