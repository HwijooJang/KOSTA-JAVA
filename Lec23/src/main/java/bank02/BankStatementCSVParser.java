package bank02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

public class BankStatementCSVParser implements BankStatementParser{
	private static final DateTimeFormatter DATE_PATTERN
	= DateTimeFormatter.ofPattern("dd-MM-yyyy");

//	public void parser() throws FileNotFoundException {
//		String fileName = "bank-data-simple.csv";
//		String path =RESOURES+ fileName;
//		BufferedReader reader = new BufferedReader(new FileReader(path));		
//		List<String[]> lines = reader.lines().
//		map(line-> line.split(",")).collect(Collectors.toList());
//		 List<BankTransaction> bankTransactions =
//		    lines.stream().map(cols-> {
//		    	LocalDate d = LocalDate.parse(cols[0], DATE_PATTERN );
//		 	    double a = Double.parseDouble(cols[1]);	    
//		 	    return new BankTransaction(d, a, cols[2]);
//		    }).collect(Collectors.toList());
//			System.out.println(bankTransactions);
//	}	
	public BankTransaction parserFrom(String line) {
		final String[] columns = line.split(",");
		final LocalDate date = LocalDate.parse(columns[0], DATE_PATTERN );
		final double amount = Double.parseDouble(columns[1]);	    
 	    return new BankTransaction(date, amount, columns[2]);		
	}
	public List<BankTransaction> parserLinesFrom(List<String> lines){
		return lines.stream().map(this::parserFrom).collect(Collectors.toList());
	}
	
}
