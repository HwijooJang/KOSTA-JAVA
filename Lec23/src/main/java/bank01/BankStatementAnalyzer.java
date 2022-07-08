package bank01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;

public class BankStatementAnalyzer {
	private static final String RESOURES = "src/main/resources/";

	public void analyze(String fileName, 
			BankStatementParser bankStatementParser) throws FileNotFoundException {
		String path = RESOURES + fileName;
		BufferedReader reader = new BufferedReader(new FileReader(path));
		List<String> lines = reader.lines().collect(Collectors.toList());
		List<BankTransaction> bankTransactions = 
				bankStatementParser.parserLinesFrom(lines);
		BankTransactionProcessor bankTransactionProcessor = 
				new BankTransactionProcessor(bankTransactions);
		
		bankTransactionProcessor.findTransactionGreaterThanEqual(1000)
		.forEach(System.out::println);
		System.out.println("=".repeat(30));
		bankTransactionProcessor.findTransactionsInMonth(Month.FEBRUARY)
		.forEach(System.out::println);
		
	}
}
