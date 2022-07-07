package d0704_01_Thread;

class MyRunable implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("두번째 스레드...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}	
}

public class Thread1Demo {
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(()-> {
			for(int i = 0; i < 5; i++) {
				System.out.println("첫번째 스레드...");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Runnable task = ()-> {
			for(int i = 0; i < 5; i++) {
				System.out.println("네번째 스레드...");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		
		Thread t2 = new Thread(new MyRunable());
		Thread t3 = new Thread(new YourRunable());
		Thread t4 = new Thread(task);
		t1.start();
		t2.start();
		t3.start();	
		t4.start();
		for(int i = 0; i < 5; i++) {
			System.out.println("메인스레드...");
			Thread.sleep(1000);
		}
		
	}
	
}
