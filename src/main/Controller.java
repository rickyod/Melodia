package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import manager.EditDataPegawaiForm;
import manager.EditPaketKursusForm;
import manager.HomepageManager;
import manager.InsertDataPegawaiForm;
import manager.InsertPaketKursusForm;
import manager.LaporanDataPegawaiForm;
import manager.LaporanPaketKursus;
import manager.PaketKursusForm;
import receptionist.DataKehadiran;
import receptionist.DataPesertaForm;
import receptionist.HomepageReceptionist;
import receptionist.LaporanKehadiranMainForm;
import receptionist.LaporanPelaksanaanKursusForm;
import receptionist.PendaftaranSiswaForm;
import receptionist.UpdateKehadiranForm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Riky Setiawan 2013730041 , Sukamto 2013730026
 */
public class Controller {

    private DataKehadiran dataKehadiran;
    private LaporanDataPegawaiForm laporanDataPegawai;
    private DataPesertaForm dataPeserta;
    private InsertDataPegawaiForm insertDataPegawaiForm;
    private EditDataPegawaiForm editDataPegawaiForm;
    private EditPaketKursusForm editPaketKursusForm;
    private UpdateKehadiranForm updateKehadiran;
    private HomepageManager homepageManager;
    private HomepageReceptionist homepageRec;
    private InsertPaketKursusForm insertPaketForm;
    private PaketKursusForm paketKursus;
    private LaporanKehadiranMainForm laporanKehadiran;
    private LaporanPaketKursus laporanPaketKursus;
    private LaporanPelaksanaanKursusForm laporanPelaksanaan;
    private Login login;
    private PendaftaranSiswaForm pendaftaranSiswa;
    private Connection conn;
    private Statement statement;
    private String loggedIn;
    private boolean connected;

    public Controller() {

        try {
            conn = DriverManager.getConnection("jdbc:sqlserver://10.100.70.70;user=i13041;password=rickyod;database=i13041");
            statement = conn.createStatement();
            connected = true;
        } catch (SQLException ex) {
            connected = false;
            JOptionPane.showMessageDialog(null, "Koneksi ke database gagal , coba periksa koneksi internet.");
        }
        if (connected) {
            this.dataKehadiran = new DataKehadiran(this);
            this.laporanDataPegawai = new LaporanDataPegawaiForm(this);
            this.dataPeserta = new DataPesertaForm(this);
            this.insertDataPegawaiForm = new InsertDataPegawaiForm(this);
            this.editDataPegawaiForm = new EditDataPegawaiForm(this);
            this.editPaketKursusForm = new EditPaketKursusForm(this);
            this.updateKehadiran = new UpdateKehadiranForm(this);
            this.homepageManager = new HomepageManager(this);
            this.homepageRec = new HomepageReceptionist(this);
            this.insertPaketForm = new InsertPaketKursusForm(this);
            this.paketKursus = new PaketKursusForm(this);
            this.laporanKehadiran = new LaporanKehadiranMainForm(this);
            this.laporanPaketKursus = new LaporanPaketKursus(this);
            this.laporanPelaksanaan = new LaporanPelaksanaanKursusForm(this);
            this.login = new Login(this);
            this.pendaftaranSiswa = new PendaftaranSiswaForm(this);
            this.login.setVisible(true);
        }
        //contoh query
//        Statement sta = conn.createStatement();
//            String query = "select * from penduduk";
//            ResultSet rs = sta.executeQuery(query);
//        while (rs.next()) 
//            {
//                System.out.println(rs.getString("nama"));
//            }
    }

    public void setLoggedIn(String loggedIn) {
        this.loggedIn = loggedIn;
    }

    public String getLoggedIn() {
        return loggedIn;
    }

    public Connection getConn() {
        return conn;
    }

    public Statement getStatement() {
        return statement;
    }

    public DataKehadiran getDataKehadiran() {
        return dataKehadiran;
    }

    public LaporanDataPegawaiForm getLaporanDataPegawai() {
        return laporanDataPegawai;
    }

    public DataPesertaForm getDataPeserta() {
        return dataPeserta;
    }

    public InsertDataPegawaiForm getInsertDataPegawaiForm() {
        return insertDataPegawaiForm;
    }

    public EditDataPegawaiForm getEditDataPegawaiForm() {
        return editDataPegawaiForm;
    }

    public EditPaketKursusForm getEditPaketKursusForm() {
        return editPaketKursusForm;
    }

    public UpdateKehadiranForm getUpdateKehadiran() {
        return updateKehadiran;
    }

    public HomepageManager getHomepageManager() {
        return homepageManager;
    }

    public HomepageReceptionist getHomepageRec() {
        return homepageRec;
    }

    public InsertPaketKursusForm getInsertPaketForm() {
        return insertPaketForm;
    }

    public PaketKursusForm getPaketKursus() {
        return paketKursus;
    }

    public LaporanKehadiranMainForm getLaporanKehadiran() {
        return laporanKehadiran;
    }

    public LaporanPaketKursus getLaporanPaketKursus() {
        return laporanPaketKursus;
    }

    public LaporanPelaksanaanKursusForm getLaporanPelaksanaan() {
        return laporanPelaksanaan;
    }

    public Login getLogin() {
        return login;
    }

    public PendaftaranSiswaForm getPendaftaranSiswa() {
        return pendaftaranSiswa;
    }

    public static void main(String[] args) {
        new Controller();
    }
}
