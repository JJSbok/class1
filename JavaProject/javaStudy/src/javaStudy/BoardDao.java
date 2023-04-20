package javaStudy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BoardDao {


        
    // DB Driver
    String dbDriver = "com.mysql.jdbc.Driver";
    
    // DB URL
    // IP:PORT/스키마 
    String dbUrl = "jdbc:mysql://127.0.0.1:3306/mydb";
    
    // DB ID/PW
    String dbUser = "root";
    String dbPassword = "14919";
    
    
    Connection dbconn = null;

    
    public void dbConnection()
    {
        Connection connection = null;
        
        try 
        {
            Class.forName(dbDriver);
            connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            dbconn = connection;
            
            System.out.println("DB Connection [성공]");
        } 
        catch (SQLException e) 
        {
            System.out.println("DB Connection [실패]");
            e.printStackTrace();
        } 
        catch (ClassNotFoundException e) 
        {
            System.out.println("DB Connection [실패]");
            e.printStackTrace();
        }
    }
}
