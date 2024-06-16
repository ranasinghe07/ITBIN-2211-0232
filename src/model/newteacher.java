/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class newteacher {
    Connection con = null;
    PreparedStatement pst = null;
    
    public void addProduct(int tid,String Name,String Address,int conno,String Gender){
   con = DBConnector.conn();
        
        try {
            String sqlquery = "INSERT INTO teacher(Id,Name,Address,ContactNo,Gender) VALUES (?, ?, ?, ?, ?)";
            pst = con.prepareStatement(sqlquery);
           // pst.setInt(1, id);
            pst.setInt(1, tid);
            pst.setString(2, Name);
            pst.setString(3, Address);
            pst.setInt(4, conno);
            pst.setString(5, Gender);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Insert SUCCESSFULY");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
