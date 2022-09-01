package com.example.activitytracker.Repository;

import com.example.activitytracker.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task , Integer> {
    @Query(value = "SELECT * FROM tasks WHERE status = ?1" , nativeQuery = true)
    List<Task> listOfTasksByStatus(String Status);

    @Modifying
    @Transactional
    @Query(value = "UPDATE tasks SET status = ?1 where  id = ?2" , nativeQuery = true)
    int updateTaskByIdAndStatus(String status , int id);

    @Query(value = "SELECT * FROM tasks WHERE user_id = ?1" , nativeQuery = true)
    List<Task> findAllByUser_id(int user_id);

    @Query(value = "SELECT * FROM tasks WHERE user_id = ?1 AND status = ?2" , nativeQuery = true)
    List<Task> findAllByUser_idAndStatus(int user_id , String status);
}
