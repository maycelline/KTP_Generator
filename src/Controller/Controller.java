package Controller;

import Database.ConnectionManager;
import Model.Penduduk;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Controller {
    static ConnectionManager conn = new ConnectionManager();

    public boolean addNewUser(Penduduk penduduk) {
        conn.connect();
        String query = "INSERT INTO penduduk VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, penduduk.getNIK());
            stmt.setString(2, penduduk.getNama());
            stmt.setString(3, penduduk.getTempatLahir());
            stmt.setString(4, penduduk.getTanggalLahir());
            stmt.setString(5, penduduk.getJenisKelamin());
            stmt.setString(6, penduduk.getGolonganDarah());
            stmt.setString(7, penduduk.getAlamat());
            stmt.setString(8, penduduk.getRtrw());
            stmt.setString(9, penduduk.getKeldesa());
            stmt.setString(10, penduduk.getKecamatan());
            stmt.setString(11, penduduk.getAgama());
            stmt.setString(12, penduduk.getStatusPerkawinan());
            stmt.setString(13, penduduk.getPekerjaan());
            stmt.setString(14, penduduk.getKewarganegaraan());
            stmt.setString(15, penduduk.getPathFoto());
            stmt.setString(16, penduduk.getPathTTD());
            stmt.setString(17, penduduk.getKotaPembuatan());
            stmt.setString(18, penduduk.getTanggalPembuatan());
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }

    public static Penduduk getPenduduk(String NIK) {
        conn.connect();
        String query = "SELECT * FROM penduduk WHERE nik='" + NIK + "'";
        Penduduk user = new Penduduk();
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                user.setNIK(rs.getString("nik"));
                user.setNama(rs.getString("nama"));
                user.setTempatLahir(rs.getString("tempatLahir"));
                user.setTanggalLahir(rs.getString("tanggalLahir"));
                user.setJenisKelamin(rs.getString("jenisKelamin"));
                user.setGolonganDarah(rs.getString("golonganDarah"));
                user.setAlamat(rs.getString("alamat"));
                user.setRtrw(rs.getString("rtrw"));
                user.setKeldesa(rs.getString("keldesa"));
                user.setKecamatan(rs.getString("kecamatan"));
                user.setAgama(rs.getString("agama"));
                user.setStatusPerkawinan(rs.getString("statusPerkawinan"));
                user.setPekerjaan(rs.getString("pekerjaan"));
                user.setKewarganegaraan(rs.getString("kewarganegaraan"));
                user.setPathFoto(rs.getString("pathFoto"));
                user.setPathTTD(rs.getString("pathTTD"));
                user.setKotaPembuatan(rs.getString("kotaPembuatan"));
                user.setTanggalPembuatan(rs.getString("tanggalPembuatan"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (user);
    }
}
