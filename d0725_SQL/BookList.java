package mySQLConnec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookList {
	Connection con;
	public BookList() {
		String url = "jdbc:mysql://192.168.2.201:3306/madang?&serverTimezone=UTC&useSSL=false";
		String usrid = "root";
		String pwd = "1234";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이브 로드 실패");
			e.printStackTrace();
		}
		try {
			System.out.println("데이터 베이스 접속 시동 중");
			Connection con = DriverManager.getConnection(url, usrid, pwd);
			System.out.println("데이터 베이스 접속 성공");	
			
			// 
		} catch (SQLException e) {
			System.out.println("접속 실패");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	private void sqlRun() {
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from book");
			while(rs.next()) {
			
			int bookid = rs.getInt(1); // bookid(int)
			String bookname = rs.getString(2); // bookname(String)
			String publisher = rs.getString(3); // publisher(String)
			int price = rs.getInt(4); // price(int)
			
			System.out.println(bookid + ", " + bookname + ", " + publisher + ", " + price);
		}  
			con.close();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		
		BookList so = new BookList();
		so.sqlRun();
		
	}

}
