package bank01;

import java.io.FileNotFoundException;

public class MainApplication {

	public static void main(String[] args) throws FileNotFoundException {
		BankStatementAnalyzer bankStatementAnalyzer 
			= new BankStatementAnalyzer();
		
		bankStatementAnalyzer.analyze
		("bank-data-simple.csv", new BankStatementCSVParser());

	}

}
