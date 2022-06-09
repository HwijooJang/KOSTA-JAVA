package d0608_02_while;

public class WhileDemo2 {

	public static void main(String[] args) {
		
		int row = 2;
		
		while(row <= 9) {
			int col = 1;
			while(col <= 9)
			{
				System.out.printf("%4d", row * col);
				col++;
			}
			System.out.println();
			row++;
		}

	}

}
