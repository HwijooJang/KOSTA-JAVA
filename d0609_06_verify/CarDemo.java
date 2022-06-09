package d0609_06_verify;

class Car{
	static int carNum = 0;
	static void resetNum() {
		carNum = 0;
	}
	static void printNum() {
		System.out.println("차량 출고 대수 : " + carNum);
	}
	
	String name;
	boolean gasoline;
	
	Car(){
		carNum++;
	}
	
	Car(String name, boolean gasoline){
		this.name = name; this.gasoline = gasoline;
		carNum++;
	}
	
	void run() {
		if(this.gasoline) {
			System.out.println("부릉 부릉");
		} else System.out.println("덜컹 덜컹");
	}
	
	void stop() {
		System.out.println("끼이익");
	}
}


public class CarDemo {

	public static void main(String[] args) {
		Car c1 = new Car(); 
		c1.name = "아반떼"; c1.gasoline = false;
		Car c2 = new Car(); 
		c2.name = "소나타"; c2.gasoline = true;
		Car c3 = new Car();
		c3.name = "그랜져"; c3.gasoline = true;
		
	   c1.run(); c1.stop();
	   c2.run(); c2.stop();
	   c3.stop(); c3.run();
	   
	   System.out.println("");
	   
	   Car.printNum();
	   Car.resetNum();
	   
	   Car c4 = new Car("페라리", true);
	   c4.run(); c4.stop();
	   Car.printNum();

	}

}
