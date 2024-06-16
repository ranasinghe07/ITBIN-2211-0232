/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class signUp {
    Connection con = null;
    PreparedStatement pst = null;
    
    public void signData(String name, String userName, String email, String password){
        
        con = DBConnector.conn();
        
        try {
            String sqlquery = "INSERT INTO signup(name, userName, email, password) VALUES (?, ?, ?, ?)";
            pst = con.prepareStatement(sqlquery);
            pst.setString(1, name);
            pst.setString(2, userName);
            pst.setString(3, email);
            pst.setString(4, password);    
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Insert SUCCESSFULY");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
}
