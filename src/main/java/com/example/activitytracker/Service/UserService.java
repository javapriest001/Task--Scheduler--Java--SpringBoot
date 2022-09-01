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

    Task updateTitleAndDescription(TaskDTO taskDTO , int id);

    Task markTaskCompleted(int id);

    List<Task> allTaskByUserId(int id);

    Task getTaskById(int id);

    List<Task> viewAllTasks();

    int updateTaskStatus(String status, int id);

    List<Task> viewAllTaskByStatus(String status);

    List<Task> findAllByUser_idAndStatus(int user_id , String status);
    boolean deleteById(int id);
    User getUserByEmail(String email);

}
