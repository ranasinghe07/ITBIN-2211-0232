/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author hp
 */

import controller.addController;
import controller.deleteControl;
import controller.deleteControl1;
import controller.teacherController;
import controller.updateController;
import controller.updateController2;
import javax.swing.JOptionPane;

public class teacher extends javax.swing.JFrame {

    /**
     * Creates new form teacher
     */
    public teacher() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Id = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        ContactNo = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        contactno = new javax.swing.JTextField();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        submit = new javax.swing.JButton();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        back = new javax.swing.JButton();
        gender = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Id.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Id :");
        Id.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 50, -1));

        Name.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Name.setText("Name :\t");
        Id.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 100, 30));

        Address.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Address.setText("Address :\t");
        Id.add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        Gender.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Gender.setText("Gender :");
        Id.add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, 30));

        ContactNo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ContactNo.setText("ContactNo :");
        Id.add(ContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        Id.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 230, 30));

        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        Id.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 230, 30));

        address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        Id.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 230, 30));

        contactno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        contactno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactnoActionPerformed(evt);
            }
        });
        Id.add(contactno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 230, 30));

        kGradientPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        kGradientPanel1.setkEndColor(new java.awt.Color(153, 153, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 0, 102));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        submit.setText("Submit");
        submit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        kGradientPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 90, 30));

        add.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add.setText("Add");
        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        kGradientPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 90, 30));

        delete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        delete.setText("Delete");
        delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        kGradientPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 90, 30));

        update.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        update.setText("Update");
        update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        kGradientPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 90, 30));

        back.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        back.setText("Back");
        back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        kGradientPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 90, 30));

        gender.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Male", "Femlale" }));
        gender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        kGradientPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 100, 30));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 50)); // NOI18N
        jLabel1.setText("Teacher");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 250, 80));

        Id.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 570));

        getContentPane().add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void contactnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactnoActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed

        String Id = id.getText();
        String Name = name.getText();
        String Address = address.getText();
        String ContactNo = contactno.getText();
        String Gender = (String)gender.getSelectedItem();
        
        
            
        
        
        try {
            int tid = Integer.parseInt(Id);
            int conno = Integer.parseInt(ContactNo);

            teacherController controller = new teacherController();
            controller.tud(tid,Name,Address,conno,Gender);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numerical values.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        
           String idText = id.getText(); 
    String nameText = name.getText();  
    String addressText = address.getText();
    String conText = contactno.getText();

    try {
        int id = Integer.parseInt(idText);
        int contactno = Integer.parseInt(conText);

        updateController2 controller = new updateController2();
        controller.update(id, nameText, addressText, contactno);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter valid numerical values.", "Error", JOptionPane.ERROR_MESSAGE);
    }
        
      /*  String idText = id.getText(); 
        String nameText = Name.getText();  
        String addressText = Address.getText();
        String conText = contactno.getText();
        
    
    try {
            int id = Integer.parseInt(idText);
            int contactno = Integer.parseInt(conText);

            updateController2 controller = new updateController2();
            controller.update(id, nameText, addressText, contactno);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numerical values.", "Error", JOptionPane.ERROR_MESSAGE);
        }*/
        
        
    }//GEN-LAST:event_updateActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        teachertable obj = new teachertable();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        
        String idText = id.getText();
      
       try {
            int id = Integer.parseInt(idText);

            deleteControl1 controller = new deleteControl1();
            controller.delete(id);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numerical values.", "Error", JOptionPane.ERROR_MESSAGE);
        }
                                  
                                  
    }//GEN-LAST:event_deleteActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        Home obj = new Home();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new teacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JLabel ContactNo;
    private javax.swing.JLabel Gender;
    private javax.swing.JPanel Id;
    private javax.swing.JLabel Name;
    private javax.swing.JButton add;
    private javax.swing.JTextField address;
    private javax.swing.JButton back;
    private javax.swing.JTextField contactno;
    private javax.swing.JButton delete;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JButton submit;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
