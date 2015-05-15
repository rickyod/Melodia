package manager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.Controller;
import model.TableModelPaketKursus;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Riky Setiawan 2013730041 , Sukamto 2013730026
 */
public class PaketKursusForm extends javax.swing.JFrame {

    TableModelPaketKursus TableModel;
    Controller cont;
            
    /**
     * Creates new form HomeManager
     */
    public PaketKursusForm(Controller cont) {
        this.cont = cont;
        initComponents();
        TableModel = new TableModelPaketKursus();
        this.setLocationRelativeTo(null);
        this.tabelPaketKursus.setModel(TableModel);
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
        insertButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPaketKursus = new javax.swing.JTable();
        editButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Paket Kursus");

        insertButton.setText("Insert");
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        tabelPaketKursus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Paket", "Nama Paket", "Jenis Alat Musik", "Biaya"
            }
        ));
        jScrollPane1.setViewportView(tabelPaketKursus);

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Melodia Music Lesson");

        logoutButton.setText("Log Out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(61, 61, 61)
                                .addComponent(logoutButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(insertButton)
                                .addGap(18, 18, 18)
                                .addComponent(editButton)
                                .addGap(18, 18, 18)
                                .addComponent(deleteButton)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoutButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton)
                    .addComponent(insertButton)
                    .addComponent(deleteButton))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setTabel() {
        TableModel.clearData();
        try {
            int count = 0;
            Statement sta = this.cont.getStatement();
            String query = "select COUNT(idPaket) as jumlahPaket from PaketKursus";
            ResultSet rs = sta.executeQuery(query);
            rs.next();
            int size = rs.getInt("jumlahPaket");
            String[][] input = new String[size][4];
            query = "select * from PaketKursus";
            rs = sta.executeQuery(query);
            while(rs.next()){
                input[count][0] = rs.getString("idPaket");
                input[count][1] = rs.getString("namaPaket");
                input[count][2] = rs.getString("jenisAlatMusik");
                input[count][3] = rs.getString("biaya");
                count++;
            }
            TableModel.updateData(input,size);
        } catch (SQLException ex) {
            Logger.getLogger(LaporanDataPegawaiForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        int index = tabelPaketKursus.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(null, "Row is not selected.");
        } else {
            this.cont.getEditPaketKursusForm().setData(tabelPaketKursus.getValueAt(index, 0) + "");
            this.cont.getEditPaketKursusForm().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        this.cont.getInsertPaketForm().setVisible(true);
        this.cont.getInsertPaketForm().clear();
        this.setVisible(false);
    }//GEN-LAST:event_insertButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.cont.getHomepageManager().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int index = tabelPaketKursus.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(null, "Row is not selected.");
        } else {
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this information?", "Choose", JOptionPane.YES_NO_OPTION);
            if (confirm == 0) {
                try {
                    Statement sta = this.cont.getStatement();
                    String idAlat = tabelPaketKursus.getValueAt(index, 2) + "";
                    String query = String.format("delete from PaketKursus where jenisAlatMusik = '%s'", idAlat);
                    boolean exe = sta.execute(query);
                    if (!exe) {
                        JOptionPane.showMessageDialog(null, "Successful.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Delete unsuccessful.");
                    }
                    this.setTabel();
                } catch (SQLException ex) {
                    Logger.getLogger(LaporanDataPegawaiForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        this.cont.getLogin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTable tabelPaketKursus;
    // End of variables declaration//GEN-END:variables
}
