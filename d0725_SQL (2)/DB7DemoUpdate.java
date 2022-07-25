package sec2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DB7DemoUpdate {

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
		System.out.println("������ ���ϴ� �̸� : ");
		String name = sc.nextLine();
		
		String sql = "select * from person where name = ?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, name);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getString(1) + ", " + rs.getString(2) + ", " + rs.getString(3));
		}
		rs.close();
		pstmt.close();
		
		sql = "update person set email =? where name =?";
		System.out.println("������ �̸��� : ");
		String email = sc.nextLine();
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, email);
		pstmt.setString(2, name);
		pstmt.executeUpdate();
		
		pstmt.close();
		sc.close();
		con.close();

	}
}
