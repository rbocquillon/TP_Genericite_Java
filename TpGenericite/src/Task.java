
public class Task implements Comparable<Task> {

	protected int priority;
	protected String description;
	
	public Task(int priority, String description) {
		super();
		this.priority=priority;
		this.description=description;
	}
	
	@Override
	public int compareTo(Task t) {
		return new Integer(priority).compareTo(t.getPriority());
	}

	protected Integer getPriority() {
		return priority;
	}
	
	public String getDescription() {
		return description;
	}
	
	@Override
	public String toString() {
		return description + ":" + priority;
	}
	
}
