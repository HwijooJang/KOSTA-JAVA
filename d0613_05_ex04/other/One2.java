package d0613_05_ex04.other;

import d0613_06_ex05.One;

public class One2 extends One {
	void Print() {
		
		One o  = new One();
		
	//	o.anybody;
		// o.child;
		
		System.out.println(super.child); // super에선 나오지만 선언 후 o. 으로 하였을때는 나오지 않는다
		System.out.println(super.anybody); 
		
	}

}
