package d0623_02_Quiz;

import java.util.Objects;

public class Transaction {
	
	private Trader trader;
	private int year;
	private int value;
	public Transaction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public Trader getTrader() {
		return trader;
	}
	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Transaction [trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}
	@Override
	public int hashCode() {
		int hash = 17;
		hash = hash * 31 + (trader == null ? 0 : trader.hashCode());
		hash = hash * 31 + year;
		hash = hash * 31 + value;
		return hash;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Transaction))
			return true;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		return Objects.equals(trader, other.trader) && value == other.value && year == other.year;
	}
	
	
}
