package org.howard.edu.lspfinal.question2;

import java.util.*;

/**
 * Manages a collection of tasks and supports operations
 * like adding, retrieving, updating, and printing grouped tasks.
 */
public class TaskManager {
    private Map<String, Task> tasks = new HashMap<>();

    /**
     * Adds a task to the manager if it doesn't already exist.
     * 
     * @param name the name of the task (must be unique)
     * @param priority the priority of the task
     * @param status the initial status of the task
     * @throws DuplicateTaskException if a task with the same name already exists
     */
    public void addTask(String name, int priority, String status) throws DuplicateTaskException {
        if (tasks.containsKey(name)) {
            throw new DuplicateTaskException("Task '" + name + "' already exists.");
        }
        tasks.put(name, new Task(name, priority, status));
    }

    /**
     * Retrieves a task by its name.
     * 
     * @param name the name of the task to retrieve
     * @return the Task object
     * @throws TaskNotFoundException if the task does not exist
     */
    public Task getTaskByName(String name) throws TaskNotFoundException {
        Task task = tasks.get(name);
        if (task == null) {
            throw new TaskNotFoundException("Task '" + name + "' not found.");
        }
        return task;
    }

    /**
     * Updates the status of a given task.
     * 
     * @param name the name of the task
     * @param newStatus the new status to apply
     * @throws TaskNotFoundException if the task does not exist
     */
    public void updateStatus(String name, String newStatus) throws TaskNotFoundException {
        Task task = getTaskByName(name);
        task.setStatus(newStatus);
    }

    /**
     * Prints all tasks grouped by their current status.
     */
    public void printTasksGroupedByStatus() {
        Map<String, List<Task>> grouped = new LinkedHashMap<>();
        grouped.put("TODO", new ArrayList<>());
        grouped.put("IN_PROGRESS", new ArrayList<>());
        grouped.put("DONE", new ArrayList<>());

        for (Task task : tasks.values()) {
            grouped.get(task.getStatus()).add(task);
        }

        System.out.println("Tasks grouped by status:");
        for (String status : grouped.keySet()) {
            System.out.println(status + ":");
            for (Task task : grouped.get(status)) {
                System.out.println("  " + task);
            }
        }
    }
}
