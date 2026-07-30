package _05_Jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Insert {
    void main(){

        try{
               Connection conn = DBConnection.getConnection();
                String insert = "Insert into employee (id, name, author) values(?,?,?)";
                PreparedStatement ps = conn.prepareStatement(insert);
                ps.setInt(1, 1);
                ps.setString(2, "Xyz Book");
                ps.setString(3, "Abc Writer");
              int inserted =  ps.executeUpdate();

              if(inserted > 0){
                System.out.println("Inserted sussessfully");
              }else{
                System.out.println("Not");
              }
                conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
