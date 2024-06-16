/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author hp
 */
public class addController {
    public void studentdetails(int id, String name,String address, int aag,String birthday,String gender,int conNo, String grade){
        new model.AddModel().addDetails(id,name,address,aag,birthday,gender,conNo,grade);
    
}

    public void studentdetails(int id, String name, String address, int Age, String birthday) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   }
