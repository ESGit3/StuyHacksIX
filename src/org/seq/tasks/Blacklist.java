package org.seq.tasks;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Blacklist {
	
	public static class Entry extends JPanel {
		
		public JLabel label;
		public JButton minusButton;
		public int index;
		public File file;
		
		{
			label = new JLabel("null");
			minusButton = new JButton("-");
			minusButton.setSize(25, 25);
			minusButton.setMaximumSize(new Dimension(25, 25));
		}
		
		public void setText(String str) {
			label.setText(str);
		}
		
		public Entry(File f) {
			super();
			file = f;
			index = entries.size();
			this.setLayout(new BorderLayout(5, 5));
			this.add(minusButton, BorderLayout.WEST);
			this.add(label, BorderLayout.CENTER);
			this.setSize(300, 25);
			this.setLocation(0, index*25);
			entries.add(this);
			frame.add(this);
			setText(f.getPath());
			Entry thisEntry = this;
			minusButton.addActionListener(arg0 -> {
				entries.remove(thisEntry);
				frame.remove(thisEntry);
				for (int i = index; i < entries.size(); i++) {
					Entry other = entries.get(i);
					other.index = i;
					other.setLocation(0, i*25);
				}
				updateBlacklisted();
				resizeFrame();
			});
			updateBlacklisted();
			resizeFrame();
		}
		
		
	}
	
	static ArrayList<Entry> entries = new ArrayList<Entry>();
	static JFrame frame;
    static GraphicsConfiguration gc;
    static JFileChooser fileChooser;
    static JButton chooseFile;
    
    public static void resizeFrame() {
    	int h = 25*entries.size();
    	chooseFile.setLocation(0, h);
		frame.setSize(300, h + 25 + 39);
    }
    
    static {
        frame = new JFrame("Blacklist");
        fileChooser = new JFileChooser() {
        	@Override
        	public boolean accept(File f) {
        		if (f.isDirectory()) return true;
        		String[] name = f.getName().split("\\.");
        		return name.length < 2 || name[name.length-1].equals("exe");
        	}
        };
        chooseFile = new JButton("Choose File...");
        
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        frame.add(chooseFile);
        chooseFile.setBounds(0, 100, 300, 25);
        chooseFile.addActionListener(e -> {
			File f;
			if ((f = getChosenFile()) != null)
				new Entry(f);
		});
        resizeFrame();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // TODO delete this
    }
    
    public static File getChosenFile() {
        int result = fileChooser.showOpenDialog(null);
        if (result != JFileChooser.APPROVE_OPTION) return null;
        File selectedFile = fileChooser.getSelectedFile();
        return selectedFile;
    }
    
    public static void openWindow() {
    	frame.setVisible(true);
    }
    
    static File[] blacklisted = updateBlacklisted();
    
    public static File[] updateBlacklisted() {
    	blacklisted = new File[entries.size()];
    	for (int i = 0; i < blacklisted.length; i++) {
    		blacklisted[i] = entries.get(i).file;
    	}
    	return blacklisted;
    }
    
    public static File[] getBlacklisted() {
    	return blacklisted;
    }

    public static void main(String[] args) throws Exception {
        openWindow();
    }
}