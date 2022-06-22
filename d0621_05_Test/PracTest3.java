package d0621_05_Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import d0621_05_Test.PracTest2.Gender;

public class PracTest3 {

	public static void main(String[] args) {
		
		Stream<Member> st = Member.members.stream();
		
		System.out.println("[Member 스트림 원소]");
		st.forEach(n -> System.out.print(n));
		
		System.out.println();
		
		System.out.println("[Member 스트림을 성별로 그룹핑]");
		Map<Gender, List<Member>> st1 = Member.members.stream()
		.collect(Collectors.groupingBy(Member::getGender));
		System.out.println(st1);
		
		
		
		 
		
	}
}
