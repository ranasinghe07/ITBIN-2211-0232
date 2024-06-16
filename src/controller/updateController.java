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
public class updateController {
    public void update(int id, String Name,String Address,int ConNo){
       
        new model.updateData().update(id, Name, Address,ConNo);
    }
    
}
