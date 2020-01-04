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
        duration.setBounds(110, 50, 130, 30);
        btnMon.setBounds(10, 10, 100, 100);
        btnTues.setBounds(10, 10, 100, 100);
        btnWed.setBounds(10, 10, 100, 100);
        btnThurs.setBounds(10, 10, 100, 100);
        btnFri.setBounds(10, 10, 100, 100);
        btnSat.setBounds(10, 10, 100, 100);
        btnSun.setBounds(10, 10, 100, 100);

        frame.add(name);
        frame.add(duration);
//        frame.getContentPane().add(btnMon);
//        frame.getContentPane().add(btnTues);
//        frame.getContentPane().add(btnWed);
//        frame.getContentPane().add(btnThurs);
//        frame.getContentPane().add(btnFri);
//        frame.getContentPane().add(btnSat);
//        frame.getContentPane().add(btnSun);


        frame.setVisible(true);
        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}