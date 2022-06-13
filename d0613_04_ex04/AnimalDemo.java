package d0613_04_ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Animal{
	public Animal(String s) {
	System.out.println("동물 : " + s);
	
	
     }
}

class Mammal extends Animal{
	public Mammal (String s) {
		super(s);
	}
	
	public Mammal() {
		super("원숭이");
		System.out.println("포유류 : 원숭이");
	}
	
	
}

public class AnimalDemo{
	
	public static void main(String[] args) {
		
		Mammal ape = new Mammal();
		System.out.println("=".repeat(15));
		
		Mammal lion = new Mammal("사자");
		System.out.println("=".repeat(15));
		
	    Animal a = new Mammal();
	    System.out.println("=".repeat(15));
	    
	    ape = (Mammal)a;
	    
	    ArrayList<Integer> myList = new ArrayList<>();
	    List<Integer> yourList = new LinkedList<Integer>();
	}
	
	
}

