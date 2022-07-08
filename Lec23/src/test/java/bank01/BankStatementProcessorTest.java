package bank01;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

class BankStatementProcessorTest {

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
		//특정 금액 이상의 은행 거래 내역 찾기
//		int amount = 1000;
//		List<BankTransaction> result 
//		= bankTransactions.stream().filter(t-> t.getAmount() >= amount)
//		.sorted(Comparator.comparing(BankTransaction::getAmount))
//		.collect(Collectors.toList());
//		result.forEach(System.out::println);
		BankTransactionProcessor processor = 
				new BankTransactionProcessor(bankTransactions);
		//List<BankTransaction> result = 
		//		processor.findTransactionGreaterThanEqual(2000);
		System.out.println("=".repeat(20));
		//processor.findTransactionsInMonth(Month.JANUARY)
		//.forEach(System.out::println);
		processor.findTranscationsInMonthAndGreater(Month.FEBRUARY, 1000)
		.stream()
		.forEach(System.out::println);
		
		
	}

}
