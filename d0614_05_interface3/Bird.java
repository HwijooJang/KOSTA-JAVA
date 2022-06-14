package d0614_05_interface3;

interface BirdInterface{
	void move();

}
public class Bird {
	void move() {
		System.out.println("새가 움직인다~~~.");
	}

	public static void main(String[] args) {
		new Bird.move();
		BirdInterface b = new BirdInterface() {

			@Override
			public void move() {
				System.out.println("새 움직");
			}
			
		};
		Bird.move();
	}
	
}
	



// public interface Bird {
// void move();
// }