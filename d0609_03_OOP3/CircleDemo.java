package d0609_03_OOP3;

class Circle {
	private double radius;
	public double getRadius()	{
		return radius;
	}
	public void setRadius(double r) {
		this.radius = r;
	}
	double findArea() {
		return 3.14 * this.radius * this.radius;
	}
	void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넒이 = %.1f", x, y);
	}
	void show() {
		System.out.printf("반지름 = %.1f, 넒이 = %.1f", this.getRadius(), this.findArea());
	}
}

public class CircleDemo {
	
	public static void main(String[] args) {
		Circle c = new Circle();
		c.setRadius(10.0);
		c.show(c.getRadius(), c.findArea());

	}

}
