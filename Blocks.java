import javax.swing.*;
import java.io.File;
import java.awt.*;
import java.awt.event.*;


public class Blocks {
    static GraphicsConfiguration gc;
    static JTextField name, duration;
    static JCheckBox btnMon, btnTues, btnWed, btnThurs, btnFri, btnSat, btnSun, weekly, monthly, yearly;
    static JButton selectAll, Submit;
    static JFrame frame = new JFrame("Blocks");

    public static void openWindow() {
        frame.setVisible(true);
    }

    static {

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
        weekly = new JCheckBox("Weekly");
        monthly = new JCheckBox("Monthly");
        yearly = new JCheckBox("Yearly");

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
        btnMon.setBounds(100, 150, 100, 50);
        btnTues.setBounds(200, 150, 100, 50);
        btnWed.setBounds(300, 150, 100, 50);
        btnThurs.setBounds(400, 150, 100, 50);
        btnFri.setBounds(150, 200, 100, 50);
        btnSat.setBounds(250, 200, 100, 50);
        btnSun.setBounds(350, 200, 100, 50);
        selectAll.setBounds(100, 275, 100, 50);
        weekly.setBounds(150, 375, 100, 50);
        monthly.setBounds(250, 375, 100, 50);
        yearly.setBounds(350, 375, 100, 50);
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
        frame.add(weekly);
        frame.add(monthly);
        frame.add(yearly);

        frame.setLayout(null);
        frame.setSize(600, 600);
    }
}