package bank01;

import java.util.List;

public interface BankStatementParser {
	BankTransaction parserFrom(String line);
	List<BankTransaction> parserLinesFrom(List<String> lines);
}
