package com.doxaflow.UserNexa.Repo;

import com.doxaflow.UserNexa.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
