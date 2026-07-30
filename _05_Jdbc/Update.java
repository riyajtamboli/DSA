package _05_Jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Update {
    void main(){
        try{
            Connection conn = DBConnection.getConnection();
            String update = "update employee set name = ? WHERE id =?";

            PreparedStatement ps =conn.prepareStatement(update);
            ps.setString(1, "Agni");
            ps.setInt(2, 1);
            int updated = ps.executeUpdate();

            if(updated>0){
                System.out.println("Updated");
            }else{
                System.out.println("Not");
            }
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
