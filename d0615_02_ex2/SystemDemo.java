package d0615_02_ex2;

public class SystemDemo {

	public static void main(String[] args) {
		int[] src = {1,2,3,4,5,6};
		//src = new int[] {10,20,30,40,50,60};
		int[] dst = {100,200,300,400,500,600,700};
		
		System.arraycopy(src, 2, dst, 3, 4);
		for(int e : dst){
			System.out.print(e + " ");
		System.out.println();
		
		System.out.println(System.currentTimeMillis());
		System.out.println(System.nanoTime());
		System.out.println(System.getenv("JAVA_HOME"));
		System.out.println(System.getProperty("os.name"));
		
		}
		
		
	}

} 