package d0613_08_type;

class Vehicle{
	String name = "탈 것";
	
	void whoami() {
		System.out.println("나는" + name + "입니다.");
	}
	static void move() {
		System.out.println("이동");
	}

}
class Car extends Vehicle{
	String name = "자동차";
	
	void whoami() {
		System.out.println("나는" + name + "입니다.");
	}
	
	static void move() {
		System.out.println("후진");
	}
}

public class OverTypeDemo {

	public static void main(String[] args) {
		Vehicle v = new Car();
		
		System.out.println(v.name);
		v.whoami();
		v.move();
	}
} 