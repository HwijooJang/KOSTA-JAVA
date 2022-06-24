package d0623_02_Quiz;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.swing.AbstractAction;

public class Transactions {

	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brain = new Trader("Brain", "Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
		new Transaction(brain, 2011, 300),
		new Transaction(raoul, 2012, 1000),
		new Transaction(raoul, 2011, 400),
		new Transaction(mario, 2012, 710),
		new Transaction(mario, 2012, 700),
		new Transaction(alan, 2012, 950));
		
		// 1
		List<Transaction> tr1 = transactions.stream()
				.filter(t -> t.getYear() == 2011).collect(Collectors.toList());
		System.out.println(tr1);
		
		//List<Transaction> tr11 = transactions.stream()
			//		.filter(t -> t.getValue() == 2011)
				//	.sorted(Comparator.comparing(Transaction::getValue, (s1, s2) -> {return s1.compareTo(s2);}))
				//	.collect(Collectors.toList());
		//System.out.println(tr11);
					
		
	//	List<Transaction> tr11 = transactions.stream()
		//		.filter(t -> t.getValue() == 2011)
		//		.sorted(Comparator.comparingInt(t -> t.getValue())).collect(Collectors.toList());
	//	System.out.println(tr11);
		
		// 2
		List<String> tr2 = transactions.stream()
				.map(x -> x.getTrader().getCity()).distinct()
				.collect(Collectors.toList());
		System.out.println(tr2);
		
		// 3
		List<Trader> tr3 = transactions.stream()
				.map(Transaction::getTrader).filter(x -> x.getCity() == "Cambridge")
				.distinct().sorted((a,b) -> a.getName().compareTo(b.getName()))
				.collect(Collectors.toList());
		System.out.println(tr3);
		
		// 4
		List<String> tr4 = transactions.stream()
				.map(x -> x.getTrader().getName())
				.distinct().sorted()
				.collect(Collectors.toList());
		System.out.println(tr4);
		
		String names1 = tr4.stream().reduce("", (a, b) -> a + " " + b);
		Optional<String> names2 = tr4.stream().reduce((a,b) -> a + " - " + b);
		System.out.println(names2.get());
		
		
		
		//5
		System.out.println(transactions.stream().map(Transaction::getTrader)
				.filter(x -> x.getCity() == "Milan").distinct()
				.collect(Collectors.toList()));
		
		//6
		System.out.println(transactions.stream()
				.filter(x -> x.getTrader().getCity() == "Cambridge")
				.map(Transaction::getValue).distinct()
				.collect(Collectors.toList()));
		
		// 7
		System.out.println(transactions.stream()
				.map(Transaction::getValue)
				.reduce(Integer::max).get() 
				);
		
		System.out.println(transactions.stream()
				.max(Comparator.comparing(Transaction::getValue)).get().getValue()
				);
		
		System.out.println(transactions.stream()
				.map(x -> x.getValue()).mapToInt(x -> x).max().getAsInt()
				);
		
		
		// 8 
		
		System.out.println(transactions.stream()
				.map(Transaction::getValue).reduce(Integer::min).get());		
		
		
		
		
		
		
	}
}
