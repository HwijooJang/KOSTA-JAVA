package d0630_01_Yaml1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import d0630_01_1_YamlStudent.Student;

public class YamlReader {
   public static void main(String[] args) throws IOException {
	   String path = "C:\\Users\\KOSTA\\git\\KOSTA-JAVA\\KOSTA-JAVA\\d0630_01_Yaml1\\student_with_courses.yml";
      
      
//      Yaml yaml = new Yaml();
      
      Yaml yaml = new Yaml(new Constructor(Student.class));
      InputStream inputStream = new FileInputStream(path);
      Student student = yaml.load(inputStream);
      System.out.println(student);
      inputStream.close();
      
//      Student student = yaml.load(inputStream);
//      System.out.println(student);
      
      
//      inputStream.close();
   }
   
}