package d0617_03_interfaceLamdba;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		Consumer<String> c1 = x -> System.out.println(x.toLowerCase()); // x를 받아 소문자로 변환하여 출력만 할 뿐 반환 값은 없다.
		c1.accept("Java Functional Interface");
		
		// Bi : 2개의 음수
		BiConsumer<String, String> c2 = (x, y) -> System.out.println(x + " : " + y);
        c2.accept("Java", "Lambda");
		
        //객체와 int타입을 위한 인터페이스
        ObjIntConsumer<String> c3 = (s, x) -> {int a = Integer.parseInt(s) + x; 
	                    // ObjIntConsumer 에서 obj에 해당하는 타입을 <>에 나타낸다
        System.out.println(a);
        }; 
        c3.accept("100", 50);
	
        IntConsumer c4 = x -> System.out.printf("%d * %d = %d\n", x, x, x*x);
        c4.accept(20);
	    IntConsumer c5 = c4.andThen(x -> System.out.printf("%d + 10 = %d", x, x + 10)); // c4와 andThen() 메서드에 나타난 람다식과 연결한다.
	    c5.accept(10);
	    
	}

}
