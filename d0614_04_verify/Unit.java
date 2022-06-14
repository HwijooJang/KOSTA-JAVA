package d0614_04_verify;

public class Unit {
	void move() {
		System.out.println("이동");
	}
	void attack() {
		System.out.println("공격");
	}
}
	
class Marine1 extends Unit{
	void move() {
		System.out.println("아장 아장");
	}
	void attack() {
		System.out.println("두두두두");
	}
	void bunker() {
		System.out.println("벙커 in");
	}
	
}
	class Zealot extends Unit{
		void move() {
			System.out.println("뒤뚱 뒤뚱");
		}
		void attack() {
			System.out.println("챙 챙");
		}	
		
	}
		class Mutal extends Unit{
			void move() {
				System.out.println("퍼득퍼득");
			}
			void attack() {
				System.out.println("휙 휙");
			}

	}
	



