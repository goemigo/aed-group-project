/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Certifier;

import CourseCatalog.SeatAssignment;
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
        private DefaultTableModel studentTableModel;
        private DefaultTableModel transTableModel;

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
        this.transTableModel = (DefaultTableModel) transTable.getModel();
        
        populateTable();
    }
        
    public void populateTable(){
        studentTableModel.setRowCount(0);
        
        for (Student s: this.platform.getSd().getStudent()){
            if (s.getRequested()){
                Object[] row = new Object[3];
            
                row[0] = s;
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
        jScrollPane2 = new javax.swing.JScrollPane();
        transTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

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

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
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
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        studentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(studentTable);

        transTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Course ID", "Course Name", "Grade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(transTable);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Transcript for this student:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Request list:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(377, 377, 377))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(logoutBtn))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(authenticateDegreeBtn)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(logoutBtn))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(authenticateDegreeBtn)
                .addContainerGap())
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
        System.out.println("got the student object");
                        //get the certifier object from the user account
            if (this.platform.getCertifier().getDegree().isStudentReadyToGraduate(s)){
                System.out.println("below if");
                s.getTranscript().setIsGraduated(true);
                System.out.println("set to true");
            }else{
                s.getTranscript().setIsGraduated(false) ;
            }
            System.out.println("start popu table");
            populateTable();  
            System.out.println("done");
    }//GEN-LAST:event_authenticateDegreeBtnActionPerformed

    private void studentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentTableMouseClicked
        // TODO add your handling code here:
        populateTranscriptTable();
    }//GEN-LAST:event_studentTableMouseClicked
    
    public void populateTranscriptTable(){
        int selectedRow = studentTable.getSelectedRow();
        Student s = (Student) studentTable.getValueAt(selectedRow, 0);
        
        transTableModel.setRowCount(0);
        
        if (s.getTranscript().getSeatAssignmentsAllTerms().size()>0){
            for (SeatAssignment sa: s.getTranscript().getSeatAssignmentsAllTerms()){
                Object[] row = new Object[3];
                
                row[0] = sa.getSeat().getCourseoffer().getCourse().getCourseId();
                row[1] = sa.getSeat().getCourseoffer().getCourse().getName();
                row[2] = sa.getGrade();
                
                transTableModel.addRow(row);
            }
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton authenticateDegreeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JTable studentTable;
    private javax.swing.JTable transTable;
    // End of variables declaration//GEN-END:variables
}
