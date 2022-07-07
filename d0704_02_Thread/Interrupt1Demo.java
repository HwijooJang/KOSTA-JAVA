package d0704_02_Thread;

public class Interrupt1Demo {

	public static void main(String[] args) {
		Runnable task = ()->{
			try {
				while(true) {
					System.out.println("실행중 ...");				
						Thread.sleep(1);					
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("정상 종료....");
		};
		Thread t = new Thread(task);
		t.start();
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.interrupt();
	}
}
