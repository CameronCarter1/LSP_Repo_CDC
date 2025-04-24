package org.howard.edu.lspfinal.question2;

/**
 * Exception thrown when a requested task is not found.
 */
public class TaskNotFoundException extends Exception {

    /**
     * Constructs a TaskNotFoundException with a custom message.
     * 
     * @param message the detail message
     */
    public TaskNotFoundException(String message) {
        super(message);
    }
}
