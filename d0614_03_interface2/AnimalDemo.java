package d0614_03_interface2;

interface Animal {
	void sound();
}
class Dog implements Animal {

	@Override
	public void sound() {
	    System.out.println("멍멍");
		
	}
}
	
class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("야옹");
		
	}
	
}

public class AnimalDemo {

	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		makeSound(d);
		makeSound(c);
	}
	
	public static void makeSound(Animal a) {
		a.sound();
	
	}

}
