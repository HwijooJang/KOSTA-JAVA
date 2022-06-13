package d0613_07_final;

class Good{}
class Better extends Good{}
final class Best extends Better{} // Best 클래스는 final로 지정이 되어 더 이상 자식클래스로 활용할 수 없다.

// class NumberOne extends Best{}

public class FinalClassDemo {
	
	public static void main(String[] args) {

		new Best();
		
		
		
	}

}
