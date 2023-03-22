/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Professor;

import CourseCatalog.Course;
import CourseCatalog.CourseLoad;
import CourseCatalog.CourseOffer;
import CourseCatalog.CourseSchedule;
import CourseCatalog.Seat;
import CourseCatalog.SeatAssignment;
import Student.Student;
import Platform.Platform;
import Professor.Professor;
import UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emi
 */
public class StudentMgtJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentMgtJPanel
     */
    
    private Platform platform;
    private UserAccount ua;
    private Professor professor;
    private DefaultTableModel studentTableModel;
    private Course selectedCourse;
    
    public StudentMgtJPanel(Platform platform, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        this.platform = platform;
        this.ua = useraccount;
        this.professor = this.platform.getProfessorDirectory().findProfessorById(ua.getAccountId());
        
        this.studentTableModel = (DefaultTableModel) studentTable.getModel();
        
        populateStudentTable();
        populateCourseCombo();
        
        this.selectedCourse = this.professor.getCourseCatalog().getCourseByName((String) comboCourse.getSelectedItem());
        
        fieldRep.setText(String.valueOf(this.professor.calReputation()));
    }
    
    public StudentMgtJPanel() {
        initComponents();
    }
    
    public void populateCourseCombo(){
        for (Course c: this.professor.getCourseCatalog().getCourses()){
            comboCourse.addItem(c.getName());
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

        comboCourse = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        fieldCourseName = new javax.swing.JTextField();
        passBtn = new javax.swing.JButton();
        failBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        fieldRep = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboCourse.setToolTipText("");
        comboCourse.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCourseItemStateChanged(evt);
            }
        });
        comboCourse.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboCourseFocusLost(evt);
            }
        });
        add(comboCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 130, -1));

        jLabel1.setText("Course");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Student ID", "Student Name", "Grade Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(studentTable);
        if (studentTable.getColumnModel().getColumnCount() > 0) {
            studentTable.getColumnModel().getColumn(0).setResizable(false);
            studentTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 380, 340));

        jLabel2.setText("Enroll List for my course");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        fieldCourseName.setEditable(false);
        fieldCourseName.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                fieldCourseNameInputMethodTextChanged(evt);
            }
        });
        add(fieldCourseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 230, -1));

        passBtn.setText("Pass");
        passBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passBtnActionPerformed(evt);
            }
        });
        add(passBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, -1, -1));

        failBtn.setText("Fail");
        failBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                failBtnActionPerformed(evt);
            }
        });
        add(failBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, -1, -1));

        jLabel3.setText("My reputation index:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, -1, 20));

        fieldRep.setEditable(false);
        fieldRep.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        add(fieldRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 130, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void comboCourseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboCourseFocusLost
        // TODO add your handling code here:
//        fieldCourseName.setText(this.selectedCourse.getName());
//        
//        populateStudentTable();
    }//GEN-LAST:event_comboCourseFocusLost

    private void comboCourseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCourseItemStateChanged
        // TODO add your handling code here:
        fieldCourseName.setText((String) comboCourse.getSelectedItem());
        populateStudentTable();
        
    }//GEN-LAST:event_comboCourseItemStateChanged

    private void fieldCourseNameInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_fieldCourseNameInputMethodTextChanged
        // TODO add your handling code here:
        populateStudentsForCourse();
    }//GEN-LAST:event_fieldCourseNameInputMethodTextChanged

    private void passBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = studentTable.getSelectedRow();
        Student student = (Student) studentTable.getValueAt(selectedRow, 0);
        
        String courseName = fieldCourseName.getText();
        
        if (!courseName.isEmpty()){
            for (Map.Entry<String,CourseLoad> courseLoads: student.getTranscript().getCourseLoads().entrySet()){
                CourseLoad cl = courseLoads.getValue();
                for (SeatAssignment sa: cl.getSeatassignments()){
                    if (sa.getSeat().getCourseoffer().getCourse().getName().equals(courseName)){
                        sa.setGrade("Pass");
                        break;
                    }
                }
            }           
        }
        
        populateStudentsForCourse();
 
    }//GEN-LAST:event_passBtnActionPerformed

    private void failBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_failBtnActionPerformed
        // TODO add your handling code here:
                int selectedRow = studentTable.getSelectedRow();
        Student student = (Student) studentTable.getValueAt(selectedRow, 0);
        
        String courseName = fieldCourseName.getText();
        
        if (!courseName.isEmpty()){
            for (Map.Entry<String,CourseLoad> courseLoads: student.getTranscript().getCourseLoads().entrySet()){
                CourseLoad cl = courseLoads.getValue();
                for (SeatAssignment sa: cl.getSeatassignments()){
                    if (sa.getSeat().getCourseoffer().getCourse().getName().equals(courseName)){
                        sa.setGrade("Fail");
                        break;
                    }
                }
            }           
        }
        
        populateStudentsForCourse();
    }//GEN-LAST:event_failBtnActionPerformed
    
    public void populateStudentTable(){
        if (this.professor.getEnrolledListForAllTerm().size()>0){
            studentTableModel.setRowCount(0);
        
            for (Map.Entry<String,CourseSchedule> termSchedule: this.professor.getAllSchedules().entrySet()){
                CourseSchedule cs = termSchedule.getValue();
                ArrayList<CourseOffer> offers = cs.getSchedule();
            
                for (CourseOffer co: offers){
//                    ArrayList<Student> enrolledStudentList = co.getEnrolledStudentList();
                    for (Seat s: co.getSeatlist()){
                        if (s.isOccupied() == true) {
                            
                            Object[] row = new Object[3];
                            row[0] = s.getSeatassignment().getCourseload().getStudent();
//                            row[0] = s.getSeatassignment().getCourseload().getStudent().getPersonid();
                            row[1] = s.getSeatassignment().getCourseload().getStudent().getName();
                            row[2] = s.getSeatassignment().getGrade();
                
                            studentTableModel.addRow(row);
                        }
                    }
                }
            }
            
        }
//        else{
//            JOptionPane.showMessageDialog(null, "No students enrolled");
//        }  
    }
    
    public void populateStudentsForCourse(){
        if (this.professor.getEnrolledListForAllTerm().size()>0){
            studentTableModel.setRowCount(0);
        
            for (Map.Entry<String,CourseSchedule> termSchedule: this.professor.getAllSchedules().entrySet()){
                CourseSchedule cs = termSchedule.getValue();
                ArrayList<CourseOffer> offers = cs.getSchedule();
            
                for (CourseOffer co: offers){
                    //only show students enrolled in the selected course
                    if (co.getCourse().getName().equals(fieldCourseName.getText())){
                        for (Seat s: co.getSeatlist()){
                            if (s.isOccupied() == true) {
                            
                                Object[] row = new Object[3];
                                
                                row[0] = s.getSeatassignment().getCourseload().getStudent();
//                                row[0] = s.getSeatassignment().getCourseload().getStudent().getPersonid();
                                row[1] = s.getSeatassignment().getCourseload().getStudent().getName();
                                row[2] = s.getSeatassignment().getGrade();
                
                                studentTableModel.addRow(row);
                            }
                        }
                    }
                    
                }
            }
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboCourse;
    private javax.swing.JButton failBtn;
    private javax.swing.JTextField fieldCourseName;
    private javax.swing.JTextField fieldRep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton passBtn;
    private javax.swing.JTable studentTable;
    // End of variables declaration//GEN-END:variables
}
