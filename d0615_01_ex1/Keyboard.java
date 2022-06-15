package d0615_01_ex1;

class Mouse{
	String name;

public Mouse(String name) {
	this.name = name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}

public class Keyboard {
	
	String name;
	public Keyboard(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Keyboard) {
			Keyboard k = (Keyboard) obj;
			if(name.equals(k.name))
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return this.name + "키보드";
	}

}
