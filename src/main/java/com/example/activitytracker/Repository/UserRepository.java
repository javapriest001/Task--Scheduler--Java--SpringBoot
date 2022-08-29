package com.example.activitytracker.Repository;

import com.example.activitytracker.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

    @Query(value = "SELECT * FROM users WHERE email = ?1" , nativeQuery = true)
    Optional<User> findUserByEmail(String email);
}
