package d0704_02_Thread;

class CalThread extends Thread {
	@Override
	public void run() {		
		try {
			for(int i = 0; i < 10; i++) {
				System.out.print(".");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("\n계산 취소");
			return;
		}
		System.out.println("\n계산완료");
	}
	
}

public class Interrupt1Practice {

	public static void main(String[] args) {
		CalThread worker = new CalThread();
		worker.start();
		try {Thread.sleep(3000);} catch (InterruptedException e) {	e.printStackTrace();
		}
		worker.interrupt();
	}

}
