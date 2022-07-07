package d0704_02_Thread;

import java.lang.reflect.Member;

class Memory{
	int[] buffer;
	int size;
	int progress;
	public Memory(int size) {
		this.buffer = new int[size];
		this.size = size;
		this.progress = 0;
	}	
}

class Download extends Thread{
	Memory memory;
	public Download(Memory memory) {		this.memory = memory;	}
	@Override
	public void run() {
		for(int i = 0; i < this.memory.size; i +=2)
		{
			for(int j = 0; j < 2; j++)
			{
				memory.buffer[i+j] = i+j;
				memory.progress = i+j +1;
				try {	Thread.sleep(200);} catch (InterruptedException e) {}
			}
		}
	}	
}
class Play extends Thread{
	Memory memory;
	Play(Memory memory){this.memory = memory;	}
	@Override
	public void run() {
		for(;;) {
			for(int i = 0; i < this.memory.progress; i++) {
				System.out.print(memory.buffer[i]+" ");
			}
			System.out.println();
			if(memory.progress == memory.size) break;
			try {	Thread.sleep(500);} catch (InterruptedException e) {}}
	}	
}
public class JoinPractice {
	public static void main(String[] args)  {
		Memory memory = new Memory(16);
		Download download = new Download(memory);
		Play play = new Play(memory);
		download.start();
		play.start();
		try {
			download.join();
			play.join();
		} catch (InterruptedException e) {	e.printStackTrace();		}
		System.out.println("다운로드가 완료 전송 시작");
	}
}
