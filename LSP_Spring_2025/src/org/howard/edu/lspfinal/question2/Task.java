package org.howard.edu.lspfinal.question2;

/**
 * Represents a Task with a name, priority level, and status.
 */
public class Task {
    private String name;
    private int priority;
    private String status;

    /**
     * Constructs a new Task.
     * 
     * @param name the unique name of the task
     * @param priority the priority level (lower = higher priority)
     * @param status the current status ("TODO", "IN_PROGRESS", "DONE")
     */
    public Task(String name, int priority, String status) {
        this.name = name;
        this.priority = priority;
        this.status = status;
    }

    /**
     * Gets the task name.
     * 
     * @return the name of the task
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the task priority.
     * 
     * @return the priority of the task
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Gets the task status.
     * 
     * @return the status of the task
     */
    public String getStatus() {
        return status;
    }

    /**
     * Updates the task status.
     * 
     * @param status the new status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Returns a string representation of the task.
     * 
     * @return a formatted string of task details
     */
    @Override
    public String toString() {
        return "Task{name='" + name + "', priority=" + priority + ", status='" + status + "'}";
    }
}
