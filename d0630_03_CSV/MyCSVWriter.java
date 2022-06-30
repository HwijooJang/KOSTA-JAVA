package d0630_03_CSV;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class MyCSVWriter {
   public static void main(String[] args) throws IOException {
      String path = "C:\\Users\\KOSTA\\git\\KOSTA-JAVA\\KOSTA-JAVA\\d0630_03_CSV\\student.csv";
      String[] header = {"id", "name", "year", "address", "department"};
      String[] record1 = {"1", "sadf", "123", "fsda", "asfd"};
      String[] record2 = {"2", "xzcv", "456", "zxcv", "xzcv"};
      String[] record3 = {"3", "qwer", "789", "qwer", "qwer"};
      
      List<String[]> students = new ArrayList<String[]>();
      students.add(header);
      students.add(record1);
      students.add(record2);
      students.add(record3);
      
      //System.out.println(String.join(",", record3));
      
      System.out.println(
      students.stream().skip(1).map(s->String.join(",", s)).reduce((a,b) -> a + "\n" + b).get());
    
      BufferedWriter bw;

		bw = new BufferedWriter(new FileWriter(path));
	    bw.close();

	
	  CSVWriter writer = new CSVWriter(new FileWriter(path));
	  writer.writeAll(students);
	  writer.close();
	
	
      
      
   }

}