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
			System.out.println("����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����̺� �ε� ����");
			e.printStackTrace();
		}
		try {
			System.out.println("������ ���̽� ���� �õ� ��");
			Connection con = DriverManager.getConnection(url, usrid, pwd);
			System.out.println("������ ���̽� ���� ����");	
			
			// 
		} catch (SQLException e) {
			System.out.println("���� ����");
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
