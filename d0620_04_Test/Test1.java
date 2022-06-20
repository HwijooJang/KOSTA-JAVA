package d0620_04_Test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		
		List<String> ani = new ArrayList<>();
		ani.add("갈매기");
		ani.add("나비");
		ani.add("다람쥐");
		ani.add("라마");
		
		ani.removeIf(c -> c.length() >= 3);
		System.out.println(ani);
	}
	
}
