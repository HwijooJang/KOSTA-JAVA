package d0615_02_ex2;

import java.util.ArrayList;
import java.util.List;

class Garbage{
	public int no;
	
	public Garbage(int no) {
		this.no = no;
		System.out.printf("Garbage(%d) 생성\n" , no );
	}
	
	protected void finalize() {
		System.out.printf("Garbage(%d) 수거\n" , no);
	}
}

public class GarbageDemo {
	public static void main(String[] args) {
		List<Garbage> list = new ArrayList<Garbage>(); // 지금처럼 참조변수를 바로 대입을 했기 때문에 자동적으로 삭제가 된다.
		
		for(int i = 0 ; i < 3 ; i++) {
			list.add(new Garbage(i));
			new Garbage(i+3); // 대입이 된 i빼고 +3은 참조 변수에 대입하지 않았기 때문에 자동삭제가 되지않고 바로 가비지가 된다.
		}
		System.gc(); // 이거 하면 안좋음 아마도?
		
	}

}
