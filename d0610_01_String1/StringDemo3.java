package d0610_01_String1;

public class StringDemo3 {

	public static void main(String[] args) {
		System.out.println(String.format("%s-%d", "JDK", 11));
		
		for(int i = 1 ; i < 13 ; i++) {
		String month = String.format("%02d", i);
		System.out.println(month);

		}
		// String f = String.join("," , "apple" , "banana" , "cherry" , "durian"); // 조인을 이용해서 문자열에 넣어준다.
		// String.valueOf(3.14); // 숫자형 데이터를 문자형 데이터로 전환할 때 사용
	}

}
