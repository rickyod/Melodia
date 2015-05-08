
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

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
    private DataPegawai dataPegawai;
    private DataPeserta dataPeserta;
    private FormDataPegawaiBaru formDataPegawaiBaru;
    private FormKehadiran formKehadiran;
    private HomepageManager homepageManager;
    private HomepageReceptionist homepageRec;
    private InsertPaketKursusForm insertPaketForm;
    private PaketKursus paketKursus;
    private LaporanKehadiran laporanKehadiran;
    private LaporanPaketKursus laporanPaketKursus;
    private LaporanPelaksanaan laporanPelaksanaan;
    private Login login;
    private PendaftaranSiswaForm pendaftaranSiswa;
    private Connection conn;

    public Controller() {
        this.dataKehadiran = new DataKehadiran(this);
        this.dataPegawai = new DataPegawai(this);
        this.dataPeserta = new DataPeserta(this);
        this.formDataPegawaiBaru = new FormDataPegawaiBaru(this);
        this.formKehadiran = new FormKehadiran(this);
        this.homepageManager = new HomepageManager(this);
        this.homepageRec = new HomepageReceptionist(this);
        this.insertPaketForm = new InsertPaketKursusForm(this);
        this.paketKursus = new PaketKursus(this);
        this.laporanKehadiran = new LaporanKehadiran(this);
        this.laporanPaketKursus = new LaporanPaketKursus(this);
        this.laporanPelaksanaan = new LaporanPelaksanaan(this);
        this.login = new Login(this);
        this.pendaftaranSiswa = new PendaftaranSiswaForm(this);
        try {
            conn = DriverManager.getConnection("jdbc:sqlserver://10.100.70.70;user=i13041;password=;database=i13041");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Koneksi ke database gagal , coba periksa koneksi internet.");
        }
        this.login.setVisible(true);
        //contoh query
//        Statement sta = conn.createStatement();
//            String query = "select * from penduduk";
//            ResultSet rs = sta.executeQuery(query);
//        while (rs.next()) 
//            {
//                System.out.println(rs.getString("nama"));
//            }
    }

    public Connection getConn() {
        return conn;
    }

    public DataKehadiran getDataKehadiran() {
        return dataKehadiran;
    }

    public DataPegawai getDataPegawai() {
        return dataPegawai;
    }

    public DataPeserta getDataPeserta() {
        return dataPeserta;
    }

    public FormDataPegawaiBaru getFormDataPegawaiBaru() {
        return formDataPegawaiBaru;
    }

    public FormKehadiran getFormKehadiran() {
        return formKehadiran;
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

    public PaketKursus getPaketKursus() {
        return paketKursus;
    }

    public LaporanKehadiran getLaporanKehadiran() {
        return laporanKehadiran;
    }

    public LaporanPaketKursus getLaporanPaketKursus() {
        return laporanPaketKursus;
    }

    public LaporanPelaksanaan getLaporanPelaksanaan() {
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
