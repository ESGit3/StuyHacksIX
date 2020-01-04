import java.time.Duration;

public interface Task {
	
	public boolean done(); // returns true if the task is complete, never to be used again, will be destroyed
	
	public boolean doneForToday(); // returns true if the task is done for today
	
	public Duration totalTimeLeft();
	
	

}
