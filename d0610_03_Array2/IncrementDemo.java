package d0610_03_Array2;

public class IncrementDemo {
    public static void main(String[] args) {
	int [] x = {0};
	int[] n;
	n = x;
    Increment(x.clone());
	// x -> n 대입이 됨
	System.out.println("호출 후의 x[0]의 값 = " + x[0]);
    System.out.println(System.identityHashCode(n[0]));	
    
    }
    
    public static void Increment(int[] n) {
    	System.out.print("increment() 메소드 안에서 ");
    	System.out.print("n[0] = " + n[0] + " ----> ");
    	
        n[0] += 1;
        
        System.out.println("n[0] = " + n[0]);
        System.out.println(System.identityHashCode(n[0]));
    }
    // return 값이 필요없는 이유 : 메인 클래스에서 배열 x와 n을 선언하고 Increment(x)를 사용함으로 써 Increment(int[] n)에서 n은 x 즉, 바로 대입을 시키기 때문에 return값이 필요없다.
    
}
