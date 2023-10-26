package com.doxaflow.UserNexa.Services;

import com.doxaflow.UserNexa.Entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserManagementService {

    User createUser(User user); //Creates a new user.

    User updateUser(User user); //Updates an existing user's information.

    User getUserById(Long userId); //Retrieves a user's information by their unique identifier.

    User getUserByUsername(String username); //Retrieves a user by their username.

    void deleteUser(Long userId); //Deletes a user by their unique identifier.

    List<User> getAllUsers(); //Retrieves a list of all users.
}
