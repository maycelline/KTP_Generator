package View;

import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Properties;
import java.util.Scanner;

public class FormScreen {
    public FormScreen() {
        inputScreen();
    }

    public void inputScreen() {
        JFrame jf = new JFrame("Halaman Input Data");

        //panel
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 700, 700);
        panel.setBackground(new Color(250,235,224));
        panel.setLayout(null);

        //label judul
        JLabel judul = new JLabel("PEMBUATAN KTP ELEKTRONIK", SwingConstants.CENTER);
        judul.setVisible(true);
        judul.setBounds(0,10,700,30);
        judul.setFont(new Font("Serif",Font.PLAIN,28));
        panel.add(judul);

        //label NIK
        JLabel labelNIK = new JLabel("Masukkan NIK");
        labelNIK.setBounds(20, 50, 260, 30);
        panel.add(labelNIK);

        //Text Field NIK
        JTextField inputNIK = new JTextField();
        inputNIK.setBounds(20, 80, 260, 30);
        inputNIK.setBackground(new Color(201,228,197));
        inputNIK.setBorder(BorderFactory.createEmptyBorder());
        panel.add(inputNIK);

        //Label nama
        JLabel labelNama = new JLabel("Masukkan Nama");
        labelNama.setBounds(350, 50, 260, 30);
        labelNama.setBackground(Color.PINK);
        panel.add(labelNama);

        //Text field nama
        JTextField inputNama = new JTextField();
        inputNama.setBounds(350, 80, 260, 30);
        inputNama.setBackground(new Color(201,228,197));
        inputNama.setBorder(BorderFactory.createEmptyBorder());
        panel.add(inputNama);

        //Label tempat lahir
        JLabel labelTempatLahir = new JLabel("Masukkan Tempat Lahir");
        labelTempatLahir.setBounds(20, 120, 260, 30);
        labelTempatLahir.setBackground(Color.PINK);
        panel.add(labelTempatLahir);

        //TextField tempatLahir
        JTextField inputTempatLahir = new JTextField();
        inputTempatLahir.setBounds(20, 150, 260, 30);
        inputTempatLahir.setBackground(new Color(201,228,197));
        inputTempatLahir.setBorder(BorderFactory.createEmptyBorder());
        panel.add(inputTempatLahir);

        //Label Tanggal Lahir
        JLabel labelTanggalLahir = new JLabel("Masukkan Tanggal Lahir");
        labelTanggalLahir.setBounds(350, 120, 260, 30);
        labelTanggalLahir.setBackground(Color.PINK);
        panel.add(labelTanggalLahir);

        //Date Picker
        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateComponentFormatter());
        datePicker.setBounds(350, 150, 260, 30);
        datePicker.setBackground(Color.white);
        panel.add(datePicker);

        //Label Jenis Kelamin
        JLabel labelJenisKelamin = new JLabel("Masukkan Jenis Kelamin");
        labelJenisKelamin.setBounds(20, 200, 260, 30);
        labelJenisKelamin.setBackground(Color.PINK);
        panel.add(labelJenisKelamin);

        //Radio Button Jjenis Kelamin
        JRadioButton male = new JRadioButton("Laki-laki");
        JRadioButton female = new JRadioButton("Perempuan");
        male.setBackground(new Color(250,235,224));
        female.setBackground(new Color(250,235,224));
        male.setBounds(350,200,100,30);
        female.setBounds(480,200,100,30);
        ButtonGroup jenisKelamin = new ButtonGroup();
        jenisKelamin.add(male);
        jenisKelamin.add(female);
        panel.add(male);panel.add(female);

        //Label Golongan Darah
        JLabel labelGolonganDarah = new JLabel("Masukkan Golongan Darah");
        labelGolonganDarah.setBounds(20, 240, 260, 30);
        labelGolonganDarah.setBackground(Color.PINK);
        panel.add(labelGolonganDarah);

        //Radio Button Golongan Darah
        JRadioButton goldarA = new JRadioButton("A");
        JRadioButton goldarB = new JRadioButton("B");
        JRadioButton goldarO = new JRadioButton("O");
        JRadioButton goldarAB = new JRadioButton("AB");

        goldarA.setBackground(new Color(250,235,224));
        goldarB.setBackground(new Color(250,235,224));
        goldarO.setBackground(new Color(250,235,224));
        goldarAB.setBackground(new Color(250,235,224));

        goldarA.setBounds(350,240,50,30);
        goldarB.setBounds(400,240,50,30);
        goldarO.setBounds(450,240,50,30);
        goldarAB.setBounds(500,240,50,30);
        ButtonGroup golonganDarah = new ButtonGroup();
        golonganDarah.add(goldarA);
        golonganDarah.add(goldarB);
        golonganDarah.add(goldarO);
        golonganDarah.add(goldarAB);

        panel.add(goldarA);
        panel.add(goldarB);
        panel.add(goldarO);
        panel.add(goldarAB);

        //label alamat
        JLabel labelAlamat = new JLabel("Masukkan Alamat");
        labelAlamat.setBounds(20, 280, 260, 30);
        panel.add(labelAlamat);

        //textfield alamat
        JTextField inputAlamat = new JTextField();
        inputAlamat.setBounds(20, 310, 260, 50);
        inputAlamat.setBackground(new Color(201,228,197));
        inputAlamat.setBorder(BorderFactory.createEmptyBorder());
        panel.add(inputAlamat);

        //Label RT
        JLabel labelRT = new JLabel("RT");
        labelRT.setBounds(20, 370, 100, 30);
        panel.add(labelRT);
        //
        JTextField inputRT = new JTextField();
        inputRT.setBounds(20, 400, 100, 30);
        inputRT.setBackground(new Color(201,228,197));
        inputRT.setBorder(BorderFactory.createEmptyBorder());
        panel.add(inputRT);

        //Label RT
        JLabel labelRW = new JLabel("RW");
        labelRW.setBounds(140, 370, 260, 30);
        panel.add(labelRW);

        JTextField inputRW = new JTextField();
        inputRW.setBounds(140, 400, 100, 30);
        inputRW.setBackground(new Color(201,228,197));
        inputRW.setBorder(BorderFactory.createEmptyBorder());
        panel.add(inputRW);

        JLabel labelDesa = new JLabel("Kel/Desa");
        labelDesa.setBounds(250, 370, 260, 30);
        panel.add(labelDesa);

        JTextField inputDesa = new JTextField();
        inputDesa.setBounds(250, 400, 100, 30);
        inputDesa.setBackground(new Color(201,228,197));
        inputDesa.setBorder(BorderFactory.createEmptyBorder());
        panel.add(inputDesa);
        
        JLabel labelKecamatan = new JLabel("Kel/Desa");
        labelKecamatan.setBounds(380, 370, 260, 30);
        panel.add(labelKecamatan);

        JTextField inputKecamatan = new JTextField();
        inputKecamatan.setBounds(380, 400, 100, 30);
        inputKecamatan.setBackground(new Color(201,228,197));
        inputKecamatan.setBorder(BorderFactory.createEmptyBorder());
        panel.add(inputKecamatan);
        
        //Label agama
        JLabel labelAgama = new JLabel("Agama");
        labelAgama.setBounds(20, 440, 260, 30);
        panel.add(labelKecamatan);


        jf.add(panel);
        jf.setSize(700, 700);
        jf.setLayout(null);
        jf.setVisible(true);

    }

}
