package d0617_01_lambda1;

interface NewObject<T> {
	T getObject(T o);
}

interface NewArray<T> {
	T[] getArray(int size);
}

public class ConstructorRefDemo {  // 생성자 참조 예시

	public static void main(String[] args) {
		NewObject<String> s; // 
		NewArray<Integer> i;
		
		// s = x -> new String(x); // 18행처럼 생성자 참조를 해 작성이 가능하다.
		s = String::new; // 생성자 참조이다.
		String str = s.getObject("사과");
	    System.out.println(str);
	
	                          //x는 getArray() 이다.
	    // i = x -> new Integer[x]; // 23행처럼 생성자 참조를 해 작성이 가능하다.
	    i = Integer[]::new; // 생성자 참조
	    Integer[] array = i.getArray(20);
	    array[0] = 10;
	    array[1] = 20;
	    
	
	
	}
	

}
