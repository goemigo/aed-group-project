/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.AdminInterface;

import Platform.Platform;
import Professor.Professor;
import UserAccount.UserAccount;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author forumkaria
 */
public
        class AnalyticsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AnalyticsJPanel
     */
    private Platform platform;
    private UserAccount ua;
    private DefaultTableModel keyTableModel;
    private DefaultTableModel profTableModel;
    
    
    public
            AnalyticsJPanel(Platform platform, UserAccount ua) {
        initComponents();
        this.setVisible(true);
        this.platform = platform;
        this.ua = ua;
        
        this.keyTableModel = (DefaultTableModel) keyTable.getModel();
        this.profTableModel = (DefaultTableModel) profTable.getModel();
        
        populateKeyMetrics();
        populateProfessorRanking();
    }
            
    public void populateKeyMetrics(){
        keyTableModel.setRowCount(0);
        try{
            int rev = this.platform.getRevenue();
            int sCount = this.platform.getSd().getStudent().size();
            int pCount = this.platform.getActiveProfessorCount();
            int dCount = this.platform.getDegreeAwarded();
            
            Object[] row = new Object[4];
            row[0] = rev;
            row[1] = sCount;
            row[2] = pCount;
            row[3] = dCount;
            keyTableModel.addRow(row);
            
        }catch (Throwable e) {

        }
               
    };
        
    public void populateProfessorRanking(){
        
        profTableModel.setRowCount(0);
        int count = 1;
        try{
            this.platform.getPd().sortProfessor(this.platform.getPd().getProfessors());
            for (Professor p: this.platform.getPd().getProfessors()){
                Object[] row = new Object[3];
                row[0] = count++;
                row[1] = p.getName();
                row[2] = p.calReputation();
                
                profTableModel.addRow(row);
            }
        }catch (Throwable e) {

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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        keyTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        profTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setText("Dashboard");

        keyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Total Subscription Fee", "Student Count", "Active Professor Count", "Total Degree Awarded"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(keyTable);

        jLabel2.setText("Professor ranking");

        profTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No.", "Professor Name", "Rating"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(profTable);

        jLabel3.setText("Key Metrics");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(371, 371, 371)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable keyTable;
    private javax.swing.JTable profTable;
    // End of variables declaration//GEN-END:variables
}
