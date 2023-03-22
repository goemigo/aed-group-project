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

    public RegisterCourse(Platform platform, Student s) {
        initComponents();
        this.setVisible(true);

        this.platform = platform;
        this.student = s;
        this.courseTableModel = (DefaultTableModel) courseTable.getModel();
        populateTerms();
        populateCourse();
    }

    public void populateCourse() {
        courseTableModel.setRowCount(0);
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
        } catch (Throwable e) {

        }
    }

    public void populateSearch(String text, String filter) {
        courseTableModel.setRowCount(0);
        String termSel = (String) termSelected.getSelectedItem();
        ArrayList<CourseOffer> filteredCourses = new ArrayList<CourseOffer>();
        try {
            for (CourseSchedule cs : this.platform.listCourseOffersByTerm(termSel)) {
                for (CourseOffer co : cs.getSchedule()) {
                    Course c = co.getCourse();
                    switch (filter) {
                        case "language":
                            if (c.getLanguage().equals(text)) {
                                filteredCourses.add(co);
                            }
                        case "professor":
                            if (c.getRegion().equals(text)) {
                                filteredCourses.add(co);
                            }
                        case "region":
                            if (c.getRegion().equals(text)) {
                                filteredCourses.add(co);
                            }
                        case "topic":
                            if (c.getTopic().equals(text)) {
                                filteredCourses.add(co);
                            }
                        case "course":
                            if (c.getName().equals(text)) {
                                filteredCourses.add(co);
                            }
                        default:
                            filteredCourses.add(co);
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

        searchFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "language", "professor", "region", "course" }));

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Term");

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
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
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
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerCourse)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextActionPerformed

    private void registerCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerCourseActionPerformed
        // TODO add your handling code here:
        int selectedRow = courseTable.getSelectedRow();
        CourseOffer co = (CourseOffer) courseTable.getValueAt(selectedRow, 0);
        this.student.getTranscript().registerCourse(this.term, co);
        JOptionPane.showMessageDialog(null, "Course Registered!");
        populateCourse();
    }//GEN-LAST:event_registerCourseActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        courseTableModel.setRowCount(0);
        String searchedText = searchText.getText();
        String filter = (String) searchFilter.getSelectedItem();
        populateSearch(searchedText, filter);

    }//GEN-LAST:event_searchButtonActionPerformed
    private void populateTerms(){
    termSelected.removeAllItems();
       for (String term : this.platform.getTerms()) {
            termSelected.addItem(term);
        }
    
    }
    private void termSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_termSelectedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_termSelectedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable courseTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton registerCourse;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> searchFilter;
    private javax.swing.JTextField searchText;
    private javax.swing.JComboBox<String> termSelected;
    // End of variables declaration//GEN-END:variables
}
