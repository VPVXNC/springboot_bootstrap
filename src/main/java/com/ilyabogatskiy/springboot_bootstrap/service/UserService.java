package com.ilyabogatskiy.springboot_bootstrap.service;

import com.ilyabogatskiy.springboot_bootstrap.model.User;

public interface UserService {
    void createNewUser(User user);
    void deleteUser(long id);
    void updateUser(User user);
    Iterable<User> getAllUsers();
}
