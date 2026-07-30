package _05_Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static final String url="jdbc:mysql://localhost:3306/jdbc";
    public static final String username = "root";
    public static final String password = "password";

    public static Connection getConnection(){

        Connection conn =  null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established");

        }catch(Exception e){
            e.printStackTrace();
        }
        return conn;
    }
}
