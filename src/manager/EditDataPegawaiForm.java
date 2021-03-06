/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.Controller;

/**
 *
 * @author Riky Setiawan 2013730041 , Sukamto 2013730026
 */
public class EditDataPegawaiForm extends javax.swing.JFrame {

    Statement statement;
    Controller cont;
    String idPegawai;
    String namaPegawai;
    String alamat;
    String kota;
    String tanggalLahir;
    String tanggal;
    String bulan;
    String tahun;
    boolean isChanges;
    
    /**
     * Creates new form EditDataPegawaiForm
     */
    public EditDataPegawaiForm(Controller cont) {
        this.cont = cont;
        statement = cont.getStatement();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        idPegawaiLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        namaField = new javax.swing.JTextField();
        alamatField = new javax.swing.JTextField();
        tanggalBox = new javax.swing.JComboBox();
        tahunBox = new javax.swing.JComboBox();
        bulanBox = new javax.swing.JComboBox();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        oldPassField = new javax.swing.JPasswordField();
        newPassField = new javax.swing.JPasswordField();
        retypePassField = new javax.swing.JPasswordField();
        saveButton2 = new javax.swing.JButton();
        cancelButton2 = new javax.swing.JButton();
        kotaBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        oldPassLabel = new javax.swing.JLabel();
        retypeLabel = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID Pegawai");

        idPegawaiLabel.setText("idPegawai");

        jLabel3.setText("Nama");

        jLabel4.setText("Alamat");

        jLabel5.setText("Kota");

        jLabel6.setText("Tanggal lahir");

        namaField.setText("jTextField1");

        alamatField.setText("jTextField2");

        tanggalBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tanggal", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        tahunBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tahun", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010" }));

        bulanBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bulan", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        saveButton.setText("Save Changes");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel7.setText(":");

        jLabel8.setText(":");

        jLabel9.setText(":");

        jLabel10.setText(":");

        jLabel11.setText(":");

        jLabel12.setText("Old password");

        jLabel13.setText("New password");

        jLabel14.setText("Retype new");

        saveButton2.setText("Save Changes");
        saveButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButton2ActionPerformed(evt);
            }
        });

        cancelButton2.setText("Cancel");
        cancelButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButton2ActionPerformed(evt);
            }
        });

        kotaBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Pilih Kota -", "Aceh", "Ambon", "Balikpapan", "Bandarlampung", "Bandung", "Banjar", "Banjarmasin", "Banjar Baru", "Batam", "Batu", "Bau-Bau", "Bekasi", "Bengkulu", "Bima", "Binjai", "Bitung", "Blitar", "Bogor", "Bontang", "BukitTinggi", "Cilegon", "Cimahi", "Cirebon", "Denpasar", "Depok", "Dumai", "Gorontalo", "Gunung Sitoli", "Jakarta Barat", "Jakarta Pusat", "Jakarta Selatan", "Jakarta Timur", "Jakarta Utara", "Jambi", "Jayapura", "Kediri", "Kendari", "Kotamobagu", "Kupang", "Langsa", "Lhokseumawe", "Lubuk Linggau", "Madiun", "Magelang", "Makassar", "Malang", "Manado", "Mataram", "Medan", "Metro", "Mojokerto", "Padang", "Padang Sidempuan", "Pagar Alam", "Palangkaraya", "Palembang", "Palopo", "Palu", "Pandang Panjang", "Pangkalpinang", "Pare-Pare", "Pariaman", "Pasuruan", "Payakumbuh", "Pekalongan", "Pekanbaru", "Pematang Siantar", "Pontianak", "Prabumulih", "Probolinggo", "Saban", "Salatiga", "Samarinda", "Sawahlunto", "Semarang", "Serang", "Sibolga", "Singkawang", "Solok", "Sorong", "Subulussalam", "Sukabumi", "Sungai Penuh", "Surabaya", "Surakarta", "Tangerang", "Tangerang Selatan", "Tanjung Balai", "Tanjung Pinang", "Tarakan", "Tasikmalaya", "Tebing Tinggi", "Tegal", "Ternate", "Tidore Kepulauan", "Tomohon", "Tual", "Yogyakarta" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Melodia Music Lesson");

        oldPassLabel.setText("jLabel15");

        retypeLabel.setText("jLabel16");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Edit Data Pegawai");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(saveButton)
                            .addGap(70, 70, 70)
                            .addComponent(cancelButton))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(saveButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancelButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(idPegawaiLabel)
                                    .addComponent(kotaBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(alamatField)
                                    .addComponent(namaField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(tanggalBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bulanBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tahunBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(oldPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(retypePassField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oldPassLabel)
                            .addComponent(retypeLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel15)))
                .addGap(0, 130, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(idPegawaiLabel))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(namaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alamatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5)
                    .addComponent(kotaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tanggalBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bulanBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tahunBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(oldPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oldPassLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(retypePassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retypeLabel))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton2)
                    .addComponent(cancelButton2))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.cont.getLaporanDataPegawai().setVisible(true);
        this.cont.getLaporanDataPegawai().setTabel();
        this.setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void cancelButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButton2ActionPerformed
        this.cont.getLaporanDataPegawai().setVisible(true);
        this.cont.getLaporanDataPegawai().setTabel();
        this.setVisible(false);
    }//GEN-LAST:event_cancelButton2ActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String newNama = namaField.getText().trim();
        String query;
        ResultSet rs;
        if (!newNama.equals(namaPegawai)) {
            isChanges = true;
            query = String.format("UPDATE DataPegawai SET namaPegawai = '%s' where idPegawai ='%s' ", newNama, idPegawai);
            try {
                statement.execute(query);
            } catch (SQLException ex) {
                Logger.getLogger(EditDataPegawaiForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        String newAlamat = alamatField.getText().trim();
        if (!newAlamat.equals(alamat)) {
            isChanges = true;
            query = String.format("UPDATE DataPegawai SET alamat = '%s' where idPegawai ='%s' ", newAlamat, idPegawai);
            try {
                statement.execute(query);
            } catch (SQLException ex) {
                Logger.getLogger(EditDataPegawaiForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        String newKota = kotaBox.getSelectedItem() + "";
        if (!newKota.equals(kota)) {
            isChanges = true;
            String kodeKota;
            try {
                query = String.format("select kodeKota from Kota where nama ='%s'", newKota);
                rs = statement.executeQuery(query);
                rs.next();
                kodeKota = rs.getString("kodeKota");
                query = String.format("UPDATE DataPegawai SET kota= '%s' where idPegawai ='%s' ", kodeKota, idPegawai);
                statement.execute(query);
            } catch (SQLException ex) {
                Logger.getLogger(EditDataPegawaiForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        String newTanggalLahir = tahunBox.getSelectedItem() + "-" + bulanBox.getSelectedItem() + "-" + tanggalBox.getSelectedItem();
        if (!newTanggalLahir.equals(tanggalLahir)) {
            isChanges = true;
            query = String.format("UPDATE DataPegawai SET tglLahir = '%s' where idPegawai ='%s' ", newTanggalLahir, idPegawai);
            try {
                statement.execute(query);
            } catch (SQLException ex) {
                Logger.getLogger(EditDataPegawaiForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (isChanges) {
            JOptionPane.showMessageDialog(null, "Changes saved.");
        }
        this.setVisible(false);
        this.cont.getLaporanDataPegawai().setTabel();
        this.cont.getLaporanDataPegawai().setVisible(true);
    }//GEN-LAST:event_saveButtonActionPerformed

    private void saveButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButton2ActionPerformed
        try {
            String oldPassword = "";
            String currentPassword ="";
            String newPassword ="";
            char[] oldPass = oldPassField.getPassword();
            char[] newPass = newPassField.getPassword();
            char[] retypePass = retypePassField.getPassword();
            for (int i = 0; i < oldPass.length; i++) {
                oldPassword += oldPass[i] + "";
            }
            for (int i = 0; i < newPass.length; i++) {
                newPassword+=newPass[i];
            }
            String query = String.format("select password from account join datapegawai on datapegawai.idpegawai = account.idpegawai where DataPegawai.idPegawai = '%s'", idPegawai);
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){
                currentPassword = rs.getString("password");
            }
            if(oldPassword.equals(currentPassword)){
                oldPassLabel.setText("");
                if(Arrays.equals(newPass, retypePass)){
                    isChanges = true;
                    query = String.format("update Account set password ='%s' where idPegawai = '%s'",newPassword,idPegawai);
                    statement.execute(query);
                    saveButton.doClick();
                }
                else
                {
                    retypeLabel.setText("Password tidak sama.");
                }
            }
            else{
                oldPassLabel.setText("Password salah.");
                if(Arrays.equals(newPass, retypePass)){
                    retypeLabel.setText("");
                }
                else
                {
                    retypeLabel.setText("Password tidak sama.");
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EditDataPegawaiForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveButton2ActionPerformed

    public void setData(String id) {
        String query = String.format("select * from DataPegawai where idPegawai = '%s'", id);
        try {
            ResultSet rs = statement.executeQuery(query);
            rs.next();
            isChanges = false;
            idPegawai = id;
            this.idPegawaiLabel.setText(idPegawai);
            namaPegawai = rs.getString("namaPegawai");
            this.namaField.setText(namaPegawai);
            alamat = rs.getString("alamat");
            this.alamatField.setText(alamat);
            tanggalLahir = rs.getString("tglLahir");
            String[] split = tanggalLahir.split("-");
            tahun = split[0];
            bulan = Integer.parseInt(split[1]) + "";
            tanggal = Integer.parseInt(split[2]) + "";
            tahunBox.setSelectedItem(tahun);
            bulanBox.setSelectedItem(bulan);
            tanggalBox.setSelectedItem(tanggal);
            String kodeKota = rs.getString("kota");
            ResultSet rsKota = statement.executeQuery(String.format("select nama from Kota where kodeKota = '%s'", kodeKota));
            rsKota.next();
            kota = rsKota.getString("nama");
            kotaBox.setSelectedItem(kota.trim());
            oldPassField.setText("");
            newPassField.setText("");
            retypePassField.setText("");
            oldPassLabel.setText("");
            retypeLabel.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(EditDataPegawaiForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamatField;
    private javax.swing.JComboBox bulanBox;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton cancelButton2;
    private javax.swing.JLabel idPegawaiLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox kotaBox;
    private javax.swing.JTextField namaField;
    private javax.swing.JPasswordField newPassField;
    private javax.swing.JPasswordField oldPassField;
    private javax.swing.JLabel oldPassLabel;
    private javax.swing.JLabel retypeLabel;
    private javax.swing.JPasswordField retypePassField;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton saveButton2;
    private javax.swing.JComboBox tahunBox;
    private javax.swing.JComboBox tanggalBox;
    // End of variables declaration//GEN-END:variables
}
