package d0620_02_Collection2;

import java.util.HashMap;
import java.util.Map;

class Fruits{
	private String name;

	public Fruits(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Fruits(%s)", this.name);
	}
	
	
	
}


public class HashMapDemo2 {

	public static void main(String[] args) {
		Map<Fruits, Integer> map = new HashMap<>();
		map.put("사과", 5	);
		
		
		
		
	}

}
