package d0614_02_interface;

public class TV implements Controllable {
	
	public static void main(String[] args) {
		
	}

	@Override
	public void turnon() {
		System.out.println("TV ON");
	}

	@Override
	public void turnoff() {
		System.out.println("TV OFF");
	}

}
