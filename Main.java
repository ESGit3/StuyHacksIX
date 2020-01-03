import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;


public class Main {
    static GraphicsConfiguration gc;
    public static void main(String[] args) {
        JFrame frame = new JFrame(gc);
        frame.setVisible(true);
    }
}