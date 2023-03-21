/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Certifier;

import Platform.Platform;
import Student.Student;
import UI.MainJFrame;
import UserAccount.UserAccount;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author forumkaria
 */
public
        class CertifierScreen extends javax.swing.JFrame {
        private Platform platform;
        private UserAccount ua;
//        private Certifier certifier;
        private DefaultTableModel studentTableModel;

    /**
     * Creates new form CertifierScreen
     * @param platform
     * @param useraccount
     */
            
    public CertifierScreen(Platform platform, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        
        this.platform = platform;
        this.ua = useraccount;
//        this.certifier = this.platform.getCertifier();
        this.studentTableModel = (DefaultTableModel) studentTable.getModel();
        
        populateTable();
    }
        
    public void populateTable(){
        studentTableModel.setRowCount(0);
        
        for (Student s: this.platform.getSd().getStudent()){
            if (s.getRequested()){
                Object[] row = new Object[3];
            
                row[0] = s.getPersonid();
                row[1] = s.getName();
                row[2] = s.getTranscript().getGraduationStatus();
                
                studentTableModel.addRow(row);
            } 
            }
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
        authenticateDegreeBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        authenticateDegreeBtn.setText("Authenticate Degree");
        authenticateDegreeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authenticateDegreeBtnActionPerformed(evt);
            }
        });

        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("CERTIFIER");

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Student ID", "Student Name", "Graduation Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(studentTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(275, 275, 275))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(authenticateDegreeBtn)
                .addGap(214, 214, 214))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(logoutBtn)
                    .addContainerGap(531, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(authenticateDegreeBtn)
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addComponent(logoutBtn)
                    .addContainerGap(395, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 473));
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MainJFrame mj = new MainJFrame(platform, ua);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void authenticateDegreeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authenticateDegreeBtnActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = studentTable.getSelectedRow();
        Student s = (Student) studentTable.getValueAt(selectedRow, 0);
        
                        //get the certifier object from the user account
            if (this.platform.getCertifier().getDegree().isStudentReadyToGraduate(s)){
                s.getTranscript().setIsGraduated(true);
            }else{
                s.getTranscript().setIsGraduated(false) ;
                        }
                populateTable();     
    }//GEN-LAST:event_authenticateDegreeBtnActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton authenticateDegreeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JTable studentTable;
    // End of variables declaration//GEN-END:variables
}
