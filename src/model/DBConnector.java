/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DBconnector {
    public static Connection conn(){
        
        try{
            String url = "jdbc:mysql://localhost:3306/schoolmanagmentdb";
            String user = "admin";
            String passworld = "Pamodi@123";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, passworld);
            return conn;
            
        }catch(SQLException|ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
        }
       return null; 
    }
    
}*/
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnector {
    public static Connection conn(){
        Connection conn = null;
        try{
            String url = "jdbc:mysql://localhost:3306/schoolmanagmentdb";
            String user = "admin";
            String password = "Pamodi@123";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
        } catch(SQLException | ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return conn;
    }
}

