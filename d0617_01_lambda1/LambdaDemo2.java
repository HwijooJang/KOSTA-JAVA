package d0617_01_lambda1;

interface Negative { // 함수형 인터페이스
	int neg(int x);
}

interface Printable { // 함수형 인터페이스
	void print();
}

public class LambdaDemo2 {

	public static void main(String[] args) {
		Negative n;
		Printable p;
		  
//		n = new Negative() {
//			
//			@Override
//			public int neg(int x) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		};  // 이거를 25행 처럼 람다식으로 바꿔 쓰는 것이다.
		
		n = (int x) -> {return -x;};
		n = (x) -> {return -x;};
		n = x -> {return -x;};
		n = (int x) -> -x;
		n = (x) -> -x;
		n = x -> -x;      // 자바 공식문서에서는 젤 짧게 쓴다.             // 모두 같은 의미의 람다식이며 이렇게 줄여 쓸수 있다.
		
		System.out.println(n.neg(10)); // 객체이기 때문에 n(10) 으로 지정하면 오류가 난다.
		
		p = () -> { System.out.println("안녕!!");};
		p = () -> System.out.println("안녕!!");       // 35행과 36행도 같은 의미의 람다식이다. 중괄호를 제외 할 수 있다.
		          // 매개변수가 없으므로 선언부의 괄호를 사용해야 한다.
		
		p.print();
		
		
	}

}
