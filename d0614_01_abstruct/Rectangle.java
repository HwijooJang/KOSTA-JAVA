package d0614_01_abstruct;

public class Rectangle extends Shape {

	int witdh, heigh;

	public Rectangle(int witdh, int heigh) {
		this.witdh = witdh;
		this.heigh = heigh;
	}
		
		@Override
		void draw() {
			System.out.println("사각형을 그림");
	}
		@Override
		public double findArea() {
			return this.witdh * this.heigh;
		}

	
}
