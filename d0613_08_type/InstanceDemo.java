package d0613_08_type;

public class InstanceDemo {

	public static void main(String[] args) {
		Student s = new Student();
		s.work();
		s.whoami();
		System.out.println("=".repeat(15));
		
		Person p = new Person();
		p.whoami();
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(p));
		System.out.println("=".repeat(15));
		
		p = s;
		p.whoami();;
		p.name = "학생";
		p.whoami();
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(p));
		((Student)p).work();
		
		Object o = p;
		((Person)o).whoami();
		
		o = s;
		((Student)o).work();
	}
	
}
