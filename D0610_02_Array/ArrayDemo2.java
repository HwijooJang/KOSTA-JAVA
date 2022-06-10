package D0610_02_Array;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int[][] score ={{70, 80, 90, 100}, {90, 80, 40, 60}, {50, 70, 80, 60}};
		System.out.println(score[2].getClass().getTypeName());
		System.out.println(score[2].length);
		// score[1][1]; // 앞에가 y이며 뒤에가 x이다
		int[][] score2 ={{70, 80, 90, 100}, {90, 80, 40, 60, 70}, {50, 80, 60}};
		
		for(int i = 0 ; i < score2.length ; i++)	{
		
		System.out.println(score2[i].getClass().getTypeName());
		System.out.println(score2[i].length);
		
		}
		System.out.println(score2.getClass().getTypeName());
		
	}

}
