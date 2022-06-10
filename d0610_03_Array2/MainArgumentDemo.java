package d0610_03_Array2;

public class MainArgumentDemo {
 
	public static void main(String[] args) {
		
    	int sum = 0;
		for(String element : args) {
			sum += 
					Integer.parseInt(element);
			
		}
		
//		String[] myArgs = {"100", "200", "300"};
//		for(String myArg : myArgs)
//			sum += Integer.parseInt(myArg);
		System.out.println(sum);
		
		
	}
}
