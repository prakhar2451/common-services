package com.doxaflow.UserNexa.Services.Implementation;

import com.doxaflow.UserNexa.Entities.User;
import com.doxaflow.UserNexa.Services.UserManagementService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManagementServiceImpl implements UserManagementService {

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public User getUserById(Long userId) {
        return null;
    }

    @Override
    public User getUserByUsername(String username) {
        return null;
    }

    @Override
    public void deleteUser(Long userId) {

    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
