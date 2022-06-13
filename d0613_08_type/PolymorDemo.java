package d0613_08_type;

class SportsCar extends Car{
	void whoami() {
		System.out.println("나는 스포츠" + name + "이다");
	}
}

public class PolymorDemo {
	
	public static void main(String[] args) {
		Vehicle[] vi = new Vehicle[2];
		vi[0] = new Car();
		vi[1] = new SportsCar()	;
		
		for(Vehicle v : vi) {
			v.whoami();
			
		}
		
		Object[] o = new Object[3];
		
		o[0] = new Person();
		o[1] = new Student();
		o[2] = new SportsCar();
		
		for(Object ob : o) {
			if(ob instanceof Person) {
				((Person)ob).whoami();
			} else if (ob instanceof Student) {
				((Student)ob).work();
			} else ((SportsCar)ob).whoami();
			
			
			// ((Person)ob).whoami();
			
			
		}
		
	}

}
