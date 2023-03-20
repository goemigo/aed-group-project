/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.AdminInterface;

import Platform.Platform;
import UserAccount.UserAccount;
import UserAccount.UserAccountDirectory;
import javax.swing.JOptionPane;

/**
 *
 * @author forumkaria
 */
public
        class RegistrationJPanel extends javax.swing.JPanel {
    private Platform platform;
    private UserAccount ua;
    
    /**
     * Creates new form RegistrationJPanel
     */
    public
            RegistrationJPanel(Platform platform) {
        initComponents();
        this.setVisible(true);
        this.platform = platform;
        this.ua = ua;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fieldusername1 = new javax.swing.JTextField();
        fieldPassword1 = new javax.swing.JTextField();
        fieldname1 = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboRole = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(fieldusername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 120, 30));
        jPanel1.add(fieldPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 120, 30));
        jPanel1.add(fieldname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 120, 30));

        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });
        jPanel1.add(registerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, -1, -1));

        jLabel5.setText("role");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, 20));

        jLabel2.setText("password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, 20));

        jLabel6.setText("username");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, 20));

        comboRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "student", "professor" }));
        comboRole.setToolTipText("");
        jPanel1.add(comboRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 120, 30));

        jLabel7.setText("name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
        UserAccountDirectory uad = this.platform.getUad();

        //get user account information
        String userName = fieldusername1.getText();
        String pass = fieldPassword1.getText();

        //get employee information
        String name = fieldname1.getText();
        String role = (String) comboRole.getSelectedItem();
       

        //check user account unique
        if(!uad.isUnique(userName)) {
            JOptionPane.showMessageDialog(null, "Sorry credentials are taken.");
        }
        //create user account and employee profile
        else {
            if (role.equals("librarian")){
                UserAccount user = uad.createUserAccount(userName, pass, new LibrarianRole());
                Library lib = this.app.getBranchDirectory().findBranch(branch).getLibrary();
                lib.getEmployeeDirectory().createEmployee(exp, role, name,user.getAccountid(), lib);

            } else if(role.equals("branch manager")){
                UserAccount user = uad.createUserAccount(userName, pass, new BranchManagerRole());
                Library lib = this.app.getBranchDirectory().findBranch(branch).getLibrary();
                lib.getEmployeeDirectory().createEmployee(exp, role, name,user.getAccountid(), lib);

            }
            
        }
    }//GEN-LAST:event_registerBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboRole;
    private javax.swing.JTextField fieldPassword1;
    private javax.swing.JTextField fieldname1;
    private javax.swing.JTextField fieldusername1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton registerBtn;
    // End of variables declaration//GEN-END:variables
}
