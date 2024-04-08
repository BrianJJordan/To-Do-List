package Todolist;

public class HoneyDoList {
	private Task[] tasks;
	private int numTasks;
	private int initial_capacity = 10;
	
	//constructor method
	public HoneyDoList() {
		this.tasks = new Task[initial_capacity];
		this.numTasks = 0;
	}
	
	public void setInitial_capacity(int initial_capacity) {
		this.initial_capacity = initial_capacity;
	}

	public int find(String name) {
		for (int i=0; numTasks>0; i++) {
			if(tasks[i].getName().equalsIgnoreCase(name)) {
				return i;
			}
		}
		return -1;
	}
	
	public void addTask(Task addedTask) { // (Task addedTask is how a new task would be added and referred to) 
		if (numTasks == tasks.length) {
			int newArrayLength = tasks.length *2;
			Task[] newArray = new Task[newArrayLength];
			System.arraycopy(tasks, 0, newArray, 0, numTasks); // this copies whats in tasks into newArray
			tasks = newArray; // sets tasks location to the same location of newArray
		}
		tasks[numTasks] = addedTask;
		numTasks++; // since a task was added, we add 1 to numTasks
	}
	
	public int totalTime() {
		int time = 0;
		for (int i=0; i<numTasks; i++) {
			time += tasks[i].getEstMinsToComplete();
		}
		return time;
	}
	
	public int shortestTime() {
		if(numTasks == 0) {
			return -1;
		}
		
		int minTimeIndex =0;
		int currentTime = tasks[0].getEstMinsToComplete();
		
		for (int i =0; i<numTasks; i++) {
			if(tasks[i].getEstMinsToComplete() < currentTime) {
				currentTime = tasks[i].getEstMinsToComplete();
				minTimeIndex = i;
			}
		}
		
		return minTimeIndex;
		
	}
	
	//returns a whole task, the method name is completeTask
	public Task completeTask(int index) {
		if (tasks[index] == null || index >= numTasks || index < 0) {
			return null;
		}

		//the 4 lines below i got from chat GPT because i was very lost...
		Task completedTask = tasks[index];
        System.arraycopy(tasks, index + 1, tasks, index, numTasks - index - 1);
        tasks[--numTasks] = null;
        return completedTask;
	
	}
	
	public Task getTask(int index) {
		if (index < 0 || index >= numTasks) {
			return null;
		}
		return tasks[index];
	}

	//toString method
	@Override // not really sure how the override works
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<numTasks; i++) {
			sb.append(tasks[i]).append("\n");
		}
		return sb.toString();
	}
}
