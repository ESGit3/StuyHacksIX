import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.event.*;


public class Main {
    static GraphicsConfiguration gc;
    static JTextField name, duration;
    static JButton dayOptions, blacklist, blocks, submit;
    static JCheckBox btnMon, btnTues, btnWed, btnThurs, btnFri, btnSat, btnSun;

    public static void main(String[] args) {
        JFrame frame = new JFrame("StuyHacksIX project");
        name = new JTextField("name", 10);
        duration = new JTextField("duration", 10);
//        dayOptions = new JButton("Preferred days");
//        btnMon = new JCheckBox("Monday");
//        btnTues = new JCheckBox("Tuesday");
//        btnWed = new JCheckBox("Wednesday");
//        btnThurs = new JCheckBox("Thursday");
//        btnFri = new JCheckBox("Friday");
//        btnSat = new JCheckBox("Saturday");
//        btnSun = new JCheckBox("Sunday");
        blacklist = new JButton("Blacklist");
        blocks = new JButton("Blocks");
        submit = new JButton("Submit");



        name.setBounds(800, 50, 130, 30);
        duration.setBounds(800, 85, 130, 30);
        submit.setBounds(800, 120, 130, 50);
//        btnMon.setBounds(100, 250, 100, 50);
//        btnTues.setBounds(200, 250, 100, 50);
//        btnWed.setBounds(300, 250, 100, 50);
//        btnThurs.setBounds(400, 250, 100, 50);
//        btnFri.setBounds(150, 300, 100, 50);
//        btnSat.setBounds(250, 300, 100, 50);
//        btnSun.setBounds(350, 300, 100, 50);
//        dayOptions.setBounds(600, 300, 100, 50);
        blacklist.setBounds(20, 20, 100, 50);
        blocks.setBounds(20, 75, 100, 50);

        frame.add(name);
        frame.add(duration);
        frame.add(submit);
//        frame.add(dayOptions);
//        dayOptions.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent args) {
//                frame.add(btnMon);
//                frame.add(btnTues);
//                frame.add(btnWed);
//                frame.add(btnThurs);
//                frame.add(btnFri);
//                frame.add(btnSat);
//                frame.add(btnSun);
//                frame.repaint();
//            }
//        });
        frame.add(blacklist);
        frame.add(blocks);

        blacklist.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent args) {
                Blacklist.openWindow();
            }
        });

        blocks.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent args) {
                Blocks.openWindow();
            }
        });

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}