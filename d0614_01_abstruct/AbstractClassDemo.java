package d0614_01_abstruct;

public class AbstractClassDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle(3);
		c1.draw();
		Rectangle r1 = new Rectangle(4, 5);
		r1.draw();
		
		Shape s1 = new Circle(4);
		Shape s2 = r1;
		s1.draw();
		s2.draw();
		// 
		//((Rectangle)s2).witdh
		
	}
}
