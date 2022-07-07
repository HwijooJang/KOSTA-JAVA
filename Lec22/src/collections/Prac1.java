package collections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import main.java.bank04.BankTransaction;

public class Prac1 {

	public static void main(String[] args) throws FileNotFoundException {
		String path = "C:\\Users\\KOSTA\\eclipse-workspace\\Lec22\\src\\main\\resources\\bank-data-simple2.csv";
		BufferedReader reader = new BufferedReader(new FileReader(path));
//		InputStream -> byte    //  FileReader -> line //  BufferedReader -> lines
		List<String> lines = reader.lines().collect(Collectors.toList());

		System.out.println(lines.get(0));
		System.out.println();
		
		System.out.println(lines.stream().map(e -> "안녕").collect(Collectors.toList()));
		// map 은 원래 나와야 될 값에서 무언가를 할 명령어를 내릴 수 있다 (즉, 내용을 바꿀 수 있다.) 하지만 데이터의 양은 줄지 않는다.
		System.out.println(Arrays.asList("30-01-2017,-100,Deliveroo".split(",")));
		System.out.println();
		
		lines.stream().map(line -> Arrays.asList(line.split(","))).forEach(System.out::println);
		// 이와 같이 작성하여 전체 리스트를 각각 출력을 할 수 있다.
		System.out.println();
		
		System.out.println(
		lines.stream().map(line -> Arrays.asList(line.split(","))).filter(e -> e.get(2).equals("Cinema")).collect(Collectors.toList()));
		System.out.println();
		
		lines.stream().map(line -> Arrays.asList(line.split(","))).filter(t -> Integer.parseInt(t.get(1)) > 1000 )
		.sorted((a,b) -> (a.get(1).compareTo(b.get(1)))).forEach(System.out::println);
		System.out.println();
		
		List<BankTransaction> bankt =
		lines.stream().map(line -> Arrays.asList(line.split(","))).filter(t -> Integer.parseInt(t.get(1)) > 1000 )
		.map(list -> new BankTransaction(LocalDate.parse(list.get(0), DateTimeFormatter.ofPattern("dd - mm - yyyy")),
			 Double.parseDouble(list.get(1)), list.get(2))).collect(Collectors.toList());
		System.out.println(bankt);
		System.out.println();
		
		bankt.stream().filter(t -> t.getAmount() > 1000)
		//.sorted((a,b) -> Double.compare(a.getAmount(), b.getAmount()))
		.sorted(Comparator.comparing(BankTransaction::getAmount).reversed())
		.forEach(System.out::println);
	
	
	
	}

}
