package org.seq.tasks;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;

import org.seq.tasks.Task.*;
import org.seq.tasks.Task.RepeatableTask.*;

public class TaskManager {
	
	static ArrayList<Task> tasks = new ArrayList<Task>();
	static Duration breakLength = Duration.ofMinutes(20);
	
	public static void main(String[] args) {
		WeekdayTask wt = new WeekdayTask(LocalDateTime.now(), LocalDateTime.now().plusHours(1), 0b0111110);
		System.out.println(wt.startFrom());
		System.out.println(wt.endBy());
		RepeatableTask next = wt.next();
		System.out.println(next.startFrom());
		System.out.println(next.endBy());
	}
	

}
