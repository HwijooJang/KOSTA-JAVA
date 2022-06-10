package D0610_02_Array;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// 배열을 만들고 선언하는 법
		int[] i = new int[5]; // Array 5개를 선언
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;
		
		String[] s = new String[3]; // Array 3개를 선언
		s[0] = new String("Hi");
		s[1] = new String("i'm");
		
		s[2] = new String("Hwi");
		
		double[] d = new double[2];
		d[0] = 10.2;
		d[1] = 7.5;
		
		float[] f = new float[4];
		// double 과 동일
		
		boolean[] b = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		Object[] o = new Object[3];
		o[0] = new Object();
		o[1] = new Object();
		o[2] = new Object();
		
        // 배열을 선언하면 int 문이 아닌 Array문으로 생성이 되어 저장이 되기 때문에 
		// int[] i; 식이여도 int 형이 아닌 Array 형이다
		
		
	}

}
