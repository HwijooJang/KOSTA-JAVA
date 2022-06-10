package d0609_06_verify;

class Printer1 {
	int numOfPapers = 0;

	public void print(int amount) {
		numOfPapers -= amount;
	}
}

public class PrintDemo {
	public static void main(String[] args) {
		Printer1 p = new Printer1();
		p.numOfPapers = 100;
		p.print(70);
		System.out.println(p.numOfPapers);
	}
	
}
