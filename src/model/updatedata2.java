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
public class updatedata2 {
      Connection con = null;
    PreparedStatement pst = null;
    
    public void update(int id, String Name, String Address, int Contactno) {
        con = DBConnector.conn();
        
        try {
            String sqlquery = "UPDATE teacher SET Name = ?, Address = ?, ContactNo = ? WHERE Id = ?";
            pst = con.prepareStatement(sqlquery);
            
            pst.setString(1, Name);
            pst.setString(2, Address);
            pst.setInt(3, Contactno);
            pst.setInt(4, id);
           
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "UPDATE SUCCESSFUL");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
}