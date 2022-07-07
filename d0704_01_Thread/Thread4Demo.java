package d0704_01_Thread;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

class WorkerThread extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("안녕 ..."+ LocalDateTime.now());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}

public class Thread4Demo {

	public static void main(String[] args) {
		
		Thread t =  new WorkerThread();
		t.start();
		
		new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 5; i ++) {
					System.out.println("나두..."+LocalDateTime.now());
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TOD Auto-generated catch block
						e.printStackTrace();
					}}			}			
		}.start();
		
		
		for(int i = 0; i < 5; i++) {
			System.out.println("그래 ..."+ LocalDateTime.now());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
