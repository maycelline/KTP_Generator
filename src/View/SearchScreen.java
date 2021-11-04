package View;

import Controller.Controller;
import Model.Penduduk;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchScreen {
    JFrame frame;
    JLabel label;
    JPanel panelSearchScreen;
    JTextField inputNIK;
    JButton buttonSearch;

    public SearchScreen(){
        label = new JLabel("Masukkan NIK");
        label.setBounds(20,20,250,30);

        inputNIK = new JTextField();
        inputNIK.setBounds(20, 70, 250,35);

        buttonSearch = new JButton("Cari Data");
        buttonSearch.setBounds(60, 110,100,35);
        buttonSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Controller controller = new Controller();
                Penduduk penduduk = controller.getPenduduk(inputNIK.getText());
                new KTPScreen(penduduk);
            }
        });

        //Panel Search
        panelSearchScreen = new JPanel();
        panelSearchScreen.setVisible(true);
        panelSearchScreen.setSize(600,600);
        panelSearchScreen.setLayout(null);
        panelSearchScreen.add(label);
        panelSearchScreen.add(inputNIK);
        panelSearchScreen.add(buttonSearch);



        //Frame
        frame = new JFrame();
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(panelSearchScreen);

    }
}
