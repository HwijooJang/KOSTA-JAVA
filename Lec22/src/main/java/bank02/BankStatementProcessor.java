package main.java.bank02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BankStatementProcessor {
	private List<BankTransaction> bankTransactions ;
	
    public BankStatementProcessor(List<BankTransaction> bankTransactions) {
		this.bankTransactions = bankTransactions;
	}
	public double calculateTotalAmount() {
    	 double total = bankTransactions
         		.stream().mapToDouble(t-> t.getAmount()).sum();
         System.out.println(total);
    	return total;
    }
	public double calculateTotalAmountInMonth(Month month) {
		double monthTotal = bankTransactions
        		.stream()
        		.filter(t-> t.getDate().getMonth() == month)
        		.mapToDouble(t-> t.getAmount()).sum();
		return monthTotal;
	}
	public List<BankTransaction> calculateRankTop(int limit){
		return
		bankTransactions.stream().sorted(
        		Comparator.comparing(BankTransaction::getAmount).reversed())
        .limit(limit).collect(Collectors.toList());
	}
	public BankTransaction calculateMaximunConsumption() {
		return  bankTransactions.stream().filter(t-> t.getAmount() < 0)
			             .min(Comparator.comparing(BankTransaction::getAmount)).get();
	}
	public static void main(String[] args) throws FileNotFoundException {
		final String RESOURCES = "src/main/resources/";
		final Path path = Paths.get(RESOURCES+"bank-data-simple.csv");
        BufferedReader reader = new BufferedReader(new FileReader(path.toString()));
		BankStatementCSVParser csvParser = new BankStatementCSVParser();
		List<String> lines = reader.lines().collect(Collectors.toList());
        List<BankTransaction> bankTransactions = csvParser.parseLinesFromCSV(lines);
        System.out.println(bankTransactions);
        System.out.println("====총지출액======");
        double total = bankTransactions
        		.stream().mapToDouble(t-> t.getAmount()).sum();
        System.out.println(total);
        System.out.println("====월별 지출액======");
        double monthTotal = bankTransactions
        		.stream()
        		.filter(t-> t.getDate().getMonth() == Month.JANUARY)
        		.mapToDouble(t-> t.getAmount()).sum();
        System.out.println(monthTotal);
        System.out.println("====상위 3개 지출 내역======");
        bankTransactions.stream().sorted(
        		Comparator.comparing(BankTransaction::getAmount).reversed())
        .limit(3).forEach(System.out::println);
        System.out.println("====최대 소비 항목======");
        BankTransaction minBankTranscation =
        bankTransactions.stream().filter(t-> t.getAmount() < 0)
             .min(Comparator.comparing(BankTransaction::getAmount)).get();
        System.out.println(minBankTranscation.getAmount()*-1 +":"+
             minBankTranscation.getDescription());
        
	}

}
