/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author dell
 */
public class ConnectionDB {
    
     Connection conn=null;
    
     public static Connection getConnection()
    {
       
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/buvette", "hbstudent","hbstudent");
            return con;
        }
        catch(Exception e)
        {
            System.out.println("Error : " + e.getMessage());
            return null;
        }
    }
    
}
