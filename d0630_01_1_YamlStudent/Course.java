package d0630_01_1_YamlStudent;

public class Course {
	private String name;
	private int credits;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", credits=" + credits + "]";
	}

}
