package d0609_03_OOP3;

public class PersonDemo {

	public static void main(String[] args) {
		Person p = new Person();
		Person yp = new Person(13, 10, 20, "장휘주");
		p.setLevel(1);
		p.setPower(2);
		p.setSpeed(3);
		p.name = "장휘주";
		p.show();
		yp.show();

	}

}
