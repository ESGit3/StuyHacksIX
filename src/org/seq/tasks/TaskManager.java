package org.seq.tasks;

import java.awt.*;
import java.awt.event.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;

import org.seq.tasks.Task.*;
import org.seq.tasks.Task.RepeatableTask.*;

import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef.HWND;

public class TaskManager {
	
	static ArrayList<Task> tasks = new ArrayList<Task>();
	static Duration breakLength = Duration.ofMinutes(20);
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
	}
	

}
