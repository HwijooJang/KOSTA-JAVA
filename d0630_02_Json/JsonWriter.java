package d0630_02_Json;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.json.Json;
import javax.json.JsonObject;

public class JsonWriter {

	public static void main(String[] args) {
		String path = "C:\\Users\\KOSTA\\git\\KOSTA-JAVA\\KOSTA-JAVA\\d0630_02_Json\\student.json";
		
		JsonObject student;
		student = Json.createObjectBuilder().add("id", 20).add("name", "홍길동").add("year", 2020).add("address", "가산")
				.add("department", "컴퓨터 과학").add("courses", Json.createArrayBuilder()
						.add(Json.createObjectBuilder().add("name" , "알고리즘").add("credit", 5))
						.add(Json.createObjectBuilder().add("name" , "자료구조").add("credit", 6))
						.add(Json.createObjectBuilder().add("name" , "디자인 패턴").add("credit", 2))).build();
		System.out.println(student.toString());
		
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter(path));
		    br.write(student.toString());
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
}
