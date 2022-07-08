package bank01;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

class BankStatementParserTest {
	private static final String RESOURES = "src/main/resources/";
	private static final DateTimeFormatter DATE_PATTERN
		= DateTimeFormatter.ofPattern("dd-MM-yyyy");
	@Test
	void test() throws FileNotFoundException {
		String fileName = "bank-data-simple.csv";
		String path =RESOURES+ fileName;
		BufferedReader reader = new BufferedReader(new FileReader(path));
		List<String[]> lines = reader.lines().
				map(line-> line.split(",")).collect(Collectors.toList()) ; 
		System.out.println(lines);
		String[] columns = "30-01-2017,-100,Deliveroo".split(",");
		System.out.println(columns[0]);
		System.out.println(columns[1]);
		System.out.println(columns[2]);
		BankTransaction bankTransaction ;
		
	    LocalDate date = LocalDate.parse(columns[0], DATE_PATTERN );
	    double amount = Double.parseDouble(columns[1]);	    
	    bankTransaction = new BankTransaction(date, amount, columns[2]);
	    
	    List<BankTransaction> bankTransactions =
	    lines.stream().map(cols-> {
	    	LocalDate d = LocalDate.parse(cols[0], DATE_PATTERN );
	 	    double a = Double.parseDouble(cols[1]);	    
	 	    return new BankTransaction(d, a, cols[2]);
	    }).collect(Collectors.toList());
		System.out.println(bankTransactions);
	}

}
