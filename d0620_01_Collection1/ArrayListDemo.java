package d0620_01_Collection1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> list = List.of("그랜져", "소나타", "제네시스", "소울");
		System.out.println(list.get(0)); // 배열의 인덱스 번호를 골라 하나만 출력을 할 수 있다.
		System.out.println(list.indexOf("제네시스")); // 몇 번째 위치해 있는지 뽑아내는 것
		System.out.println(list.contains("싼타페"));
		System.out.println(list + "\n");
		
		List<String> cars1 = new ArrayList<>(list); // 새로운 ArrayList를 만들어 배열을 추가한다.
		cars1.add("싼타페");
		System.out.println(cars1);
		
		List<String> cars2 = new ArrayList<>(list);
		cars2.remove("제네시스"); // 인덱스로 배열 위치를 지정해 번호로 지울 수 있고, String 문자열로 같은 문자의 값으로 지울 수 있다.
		System.out.println(cars2);
		System.out.println(cars1.containsAll(cars2)); // containsAll 이면 car1에 car2의 배열이 다 포함이 되어있다면 true
		System.out.println(list.contains(cars1.get(0))); // 하나를 리스트와 비교하고 싶다면 contains 를 사용해 비교한다.
		
		cars2.replaceAll(s -> "뉴" + s); // 전체적으로 배열 내에 글자를 추가 하고 싶을때 쓰는 것
		System.out.println(cars2);
		
		cars2.removeIf(c -> c.startsWith("소")); // "소"라는 문자가 포함된 문자열의 단어를 삭제한다. (소나타와 소울이 삭제되었다
		System.out.println(cars2);
		cars1.clear(); // 전체 배열의 데이터를 삭제 시킨다.
		System.out.println(cars1);
		
		
	}
}
