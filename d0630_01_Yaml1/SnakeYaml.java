package d0630_01_Yaml1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import d0630_01_1_YamlStudent.Course;
import d0630_01_1_YamlStudent.Student;



public class SnakeYaml {

	public static void main(String[] args) throws FileNotFoundException {
		String path = "C:\\Users\\KOSTA\\git\\KOSTA-JAVA\\KOSTA-JAVA\\d0630_01_Yaml1\\student.yml";
//		String path2 = "C:\\Users\\KOSTA\\git\\KOSTA-JAVA\\KOSTA-JAVA\\d0630_01_Yaml1\\student_with_courses.yml";
      	InputStream inputStream = new FileInputStream(path);
//		InputStream inputStream2 = new FileInputStream(path2);
//
//		Yaml yaml = new Yaml();
//		Map<String, Object> data = yaml.load(inputStream); // yaml은 항상 Map으로 타입이 맞춰져 있다.
//
//		System.out.println(data);
//
//		String id = data.get("id").toString();
//		String name = data.get("name").toString();
//		int year = Integer.parseInt(data.get("year").toString());
//		String address = data.get("address").toString();
//		String department = data.get("department").toString();
//		List<Object> courses = (List<Object>) data.get("courses");
//
//		System.out.println(id);
//		System.out.println(name);
//		System.out.println(year);
//		System.out.println(address);
//		System.out.println(department);
//		System.out.println(courses.get(0));
//		Map<String, Object> coursec0 = (Map<String, Object>) courses.get(0);
//		System.out.println(coursec0.get("name"));
//		System.out.println(coursec0.get("credits"));

		Yaml yaml2 = new Yaml(new Constructor(Student.class));
		Student student = yaml2.load(inputStream);
		System.out.println(student);
		System.out.println(student.getName());
		
		Yaml yaml3 = new Yaml(new Constructor(Course.class));
		Course course = yaml3.load(inputStream);
		System.out.println(course);

	}

}
