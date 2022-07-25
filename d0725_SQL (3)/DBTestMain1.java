package sec3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;

public class DBTestMain1 {

	public static void main(String[] args) {
		// ���� ���๮
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/javastudy?&serverTimezone=UTC&useSSL=false";
			String user = "root";
			String pass = "1234";
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("JavaStudy Connection ���� " + conn);
			String query = "select * from product";
			
			//��ȸ
			rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData(); // ��Ÿ������
			while(rs.next()) {
				for(int i = 1 ; i <= rsmd.getColumnCount() ; i++) {
					System.out.println(rsmd.getColumnName(i)+ "[" + rs.getString(i) + "]");
				}
				System.out.println();
			}
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
        // Resultset, Statement, Connection close ��
		
		try {
			if(rs != null) rs.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			if (pstmt != null)
				pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
