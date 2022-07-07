package d0704_02_Thread;

class Counter extends Thread {
	private int count = 0;
	public Counter(String name) {	this.setName(name);	}
	@Override
	public void run() {
		while(count++ < 5) {
			System.out.print(this.getName()+"-> ");
			try {	Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
	
}

public class PriorityDemo {

	public static void main(String[] args) {
		Counter c1 = new Counter("느긋한");
		c1.setPriority(Thread.MIN_PRIORITY);
		Counter c2 = new Counter("급한");
		c2.setPriority(Thread.MAX_PRIORITY);
		c1.start();
		c2.start();

	}

}
