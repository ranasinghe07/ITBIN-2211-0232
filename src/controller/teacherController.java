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
public class teacherController {
    
    public void tud(int tid,String Name,String Address,int conno,String Gender){
        
        new model.newteacher().addProduct(tid,Name,Address,conno,Gender);
        
    }
    
}
