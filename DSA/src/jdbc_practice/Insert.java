package jdbc_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {
	public static final String url = "jdbc:mysql://localhost:3306/tp";
	public static final String username = "root";
	public static final String password = "password";
	public static void main(String[] args) {
			
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}catch(Exception e){
			IO.println(e.getMessage());
		}
		
		try {
			
			Connection conn = DriverManager.getConnection(url, username, password);
			String query = "insert into tp (id, name, mark) values (?, ?, ?)";
			PreparedStatement psmt = conn.prepareStatement(query);
			while(true) {
				int id = Integer.parseInt(IO.readln("Enter Id : "));
				String name = IO.readln("Enter Name : ");
				int mark = Integer.parseInt(IO.readln("Enter Mark : "));
				IO.println("Enter more data Y/N : ");
				String choice = IO.readln();
				psmt.setInt(1, id);
				psmt.setString(2, name);
				psmt.setInt(3, mark);	
				psmt.addBatch();
				
				if(choice.toUpperCase().equals("N")) {
					IO.println("Thanks For Inserting Data");
					break;
				}
				
			}
			int arr[] = psmt.executeBatch();
			for(int el : arr) {
				if(arr[el]==0) {
					IO.println("Query "+el+" not executed");
				}
			}
		}catch(Exception e) {
			
		}
		
		
	}

}
