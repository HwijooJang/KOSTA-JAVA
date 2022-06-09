package d0609_06_verify;

class Notebook{
	final String CPU;
	int memory;
	int storage;
	static final long GIGA = 1073741824L;
	
    Notebook(String CPU, int memory, int storage){
    	this.CPU = CPU;
    	this.memory = memory;
    	this.storage = storage;
    	
    }
    
     void upgrade(int memory, int storage) {
    	 this.memory = memory;
    	 this.storage = storage;
    	 System.out.println("업그레이드 후");
     }
     
     void printSpec() {
    	 System.out.println("CPU : " + this.CPU);
    	 System.out.println("Memory : " + this.memory * Notebook.GIGA + "바이트"); // Notebook.GIGA 는 기가바이트를 -> 바이트로 바꾼것이다
    	 System.out.println("storage : " + this.storage+ "\n");
    	 System.out.println("==============================\n");
     }
}

public class NotebookDemo {
	
	public static void main(String[] args) {
	
	Notebook n1 = new Notebook("Intel i5", 8, 250);
	Notebook n2 = new Notebook("Intel i7", 16, 500);
	Notebook n3 = new Notebook("AMD 5600H", 32, 2000);
	
	n1.printSpec();
	n1.upgrade(16, 500);
	n1.printSpec();
	
	n2.printSpec();
	n2.upgrade(32, 1000);
	n2.printSpec();
	
	n3.printSpec();
	n3.upgrade(64, 3000);
	n3.printSpec();
	
	
	}
	
}
