package d0614_06_verify.challenge.two;

interface Countable{
	void count();
}

class Bird implements Countable{
	String name;
	static int count = 0;
	
		public Bird(String name) {
		this.name = name;
		Bird.count += 1; // 새를 카운트를 하는 법 this.count = count; 로 사용 가능
	}
		
	@Override
	public void count() {
		System.out.println(Bird.count + "마리 " + name + " 있다");
	}
	void fly() {
		System.out.println(name + " 난다");	
	}
	
}

class Tree implements Countable{
	String name;
	static int count	=	0;
	
	public Tree(String name) {
	this.name = name;
	Tree.count += 1;
	}

	@Override
	public void count() {
		System.out.println(Tree.count + "그루 " + name + " 있다");
	}
	
	void ripen() {
        System.out.println(name + " 익는다.");		
	}
	
}

public class CountableTest {

	public static void main(String[] args) {
		
	
		
		Countable[] c = {new Bird("참새"), new Bird("부엉이"),
				new Tree("사과나무"), new Tree("동백나무")};
	
		for(Countable Con : c) { 
		Con.count();
		if(Con instanceof Bird)
			((Bird)Con).fly();
		if(Con instanceof Tree)
			((Tree)Con).ripen();
	
		}
	}
	
	}



