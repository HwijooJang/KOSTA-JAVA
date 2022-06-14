package d0614_06_verify.challenge.one;

interface Countable{
	void count();
}

class Bird implements Countable{
	String name;
	
		public Bird(String name) {
		this.name = name;
	}
		
	@Override
	public void count() {
		System.out.println("2마리 " + name + " 있다");
	}
	void fly() {
		System.out.println("2마리 " + name + " 난다");	
	}
	
}

class Tree implements Countable{
	String name;
	
	public Tree(String name) {
	this.name = name;
	
	}

	@Override
	public void count() {
		System.out.println("5그루 " + name + " 있다");
	}
	
	void ripen() {
        System.out.println("5개 " + name + " 익는다.");		
	}
	
}

public class CountableTest {

	public static void main(String[] args) {
		
	
		
		Countable[] c = {new Bird("참새"), new Bird("부엉이"),
				new Tree("사과나무"), new Tree("동백나무")};
	
		for(Countable Con : c) Con.count();
	
	}
	
	}



