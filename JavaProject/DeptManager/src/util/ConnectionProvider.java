package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	public static Connection getConnection() throws SQLException {
		
		//connection 객체 구하기
		String dbUrl = "jdbc:mysql://127.0.0.1:3306/mydb";
		return DriverManager.getConnection(dbUrl, "root", "14919");
		
	}
}
