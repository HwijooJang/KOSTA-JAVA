package d0630_02_Json;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;

import d0630_01_1_YamlStudent.Course;
import d0630_01_1_YamlStudent.Student;


public class JsonReading {
   public static void main(String[] args) throws FileNotFoundException {
	   String path = "C:\\Users\\KOSTA\\git\\KOSTA-JAVA\\KOSTA-JAVA\\d0630_02_Json\\student.json";

      InputStream inputStream = new FileInputStream(path);
      JsonReader reader = Json.createReader(inputStream);
      JsonObject student = reader.readObject();
      reader.close();

      System.out.println(student);

      long id = student.getInt("id");
      String name = student.getString("name");
      int year = student.getInt("year");
      String address = student.getString("address");
      String department = student.getString("department");


      JsonArray JsonCourses = student.getJsonArray("courses");

      List<Course> courses = new ArrayList<Course>();
      
      for (JsonValue c : JsonCourses) {
         Course course = new Course();
         course.setName(c.asJsonObject().getString("name"));
         course.setCredits(c.asJsonObject().getInt("credit"));
         courses.add(course);
      }
      
      Student student2 = new Student();
      student2.setId(id);
      student2.setName(name);
      student2.setAddress(address);
      student2.setDepartment(department);
      student2.setYear(year);
      student2.setCourses(courses);
      
      System.out.println(student2);
   }

}