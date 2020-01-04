//package com.sun.jna/examples;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;

public class Main {
    static GraphicsConfiguration gc;
    static JTextField name, duration;
    static JButton btnMon, btnTues, btnWed, btnThurs, btnFri, btnSat, btnSun;

    public static void main(String[] args) {
        JFrame frame = new JFrame("StuyHacksIX project");
//        frame.getContentPane().setLayout(new FlowLayout());
        name = new JTextField("name", 10);
        duration = new JTextField("duration", 10);
        btnMon = new JButton("Monday");
        btnTues = new JButton("Tuesday");
        btnWed = new JButton("Wednesday");
        btnThurs = new JButton("Thursday");
        btnFri = new JButton("Friday");
        btnSat = new JButton("Saturday");
        btnSun = new JButton("Sunday");

        name.setBounds(110, 50, 130, 30);
        duration.setBounds(300, 50, 130, 30);
        btnMon.setBounds(100, 250, 100, 50);
        btnTues.setBounds(200, 250, 100, 50);
        btnWed.setBounds(300, 250, 100, 50);
        btnThurs.setBounds(400, 250, 100, 50);
        btnFri.setBounds(150, 300, 100, 50);
        btnSat.setBounds(250, 300, 100, 50);
        btnSun.setBounds(350, 300, 100, 50);

        frame.add(name);
        frame.add(duration);
        frame.getContentPane().add(btnMon);
        frame.getContentPane().add(btnTues);
        frame.getContentPane().add(btnWed);
        frame.getContentPane().add(btnThurs);
        frame.getContentPane().add(btnFri);
        frame.getContentPane().add(btnSat);
        frame.getContentPane().add(btnSun);
        frame.add(btnMon);
        frame.add(btnTues);
        frame.add(btnWed);
        frame.add(btnThurs);
        frame.add(btnFri);
        frame.add(btnSat);
        frame.add(btnSun);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}