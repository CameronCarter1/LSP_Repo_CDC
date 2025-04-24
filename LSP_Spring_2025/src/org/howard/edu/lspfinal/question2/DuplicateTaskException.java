package org.howard.edu.lspfinal.question2;

/**
 * Exception thrown when a task with a duplicate name is added.
 */
public class DuplicateTaskException extends Exception {

    /**
     * Constructs a DuplicateTaskException with a custom message.
     * 
     * @param message the detail message
     */
    public DuplicateTaskException(String message) {
        super(message);
    }
}

