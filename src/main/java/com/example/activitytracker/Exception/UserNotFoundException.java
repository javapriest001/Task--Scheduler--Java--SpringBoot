package com.example.activitytracker.Exception;

public class UserNotFoundException  extends   RuntimeException{
    public UserNotFoundException(String message) {
        super(message);
    }
}
