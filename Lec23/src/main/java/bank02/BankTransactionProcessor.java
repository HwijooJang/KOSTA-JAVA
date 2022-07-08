package bank02;
//Ư�� �ݾ� �̻��� ���� �ŷ� ���� ã��
//Ư�� ���� ����� ����ã��
//Ư�� ���̳� �ݾ����� ����� ���� �˻� ã��

import java.time.Month;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class BankTransactionProcessor {
     private final List<BankTransaction> bankTransactions;

	public BankTransactionProcessor(List<BankTransaction> bankTransactions) {
		this.bankTransactions = bankTransactions;
	}	
	
	public SummaryStatictics summarizeTransactions() {
		DoubleSummaryStatistics dss = bankTransactions.stream()
				.mapToDouble(BankTransaction::getAmount)
				.summaryStatistics();
		return new SummaryStatictics
				(dss.getSum(), dss.getMax(), dss.getMin(), dss.getAverage());
	}
	
	public double summarizeTransactions(BankTranscationSummarizer bts) {
		double result = 0;
		for(BankTransaction t : bankTransactions) {
			result = bts.summarize(result, t);
		}
		return result;
	}
	
	public double calculateTotalInMonth(Month month) {		
		return summarizeTransactions((acc,t)-> 
				t.getDate().getMonth() == month? acc+t.getAmount():acc);
	}
	
	public List<BankTransaction> 
	findTransactions(BankTransactionFilter bankTransactionFilter){		
		return bankTransactions.stream()
				.filter(t-> bankTransactionFilter.test(t))
				.collect(Collectors.toList());
	}
	
	//Ư�� ����� ���� ���� ū ���� �˻�
	public List<BankTransaction> 
	findTransactionGreaterThanEqual(int amount){		
		return findTransactions(t-> t.getAmount() >= amount);
	}
   
    
}
