package jdbc_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {
		public static final String url = "jdbc:mysql://localhost:3306/tp";
		public static final String username = "root";
		public static final String password = "password";
	public static void main(String[] args) {
			
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			IO.println("Driver Loaded");
		}catch(Exception e) {
			IO.println(e.getMessage());
		}
		
		try {
			
			Connection conn = DriverManager.getConnection(url, username, password);
			String query = "update tp set name = ? where id = ?";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setString(1, "Fayaj");
			psmt.setInt(2, 1);
			int row = psmt.executeUpdate();
			
			if(row >0) {
				IO.println("Update Succefully");
			}else {
				IO.println("not updated");
			}
			
			
		}catch(Exception e) {
			IO.println(e.getMessage());
		}
		
	}

}
