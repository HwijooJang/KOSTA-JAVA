package d0629_02_JSON;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.json.Json;
import javax.json.JsonObject;

public class JsonDemo1 {

	public static void main(String[] args) throws IOException {
		List<String> plantes = Arrays.asList("Mercury", "Vneus", "Terra", "Mars", "Jupiter", "Saturn", "Uranus",
				"Pluto");
		System.out.println(Json.createArrayBuilder(plantes).set(2, "Earth").add("Neptune").build());
		
		Map<String, Object> employees = new HashMap<>();
		employees.put("John Doe", 42);
		employees.put("Jill Smith", 38);
	    employees.put("Bonnie Barnes", 26);
	    employees.put("Amugae Kim", 22);
	    
	    JsonObject employee = Json.createObjectBuilder(employees).build();
	    System.out.println(employee);
	    
	    String path = "C:\\Users\\KOSTA\\git\\KOSTA-JAVA\\KOSTA-JAVA\\d0629_02_JSON\\employees.json";
	    BufferedWriter bw = new BufferedWriter(new FileWriter(path));
	    bw.write(employee.toString());
	    bw.flush();
	    bw.close();
	      

	}

}
