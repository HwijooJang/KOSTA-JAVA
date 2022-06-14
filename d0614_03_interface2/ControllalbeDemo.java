package d0614_03_interface2;

import d0614_02_interface.Computer;
import d0614_02_interface.Controllable;
import d0614_02_interface.NoteBook;
import d0614_02_interface.TV;

public class ControllalbeDemo {

	public static void main(String[] args) {
		Controllable[] controllables = { new TV(), new Computer(), new NoteBook() };
		for(Controllable c : controllables) {
			c.turnon();
			c.turnoff();
			c.repair();
		}
		
		Controllable.reset();
		
	}

}
