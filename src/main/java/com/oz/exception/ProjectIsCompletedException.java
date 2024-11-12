package com.oz.exception;

public class ProjectIsCompletedException extends RuntimeException {

    public ProjectIsCompletedException(String message) {
        super(message);
    }

}
