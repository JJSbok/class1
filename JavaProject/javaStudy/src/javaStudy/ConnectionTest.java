package javaStudy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydb","root","14919");
	System.out.println("성공");
	
	conn.close();
	System.out.println("mysql 연결해제 성공");
}catch(ClassNotFoundException e) {
	System.out.println("mysql driver 오류");
}catch(SQLException e) {
	System.out.println("접속 오류");
}

	}

}
