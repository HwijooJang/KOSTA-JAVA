package main.java.bank01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

//월별 지출 내역 조회
public class BankStatementAnalyzerMonth {

	private static final String RESOURCES = "src/main/resources/";
	
	public static void main(String[] args) throws FileNotFoundException {
		final Path path = Paths.get(RESOURCES+"bank-data-simple.csv");
	    final DateTimeFormatter DATE_PATTERN =	
	    		DateTimeFormatter.ofPattern("dd-MM-yyyy");
	    final LocalDate date = LocalDate.parse("30-01-2017",DATE_PATTERN );
	    if( date.getMonth() == Month.JANUARY)
	    	System.out.println("1월");
	    else 
	    	System.out.println("다른달");
	    
	    BufferedReader reader = new BufferedReader(new FileReader(path.toString()));
	   // reader.lines().forEach(System.out::println);
	    System.out.println("=".repeat(20));
	    double sum =  reader.lines().map(line-> line.split(","))
	    	.filter(s-> LocalDate.parse(s[0],DATE_PATTERN ).getMonth() == Month.JANUARY)
	    	.mapToDouble((s-> Integer.parseInt(s[1])))
	    	.sum();
	    	//.forEach(System.out::println);
	    	//.forEach(s->System.out.println(s[0]+":"+s[1]+":"+s[2]));
	    System.out.println("1월 지출 내역 : "+ sum);
	}

}
