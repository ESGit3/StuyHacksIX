package org.seq.tasks;

import java.time.*;

public class TimePeriod {
	
	public LocalDateTime start;
	public LocalDateTime end;
	
	public TimePeriod(LocalDateTime start, LocalDateTime end) {
		this.start = start;
		this.end = end;
	}
	
	public Duration getDuration() {
		return Duration.between(start, end);
	}
	
	@Override
	public int hashCode() {
		return start.hashCode() + end.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		return false;
	}
	
}
