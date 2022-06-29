package d0629_03_Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class YamlReader {

	public static void main(String[] args) throws FileNotFoundException {
		String path = "C:\\Users\\KOSTA\\git\\KOSTA-JAVA\\KOSTA-JAVA\\d0629_03_Yaml\\student.yml";
		String path2 = "C:\\Users\\KOSTA\\git\\KOSTA-JAVA\\KOSTA-JAVA\\d0629_03_Yaml\\student_with_courses.yml";
		
		InputStream inputStream = new FileInputStream(path);
		
		Yaml yaml = new Yaml();
		Map<String, Object> data =  yaml.load(inputStream);
		System.out.println(data);
		
		inputStream = new FileInputStream(path2);
		Map<String, Object> data2 =  yaml.load(inputStream);
		System.out.println(data2);
		
		
	}

}
