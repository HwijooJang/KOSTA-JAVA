package sec3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DBTestMain2 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/javastudy?&serverTimezone=UTC&useSSL=false";
			String user = "root";
			String pass = "1234";
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("JavaStudy Connection 연결 : " + conn);
			String query ="select * from product";
			pstmt = conn.prepareStatement(query);
			//조회 
			rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			while(rs.next()) {
				for(int i=1; i <= rsmd.getColumnCount(); i++) {
					System.out.print(rsmd.getColumnName(i)+"["+ 
							rs.getString(i)+"]\t");
				}
				System.out.println();
			}
			
			
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// Resultset 종료
		try {if(rs!=null) rs.close();} 
		catch (SQLException e1) {	e1.printStackTrace();}
        //statement 종료
		try {if(pstmt!=null) pstmt.close();	} 
		catch (SQLException e) {e.printStackTrace();}
		//connection 종료
		try {if(conn!=null) conn.close();} 
		catch (SQLException e) {e.printStackTrace();}
	}

}
