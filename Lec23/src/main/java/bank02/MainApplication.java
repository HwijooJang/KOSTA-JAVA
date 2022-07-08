package bank02;

import java.io.FileNotFoundException;

public class MainApplication {
	public static void main(String[] args) throws FileNotFoundException {
		BankStatementAnalyzer bankStatementAnalyzer 
			= new BankStatementAnalyzer();
		BankStatementParser bankStatementParser = 
				new BankStatementCSVParser();
		Exporter exporter = new HtmlExporter();
		bankStatementAnalyzer.analyze
		("bank-data-simple.csv", bankStatementParser,exporter);
	}
}
