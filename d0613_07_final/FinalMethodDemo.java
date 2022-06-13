package d0613_07_final;



class chess{
	enum ChessPlayer {
		WHITE, BLACK
	}
	final ChessPlayer getFirstPlayer() {
	    return ChessPlayer.WHITE; 		
		}
}
class WorldClass extends chess{
	
}

public class FinalMethodDemo {

	public static void main(String[] args) {
		
		WorldClass w = new WorldClass();
		w.getFirstPlayer();
	}
	
}
