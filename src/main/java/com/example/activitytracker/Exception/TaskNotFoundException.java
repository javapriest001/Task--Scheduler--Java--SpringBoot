package com.example.activitytracker.Exception;

public class TaskNotFoundException extends   RuntimeException{
    public TaskNotFoundException(String message) {
        super(message);
    }
}
