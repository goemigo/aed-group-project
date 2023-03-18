/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Professor;

import Platform.Platform;
import UserAccount.UserAccount;

/**
 *
 * @author emi
 */
public class CourseMgtJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CourseMgtJPanel
     */
    
    private Platform platform;
    private UserAccount ua;
    
    public CourseMgtJPanel(Platform platform, UserAccount useraccount) {
        initComponents();
        this.platform = platform;
        this.ua = useraccount;
    }
    
    public CourseMgtJPanel() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        comboCourseId = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Price");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel2.setText("Course Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jLabel3.setText("Topic");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel4.setText("Region");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel5.setText("Language");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 200, -1));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 200, -1));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 200, -1));
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 200, -1));
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 200, -1));

        jButton1.setText("Create Course");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Course ID", "Course Name", "Topic", "Region", "Language", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 460, 140));

        jLabel6.setText("My Courses");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        jLabel7.setText("term");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));
        add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 200, -1));

        jLabel8.setText("Course Id");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabel9.setText("Number of seats");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "term1", "term2", "term3", "term4" }));
        jComboBox1.setSelectedIndex(-1);
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 200, -1));

        jButton2.setText("Create Course Offer");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Term", "Course ID", "Course Name", "Professor Name", "No. of seats"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 460, 230));

        jLabel10.setText("My Course Schedule");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, -1, -1));

        add(comboCourseId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 200, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboCourseId;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}