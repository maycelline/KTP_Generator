package View;

import Model.Penduduk;
import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

public class FormScreen {

    public FormScreen() {
        inputScreen();
    }

    public void inputScreen() {
        JFrame jf = new JFrame("Halaman Input Data");
        JLabel labelPathFotoKTP = new JLabel();
        JLabel labelPathFotoTTD = new JLabel();
        //panel
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 700, 2000);
        panel.setBackground(new Color(250, 235, 224));
        panel.setLayout(null);

        //label judul
        JLabel judul = new JLabel("PEMBUATAN KTP ELEKTRONIK", SwingConstants.CENTER);
        judul.setVisible(true);
        judul.setBounds(0, 10, 700, 30);
        judul.setFont(new Font("Serif", Font.PLAIN, 28));
        panel.add(judul);

        //label NIK
        JLabel labelNIK = new JLabel("Masukkan NIK");
        labelNIK.setBounds(20, 50, 260, 30);
        panel.add(labelNIK);

        //Text Field NIK
        JTextField inputNIK = new JTextField();
        inputNIK.setBounds(20, 80, 260, 30);
        inputNIK.setBackground(new Color(201, 228, 197));
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
        inputNama.setBackground(new Color(201, 228, 197));
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
        inputTempatLahir.setBackground(new Color(201, 228, 197));
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
        male.setBackground(new Color(250, 235, 224));
        female.setBackground(new Color(250, 235, 224));
        male.setBounds(350, 200, 100, 30);
        female.setBounds(480, 200, 100, 30);
        ButtonGroup jenisKelamin = new ButtonGroup();
        jenisKelamin.add(male);
        jenisKelamin.add(female);
        panel.add(male);
        panel.add(female);

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

        goldarA.setBackground(new Color(250, 235, 224));
        goldarB.setBackground(new Color(250, 235, 224));
        goldarO.setBackground(new Color(250, 235, 224));
        goldarAB.setBackground(new Color(250, 235, 224));

        goldarA.setBounds(350, 240, 50, 30);
        goldarB.setBounds(400, 240, 50, 30);
        goldarO.setBounds(450, 240, 50, 30);
        goldarAB.setBounds(500, 240, 50, 30);
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
        inputAlamat.setBackground(new Color(201, 228, 197));
        inputAlamat.setBorder(BorderFactory.createEmptyBorder());
        panel.add(inputAlamat);

        //Label RT
        JLabel labelRT = new JLabel("RT");
        labelRT.setBounds(20, 370, 100, 30);
        panel.add(labelRT);
        //
        JTextField inputRT = new JTextField();
        inputRT.setBounds(20, 400, 100, 30);
        inputRT.setBackground(new Color(201, 228, 197));
        inputRT.setBorder(BorderFactory.createEmptyBorder());
        panel.add(inputRT);

        //Label RT
        JLabel labelRW = new JLabel("RW");
        labelRW.setBounds(140, 370, 260, 30);
        panel.add(labelRW);

        JTextField inputRW = new JTextField();
        inputRW.setBounds(140, 400, 100, 30);
        inputRW.setBackground(new Color(201, 228, 197));
        inputRW.setBorder(BorderFactory.createEmptyBorder());
        panel.add(inputRW);

        JLabel labelDesa = new JLabel("Kel/Desa");
        labelDesa.setBounds(250, 370, 260, 30);
        panel.add(labelDesa);

        JTextField inputDesa = new JTextField();
        inputDesa.setBounds(250, 400, 100, 30);
        inputDesa.setBackground(new Color(201, 228, 197));
        inputDesa.setBorder(BorderFactory.createEmptyBorder());
        panel.add(inputDesa);

        JLabel labelKecamatan = new JLabel("Kecamatan");
        labelKecamatan.setBounds(380, 370, 260, 30);
        panel.add(labelKecamatan);

        JTextField inputKecamatan = new JTextField();
        inputKecamatan.setBounds(380, 400, 100, 30);
        inputKecamatan.setBackground(new Color(201, 228, 197));
        inputKecamatan.setBorder(BorderFactory.createEmptyBorder());
        panel.add(inputKecamatan);

        //Label agama
        JLabel labelAgama = new JLabel("Agama");
        labelAgama.setBounds(20, 440, 260, 30);
        panel.add(labelAgama);

        //combobox agama
        String[] agama = {"Buddha", "Hindu", "Islam", "Katolik", "Kristen", "Konghucu"};
        JComboBox comboboxAgama = new JComboBox(agama);
        comboboxAgama.setBounds(100, 440, 150, 30);
        comboboxAgama.setBackground(new Color(250, 235, 224));
        panel.add(comboboxAgama);

        //Label Pekerjaan
        JLabel labelPekerjaan = new JLabel("Pekerjaan");
        labelPekerjaan.setBounds(20, 470, 260, 30);
        panel.add(labelPekerjaan);

        //Checkbox  pekerjaan 
        JCheckBox swasta = new JCheckBox("Karyawan Swasta");
        swasta.setBounds(20, 430, 150, 30);
        swasta.setBackground(new Color(250, 235, 224));
        JCheckBox PNS = new JCheckBox("PNS");
        PNS.setBounds(20, 500, 150, 30);
        PNS.setBackground(new Color(250, 235, 224));
        JCheckBox wiraswasta = new JCheckBox("Wiraswasta");
        wiraswasta.setBounds(20, 530, 150, 30);
        wiraswasta.setBackground(new Color(250, 235, 224));
        JCheckBox akademisi = new JCheckBox("Akademisi");
        akademisi.setBounds(20, 560, 150, 30);
        akademisi.setBackground(new Color(250, 235, 224));
        JCheckBox pengangguran = new JCheckBox("Pengangguran");
        pengangguran.setBounds(20, 590, 150, 30);
        pengangguran.setBackground(new Color(250, 235, 224));
        pengangguran.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pengangguran.isSelected()) {
                    swasta.setEnabled(false);
                    swasta.setSelected(false);
                    wiraswasta.setEnabled(false);
                    wiraswasta.setSelected(false);
                    akademisi.setEnabled(false);
                    akademisi.setSelected(false);
                    PNS.setEnabled(false);
                    PNS.setSelected(false);
                } else {
                    swasta.setEnabled(true);
                    wiraswasta.setEnabled(true);
                    akademisi.setEnabled(true);
                    PNS.setEnabled(true);
                }
            }
        });

        panel.add(PNS);
        panel.add(wiraswasta);
        panel.add(akademisi);
        panel.add(pengangguran);

        //Label Kewarganegaraan
        JLabel labelKewarganegaraan = new JLabel("Kewarganegaraan");
        labelKewarganegaraan.setBounds(310, 440, 260, 30);

        panel.add(labelKewarganegaraan);

        //Label Add Kewarganegaraan
        JLabel labelInputKewarganegaraan = new JLabel("Input Kewarganegaraan");
        labelInputKewarganegaraan.setBounds(465, 440, 260, 30);
        labelInputKewarganegaraan.setVisible(false);
        panel.add(labelInputKewarganegaraan);

        //Text field input kewarganegaraan
        JTextField negara = new JTextField();
        negara.setBounds(465, 470, 200, 30);
        negara.setBackground(new Color(201, 228, 197));
        negara.setBorder(BorderFactory.createEmptyBorder());
        negara.setVisible(false);
        panel.add(negara);

        //Radio Button Kewarganegaraan
        JRadioButton wna = new JRadioButton("WNA");
        JRadioButton wni = new JRadioButton("WNI");
        wna.setBackground(new Color(250, 235, 224));
        wni.setBackground(new Color(250, 235, 224));
        wni.setBounds(310, 470, 70, 30);
        wni.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (wni.isSelected()) {
                    negara.setVisible(false);
                    labelInputKewarganegaraan.setVisible(false);
                }
            }

        });
        wna.setBounds(380, 470, 70, 30);
        wna.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (wna.isSelected()) {
                    negara.setVisible(true);
                    labelInputKewarganegaraan.setVisible(true);
                }
            }
        });
        ButtonGroup kewarganegaraan = new ButtonGroup();
        kewarganegaraan.add(wni);
        kewarganegaraan.add(wna);
        panel.add(wni);
        panel.add(wna);

        //FOTO KTP AREA
        JLabel fotoKTP = new JLabel("Input Foto KTP");
        fotoKTP.setBounds(250, 500, 150, 30);
        fotoKTP.setBackground(new Color(250, 235, 224));
        panel.add(fotoKTP);
        //File chooser untuk ktp
        JMenuItem inputFoto = new JMenuItem("choose");
        inputFoto.setBounds(250, 530, 70, 30);
        inputFoto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == inputFoto) {
                    JFileChooser choose = new JFileChooser();
                    int approve = choose.showOpenDialog(null);
                    if (approve == JFileChooser.APPROVE_OPTION) {
                        File f = choose.getSelectedFile();
                        labelPathFotoKTP.setText(f.getPath());
                    }
                }
            }
        });
        panel.add(inputFoto);

        //FOTO KTP AREA
        JLabel fotoTTD = new JLabel("Input Foto TTD");
        fotoTTD.setBounds(250, 560, 150, 30);
        fotoTTD.setBackground(new Color(250, 235, 224));
        panel.add(fotoTTD);
        //File chooser untuk ktp
        JMenuItem inputTTD = new JMenuItem("choose");
        inputTTD.setBounds(250, 590, 70, 30);
        inputTTD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == inputTTD) {
                    JFileChooser choose = new JFileChooser();
                    int approve = choose.showOpenDialog(null);
                    if (approve == JFileChooser.APPROVE_OPTION) {
                        File f = choose.getSelectedFile();
                        labelPathFotoTTD.setText(f.getPath());
                    }
                }
            }
        });
        panel.add(inputTTD);

        //Kota
        JLabel kotaPembuatan = new JLabel("Kota Pembuatan");
        kotaPembuatan.setBounds(400, 500, 200, 30);
        kotaPembuatan.setBackground(new Color(250, 235, 224));
        panel.add(kotaPembuatan);

        JTextField inputKotaPembuatan = new JTextField();
        inputKotaPembuatan.setBounds(400, 530, 200, 30);
        inputKotaPembuatan.setBackground(new Color(201, 228, 197));
        inputKotaPembuatan.setBorder(BorderFactory.createEmptyBorder());
        panel.add(inputKotaPembuatan);

        //Kota
        JLabel tanggalPembuatan = new JLabel("Tanggal Pembuatan");
        tanggalPembuatan.setBounds(400, 570, 200, 30);
        tanggalPembuatan.setBackground(new Color(250, 235, 224));
        panel.add(tanggalPembuatan);

        //tanggal pembuatan
        UtilDateModel model2 = new UtilDateModel();
        Properties p2 = new Properties();
        p2.put("text.today", "Today");
        p2.put("text.month", "Month");
        p2.put("text.year", "Year");
        JDatePanelImpl datePanel2 = new JDatePanelImpl(model2, p2);
        JDatePickerImpl datePicker2 = new JDatePickerImpl(datePanel2, new DateComponentFormatter());
        datePicker2.setBounds(400, 600, 260, 30);
        datePicker2.setBackground(new Color(201, 228, 197));
        panel.add(datePicker2);

        //Label agama
        JLabel labelStatus = new JLabel("Status");
        labelStatus.setBounds(10, 630, 150, 30);
        panel.add(labelStatus);

        //combobox agama
        String[] status = {"Belum Menikah", "Menikah", "Janda", "Duda"};
        JComboBox comboboxStatus = new JComboBox(status);
        comboboxStatus.setBounds(10, 660, 150, 30);
        comboboxStatus.setBackground(new Color(250, 235, 224));
        panel.add(comboboxStatus);

        JButton submit = new JButton("Submit");
        submit.setBounds(200, 630, 150, 30);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = "", nik = "", tempatLahir = "", tanggalLahir = "", jKelamin = "", goldar = "", alamat = "", rtrw = "", keldesa = "", kecamatan = "", agama = "",
                        statusPerkawinan = "", pekerjaan = "", kewarganegaraan = "", foto = "", tandatangan = "", kotaPembuatan = "", tanggalPembuatan = "";
                int counter = 0;
                int validationCount = 0;
                //validasi NIK
                validationCount += 1;
                if (!inputNIK.getText().equals("")) {
                    nik = inputNIK.getText();
                    counter += 1;
                }
                //Validasi Nama
                validationCount += 1;
                if (!inputNama.getText().equals("")) {
                    nama = inputNama.getText();
                    System.out.println(nama);
                    counter += 1;
                }


                //Validasi Tempat Lahir
                validationCount += 1;
                if (!inputTempatLahir.getText().equals("")) {
                    tempatLahir = inputTempatLahir.getText();
                    counter += 1;
                }

                //Validasi Tanggal Lahir
                validationCount += 1;
                if (datePicker.getModel().getValue() != null) {
                    tanggalLahir = generateTanggal(datePicker);
                    System.out.println("Tanggal Lahir: " + tanggalLahir);
                    counter += 1;
                }
                //Validasi Jenis Kelamin
                validationCount += 1;
                if (male.isSelected()) {
                    counter += 1;
                    jKelamin = "Laki-laki";
                } else if (female.isSelected()) {
                    counter += 1;
                    jKelamin = "Perempuan";
                }
                //Golongan Darah
                validationCount += 1;
                if (goldarA.isSelected()) {
                    goldar = "A";
                    counter += 1;
                } else if (goldarAB.isSelected()) {
                    goldar = "AB";
                    counter += 1;
                } else if (goldarB.isSelected()) {
                    goldar = "B";
                    counter += 1;
                } else if (goldarO.isSelected()) {
                    goldar = "O";
                    counter += 1;
                }

                //Validasi Alamat
                validationCount += 1;
                if (!inputAlamat.getText().equals("")) {
                    alamat = inputAlamat.getText();
                    counter += 1;
                }

                //Validasi RT RW
                validationCount += 1;
                if (!inputRT.getText().equals("") && !inputRW.getText().equals("")) {
                    rtrw += inputRT.getText() + "/" + inputRW.getText();
                    System.out.println(rtrw);
                    counter += 1;
                }

                //Validasi Desa
                validationCount += 1;
                if (!inputDesa.getText().equals("")) {
                    keldesa = inputDesa.getText();
                    counter += 1;
                }

                //Validasi Kecamatan
                validationCount += 1;
                if (!inputKecamatan.getText().equals("")) {
                    kecamatan = inputKecamatan.getText();
                    counter += 1;
                }

                //Validasi Agama
                validationCount += 1;
                if (!comboboxAgama.getSelectedItem().toString().equals("")) {
                    agama = comboboxAgama.getSelectedItem().toString();
                    counter += 1;
                }

                //Validasi Status Perkawinan
                validationCount += 1;
                if (!comboboxStatus.getSelectedItem().toString().equals("")) {
                    statusPerkawinan = comboboxStatus.getSelectedItem().toString();
                    counter += 1;
                }

                //Validasi Pekerjaan
                validationCount += 1;
                if (swasta.isSelected() || PNS.isSelected() || wiraswasta.isSelected() || akademisi.isSelected()) {
                    ArrayList<String> listPekerjaan = new ArrayList<>();
                    if (swasta.isSelected()) {
                        listPekerjaan.add("Pegawai Swasta");

                    }
                    if (PNS.isSelected()) {
                        listPekerjaan.add("PNS");
                    }
                    if (wiraswasta.isSelected()) {
                        listPekerjaan.add("Wiraswasta");
                    }
                    if (akademisi.isSelected()) {
                        listPekerjaan.add("Akademisi");
                    }
                    pekerjaan = generateStringPekerjaan(listPekerjaan);

                    counter += 1;

                } else if (pengangguran.isSelected()) {
                    pekerjaan = "Pengangguran";
                    counter += 1;
                }

                //Validasi KewargaNegaraan
                validationCount += 1;
                if (wni.isSelected()) {
                    kewarganegaraan = "WNI";
                    counter += 1;
                } else if (wna.isSelected()) {
                    if (!negara.getText().equals("")) {
                        kewarganegaraan = "WNA(" + negara.getText() + ")";
                        counter += 1;
                    }
                }

                //Validasi Foto
                validationCount += 1;
                if (!labelPathFotoKTP.getText().equals("")) {
                    foto = labelPathFotoKTP.getText();
                    System.out.println("Foto KTP: " + foto);
                    counter += 1;
                }

                //Validsadi Foto tanda tangan
                validationCount += 1;
                if (!labelPathFotoTTD.getText().equals("")) {
                    tandatangan = labelPathFotoTTD.getText();
                    counter += 1;
                }

                //Validasi Kota Pembuatan
                validationCount += 1;
                if (!inputKotaPembuatan.getText().equals("")) {
                    kotaPembuatan = inputKotaPembuatan.getText();
                    counter += 1;
                }

                //Validasi tanggal Pembuatan
                validationCount += 1;
                if (datePicker2.getModel().getValue() != null) {
                    tanggalPembuatan = generateTanggal(datePicker2);
                    System.out.println("Tanggal dibuat: " + tanggalPembuatan);
                    counter += 1;
                }

                if (counter >= validationCount) {
                    Penduduk penduduk1 = new Penduduk(nik, nama, tempatLahir, tanggalLahir, jKelamin, goldar, alamat, rtrw, keldesa, kecamatan, agama, statusPerkawinan, pekerjaan, kewarganegaraan, foto, tandatangan, kotaPembuatan, tanggalPembuatan);

                    new KTPScreen(penduduk1);

                } else {
                    JOptionPane.showMessageDialog(null, "Harap isi semua data");
                }
            }

            private String generateStringPekerjaan(ArrayList<String> listPekerjaan) {
                System.out.println(listPekerjaan.size());
                if (listPekerjaan.size() == 1) {
                    return listPekerjaan.get(0);
                } else {
                    String stringPekerjaan = "";
                    for (int i = 0; i < listPekerjaan.size(); i++) {
                        stringPekerjaan += listPekerjaan.get(i).toString() + ", ";
                    }
                    return stringPekerjaan;
                }

            }

            private String generateTanggal(JDatePickerImpl datePicker) {
                int date = datePicker.getModel().getDay();
                int month = datePicker.getModel().getMonth() + 1;
                int year = datePicker.getModel().getYear();
                return date + "-" + month + "-" + year;
            }
        });
        panel.add(submit);

        jf.add(panel);
        jf.setSize(1370, 2000);
//        jf.setExtendedState(4000);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setResizable(true);

    }
}
