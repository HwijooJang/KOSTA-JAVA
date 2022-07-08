package bank01;
//Ư�� �ݾ� �̻��� ���� �ŷ� ���� ã��
//Ư�� ���� ����� ����ã��
//Ư�� ���̳� �ݾ����� ����� ���� �˻� ã��

import java.time.Month;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BankTransactionProcessor {
     private final List<BankTransaction> bankTransactions;

	public BankTransactionProcessor(List<BankTransaction> bankTransactions) {
		this.bankTransactions = bankTransactions;
	}	
	public List<BankTransaction> 
	findTransactionGreaterThanEqual(int amount){		
		List<BankTransaction> result 
		= bankTransactions.stream().filter(t-> t.getAmount() >= amount)
		.sorted(Comparator.comparing(BankTransaction::getAmount))
		.collect(Collectors.toList());
		return result;
	}
    public List<BankTransaction> findTransactionsInMonth(Month month){
       	return bankTransactions.stream()
    			.filter(t->t.getDate().getMonth() == month)
    	    	.collect(Collectors.toList());
    }
    
    public List<BankTransaction> findTranscationsInMonthAndGreater
    (Month month, int amount){
    	
    	return bankTransactions.stream()
        		.filter(t -> t.getAmount() >= amount && 
        		t.getDate().getMonth() == month)
        		.collect(Collectors.toList());
    }
    
}
