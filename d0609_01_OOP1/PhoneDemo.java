package d0609_01_OOP1;

class Phone {
	String model;
	int val;
	
	void print() {
		System.out.println(val + " 만원," + " 스마트폰기종 : "
				+ "" + model);
	}
}

public class PhoneDemo {	

	public static void main(String[] args) {
		Phone mp = new Phone();
		mp = new Phone();
		
		mp.model = " 아이폰13Pro";
		mp.val = 55;
		mp.print();
		
		Phone mp1 = new Phone();
		mp1 = new Phone();
		
		mp1.model = " 아이폰12mini";
		mp1.val = 30;
		mp1.print();
		
		Phone mp2 = new Phone();
		mp2 = new Phone();
		
		mp2.model = " 갤럭시S21";
		mp2.val = 60;
		mp2.print();
		
	}

}
