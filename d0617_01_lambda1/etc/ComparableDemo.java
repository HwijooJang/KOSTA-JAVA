package d0617_01_lambda1.etc;

import java.util.Arrays;

class Rectangle implements Comparable<Rectangle>{
	
	private int width, height;
    public Rectangle (int width, int height) {
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
	@Override
	public int compareTo(Rectangle o) {
		// TODO Auto-generated method stub
		return this.height-o.height; // 똑같은 변수로 비교를 해주는 것이다. height은 height 끼리, width는 width 끼리
	}
	
    
}

public class ComparableDemo {

	public static void main(String[] args) {
		Rectangle[] rectangles = new Rectangle[] {
				new Rectangle(3, 5), new Rectangle(10, 2), new Rectangle(6, 7)
		};
		for(Rectangle r : rectangles)
			System.out.println(r);
		
		Arrays.sort(rectangles); // height 로 비교를 했기 때문에 두번째 출력문을 보면 높이가 낮은 순 부터 차곡차곡 나오는것을 볼 수 있다.
	
		for(Rectangle r : rectangles)
			System.out.println(r);
		
	}

}
