package main.java.bank04;

import java.io.FileNotFoundException;

public class MainApp {

	public static void main(String[] args) throws FileNotFoundException {
		final BankStatementAnalyzer bankStatementAnalyzer
		= new BankStatementAnalyzer();
		final BankStatementParser bankStatementParser
		= new BankStatementCSVParser();
		bankStatementAnalyzer.analyze("bank-data-simple.csv", 
				bankStatementParser);

	}

}
