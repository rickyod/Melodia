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
import receptionist.DaftarUlangForm;
import receptionist.DataKehadiran;
import receptionist.DataPesertaForm;
import receptionist.EditDataPesertaForm;
import receptionist.FormTransaksi;
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
    private EditDataPesertaForm editDataPesertaForm;
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
    private DaftarUlangForm daftarUlang;
    private FormTransaksi formTransaksi;
    private Connection conn;
    private Statement statement;
    private String loggedIn;
    private String idPegawai;
    private String namaPegawai;
    private boolean connected;

    
    public Controller() {

        try {
            conn = DriverManager.getConnection("jdbc:sqlserver://10.100.70.70;user=i13041;password=rickyod;database=i13041");
            JOptionPane.showMessageDialog(null, "Connected.");
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
            this.editDataPesertaForm = new EditDataPesertaForm(this);
            this.updateKehadiran = new UpdateKehadiranForm(this);
            this.homepageManager = new HomepageManager(this);
            this.homepageRec = new HomepageReceptionist(this);
            this.insertPaketForm = new InsertPaketKursusForm(this);
            this.paketKursus = new PaketKursusForm(this);
            this.laporanKehadiran = new LaporanKehadiranMainForm(this);
            this.laporanPaketKursus = new LaporanPaketKursus(this);
            this.laporanPelaksanaan = new LaporanPelaksanaanKursusForm(this);
            this.formTransaksi = new FormTransaksi(this);
            this.daftarUlang = new DaftarUlangForm(this);
            this.login = new Login(this);
            this.pendaftaranSiswa = new PendaftaranSiswaForm(this);
            this.login.setVisible(true);
        }
    }

    public void setLoggedIn(String loggedIn) {
        this.loggedIn = loggedIn;
    }

    public String getLoggedIn() {
        return loggedIn;
    }

    public EditDataPesertaForm getEditDataPesertaForm() {
        return editDataPesertaForm;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    public String getIdPegawai() {
        return idPegawai;
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

    public FormTransaksi getFormTransaksi() {
        return formTransaksi;
    }
    
    public LaporanPelaksanaanKursusForm getLaporanPelaksanaan() {
        return laporanPelaksanaan;
    }

    public DaftarUlangForm getDaftarUlang() {
        return daftarUlang;
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
