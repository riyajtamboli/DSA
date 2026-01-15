package jdbc_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select {
	private final static String url= "jdbc:mysql://localhost:3306/tp";
	private final static String username= "root";
	private final static String password="password";
	

	public static void main(String[] args) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			}catch(Exception e) {
				IO.print(e.getMessage());
			}
			
			try {
				Connection conn = DriverManager.getConnection(url, username, password);
				Statement smt =	conn.createStatement();
				String query = "update tp set mark = 30 where id = 1";
				int rs1  =smt.executeUpdate(query);
				String q = "select *from tp";
				ResultSet rs = smt.executeQuery(q);
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					int mark = rs.getInt("mark");
					IO.println("Id : "+id);
					IO.println("Name : "+name);
					IO.println("Marks : "+mark);
					IO.println("------------------------------");
				}
			}catch(Exception e) {
				IO.print(e.getMessage());
			}
	}

}
