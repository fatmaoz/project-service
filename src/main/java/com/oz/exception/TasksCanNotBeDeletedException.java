package com.oz.exception;

public class TasksCanNotBeDeletedException extends RuntimeException {

    public TasksCanNotBeDeletedException(String message) {
        super(message);
    }

}
