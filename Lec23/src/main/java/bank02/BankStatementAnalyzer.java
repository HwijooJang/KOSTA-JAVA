package bank02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;

public class BankStatementAnalyzer {
	private static final String RESOURES = "src/main/resources/";

	public void analyze(String fileName, 
			BankStatementParser bankStatementParser,
			Exporter exporter) throws FileNotFoundException {
		String path = RESOURES + fileName;
		BufferedReader reader = new BufferedReader(new FileReader(path));
		List<String> lines = reader.lines().collect(Collectors.toList());
		List<BankTransaction> bankTransactions = 
				bankStatementParser.parserLinesFrom(lines);
		BankTransactionProcessor bankTransactionProcessor = 
				new BankTransactionProcessor(bankTransactions);
		
		SummaryStatictics summaryStatictics = 
				bankTransactionProcessor.summarizeTransactions();
		System.out.println(exporter.export(summaryStatictics));
				
	}
}
