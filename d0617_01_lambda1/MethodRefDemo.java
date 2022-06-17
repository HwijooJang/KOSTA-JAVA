package d0617_01_lambda1;

interface Mathematical {
	double calculate(double d);
}
interface Pickable {
	char pick(String s, int i);
}
interface Computable {
	int compute(int x, int y);
}

class Utils{
	int add(int a, int b) {
		return a + b;
	}
}

public class MethodRefDemo {

	public static void main(String[] args) {
		Mathematical mathematical;
		Pickable pickable;
		Computable computable;
		
		mathematical = (double d) -> { return Math.abs(d);}; // abs는 절대값이다. 어떠한 값을 넣어도 양수로 만들어준다.
		mathematical = d -> Math.abs(d);
		mathematical = Math::abs; // 위의 코드들이 람다식을 만나만나 이렇게 까지 줄어든다. :: 는 메서드 참조 연산자이다.
		
		System.out.println(mathematical.calculate(-100));
		
		pickable = (a, b) -> {return a.charAt(b);};
		System.out.println(pickable.pick("Happy", 2));
		
		pickable = (a, b) -> a.charAt(b);
		pickable = String::charAt;  // 위의 코드들이 람다식을 만나만나 이렇게 까지 줄어든다.
		System.out.println(pickable.pick("Happy", 2)); // 결과는 똑같다.
		System.out.println(pickable.pick("안녕하세요.", 3));
		
		Utils utils = new Utils();
		
		computable = (a, b) -> {return utils.add(a, b);};
		System.out.println(computable.compute(100, 200));
		computable = (a, b) -> utils.add(a, b);
		computable = utils::add;    // 위의 코드들을 람다식으로 줄여줄여 이렇게 까지 줄어든다.
		System.out.println(computable.compute(100, 200)); // 역시 결과는 동일하다.
		
	}

}
