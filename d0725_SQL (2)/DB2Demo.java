package sec2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB2Demo {

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
		Statement stmt = con.createStatement();
		String sql = "insert into person (name, phone, email) " + "values ('�ڹ̼�', '010-3333-4444', 'misun@naver.com')";
		
		if(stmt.executeUpdate(sql) == 1)
			System.out.println("���ڵ� �߰� ����");
		else 
			System.out.println("���ڵ� �߰� ����");
		stmt.close();
		con.close();

	}
}
