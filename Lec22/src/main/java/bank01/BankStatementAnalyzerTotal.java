package main.java.bank01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

//총지출 내역 출력
public class BankStatementAnalyzerTotal {

	public static void main(String[] args) throws FileNotFoundException {
		Path path = Paths.get("src/main/resources/bank-data-simple.csv");
		System.out.println(path.toString());
		BufferedReader reader = new BufferedReader(new FileReader(path.toString()));
       // reader.lines().map(null);
	   //System.out.println(Arrays.asList("01-02-2017,6000,Salary".split(",")));
	  // reader.lines().map(line-> line.split(",")).map(s->Integer.parseInt(s[1]))
	  // .forEach(System.out::println);
	  int sum = reader.lines().map(line-> line.split(","))
			   .mapToInt(s->Integer.parseInt(s[1])).sum();
			 
	   System.out.println("=".repeat(20));
	   System.out.println("전체 지출내역 : " +sum);
	}

}
