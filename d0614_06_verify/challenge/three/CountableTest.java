package d0614_06_verify.challenge.three;

abstract class Countable{
	protected String name;
	protected int num;
	
	abstract void count();
	
	Countable(String name, int num){
		this.name = name;
		this.num = num;
	}
	
}

class Bird extends Countable{
	public Bird(String name, int num) {
		super(name, num);
	}
	@Override
	public void count() {
		System.out.println(num + "마리 " + name + " 있다");
	}
	void fly() {
		System.out.println(name + " 난다");	
	}
	
}

class Tree extends Countable{
	public Tree(String name, int num) {
		super(name, num);
	}
	
	@Override
	public void count() {
		System.out.println(num + "그루 " + name + " 있다");
	}
	
	void ripen() {
        System.out.println(name + " 익는다.");		
	}
	
}

public class CountableTest {

	public static void main(String[] args) {
		
	
		
		Countable[] c = {new Bird("참새", 5), new Bird("비둘기" , 6), 
				new Tree("동백나무" , 2), new Tree("사과나무" , 10)};
	
		for(Countable con : c)
			con.count();
		
		for (int i = 0; i < c.length; i++) {
			if (c[i] instanceof Bird)
				((Bird) c[i]).fly();
			else
				((Tree) c[i]).ripen();

		
		}
	
	
	}

}

