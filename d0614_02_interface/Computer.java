package d0614_02_interface;

public class Computer implements Controllable {

	public static void main(String[] args) {
		
	}
	
	@Override
	public void turnon() {
		System.out.println("컴퓨터 ON");
	}

	@Override
	public void turnoff() {
		System.out.println("컴퓨터 OFF");
	}

}
