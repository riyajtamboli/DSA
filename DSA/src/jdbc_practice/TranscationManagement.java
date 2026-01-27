package jdbc_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TranscationManagement {

	public static final String url = "jdbc:mysql://localhost:3306/accounts";
	public static final String username = "root";
	public static final String password = "password";
	public static void main(String[] args) {
		String withDrawl = "update accountTable set balance = balance-? where acc = ? ";
		String deposit = "update accountTable set balance = balance + ? where acc  = ? ";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		} catch (Exception e) {
			IO.println(e.getMessage());
		}

		try {
			Connection conn = DriverManager.getConnection(url, username, password);
			conn.setAutoCommit(false);
			
			double balance = Double.parseDouble(IO.readln("Enter balance to withdrawal : "));
			String acc1 = IO.readln("Enter account number debited From : ");
			double depoBalance = Double.parseDouble(IO.readln("Enter balance to deposit : "));
			String acc2 = IO.readln("Enter account to credit : ");
			
			if(isSufficient(conn, acc1, balance)) {
				PreparedStatement with = conn.prepareStatement(withDrawl);
				PreparedStatement dep = conn.prepareStatement(deposit);
				with.setDouble(1, balance);
				with.setString(2, acc1);
				dep.setDouble(1, depoBalance);
				dep.setString(2, acc2);
				with.executeUpdate();
				dep.executeUpdate();
				conn.commit();
				IO.println("transcation Success");
			}else {
				conn.rollback();
				IO.println("InSuffient Balance");
				IO.println("Failed");
			}

		} catch (Exception e) {
			IO.println(e.getMessage());
		}
	}
	
	public static boolean isSufficient(Connection conn, String acc, double balance) {
		
		String balanceQuery = "Select balance from accountTable where acc = ?";
		
		try {
			
			PreparedStatement psmt = conn.prepareStatement(balanceQuery);
			psmt.setString(1, acc);
			 ResultSet rs = psmt.executeQuery();
	 
			 
			 if (rs.next()) {
	                double currentBalance = rs.getDouble("balance");
	                return currentBalance >= balance;
	            }
		}catch(Exception e) {
			IO.println(e.getMessage());
		}
		
		
		return false;
	}

}
