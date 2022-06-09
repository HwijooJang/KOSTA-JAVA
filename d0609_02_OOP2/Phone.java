package d0609_02_OOP2;

public class Phone {

	public String model;
	public int val;
	public void print() {
		System.out.println(val + " 만원 " + model + " 스마트폰");
	}
	
	public Phone(String model, int val) {
		this.model = model;
		this.val = val;
	}

	public Phone() {
		// TODO Auto-generated constructor stub
	}
	
	
}
