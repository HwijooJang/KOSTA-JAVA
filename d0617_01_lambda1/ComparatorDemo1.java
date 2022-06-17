package d0617_01_lambda1;

import java.util.Arrays;
import java.util.Comparator;

class Rectangle2 {
	
	private int width, height;
    public Rectangle2 (int width, int height) {
    	this.width = width;
    	this.height = height;
    }
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int findArea() {
		return this.width * this.height;
	}
	
	@Override
	public String toString() {
		return String.format("사각형[폭:%d, 높이:%d, 넒이:%d]", this.width, this.height, this.findArea());
	}
    
}

public class ComparatorDemo1 {

	public static void main(String[] args) {
		Rectangle2[] rectangles = new Rectangle2[] {
				new Rectangle2(3, 5), new Rectangle2(10, 2), new Rectangle2(6, 7)
		};
		for(Rectangle2 r : rectangles)
			System.out.println(r);
		
		Arrays.sort(rectangles, new Comparator<Rectangle2>() {

			@Override
			public int compare(Rectangle2 o1, Rectangle2 o2) {
				return o1.findArea() - o2.findArea(); // compare을 사용해서 int인자를 2개로 늘리고 전체 면적으로 비교를 한다.
			}
			
		});
		
		System.out.println("\n" + "=".repeat(15) + "\n");
		
		for(Rectangle2 r : rectangles)
			System.out.println(r);
		Arrays.sort(rectangles, (o1,o2) -> o1.getWidth() - o2.getWidth());
					
		System.out.println("\n" + "=".repeat(15) + "\n");
	
		
		for(Rectangle2 r : rectangles)
			System.out.println(r);
		
		
	}

}
