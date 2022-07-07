package main.java.bank03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BankStatementCSVParser {
	private static final DateTimeFormatter DATE_PATTERN = 
			DateTimeFormatter.ofPattern("dd-MM-yyyy");
	private BankTransaction parseFromCSV(final String line) {
		String[] columns = line.split(",");
		LocalDate date = LocalDate.parse(columns[0], DATE_PATTERN);
		double amount = Double.parseDouble(columns[1]);
		String description = columns[2];
		BankTransaction bankTransaction = 
				new BankTransaction(date, amount, description);
		return bankTransaction;
	}
	public List<BankTransaction> parseLinesFromCSV(final List<String> lines){
		List<BankTransaction> bankTransactions = new ArrayList<>();
		for(final String line : lines) {
			BankTransaction bankTransaction = parseFromCSV(line);
			bankTransactions.add(bankTransaction);
		}
		return bankTransactions;
	}
/*
	public static void main(String[] args) throws FileNotFoundException {
//		final String line = "30-01-2017,-100,Deliveroo";
//	    String[] columns = line.split(",");
//		System.out.println(columns[0]);
//		System.out.println(columns[1]);
//		System.out.println(columns[2]);
//		LocalDate date = LocalDate.parse(columns[0], DATE_PATTERN);
//		double amount = Double.parseDouble(columns[1]);
//		String description = columns[2];
//		BankTransaction bankTransaction = new BankTransaction(date, amount, description);
//		System.out.println(bankTransaction);
		final String RESOURCES = "src/main/resources/";
		final Path path = Paths.get(RESOURCES+"bank-data-simple.csv");
		BufferedReader reader = new BufferedReader(new FileReader(path.toString()));
		List<String> lines = reader.lines().collect(Collectors.toList());
		List<BankTransaction> bankTransactions = new ArrayList<>();
		for(final String line : lines) {
			String[] columns = line.split(",");
			LocalDate date = LocalDate.parse(columns[0], DATE_PATTERN);
			double amount = Double.parseDouble(columns[1]);
			String description = columns[2];
			BankTransaction bankTransaction = 
					new BankTransaction(date, amount, description);
			bankTransactions.add(bankTransaction);
		}
		System.out.println(bankTransactions);
	}*/
	
}
