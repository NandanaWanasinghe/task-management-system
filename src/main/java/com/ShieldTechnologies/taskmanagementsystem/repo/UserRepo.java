package com.ShieldTechnologies.taskmanagementsystem.repo;

import com.ShieldTechnologies.taskmanagementsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
