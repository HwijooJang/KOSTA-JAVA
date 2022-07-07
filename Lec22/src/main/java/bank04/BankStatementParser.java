package main.java.bank04;

import java.util.List;

public interface BankStatementParser {
    BankTransaction parseFromCSV(final String line);  
	List<BankTransaction> parseLinesFrom(List<String> lines);
}
