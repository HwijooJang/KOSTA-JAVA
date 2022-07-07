package d0704_02_Thread;

import java.time.LocalDateTime;

public class Interrupt2Demo {

	public static void main(String[] args) {
		Runnable task = ()->{
			while(!Thread.currentThread().isInterrupted()) {
				System.out.println("실행 중..."+LocalDateTime.now());
			}
			System.out.println("정상 종료...."+LocalDateTime.now());
		};
		Thread t = new Thread(task);
		t.start();
		try {	Thread.sleep(2);} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t.interrupt();

	}

}
