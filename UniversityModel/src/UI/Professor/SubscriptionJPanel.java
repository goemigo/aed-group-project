/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Professor;

import Platform.Platform;
import Professor.Professor;
import UserAccount.UserAccount;
import javax.swing.JOptionPane;

/**
 *
 * @author emi
 */
public class SubscriptionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SubscriptionJPanel
     */
    private Platform platform;
    private UserAccount ua;
    private Professor professor;
    
    public SubscriptionJPanel(Platform platform, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        this.platform = platform;
        this.ua = useraccount;
        
        this.professor = this.platform.getProfessorDirectory().findProfessorById(ua.getAccountId());
        
        fieldProfID.setText(this.ua.getAccountId());
        fieldProfName.setText(this.professor.getName());
        fieldAccountStatus.setText(this.professor.getAccountStatusString());
        fieldSubFee.setText(String.valueOf(1000));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SubscribeBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        fieldProfID = new javax.swing.JTextField();
        fieldProfName = new javax.swing.JTextField();
        fieldSubFee = new javax.swing.JTextField();
        fieldAccountStatus = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("ID");

        jLabel2.setText("Name");

        jLabel3.setText("Account Status");

        SubscribeBtn.setText("Subscribe to platform");
        SubscribeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubscribeBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Subscription fee");

        fieldProfID.setEditable(false);
        fieldProfID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldProfIDActionPerformed(evt);
            }
        });

        fieldProfName.setEditable(false);
        fieldProfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldProfNameActionPerformed(evt);
            }
        });

        fieldSubFee.setEditable(false);
        fieldSubFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldSubFeeActionPerformed(evt);
            }
        });

        fieldAccountStatus.setEditable(false);
        fieldAccountStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldAccountStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SubscribeBtn)
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldAccountStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldSubFee, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldProfName, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldProfID, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fieldProfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldProfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fieldAccountStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fieldSubFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(SubscribeBtn)
                .addGap(70, 70, 70))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SubscribeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubscribeBtnActionPerformed
        // TODO add your handling code here:
      
        professor.setAccountStatus(true); //set prof user account status to true
        fieldAccountStatus.setText(this.professor.getAccountStatusString());
        this.platform.collectSubscriptionFee(this.professor.getPersonid()); //add revenue to platform
        
        //initiate all schedules for the professor once subscribed
        this.professor.initiateAllSchedules(this.platform.getTerms());
        JOptionPane.showMessageDialog(null, "Successfully subscribed!");
    }//GEN-LAST:event_SubscribeBtnActionPerformed

    private void fieldProfIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldProfIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldProfIDActionPerformed

    private void fieldProfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldProfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldProfNameActionPerformed

    private void fieldSubFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldSubFeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldSubFeeActionPerformed

    private void fieldAccountStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldAccountStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldAccountStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SubscribeBtn;
    private javax.swing.JTextField fieldAccountStatus;
    private javax.swing.JTextField fieldProfID;
    private javax.swing.JTextField fieldProfName;
    private javax.swing.JTextField fieldSubFee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
