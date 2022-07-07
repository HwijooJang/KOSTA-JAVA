package d0704_01_Thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

	public static void main(String[] args) {
		Runnable task = ()->{
			for(int i = 0; i < 5; i++) {
				System.out.println(i+" 잘가..");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		//ExecutorService exec = Executors.newCachedThreadPool();
		ExecutorService exec = Executors.newFixedThreadPool(1);

		exec.execute(task);
		//exec.submit(task);
		for(int i = 0; i < 5; i++) {
			System.out.println(i+" 안녕..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	    exec.shutdownNow();
		
	}

}
