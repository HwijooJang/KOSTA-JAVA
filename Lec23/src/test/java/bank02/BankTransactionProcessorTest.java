package bank02;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Month;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

class BankTransactionProcessorTest {
	private static final String RESOURES = "src/main/resources/";
	@Test
	void test() throws IOException {
		String path = RESOURES + "bank-data-simple.csv";
		BufferedReader reader = new BufferedReader(new FileReader(path));
		List<String> lines = reader.lines().collect(Collectors.toList());
		List<BankTransaction> bankTransactions = 
				new BankStatementCSVParser().parserLinesFrom(lines);
		BankTransactionProcessor bankTransactionProcessor = 
				new BankTransactionProcessor(bankTransactions);
		
//		bankTransactionProcessor
//		.findTransactions(t->t.getDescription().equals("Cinema"))
//		.forEach(System.out::println);
		DoubleSummaryStatistics doubleummaryStatistics =
		bankTransactions.stream()
			.mapToDouble(t->t.getAmount()).summaryStatistics();
		SummaryStatictics ss =
		new SummaryStatictics(doubleummaryStatistics.getSum(), 
				doubleummaryStatistics.getMax(), 
				doubleummaryStatistics.getMin(), 
				doubleummaryStatistics.getAverage());
		System.out.println(ss.getAverage());
		double result =
		bankTransactionProcessor.calculateTotalInMonth(Month.FEBRUARY);
		System.out.println(result);		
	    Exporter ep =  new HtmlExporter();
	    System.out.println(ep.export(ss));
	    BufferedWriter writer = 
	    		new BufferedWriter(new FileWriter(RESOURES+"aaa.html"));
	    writer.write(ep.export(ss));
	    writer.flush();
	    writer.close();
	}

}
