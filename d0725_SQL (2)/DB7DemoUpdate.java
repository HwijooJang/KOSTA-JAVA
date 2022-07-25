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
			System.out.println("데이터 베이스 연결중");
			con = DriverManager.getConnection(url, "root", "1234");
			System.out.println("데이터 베이스 연결 완료");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버를 찾지 못했습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("데이터 베이스 연결 실패");
			System.out.println(e.getMessage());
		}
		return con;
	}

	public static void main(String[] args) throws SQLException {
		Connection con = makeConnection();
		Scanner sc = new Scanner(System.in);
		System.out.println("수정을 원하는 이름 : ");
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
		System.out.println("수정할 이메일 : ");
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
