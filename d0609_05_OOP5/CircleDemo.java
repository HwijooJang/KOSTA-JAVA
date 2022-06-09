package d0609_05_OOP5;

class Circle{
	double radius;
	int numCircle = 0;
	
	static int numOfCircles = 0;
	
	public Circle(double radius) {
		this.radius = radius;
		Circle.numOfCircles++;
		numCircle++;
	}
	
	
	
	
}

class Rectangle {
	double width; double height;
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		Circle.numOfCircles++;
	}
}

public class CircleDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle(10.0);
		Circle c2 = new Circle(5.0);
		Circle c3 = new Circle(7.5);
		Circle c4 = new Circle(1.0);
		System.out.println("원의 갯수 : " + Circle.numOfCircles);
		System.out.println("원의 갯수 : " + c2.numCircle);
		

	}

}
