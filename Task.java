package Todolist;

public class Task extends Main{
	private String name;
	private int priority;
	private int estMinsToComplete;
	
	//constructor method > used by Task variableName = new Task(...);
	public Task(String name, int priority, int estMinsToComplete) { // constructor
		this.name = name;
		this.priority = priority;
		this.estMinsToComplete = estMinsToComplete;
	}

// For getters and setters - right click > source > generate getters and setters
	public String getName() {
		return name;
	}

	public void setName(String NewName) {
		this.name = NewName;
	}

	public int getPriority() {
		return priority;
	}

	public int getEstMinsToComplete() { 
		return estMinsToComplete;
	}

	public void setEstMinsToComplete(int estMinsToComplete) {
		this.estMinsToComplete = estMinsToComplete;
	}
	
	
	// toString method
	@Override
	public String toString() {
		return this.name + "\npriority of " + this.priority + "\nwill take " + this.estMinsToComplete + " minutes\n" ;
	}

	
	
	public int IncreasePriority(int amount) {
		if (amount > 0) {
			this.priority += amount;
		}		
		return this.priority;
	}
	
	public int DecreasePriority(int amount) {
		if ((this.priority -= amount) < 0) {
			this.priority = 0; 
		}
		return this.priority;
	}

}
