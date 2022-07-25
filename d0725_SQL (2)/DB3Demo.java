package sec2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DB3Demo {

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

		String name = "�ƹ���";
		String phone = "010-1234-5678";
		String email = "amug@naver.com";
		String sql = "insert into person (name, phone, email) values (?, ?, ?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setString(2, phone);
		pstmt.setString(3, email);

		if (pstmt.executeUpdate() == 1)
			System.out.println("���ڵ� �߰� ����");
		else 
			System.out.println("���ڵ� �߰� ����");
		pstmt.close();
		con.close();

	}
}
