package com.example.activitytracker.Repository;

import com.example.activitytracker.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task , Integer> {

}
