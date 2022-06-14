package d0614_05_interface3;

public class AnonymousDemo1 {
	BirdInterface e = new BirdInterface() {
		public void move() {
			System.out.println("독수리가 난다~~~.");
		}

		void sound() {
			System.out.println("휘익~~~.");
		}
	};

	public static void main(String[] args) {
		AnonymousDemo1 a = new AnonymousDemo1();
		a.e.move();
		// a.e.sound();
	}
}