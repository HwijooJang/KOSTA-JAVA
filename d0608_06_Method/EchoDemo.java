package d0608_06_Method;

public class EchoDemo {

	public static void main(String[] args) {
		
		for(int i = 0 ; i <30 ; i++)
			System.out.print("*");
		System.out.println();
		
		
		System.out.println(linePrint("ㅁ", MethodDemo2.sumMethod(1, 5
				)));
		
		linePrint("★", 20);
		
	}
	
	
    public static int linePrint(String shape, int num) {
    	for(int i = 0 ; i < num ; i++)
    		System.out.print(shape);
    	System.out.println();
    	
		return num;
    	
    }
	
}
