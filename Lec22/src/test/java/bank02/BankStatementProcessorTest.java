package test.java.bank02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import main.java.bank02.BankStatementCSVParser;
import main.java.bank02.BankStatementProcessor;
import main.java.bank02.BankTransaction;

public class BankStatementProcessorTest {

	@Test
	void test() throws FileNotFoundException {
		final String RESOURCES = "src/main/resources/";
	      final Path path = Paths.get(RESOURCES+"bank-data-simple.csv");
	      BufferedReader reader = 
	            new BufferedReader(new FileReader(path.toString()));
	      List<String> lines = reader.lines().collect(Collectors.toList());
	      BankStatementCSVParser csvParser = new BankStatementCSVParser();      
	      BankStatementProcessor processor 
	         = new BankStatementProcessor(csvParser.parseLinesFromCSV(lines));
	      System.out.println(processor.calculateTotalAmount());
	      System.out.println(processor.calculateTotalAmountInMonth(Month.FEBRUARY));
	      System.out.println(processor.calculateMaximunConsumption());

		
	}
}
