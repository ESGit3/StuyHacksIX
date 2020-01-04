import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.io.File;

public class Blacklist {
    static GraphicsConfiguration gc;
    static JButton chooseFile;
    static JLabel path;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Blacklist");
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String chosenPath = selectedFile.getAbsolutePath();
        }

        chooseFile = new JButton("Choose File...");
        path = new JLabel(chosenPath);

        chooseFile.setBounds(10, 10, 100, 30);
        path.setBounds(300, 10, 100, 30);

        frame.add(chooseFile);
        frame.add(path);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}