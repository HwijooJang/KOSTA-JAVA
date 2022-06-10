package d0609_06_verify;

class Printer2 {
	private int numOfPapers = 0;

	public Printer2(int numOfPapers) {
		this.numOfPapers = numOfPapers;
	}

	public void feed(int amount) {
		numOfPapers += amount;
	}

	public void print(int amount) {
		if (numOfPapers == 0)
			System.out.println("용지가 없습니다.");
		else if (numOfPapers < amount) {
			System.out.printf("모두 출력하려면 용지가 %d매 부족합니다. ", amount - numOfPapers);
			System.out.println(numOfPapers + "장만 출력합니다.");
			numOfPapers = 0;
		} else {
			numOfPapers -= amount;
			System.out.print(amount + "장 출력했습니다. ");
			System.out.println("현재 " + numOfPapers + "장 남아있습니다.");
		}
	}
}

public class PrintDemo2 {

	public static void main(String[] args) {
		Printer2 p = new Printer2(10);
		p.print(2);
		p.print(20);
		p.print(10);


	}

}
