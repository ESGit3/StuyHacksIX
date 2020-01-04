import javax.swing.*;
import java.io.File;
import java.awt.*;
import java.awt.event.*;


public class Blocks {
    static GraphicsConfiguration gc;
    static JTextField name, duration;
    static JCheckBox btnMon, btnTues, btnWed, btnThurs, btnFri, btnSat, btnSun;
    static JButton selectAll, Submit;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Blocks");

        name = new JTextField("name", 10);
        duration = new JTextField("duration", 10);
        btnMon = new JCheckBox("Monday");
        btnTues = new JCheckBox("Tuesday");
        btnWed = new JCheckBox("Wednesday");
        btnThurs = new JCheckBox("Thursday");
        btnFri = new JCheckBox("Friday");
        btnSat = new JCheckBox("Saturday");
        btnSun = new JCheckBox("Sunday");
        selectAll = new JButton("Select All");
        Submit = new JButton("Submit");

        selectAll.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent args) {
                btnMon.setSelected(true);
                btnTues.setSelected(true);
                btnWed.setSelected(true);
                btnThurs.setSelected(true);
                btnFri.setSelected(true);
                btnSat.setSelected(true);
                btnSun.setSelected(true);
            }
        });

        name.setBounds(110, 50, 130, 30);
        duration.setBounds(300, 50, 130, 30);
        btnMon.setBounds(100, 250, 100, 50);
        btnTues.setBounds(200, 250, 100, 50);
        btnWed.setBounds(300, 250, 100, 50);
        btnThurs.setBounds(400, 250, 100, 50);
        btnFri.setBounds(150, 300, 100, 50);
        btnSat.setBounds(250, 300, 100, 50);
        btnSun.setBounds(350, 300, 100, 50);
        selectAll.setBounds(100, 375, 100, 50);
        Submit.setBounds(100, 450, 400, 50);

        frame.add(name);
        frame.add(duration);
        frame.add(btnMon);
        frame.add(btnTues);
        frame.add(btnWed);
        frame.add(btnThurs);
        frame.add(btnFri);
        frame.add(btnSat);
        frame.add(btnSun);
        frame.add(selectAll);
        frame.add(Submit);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}