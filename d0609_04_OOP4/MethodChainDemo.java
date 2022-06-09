package d0609_04_OOP4;

class Person{
	String name;
	int age;
	public Person setName(String name) {
		this.name = name;
		return this;
	}
	public Person setAge(int age) {
		this.age = age;
		return this;
	}
	
	public void sayHello() {
		System.out.println("안녕 나는 " + name + " 이고 " + age + " 살이야.");
	}
}

public class MethodChainDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("장휘주").setAge(26).sayHello(); // 체인처럼 .으로 메소드에 여러가지 명령을 할 수 있다.
		
		
		
//		int a = 10, b = 20;
//				a = b;
//				
//				Object o1 = new Object(); // 모든 객체는 Object를 받는다.
//				Person p1 = new Person();
//				Person p2;
//				p2 = p1;
//				o1 = p2;
		
		// "anyway".toUpperCase().toLowerCase().length(); // 이런 식으로 계속 이어지는게 MethodChain 이라고 한다.
		// "anything".substring(2, 3).toUpperCase(); // substring 글자를 자르겠다.
		

	}

}
