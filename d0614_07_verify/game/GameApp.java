package d0614_07_verify.game;

public class GameApp {
	
	public static void main(String[] args) {
		Fish fish = new Fish(5, 5, 2);
		Bear bear = new Bear(0, 0, 1);
		for(int i = 0 ; i < Game.MAX_X ; i++)
		  for(int j = 0 ; j <Game.MAX_Y; j++) {
			  System.out.print("-");
		  }
		System.out.println();
		
	}

}
