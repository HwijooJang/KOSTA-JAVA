package d0629_01_CSV;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

public class CSVBasic {

	public static void main(String[] args) throws FileNotFoundException {

		String path = "C:\\Users\\KOSTA\\git\\KOSTA-JAVA\\KOSTA-JAVA\\d0629_01_CSV\\score.csv";

		BufferedReader file = new BufferedReader(new FileReader(path));
		file.lines().forEach(System.out::println);

		System.out.println("=".repeat(15));

		List<String[]> ls = file.lines().map(l -> l.split(",")).skip(1).collect(Collectors.toList());

		ls.forEach(e -> System.out.printf(e[0], " ", e[1], " ", e[2]));// 문자열 쏼라쏼라 하면된다.


	}

}