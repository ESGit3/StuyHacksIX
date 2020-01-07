package org.seq.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FocusManager {

	private static String BlacklistApp =  "NetLogo 6.1.1";

	private static String OS = System.getProperty("os.name").toLowerCase();
	private static boolean isWindows() {
		return (OS.contains("win"));
	}
	private static boolean isMac() {
		return (OS.contains("mac"));
	}
	private static boolean isUnix() {
		return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0 );
	}
	public static void main(String[] args) throws IOException {
		ProcessBuilder processBuilder = new ProcessBuilder();
		if (isWindows()) {
			processBuilder.command("cmd.exe", "/C", "pgrep " + BlacklistApp + " | head -1");
			var pidFromName = processBuilder.start();
			try (var reader = new BufferedReader (
					new InputStreamReader(pidFromName.getInputStream()))) {

				String line;

				while ((line = reader.readLine()) != null) {
					line = "taskkill /f /im " + line;
					Runtime.getRuntime().exec(line);
				}
			}
		}

		if (isMac()) {
			processBuilder.command("bash", "-c", "pgrep " + BlacklistApp + " | head -1");
			var pidFromName = processBuilder.start();
			try (var reader = new BufferedReader (
					new InputStreamReader(pidFromName.getInputStream()))) {

				String line;

				while ((line = reader.readLine()) != null) {
					line = "kill " + line;
					Runtime.getRuntime().exec(line);
				}
			}
		}

		if(isUnix()) {
			processBuilder.command("/usr/bin/env bash", "-c", "pgrep "+ BlacklistApp + " | head -1");
			var pidFromName = processBuilder.start();
			try (var reader = new BufferedReader(
					new InputStreamReader(pidFromName.getInputStream()))) {
				String line;
				while ((line = reader.readLine()) != null) {
					line = "kill " + line;
					Runtime.getRuntime().exec(line);
				}
			}
		}
	}
}
