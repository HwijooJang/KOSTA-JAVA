package d0617_02_lambda2;

import java.util.ArrayList;
import java.util.List;

public class CarDemo {
	
	public static void main(String[] args) {
		for(Car car : Car.cars)
			System.out.println(car);
	
	System.out.println("\n".repeat(2));
	List<Car> dieselCars = findCars(Car.cars, c -> !c.isGasoline());
	
	System.out.println(dieselCars);
	
	System.out.println("\n".repeat(2));
	
	List<Car> oldCars = findCars(Car.cars, car -> car.getAge() > 10);
	System.out.println(oldCars);
	
	System.out.println("\n".repeat(2));
	
	List<Car> oldDieselCars = findCars(Car.cars, car -> !car.isGasoline() && car.getAge() > 10	);
	System.out.println(oldDieselCars);
	
	System.out.println("\n".repeat(2));
	
	// 디젤 자동차를 출력하되 모델과 연식만 나타나도록 출력
	printCars(dieselCars, (car) -> System.out.printf("%s(%d)", car.getModel(), car.getAge()));
	
	System.out.println("\n".repeat(2));
	
	//10년보다 오래된 자동차를 출력하되 모델, 연식, 주행거리만 나타나도록 출력
	printCars(oldCars, (c) -> System.out.printf("%s(%d, %d)", c.getModel(), c.getAge(), c.getMileage()));
	}
	
	
	static List<Car>findCars(List<Car> all, CarPredicate cp){
		List<Car> result = new ArrayList<Car>();
		
		for(Car car : all) {
			if(cp.test(car))
				result.add(car);
		}
		return result;
		
	}
	
	static void printCars(List<Car> all, CarConsumer cc ) {
		for(Car car : all) cc.apply(car);
		
	}
	

}
