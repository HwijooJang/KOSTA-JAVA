package d0704_02_Thread;

class StopThread extends Thread{
	public boolean stop;

	@Override
	public void run() {
		while(!stop) {
			System.out.println("실행 중....");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	   System.out.println("정상 종료");
	}	
}

public class StopDemon {
	public static void main(String[] args) throws InterruptedException {
		StopThread t = new StopThread();
		t.start();
		Thread.sleep(3);
		t.stop = true;	
	}

}
