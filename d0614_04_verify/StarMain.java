package d0614_04_verify;

public class StarMain {
	
	public static void main(String[] args) {
		Unit[] arunit = { new Marine1(), new Zealot(), new Mutal() 
				};
		for (Unit u : arunit) {
			u.move();
			u.attack();
			if(u instanceof Marine1) 
				((Marine1)u).bunker();
			System.out.println("=".repeat(15));
			
		}
	}

}
