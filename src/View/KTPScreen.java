package View;

import Main.Main;
import Model.Penduduk;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class KTPScreen {
    public KTPScreen(Penduduk penduduk) {
        JFrame frame = new JFrame("Halaman KTP");
        JPanel ktp = new JPanel();
        ktp.setBounds(0, 0, 600, 500);
        ktp.setLayout(null);
        ktp.setBackground(new Color(178, 206, 255));

        JLabel title = new JLabel("REPUBLIK HARAPAN BANGSA", SwingConstants.CENTER);
        title.setVisible(true);
        title.setBounds(0, 0, 600, 30);
        title.setFont(new Font("Serif", Font.PLAIN, 28));
        ktp.add(title);

        String NIK = "NIK                 :" + penduduk.getNIK();
        JLabel labelNIK = new JLabel(NIK);
        labelNIK.setFont(new Font("Poppins", Font.PLAIN, 22));
        labelNIK.setBounds(10, 40, 600, 30);
        ktp.add(labelNIK);

        ImageIcon fotoKTP = new ImageIcon(penduduk.getPathFoto());
        JLabel labelFotoKTP = new JLabel(fotoKTP, JLabel.CENTER);
        labelFotoKTP.setBounds(400, 40, 120, 200);
        labelFotoKTP.setVisible(true);
        ktp.add(labelFotoKTP);

        JLabel labelKotaPembuatan = new JLabel(penduduk.getKotaPembuatan());
        labelKotaPembuatan.setBounds(400, 240, 120, 30);
        labelKotaPembuatan.setVisible(true);
        ktp.add(labelKotaPembuatan);

        JLabel labelTanggalPembuatan = new JLabel(penduduk.getTanggalPembuatan());
        labelTanggalPembuatan.setBounds(400, 270, 120, 30);
        labelTanggalPembuatan.setVisible(true);
        ktp.add(labelTanggalPembuatan);

        ImageIcon fotoTTD = new ImageIcon(penduduk.getPathTTD());
        JLabel labelFotoTTD = new JLabel(fotoTTD, JLabel.CENTER);
        labelFotoTTD.setBounds(400, 300, 70, 70);
        labelFotoTTD.setVisible(true);
        ktp.add(labelFotoTTD);

        String nama = "Nama               :" + penduduk.getNama();
        JLabel labelNama = new JLabel(nama);
        labelNama.setFont(new Font("Poppins", Font.PLAIN, 17));
        labelNama.setBounds(10, 70, 600, 30);
        ktp.add(labelNama);

        String ttl = "Tempat/Tgl Lahir    :" + penduduk.getTempatLahir() + ", " + penduduk.getTanggalLahir();
        JLabel labelTTL = new JLabel(ttl);
        labelTTL.setFont(new Font("Poppins", Font.PLAIN, 17));
        labelTTL.setBounds(10, 100, 600, 30);
        ktp.add(labelTTL);

        String jk = "Jenis Kelamin         :" + penduduk.getJenisKelamin();
        JLabel labelJK = new JLabel(jk);
        labelJK.setFont(new Font("Poppins", Font.PLAIN, 17));
        labelJK.setBounds(10, 130, 600, 30);
        ktp.add(labelJK);

        String alamat = "Alamat            :" + penduduk.getAlamat();
        JLabel labelAlamat = new JLabel(alamat);
        labelAlamat.setFont(new Font("Poppins", Font.PLAIN, 17));
        labelAlamat.setBounds(10, 160, 600, 30);
        ktp.add(labelAlamat);

        String rtrw = "RT/RW     : " + penduduk.getRtrw();
        JLabel labelRTRW = new JLabel(rtrw);
        labelRTRW.setFont(new Font("Poppins", Font.PLAIN, 17));
        labelRTRW.setBounds(40, 190, 600, 30);
        ktp.add(labelRTRW);

        String keldesa = "Desa    :" + penduduk.getKeldesa();
        JLabel labelDesa = new JLabel(keldesa);
        labelDesa.setFont(new Font("Poppins", Font.PLAIN, 17));
        labelDesa.setBounds(40, 220, 600, 30);
        ktp.add(labelDesa);

        String kecamatan = "Kecamatan  :" + penduduk.getKecamatan();
        JLabel labelKecamatan = new JLabel(kecamatan);
        labelKecamatan.setFont(new Font("Poppins", Font.PLAIN, 17));
        labelKecamatan.setBounds(40, 250, 600, 30);
        ktp.add(labelKecamatan);

        String agama = "Agama     :" + penduduk.getAgama();
        JLabel labelAgama = new JLabel(agama);
        labelAgama.setFont(new Font("Poppins", Font.PLAIN, 17));
        labelAgama.setBounds(10, 280, 600, 30);
        ktp.add(labelAgama);

        String status = "Status Perkawinan    :" + penduduk.getStatusPerkawinan();
        JLabel labelStatus = new JLabel(status);
        labelStatus.setFont(new Font("Poppins", Font.PLAIN, 17));
        labelStatus.setBounds(10, 310, 600, 30);
        ktp.add(labelStatus);

        String pekerjaan = "Pekerjaan    :" + penduduk.getPekerjaan();
        JLabel labelPekerjaan = new JLabel(pekerjaan);
        labelPekerjaan.setFont(new Font("Poppins", Font.PLAIN, 17));
        labelPekerjaan.setBounds(10, 340, 600, 30);
        ktp.add(labelPekerjaan);

        String kewarganegaraan = "Kewarganegaraan    :" + penduduk.getKewarganegaraan();
        JLabel labelKewarganegaraan = new JLabel(kewarganegaraan);
        labelKewarganegaraan.setFont(new Font("Poppins", Font.PLAIN, 17));
        labelKewarganegaraan.setBounds(10, 370, 600, 30);
        ktp.add(labelKewarganegaraan);

        JLabel masaBerlaku = new JLabel("Masa Berlaku   : SEUMUR HIDUP");
        masaBerlaku.setFont(new Font("Poppins", Font.PLAIN, 17));
        masaBerlaku.setBounds(10, 400, 600, 30);
        ktp.add(masaBerlaku);


        frame.add(ktp);
        frame.setSize(600, 500);
        frame.setVisible(true);


    }


}
