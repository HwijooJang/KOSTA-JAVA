package d0621_05_Test;

import java.util.List;

import d0621_05_Test.PracTest2.Gender;

public class Member{
	private String name;
	private Gender gender;
	int age;
	
	public Member(String name, Gender gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member ( " + name + ", " + gender + ", " + age + " )" + "  ";
	}
	
	public static final List<Member> members = List.of(
			new Member("홍길동", Gender.남, 25),
			new Member("배장화", Gender.여, 20),
			new Member("임꺽정", Gender.남, 29),
			new Member("연흥부", Gender.남, 28),
			new Member("김선달", Gender.남, 32),
			new Member("황진이", Gender.여, 18)
				);
	
}
