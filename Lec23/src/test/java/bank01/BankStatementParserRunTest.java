package bank01;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.text.html.parser.Parser;

import org.junit.jupiter.api.Test;

class BankStatementParserRunTest {
	private static final String RESOURES = "src/main/resources/";

	@Test
	void test() throws FileNotFoundException {
		BankStatementParser parser = 
				new BankStatementCSVParser();
		//parser.parser();
		String fileName = "bank-data-simple.csv";
		String path =RESOURES+ fileName;
		BufferedReader reader = new BufferedReader(new FileReader(path));		
		List<String> lines = reader.lines().collect(Collectors.toList());
		List<BankTransaction> bankTransactions = parser.parserLinesFrom(lines);
		System.out.println(bankTransactions);
	}

}
