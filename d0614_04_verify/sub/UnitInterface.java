package d0614_04_verify.sub;

public interface UnitInterface {
	void move();
	void attack();
	
	
}
	
class Marine1 implements UnitInterface{
	public void move() {
		System.out.println("아장 아장");
	}
	public void attack() {
		System.out.println("두두두두");
	}
	public void bunker() {
		System.out.println("벙커 in");
	}
	
}
	class Zealot implements UnitInterface{
		public void move() {
			System.out.println("뒤뚱 뒤뚱");
		}
		public void attack() {
			System.out.println("챙 챙");
		}	
		
	}
		class Mutal implements UnitInterface{
			public void move() {
				System.out.println("퍼득퍼득");
			}
			public void attack() {
				System.out.println("휙 휙");
			}

	}
	



