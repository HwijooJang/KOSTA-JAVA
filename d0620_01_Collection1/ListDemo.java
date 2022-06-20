package d0620_01_Collection1;

import java.util.Arrays;
import java.util.List;

public class ListDemo {
	
	public static void main(String[] args) {
		String[] animals = { "사슴", "호랑이", "바다표범", "곰" };
		
		List<String> animal2 = Arrays.asList(animals); // Arrays클래스가 제공하는 정적 메서드로 배열을 List타입으로 반환한다.
		System.out.println(animal2);
		
		animal2.set(1, "앵무새");
		System.out.println(animal2);
		animal2.sort((a,b) -> a.length() - b.length());
		System.out.println(animal2);
		
		
		animal2.sort(((a,b) -> a.compareTo(b)));
		System.out.println(animal2);
		animal2.sort(((a,b) -> b.compareTo(a)));
		System.out.println(animal2); // compareTo 를 사용해 글자의 아스키코드를 비교해 큰 숫자로 소트시킨다. (compareTo 는 String 말고도 int 값 비교가 가능하다.)
		
//		animal2.sort(new Comparator<>() { // 21 ~ 24 행 까지 처럼 람다식으로 작성이 가능하다.
//
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		});
		System.out.println("\n" + "=".repeat(15));
		
		
		List<String> cars = List.of("그랜져", "아반떼", "제네시스", "소나타");
		System.out.println(cars);
		cars.set(1, "에쿠스"); // 불변 리스트 이므로 변수 내용을 변경할 수 없다.
		System.out.println(cars);
		
		
		
		
	}
}
