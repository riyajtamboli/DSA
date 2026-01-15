package jdbc_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {
	
	public static final String url = "jdbc:mysql://localhost:3306/tp";
	public static final String username = "root";
	public static final String password = "password";
	
	public static void main(String[] args) {
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			IO.println(e.getMessage());
		}
		
		try {
			
			Connection conn = DriverManager.getConnection(url, username, password);
			String query = "Delete from tp where mark = ?";
			PreparedStatement smt = conn.prepareStatement(query);
			
			while(true){				
				int mark = Integer.parseInt(IO.readln("Enter marks to delete rows : "));
				smt.setInt(1, mark);
				smt.executeUpdate();
				IO.println("Deleted Successfully");
				String choice = IO.readln("Do you want to delete more (Y/N) : ");
				
				if(choice.toUpperCase().equals("N")) {
					break;
				}
				
			}
		}catch(Exception e) {
			
		}
	}

}
