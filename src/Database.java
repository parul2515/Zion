
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Database 
{
    
   static Connection con = null;
    public static Connection getConnection()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_mangement","root","");
            
            
            
        } catch (Exception e) {
        }
       return con;
        
        
    }
    
    
}
