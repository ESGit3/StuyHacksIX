package org.seq.tasks;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.ManagementFactory;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinDef.RECT;

public class FocusManager {

	private static String OS = System.getProperty("os.name").toLowerCase();
	private static boolean isWindows() {
		return (OS.contains("win"));
	}
	private static boolean isMac() {
		return (OS.contains("mac"));
	}

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		//if currentWindow = something on the blacklist, alt f4
//		HWND hwnd = User32.INSTANCE.GetActiveWindow();
		if (isWindows()) {
            System.out.println("win");
		}
		if(isMac()) {
			ProcessBuilder processBuilder = new ProcessBuilder();
			processBuilder.command("bash", "-c", "pgrep Spotify | head -1");
			var pidFromName = processBuilder.start();
//			pidFromName = pidFromName.replace("Process[pid=", "");
//			pidFromName = pidFromName.replace(pidFromName.substring(pidFromName.lastIndexOf(",")), "");
			try (var reader = new BufferedReader(
					new InputStreamReader(pidFromName.getInputStream()))) {

				String line;

				while ((line = reader.readLine()) != null) {
					line = "kill " + line;
					System.out.println(line);
					Runtime.getRuntime().exec(line);
				}
			}
			System.out.println("mac");
		}
//		Robot robot = new Robot();
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_ALT);
//		robot.keyPress(KeyEvent.VK_F4);
//		robot.keyRelease(KeyEvent.VK_F4);
//		robot.keyRelease(KeyEvent.VK_ALT);
	}

}
