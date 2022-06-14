package d0614_02_interface;

interface Portable{
	void inMyBag();
}

public class NoteBook extends Computer implements Portable	{

	@Override
	public void inMyBag() {
		System.out.println("노트북은 가방에 있다");
		
	}

	@Override
	public void turnon() {
		System.out.println("노트북 ON");
	}

	@Override
	public void turnoff() {
		System.out.println("노트북 OFF");
	}
	
	public static void main(String[] args) {
		NoteBook n = new NoteBook();
		n.turnoff();
		n.turnon();
		n.inMyBag();
	}
	
	

}
