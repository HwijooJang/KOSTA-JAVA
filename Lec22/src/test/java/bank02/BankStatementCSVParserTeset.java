package test.java.bank02;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import main.java.bank02.BankStatementCSVParser;

class BankStatementCSVParserTeset {

	@Test
	void test() throws FileNotFoundException {
		final String RESOURCES = "src/main/resources/";
		final Path path = Paths.get(RESOURCES+"bank-data-simple.csv");
		BankStatementCSVParser csvParser = new BankStatementCSVParser();
		BufferedReader reader = new BufferedReader(new FileReader(path.toString()));
		List<String> lines = reader.lines().collect(Collectors.toList());
		csvParser.parseLinesFromCSV(lines).forEach(System.out::println);
	}

}
