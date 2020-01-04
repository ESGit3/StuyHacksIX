package org.seq.tasks;

import java.time.LocalDateTime;

import org.seq.tasks.Task.*;
import org.seq.tasks.Task.RepeatableTask.*;

public class TaskManager {

	public static void main(String[] args) {
		WeekdayTask wt = new WeekdayTask(LocalDateTime.now(), LocalDateTime.now().plusHours(1), 0b1111111);
		
	}

}
