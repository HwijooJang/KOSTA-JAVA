package d0614_02_interface;

public class ControllableDemo  {
	
public static void main(String[] args) {
		
	TV tv = new TV();
	Computer C = new Computer();
	C.turnon();
	C.turnoff();
	tv.repair();
	C.repair();
	Controllable.reset();
	
	System.out.println(C instanceof Controllable);
		
		
	
	
	}

}
