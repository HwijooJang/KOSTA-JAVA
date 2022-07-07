package main.java.bank04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;

public class BankStatementAnalyzer {
	private final static String RESOURCES = "src/main/resources/";

	public void analyze(final String fileName, final BankStatementParser bankStatementParser)
			throws FileNotFoundException {
		String path = RESOURCES + fileName;
		BufferedReader reader = new BufferedReader(new FileReader(path));
		List<String> lines = reader.lines().collect(Collectors.toList());
		List<BankTransaction> bankTransactions = bankStatementParser.parseLinesFrom(lines);
		BankStatementProcessor processor = new BankStatementProcessor(bankTransactions);
		collectSummary(processor);
	}

	private static void collectSummary(final BankStatementProcessor processor) {
		System.out.println("전체 합: " + processor.calculateTotalAmount());
		System.out.println("일월 합: " + processor.calculateTotalAmountInMonth(Month.JANUARY));
		System.out.println("이월 합: " + processor.calculateTotalAmountInMonth(Month.FEBRUARY));
		System.out.println("최대소비: " + processor.calculateMaximunConsumption());
		System.out.println("최대 상위 2위 항목들");
		processor.calculateRankTop(2).forEach(System.out::println);
	}
}
