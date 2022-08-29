package com.example.activitytracker.Service;

import com.example.activitytracker.DTO.TaskDTO;
import com.example.activitytracker.DTO.UserDTO;
import com.example.activitytracker.Model.Task;
import com.example.activitytracker.Model.User;

import java.util.List;

public interface UserService {

    User registerUser(UserDTO userDTO);

    String loginUser(String email, String password);

    Task createTask(TaskDTO taskDTO);

    Task updateTitleAndDescription(TaskDTO taskDTO);

    List<Task> viewAllTasks();

    Task getSingleTask(int id);

    List<Task> viewAllTaskByStatus(String status);

    boolean deleteById(int id);

}
