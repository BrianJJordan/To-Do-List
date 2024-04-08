package Todolist;

public class Main {

	public static void main(String[] args) {
		HoneyDoList Brian = new HoneyDoList();
		
		Brian.addTask(new Task("Walk the dog", 10, 30));
		Brian.addTask(new Task("Do the dishes", 3, 8));
		Brian.addTask(new Task("Go to the gym", 7, 120));
		Brian.addTask(new Task("Do calc java homework", 5, 240));
		
		// prints all tasks
		System.out.println(Brian);
		System.out.println("\n\n");
		
		// prints total time of all tasks
		System.out.println("Total time:\n");
		System.out.println(Brian.totalTime() + " minutes to complete all tasks");
		System.out.println("\n\n");
		
		// prints task that takes the least amount of time
		System.out.println("Task with the shortest time: \n");
		System.out.println(Brian.getTask(Brian.shortestTime()));
		System.out.println("\n\n");

		// prints tasks left after completing task 3
		System.out.println("This tests to see if my completeTask function works for the 3rd task:\n");
		Task completedTask = Brian.completeTask(2);
		System.out.println(Brian);
		System.out.println("\n\n");

		// prints the first task
		System.out.println("Task 1:\n");
		System.out.println(Brian.getTask(0));
		System.out.println("\n\n");


	}

}
