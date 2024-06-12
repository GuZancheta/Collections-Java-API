package main.list.basicoperations;

public class MainTask {

    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        System.out.println("The total number of elements in the list is: " + taskList.getTotalNumberOfTasks());

        taskList.addTask("Task 1");
        taskList.addTask("Task 1");
        taskList.addTask("Task 2");

        System.out.println("The total number of elements in the list is: " + taskList.getTotalNumberOfTasks());
        taskList.getTaskDescriptions();

        taskList.removeTask("Task 1");

        System.out.println("The total number of elements in the list is: " + taskList.getTotalNumberOfTasks());
        taskList.getTaskDescriptions();
    }
}
