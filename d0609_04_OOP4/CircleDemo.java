package d0609_04_OOP4;

class Circle{
	
	private double radius;
	private String color;
	public Circle(double r) {
		this.radius = r;
		this.color = "검정";
	}
	public Circle() {
		this.radius = 10.0; 
		this.color = "하양";
	} // 디폴트 생성자 *꼭 필요 (오버로딩)
	public Circle(double r, String s) {
		this.radius = r;
		this.color = s;
	}
	public Circle(String c) {
		this.radius = 10.0;
		this.color = c;
	}
}

public class CircleDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle(10.0, "빨강");
		Circle c2 = new Circle(5.0);
		Circle c3 = new Circle("검정");
		Circle c4 = new Circle();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

	}

}
