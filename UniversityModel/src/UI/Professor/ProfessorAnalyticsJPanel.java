/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Professor;

import CourseCatalog.Course;
import CourseCatalog.CourseOffer;
import CourseCatalog.CourseSchedule;
import CourseCatalog.Seat;
import Platform.Platform;
import Professor.Professor;
import UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emi
 */
public class ProfessorAnalyticsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProfessorAnalyticsJPanel
     */
    
    private Platform platform;
    private UserAccount ua;
    private Professor professor;
    private DefaultTableModel dataTableModel;
    
    public ProfessorAnalyticsJPanel(Platform platform, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        this.platform = platform;
        this.ua = useraccount;
        this.professor = this.platform.getProfessorDirectory().findProfessorById(ua.getAccountId());
        this.dataTableModel = (DefaultTableModel) dataTable.getModel();
        
        fieldRevenue.setText(String.valueOf(this.professor.getTuitionCollected()));
        fieldStudents.setText(String.valueOf(this.professor.getEnrolledListForAllTerm().size()));
        
        populateTable();
    }
    
    public ProfessorAnalyticsJPanel() {
        initComponents();
    }
    
    public void populateTable(){
        dataTableModel.setRowCount(0);
    if (!this.professor.getAllSchedules().entrySet().isEmpty()){
        
        //get data
        for (Course course: this.professor.getCourseCatalog().getCourses()){
            String courseName = course.getName();
            int registedCountForCourse = course.getRegistedCountForCourse();
            int passCountForCourse = course.getPassCountForCourse();
            int revenueForCourse = course.getRevenueForCourse();
            
            for (Map.Entry<String,CourseSchedule> termSchedule: this.professor.getAllSchedules().entrySet()){
                CourseSchedule cs = termSchedule.getValue();
                ArrayList<CourseOffer> offers = cs.getSchedule();
                
                for (CourseOffer co: offers){
                    if (co.getCourse().getName().equals(courseName)){
                        registedCountForCourse += co.getEnrolledStudentList().size();
                        revenueForCourse += co.getTotalCourseRevenues();
                        passCountForCourse += co.getPassCount();
                    }
                }
            }
        }
        
        //populate data into table
        for (Course c: this.professor.getCourseCatalog().getCourses()){
            Object[] row = new Object[4];
            
            row[0] = c.getName();
            row[1] = c.getRegistedCountForCourse();
            row[2] = (c.getRegistedCountForCourse() ==0) ? 0:c.getPassCountForCourse()/c.getRegistedCountForCourse()*100 + "%";
            row[3] = c.getRevenueForCourse();
            
            dataTableModel.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        fieldRevenue = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fieldStudents = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("Total Revenue");

        fieldRevenue.setEditable(false);

        jLabel3.setText("Number of students");

        fieldStudents.setEditable(false);

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Course name", "Student count", "Pass rate", "Revenue"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(dataTable);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setText("My dashboard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(45, 45, 45)
                                .addComponent(fieldRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fieldStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jLabel2)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fieldRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldStudents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable dataTable;
    private javax.swing.JTextField fieldRevenue;
    private javax.swing.JTextField fieldStudents;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
