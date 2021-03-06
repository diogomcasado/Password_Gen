/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.casado.pwdgen;

import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.net.URL;
import javax.swing.JOptionPane;

/**
 *
 * @author podiaserpior
 */
public class PwdGen extends javax.swing.JFrame {

    /**
     * Creates new form PwdGen
     */
    private int valueSlider;

    public PwdGen() {

        initComponents();
        updateSlider();
        newPwd();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNew = new javax.swing.JButton();
        tfPassword = new javax.swing.JTextField();
        jSlider = new javax.swing.JSlider();
        btnCopy = new javax.swing.JButton();
        chkSpecial = new javax.swing.JCheckBox();
        tfValue = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        chkUpper = new javax.swing.JCheckBox();
        chkLower = new javax.swing.JCheckBox();
        chkNumber = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnNew.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        tfPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jSlider.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jSlider.setMajorTickSpacing(10);
        jSlider.setMaximum(24);
        jSlider.setMinimum(6);
        jSlider.setMinorTickSpacing(1);
        jSlider.setSnapToTicks(true);
        jSlider.setValue(12);
        jSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jSliderMouseDragged(evt);
            }
        });
        jSlider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSliderMouseClicked(evt);
            }
        });

        btnCopy.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCopy.setText("Copy");
        btnCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyActionPerformed(evt);
            }
        });

        chkSpecial.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        chkSpecial.setText("Special characters");

        tfValue.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfValue.setText("jTextField1");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Password Generator");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        chkUpper.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        chkUpper.setSelected(true);
        chkUpper.setText("Uppercase");

        chkLower.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        chkLower.setSelected(true);
        chkLower.setText("Lowercase");

        chkNumber.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        chkNumber.setText("Numbers");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfValue, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkLower)
                            .addComponent(chkSpecial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(chkUpper, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(chkNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tfPassword))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkLower)
                    .addComponent(chkUpper))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkSpecial)
                    .addComponent(chkNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnCopy))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        newPwd();
    }//GEN-LAST:event_btnNewActionPerformed

    private void jSliderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSliderMouseDragged
        updateSlider();
    }//GEN-LAST:event_jSliderMouseDragged

    private void jSliderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSliderMouseClicked
        updateSlider();
    }//GEN-LAST:event_jSliderMouseClicked

    private void btnCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyActionPerformed
        Toolkit.getDefaultToolkit()
                .getSystemClipboard()
                .setContents(
                        new StringSelection(tfPassword.getText()),
                        null
                );
    }//GEN-LAST:event_btnCopyActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        try {
            Desktop.getDesktop().browse(new URL("https://github.com/diogomcasado").toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(PwdGen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PwdGen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PwdGen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PwdGen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PwdGen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCopy;
    private javax.swing.JButton btnNew;
    private javax.swing.JCheckBox chkLower;
    private javax.swing.JCheckBox chkNumber;
    private javax.swing.JCheckBox chkSpecial;
    private javax.swing.JCheckBox chkUpper;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSlider jSlider;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfValue;
    // End of variables declaration//GEN-END:variables

    private void updateSlider() {
        valueSlider = jSlider.getValue();
        tfValue.setText(String.valueOf(valueSlider));
    }

    public static Integer tryParse(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid value");
            return 8;
        }
    }

    private void newPwd() {
        boolean lowerChars = chkLower.isSelected();
        boolean upperChars = chkUpper.isSelected();
        boolean specialChars = chkSpecial.isSelected();
        boolean numbersChars = chkNumber.isSelected();
       
        int len = tryParse(tfValue.getText());
        
        if (!lowerChars && !upperChars && !specialChars && !numbersChars){
            JOptionPane.showMessageDialog(null,"You must select at least one character set!");
        } else {
            
        String finalCharset = Password.setCharset(specialChars, numbersChars, upperChars, lowerChars);
        String finalPassword = (Password.generateRandomPassword(len, finalCharset));
        
        tfPassword.setText(finalPassword);
        
        }

    }
}
