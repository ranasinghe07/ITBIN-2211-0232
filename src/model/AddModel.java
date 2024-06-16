/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package model;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;


public class addModel {
    Connection con = null;
    PreparedStatement pst=null;
    
    public void addDetails(int id, String name,String address, int aag,String birthday,String gender,int conNo, String grade){
        con=DBconnector.conn();
        
        try{
         String sql = "INSERT INTO student(Id ,Name,Address,Age,Birthday,Gender,Contact No,Grade) VALUES (?,?,?,?,?,?,?,?)";   
         pst=(PreparedStatement) con.prepareStatement(sql);
         pst.setInt(1,id);
         pst.setString(2,name);
         pst.setString(3,address);
         pst.setInt(4,aag);
         pst.setString(5,birthday);
         pst.setString(6,gender);
         pst.setInt(7,conNo);
         pst.setString(8,grade);
         pst.execute();
         JOptionPane.showMessageDialog(null,"Data Insert Successfuly");
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
            
        }
    }
    
}*/
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AddModel {
    Connection con = null;
    PreparedStatement pst=null;
    
    public void addDetails(int id, String name,String address, int age,String birthday,String gender,int conNo, String grade){
        con = DBConnector.conn();
        
        try{
            String sql = "INSERT INTO student(Id, Name, Address, Age, Birthday, Gender, `Contact No`, Grade) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setString(3, address);
            pst.setInt(4, age);
            pst.setString(5, birthday);
            pst.setString(6, gender);
            pst.setInt(7, conNo);
            pst.setString(8, grade);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Inserted Successfully");
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                if(pst != null) {
                    pst.close();
                }
                if(con != null) {
                    con.close();
                }
            } catch(SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
}

