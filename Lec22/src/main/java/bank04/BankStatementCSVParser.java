package main.java.bank04;

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
//기능 응집
public class BankStatementCSVParser implements BankStatementParser{
	private static final DateTimeFormatter DATE_PATTERN = 
			DateTimeFormatter.ofPattern("dd-MM-yyyy");
	public BankTransaction parseFrom(final String line) {
		String[] columns = line.split(",");
		LocalDate date = LocalDate.parse(columns[0], DATE_PATTERN);
		double amount = Double.parseDouble(columns[1]);
		String description = columns[2];
		BankTransaction bankTransaction = 
				new BankTransaction(date, amount, description);
		return bankTransaction;
	}
	public List<BankTransaction> parseLinesFrom(final List<String> lines){
		List<BankTransaction> bankTransactions = new ArrayList<>();
		for(final String line : lines) {
			BankTransaction bankTransaction = parseFrom(line);
			bankTransactions.add(bankTransaction);
		}
		return bankTransactions;
	}
	@Override
	public BankTransaction parseFromCSV(String line) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<BankTransaction> parseLinesFromCSV(List<String> lines) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
