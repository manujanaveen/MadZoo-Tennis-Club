/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tennis_club;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Chathinthaka
 */
public class dbcon {
    public static Connection dbConnection() throws ClassNotFoundException, SQLException{
      Class.forName("com.mysql.jdbc.Driver");
      Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/madzootennisclub", "root", "");
      return c;
    } 
    
}


