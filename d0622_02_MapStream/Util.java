package d0622_02_MapStream;

public class Util {

	public static<T> void print(T t) {
		System.out.print(t + "   ");
	}
	
	public static<T> void PrintWithParenthesis(T t) {
		System.out.print("("+ t + ")  ");
	}
	
    public static void main(String[] args) {
		Util.print("안녕");
		Util.print("안녕");
		Util.PrintWithParenthesis("안녕");
	}
	
}
