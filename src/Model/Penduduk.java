/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author maycelline
 */
public class Penduduk {
    private String NIK;
    private String Nama;
    private String tempatLahir;
    private String tanggalLahir;
    private String jenisKelamin;
    private String golonganDarah;
    private String alamat;
    private String rtrw;
    private String keldesa;
    private String kecamatan;
    private String agama;
    private String statusPerkawinan;
    private String pekerjaan;
    private String kewarganegaraan;
    private String pathFoto;
    private String pathTTD;
    private String kotaPembuatan;
    private String tanggalPembuatan;

    public Penduduk(){

    }
  

    public Penduduk(String NIK, String Nama, String tempatLahir, String tanggalLahir, String jenisKelamin, String golonganDarah, String alamat, String rtrw, String keldesa, String kecamatan, String agama, String statusPerkawinan, String pekerjaan, String kewarganegaraan, String pathFoto, String pathTTD, String kotaPembuatan,String tanggalPembuatan) {
        setNIK(NIK);
        setNama(Nama);
        setTempatLahir(tempatLahir);
        setTanggalLahir(tanggalLahir);
        setJenisKelamin(jenisKelamin);
        setGolonganDarah(golonganDarah);
        setAlamat(alamat);
        setRtrw(rtrw);
        setKeldesa(keldesa);
        setKecamatan(kecamatan);
        setAgama(agama);
        setStatusPerkawinan(statusPerkawinan);
        setPekerjaan(pekerjaan);
        setKewarganegaraan(kewarganegaraan);
        setPathFoto(pathFoto);
        setPathTTD(pathTTD);
        setKotaPembuatan(kotaPembuatan);
        setTanggalPembuatan(tanggalPembuatan);
    }

    public String getKotaPembuatan() {
        return kotaPembuatan;
    }

    public void setKotaPembuatan(String kotaPembuatan) {
        this.kotaPembuatan = kotaPembuatan;
    }

    public String getTanggalPembuatan() {
        return tanggalPembuatan;
    }

    public void setTanggalPembuatan(String tanggalPembuatan) {
        this.tanggalPembuatan = tanggalPembuatan;
    }





    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getGolonganDarah() {
        return golonganDarah;
    }

    public void setGolonganDarah(String golonganDarah) {
        this.golonganDarah = golonganDarah;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getRtrw() {
        return rtrw;
    }

    public void setRtrw(String rtrw) {
        this.rtrw = rtrw;
    }

    public String getKeldesa() {
        return keldesa;
    }

    public void setKeldesa(String keldesa) {
        this.keldesa = keldesa;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getStatusPerkawinan() {
        return statusPerkawinan;
    }

    public void setStatusPerkawinan(String statusPerkawinan) {
        this.statusPerkawinan = statusPerkawinan;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    public String getPathFoto() {
        return pathFoto;
    }

    public void setPathFoto(String pathFoto) {
        this.pathFoto = pathFoto;
    }

    public String getPathTTD() {
        return pathTTD;
    }

    public void setPathTTD(String pathTTD) {
        this.pathTTD = pathTTD;
    }
    
    
}
