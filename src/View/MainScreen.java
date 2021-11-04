package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen {
    JFrame frame;
    JLabel label;
    JButton buttonPerekaman, buttonPencarian, buttonExit;
    JPanel panelMainScreen;

    public MainScreen() {
        //Button Perekaman
        buttonPerekaman = new JButton("Rekam Data");
        buttonPerekaman.setBounds(150, 20, 300, 50);
        buttonPerekaman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new FormScreen();
            }
        });

        //Button Pencarian
        buttonPencarian = new JButton("Cari Data");
        buttonPencarian.setBounds(150, 90, 300, 50);
        buttonPencarian.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
//                new KTPScreen();
            }
        });

        //Button Exit
        buttonExit = new JButton("Keluar");
        buttonExit.setBounds(150, 160, 300, 50);


        //Panel
        panelMainScreen = new JPanel();
        panelMainScreen.setVisible(true);
        panelMainScreen.setLayout(null);
        panelMainScreen.setSize(600, 600);
        panelMainScreen.add(buttonPerekaman);
        panelMainScreen.add(buttonPencarian);
        panelMainScreen.add(buttonExit);

        //Frame
        frame = new JFrame();
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(panelMainScreen);


    }
}
