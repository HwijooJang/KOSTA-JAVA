package sec2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

public class DB4DemoInsert {

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

	public static void main(String[] args) throws SQLException, FileNotFoundException {
		String path = "C:\\Users\\KOSTA\\eclipse-workspace\\mySQLConnec\\src\\sec2\\person.txt";
		BufferedReader br = new BufferedReader(new FileReader(path));
		List<String[]> personList = br.lines().map(line -> line.split(",")).collect(Collectors.toList());

		// personList.forEach(p -> System.out.println(p[0] + ", " + p[1] + ", " + p[2]));

		Connection con = makeConnection();
		String sql = "insert into person (name, phone, email) values (?, ?, ?)";

		personList.forEach(p -> {
		try {
			System.out.println(p[0] + ", " + p[1] + ", " + p[2] + " 가 추가되었습니다.");
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, p[0]);
			pstmt.setString(2, p[1]);
			pstmt.setString(3, p[2]);
			

			if (pstmt.executeUpdate() == 1)
				System.out.println("레코드 추가 성공");
			else
				System.out.println("레코드 추가 에러");
			
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		});
		
		
		con.close();

	}
}
