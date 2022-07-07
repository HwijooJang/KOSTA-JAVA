package main.java.bank03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;

public class BankStatementAnalyzer {

	private final static String RESOURCES = "src/main/resources/";
	private final static BankStatementCSVParser bankStatementParser = new BankStatementCSVParser();

	public static void main(String[] args) throws FileNotFoundException {
		String path = RESOURCES + "bank-data-simple.csv";
		BufferedReader reader = new BufferedReader(new FileReader(path));
		List<String> lines = reader.lines().collect(Collectors.toList());
		List<BankTransaction> bankTreansactions = bankStatementParser.parseLinesFromCSV(lines);
		BankStatementProcessor processor = new BankStatementProcessor(bankTreansactions);
		collectSummary(processor);
	}

	private static void collectSummary(final BankStatementProcessor processor) {
		System.out.println("전체 합 : " + processor.calculateTotalAmount());
		System.out.println("1월 합 : " + processor.calculateTotalAmountInMonth(Month.JANUARY));
		System.out.println("2월 합 : " + processor.calculateTotalAmountInMonth(Month.FEBRUARY));
		System.out.println("최대 소비 : " + processor.calculateMaximunConsumption());
		System.out.println("최대 상위 2위 항목들");
		processor.calculateRankTop(2).forEach(System.out::println);

	}

}
