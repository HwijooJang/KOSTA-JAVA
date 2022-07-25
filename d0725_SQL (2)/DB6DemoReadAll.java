package sec2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DB6DemoReadAll {

	public static Connection makeConnection() {

		String url = "jdbc:mysql://localhost/contacts?&serverTimezone=UTC&useSSL=false";
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("������ ���̽� ������");
			con = DriverManager.getConnection(url, "root", "1234");
			System.out.println("������ ���̽� ���� �Ϸ�");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹��� ã�� ���߽��ϴ�.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("������ ���̽� ���� ����");
			System.out.println(e.getMessage());
		}
		return con;
	}

	public static void main(String[] args) throws SQLException {
		Connection con = makeConnection();
		Scanner sc = new Scanner(System.in);
		
		String sql = "select * from person";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println(
					rs.getString(1) + ", " + rs.getString(2) + ", " + rs.getString(3));
		} 
		System.out.println("������ ���� �Ǿ���");
		
		rs.close();
		stmt.close();
		con.close();
		
		
	}
}
	