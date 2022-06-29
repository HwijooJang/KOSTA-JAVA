package d0629_02_JSON;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonValue;

public class JsonReader {

	public static void main(String[] args) throws FileNotFoundException {

		String path = "C:\\Users\\KOSTA\\git\\KOSTA-JAVA\\KOSTA-JAVA\\d0629_02_JSON\\employees.json";
		String path2 = "C:\\Users\\KOSTA\\git\\KOSTA-JAVA\\KOSTA-JAVA\\d0629_02_JSON\\person.json";

		InputStream is = new FileInputStream(path);

		javax.json.JsonReader reader = Json.createReader(is);
		JsonArray employees = reader.readArray();
		reader.close();
		System.out.println(employees.toString());
		String name = employees.get(0).asJsonObject().getString("name");
		Integer age = employees.get(0).asJsonObject().getInt("age");
		
		System.out.println(name + " : " + age);
	

	    is = new FileInputStream(path2);
	    reader = Json.createReader(is);
	    JsonObject person = reader.readObject();
	    System.out.println(person.toString());
	    name = person.getString("name");
	    age = person.getInt("age");
	    boolean isMarried = person.getBoolean("isMarried");
	    JsonObject addressObject = person.getJsonObject("address");
	    addressObject.getString(name);
	    String street = addressObject.getString("street");
	    String zipcode = addressObject.getString("zipcode");
	    JsonArray phoneArray = person.getJsonArray("phone");
	    List<String> phones = new ArrayList<String>();
	    for(JsonValue phone : phoneArray) 
	    	phones.add(phone.toString());
	    
	    System.out.println(phones);
	    	
	    
	    
		
	}

}
