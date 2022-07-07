package d0704_02_Thread;

import java.time.LocalDateTime;

class JoinThread extends Thread {
	int total = 0;
	@Override
	public void run() {
		for(int i = 0; i <=100; i++)
			total += i;
	}
//	@Override
//	public  void start() {
//		System.out.println("시작: "+LocalDateTime.now());
//	}	
}

public class JoinDemo {
	public static void main(String[] args)  {
		JoinThread t = new JoinThread();
		t.start();
		//System.out.println("총합 : "+t.total);
		//Thread.sleep(1000);
		try {
			t.join();
			System.out.println("스레드가 끝날때까지 대기: "+LocalDateTime.now());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("총합 : "+t.total);

	}

}
