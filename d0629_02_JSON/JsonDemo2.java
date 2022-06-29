package d0629_02_JSON;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.stream.JsonCollectors;

public class JsonDemo2 {

	public static void main(String[] args) throws IOException {
		JsonArray employees;

		employees = Json.createArrayBuilder()
				.add(Json.createObjectBuilder().add("name", "John").add("age", 46))
				.add(Json.createObjectBuilder().add("name", "Joan").add("age", 26))
				.add(Json.createObjectBuilder().add("name", "Trevor").add("age", 31))
				.add(Json.createObjectBuilder().add("name", "Sally").add("age", 42))
				.add(Json.createObjectBuilder().add("name", "Frank").add("age", 26)).build();

		System.out.println(employees.toString());
		
		JsonObject jo =
		employees.getValuesAs(JsonObject.class).stream().filter(x -> x.getInt("age") > 40)
		.collect(JsonCollectors.toJsonObject(x -> x.asJsonObject().getString("name"),
				x -> x.asJsonObject().get("age")));

		System.out.println(jo);
		
		String path = "C:\\Users\\KOSTA\\git\\KOSTA-JAVA\\KOSTA-JAVA\\d0629_02_JSON\\employees.json";
		  BufferedWriter bw = new BufferedWriter(new FileWriter(path));
		    bw.write(employees.toString());
		    bw.flush();
		    bw.close();
		
		    
	}
}
