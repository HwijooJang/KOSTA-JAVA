package d0620_04_Test;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		
		Set<Person> set = new HashSet<>();
		set.add(new Person("김열공", 20)); set.add(new Person("최고봉", 56));
		set.add(new Person("우등생", 16)); set.add(new Person("나자바", 35));
		
		for(Person s : set)
			System.out.println(s);
		
		
	
		
	}
}

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return name + " : " + age;
	}
	
	
	
	
}
