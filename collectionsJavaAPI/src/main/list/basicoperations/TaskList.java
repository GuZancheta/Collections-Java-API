package main.list.basicoperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskList {

    private List<Task> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        tasks.add(new Task(description));
    }

    public void removeTask(String description) {
        tasks.removeIf(task -> task.getDescription().equalsIgnoreCase(description));
    }

    public int getTotalNumberOfTasks() {
        return tasks.size();
    }

    public void getTaskDescriptions() {
        System.out.println(tasks);
    }
}
