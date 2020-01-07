package org.seq.tasks;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FocusManager {

	private static String OS = System.getProperty("os.name").toLowerCase();
	private static boolean isWindows() {
		return (OS.contains("win"));
	}
	private static boolean isMac() {
		return (OS.contains("mac"));
	}

	public static void main(String[] args) throws IOException {
		ProcessBuilder processBuilder = new ProcessBuilder();
		if (isWindows()) {
			processBuilder.command("cmd.exe", "/C", "pgrep Spotify | head -1");
			var pidFromName = processBuilder.start();
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

		if(isMac()) {
			processBuilder.command("bash", "-c", "pgrep Spotify | head -1");
			var pidFromName = processBuilder.start();
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
	}
}
