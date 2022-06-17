package d0617_02_lambda2;

import java.util.Comparator;

interface UseThis{
	void use();
}

public class UseThisDemo {

	public void lambda() {
		String hi = "Hi!";
		UseThis u1 = new UseThis() { // 익명 지역 객체이다.
			
			@Override
			public void use() {
				System.out.println(this); // 지역 객체의 this는 지역 객체 자신을 참조한다. 따라서 this는 UseThis의 자식인 익명 객체이다.		
			}
		};
		u1.use();
		
		UseThis u2 = () -> { // 람다식
			System.out.println(this); // 람다식의 this는 람다식을 사용하는 UseThisDemo 객체를 의미
			};                        // 람다식에서 사용되는 외부 지역변수도 실질적으로 final이다. 따라서 변경이 불가능하다.
			u2.use();	
	}	
	@Override
	public String toString() {
		return "UseThisDemo";
	}



	public static void main(String[] args) {
		int one = 1;
		
		new UseThisDemo().lambda();
		// Comparator<String> c = (one, b) -> 0; // 람다식의 선언부에 외부에서 선언된 동일한 이름의 변수를 선언 x
		
		// 정답을 출력하면 17행과 23행이 실행된 것이다. 17행은 익명 지역 객체를 나타내지만
		// 람다식이 사용된 23행의 결과는 외부 객체를 나타낸다.
		
	}
}
