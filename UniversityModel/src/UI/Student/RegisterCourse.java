/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Student;

import CourseCatalog.Course;
import CourseCatalog.CourseOffer;
import CourseCatalog.CourseSchedule;
import CourseCatalog.SeatAssignment;
import Platform.Platform;
import Student.Student;
import java.util.ArrayList;
import java.util.Iterator;
import javax.lang.model.type.ErrorType;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 15512
 */
public class RegisterCourse extends javax.swing.JPanel {

    /**
     * Creates new form RegisterCourse
     */
    private Platform platform;
    private Student student;
    private String term;
    private DefaultTableModel courseTableModel;
    private DefaultTableModel registeredTableModel;
    private DefaultTableModel transcriptTableModel;

    public RegisterCourse(Platform platform, Student s) {
        initComponents();
        this.setVisible(true);

        this.platform = platform;
        this.student = s;
        this.courseTableModel = (DefaultTableModel) courseTable.getModel();
        this.transcriptTableModel = (DefaultTableModel) transcriptTable.getModel();

        populateTerms();
        populateCourse();
        populateTranscript();

    }

    public void clearTable() {
        while (courseTableModel.getRowCount() > 0) {
            courseTableModel.removeRow(0);
        }
    }

    public void populateCourse() {
        clearTable();
        String termSel = (String) termSelected.getSelectedItem();
        try {
            for (CourseSchedule cs : this.platform.listCourseOffersByTerm(termSel)) {
                for (CourseOffer co : cs.getSchedule()) {
                    Course c = co.getCourse();
                    Object[] row = new Object[9];
                    row[0] = co; 
                    row[1] = c.getName();
                    row[2] = c.getTopic();
                    row[3] = c.getRegion();
                    row[4] = c.getLanguage();
                    row[5] = c.getPrice();
                    row[6] = co.getProfessor().getName();
                    row[7] = co.getProfessor().calReputation();
                    row[8] = co.getSeatsAvailable();
                    courseTableModel.addRow(row);
                }
            }
        }catch (Throwable e) {}
    }

    public void populateSearch(String text) {
        clearTable();
        String termSel = (String) termSelected.getSelectedItem();
        String filter = (String) searchFilter.getSelectedItem();
        ArrayList<CourseOffer> filteredCourses = new ArrayList<CourseOffer>();
        try {
            for (CourseSchedule cs : this.platform.listCourseOffersByTerm(termSel)) {
                for (CourseOffer co : cs.getSchedule()) {
                    Course c = co.getCourse();
                    switch (filter) {
                        case "language":
                            if (c.getLanguage().equals(text) && !filteredCourses.contains(co)) {
                                filteredCourses.add(co);
                            }
                        case "professor":
                            if (co.getProfessor().getName().equals(text) && !filteredCourses.contains(co)) {
                                filteredCourses.add(co);
                            }
                        case "region":
                            if (c.getRegion().equals(text) && !filteredCourses.contains(co)) {
                                filteredCourses.add(co);
                            }
                        case "topic":
                            if (c.getTopic().equals(text) && !filteredCourses.contains(co)) {
                                filteredCourses.add(co);
                            }
                        case "course":
                            if (c.getName().equals(text) && !filteredCourses.contains(co)) {
                                filteredCourses.add(co);
                            }
                        default:
                            String sss;
                    }
                }
            }
            
            for (CourseOffer co : filteredCourses) {

                Course c = co.getCourse();
                Object[] row = new Object[9];

                row[0] = co;
                row[1] = c.getName();
                row[2] = c.getTopic();
                row[3] = c.getRegion();
                row[4] = c.getLanguage();
                row[5] = c.getPrice();
                row[6] = co.getProfessor().getName();
                row[7] = co.getProfessor().calReputation();
                row[8] = co.getSeatsAvailable();
                courseTableModel.addRow(row);
            }
        } catch (Throwable e) {
            
        }
    }

    public void populateTranscript() {
        transcriptTableModel.setRowCount(0);
        for (SeatAssignment sa : this.student.getTranscript().getSeatAssignmentsAllTerms()) {
            Course c = sa.getSeat().getCourseoffer().getCourse();
            Object[] row = new Object[4];
            row[0] = sa.getCourseload().getTerm();
            row[1] = c;
            row[2] = sa.getSeat().getCourseoffer().getProfessor().getName();

     
            transcriptTableModel.addRow(row);
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

        searchText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        courseTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        registerCourse = new javax.swing.JButton();
        termSelected = new javax.swing.JComboBox<>();
        searchFilter = new javax.swing.JComboBox<>();
        searchButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        transcriptTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 204, 51));

        searchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextActionPerformed(evt);
            }
        });

        jLabel1.setText("Search");

        courseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Course", "Topic", "Region", "Language", "Price", "Professor", "Reputation", "Seats"
            }
        ));
        jScrollPane1.setViewportView(courseTable);

        jLabel3.setText("Courses table");

        registerCourse.setText("Register");
        registerCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerCourseActionPerformed(evt);
            }
        });

        termSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                termSelectedActionPerformed(evt);
            }
        });

        searchFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "language", "professor", "region", "course", "topic" }));

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Term");

        jLabel6.setText("Course Selected");

        transcriptTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Term", "Course", "Professor"
            }
        ));
        jScrollPane3.setViewportView(transcriptTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(searchFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(searchButton))
                                    .addComponent(termSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(272, 272, 272)
                                .addComponent(registerCourse))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(termSelected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(searchFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton)
                    .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerCourse)
                .addContainerGap(59, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextActionPerformed

    private void registerCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerCourseActionPerformed
        // TODO add your handling code here:
        int selectedRow = courseTable.getSelectedRow();
        CourseOffer co = (CourseOffer) courseTable.getValueAt(selectedRow, 0);
        String termSel = (String) termSelected.getSelectedItem();
        this.student.getTranscript().registerCourse(termSel, co);
        JOptionPane.showMessageDialog(null, "Course Registered!");
        populateCourse();
        populateTranscript();
    }//GEN-LAST:event_registerCourseActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String searchedText = searchText.getText();
        populateSearch(searchedText);

    }//GEN-LAST:event_searchButtonActionPerformed
    private void populateTerms() {
        termSelected.removeAllItems();
        for (String term : this.platform.getTerms()) {
            termSelected.addItem(term);
        }

    }
    private void termSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_termSelectedActionPerformed
        // TODO add your handling code here:
//        termSelected.getSelectedItem();
        populateCourse();

    }//GEN-LAST:event_termSelectedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable courseTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton registerCourse;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> searchFilter;
    private javax.swing.JTextField searchText;
    private javax.swing.JComboBox<String> termSelected;
    private javax.swing.JTable transcriptTable;
    // End of variables declaration//GEN-END:variables
}
