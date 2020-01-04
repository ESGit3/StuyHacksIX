package org.seq.tasks;

import java.awt.*;
import java.awt.event.*;

public class FocusManager {

	public static void main(String[] args) throws AWTException, InterruptedException {
		Robot robot = new Robot();
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_ALT);
	}

}
