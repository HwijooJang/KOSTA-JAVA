package bank02;

//������ description statictics
//���� ���� ���� sum, max, min ,average
public class SummaryStatictics {
	private final double sum;
	private final double max;
	private final double min;
	private final double average;
	public SummaryStatictics(double sum, double max, double min, double average) {
		this.sum = sum;
		this.max = max;
		this.min = min;
		this.average = average;
	}
	public double getSum() {		return sum;	}
	public double getMax() {		return max;	}
	public double getAverage() {		return average;	}
	public double getMin() {		return min;	}
	
}
