package manager;

import main.Controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Riky Setiawan 2013730041 , Sukamto 2013730026
 */
public class HomepageManager extends javax.swing.JFrame {

    Controller cont;
    
    /**
     * Creates new form HomepageManager
     */
    public HomepageManager(Controller cont) {
        this.cont = cont;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        paketKursusButton = new javax.swing.JButton();
        dataPegawaiButton = new javax.swing.JButton();
        laporanPelaksanaanButton = new javax.swing.JButton();
        laporanKehadiranButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Melodia Music Lesson");

        jLabel2.setText("Welcome, Manager !");

        jLabel3.setText("Choose your option : ");

        logoutButton.setText("Log Out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        paketKursusButton.setText("Paket Kursus");
        paketKursusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paketKursusButtonActionPerformed(evt);
            }
        });

        dataPegawaiButton.setText("Data Pegawai");
        dataPegawaiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataPegawaiButtonActionPerformed(evt);
            }
        });

        laporanPelaksanaanButton.setText("Laporan Pelaksanaan Kursus");
        laporanPelaksanaanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanPelaksanaanButtonActionPerformed(evt);
            }
        });

        laporanKehadiranButton.setText("Laporan Kehadiran Kursus");
        laporanKehadiranButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanKehadiranButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(0, 307, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(logoutButton)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(paketKursusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(laporanKehadiranButton, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(laporanPelaksanaanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataPegawaiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(logoutButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paketKursusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataPegawaiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laporanPelaksanaanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(laporanKehadiranButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        this.cont.getLogin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void paketKursusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paketKursusButtonActionPerformed
        this.cont.getPaketKursus().setVisible(true);
        this.cont.getPaketKursus().setTabel();
        this.setVisible(false);
    }//GEN-LAST:event_paketKursusButtonActionPerformed

    private void dataPegawaiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataPegawaiButtonActionPerformed
        this.cont.getLaporanDataPegawai().setTabel();
        this.cont.getLaporanDataPegawai().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_dataPegawaiButtonActionPerformed

    private void laporanPelaksanaanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanPelaksanaanButtonActionPerformed
        this.cont.getLaporanPelaksanaan().setVisible(true);
        this.cont.getLaporanPelaksanaan().setTabel();
        this.setVisible(false);
    }//GEN-LAST:event_laporanPelaksanaanButtonActionPerformed

    private void laporanKehadiranButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanKehadiranButtonActionPerformed
        this.cont.getDataKehadiran().setVisible(true);
        this.cont.getDataKehadiran().setTabel();
        this.setVisible(false);
    }//GEN-LAST:event_laporanKehadiranButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dataPegawaiButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton laporanKehadiranButton;
    private javax.swing.JButton laporanPelaksanaanButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton paketKursusButton;
    // End of variables declaration//GEN-END:variables
}
