package d0704_03_Thread;
class CarThread extends Thread{
	private String who;
	private SharedCar car;
	private String where;
	public CarThread(String who, SharedCar car, String where) {
		this.who = who;
		this.car = car;
		this.where = where;
	}
	@Override
	public void run() {
		car.drive(who, where);
	}	
}
public class SynchroDemo {

	public static void main(String[] args) {
		SharedCar car = new SharedCar();
		new CarThread("홍길동", car, "부산").start();
		new CarThread("아무개", car, "전주").start();
		new CarThread("박명수", car, "대구").start();
	}

}
