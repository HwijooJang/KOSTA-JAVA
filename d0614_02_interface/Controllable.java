package d0614_02_interface;

public interface Controllable {
	
	default void repair() {
		this.show("장비 수리");
	}
	
	static void reset() {
	   System.out.println("장비 초기화");
	}
	
	private void show (String s) {
		System.out.println(s);
	}
	
	void turnon();
	void turnoff();
}
