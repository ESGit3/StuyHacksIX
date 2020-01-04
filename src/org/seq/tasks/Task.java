package org.seq.tasks;
import java.time.*;

public interface Task {
	
	public Duration timeToComplete = Duration.ofHours(1);
	
	public String name = "Untitled Task";
	
	public LocalDateTime startFrom();
	
	public LocalDateTime endBy();
	
	public static interface RepeatableTask extends Task {
		
		public RepeatableTask next();
		
		public static class DailyTask implements RepeatableTask {
			
			LocalDateTime start;
			LocalDateTime end;
			
			public DailyTask(LocalDateTime start, LocalDateTime end) {
				this.start = start;
				this.end = end;
			}
			
			@Override
			public LocalDateTime startFrom() {
				return start;
			}

			@Override
			public LocalDateTime endBy() {
				return end;
			}

			@Override
			public RepeatableTask next() {
				return new DailyTask(start.plusDays(1), end.plusDays(1));
			}
			
		}
		public static class WeekdayTask extends DailyTask {
			
			int flags;
			
			public WeekdayTask(LocalDateTime start, LocalDateTime end, int flags) {
				super(start, end);
				this.flags = flags;
			}

			@Override
			public RepeatableTask next() {
				int weekday = start.getDayOfWeek().getValue()%7;
				int f = (flags | (flags << 7)) >> (weekday+1);
				int i = 1;
				while ((f & 1) != 1) {
					f >>= 1;
					i++;
				}
				return new WeekdayTask(start.plusDays(i), end.plusDays(i), flags);
			}
			
		}
	}
	
}
