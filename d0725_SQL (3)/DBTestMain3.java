package sec3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DBTestMain3 {

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
			System.out.println("JavaStudy Connection ���� : " + conn);
			
			// ���ǹ� ���� �и� 
			int totalAmount = 9000;
			String saleDateStart="20190101";
			String saleDateEnd="20190102";
			// ���ǹ� ?�� �Է�
			String query ="";
			query +="SELECT	date_format(B.SALE_DATE, '%Y-%m-%d') AS SALE_DATE ";       
			query +=", C.PRODUCT_NO " ;
			query +=", A.PRODUCT_NAME ";        
			query +=", C.PRICE " ;      
			query +=", C.QTY  "  ;      
			query +=", C.PRICE * C.QTY AS TOTAL_AMOUNT ";  
			query +="FROM	PRODUCT A  inner join PRODUCT_PURCHASE_DETAIL C on A.PRODUCT_NO = C.PRODUCT_NO ";       
			query +="inner join product_purchase B 	on B.ACCOUNT_NO = C.ACCOUNT_NO "; 
			query +="where (C.PRICE * C.QTY) >= ? ";  
			query +="AND B.SALE_DATE >= str_to_date(?,'%Y%m%d') ";   
			query +="AND B.SALE_DATE <= str_to_date(?,'%Y%m%d') ";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, totalAmount);
			pstmt.setString(2, saleDateStart);
			pstmt.setString(3, saleDateEnd);
			//��ȸ 
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
		// Resultset ����
		try {if(rs!=null) rs.close();} 
		catch (SQLException e1) {	e1.printStackTrace();}
        //statement ����
		try {if(pstmt!=null) pstmt.close();	} 
		catch (SQLException e) {e.printStackTrace();}
		//connection ����
		try {if(conn!=null) conn.close();} 
		catch (SQLException e) {e.printStackTrace();}
	}

}
