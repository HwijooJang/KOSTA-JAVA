package d0630_03_CSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;


public class MyCSVReader {

	public static void main(String[] args) throws IOException, CsvException {
      	String path = "C:\\Users\\KOSTA\\git\\KOSTA-JAVA\\KOSTA-JAVA\\d0630_03_CSV\\student.csv";
     
      	BufferedReader br = new BufferedReader(new FileReader(path));
      	List<String[]> students = 
      	br.lines().map(line -> line.split(",")).collect(Collectors.toList());
      	br.close();
      	
      	CSVReader reader = new CSVReader(new FileReader(path));
      	List<String[]> students2 = reader.readAll();
      	
      	List<MyStudent> student3 = new CsvToBeanBuilder<MyStudent>(new FileReader(path))
      			.withType(MyStudent.class).build().parse();
      	
      	System.out.println(student3);
      	
	}

}
