package com.baskent.edu.tr.dbhw.service;

import com.baskent.edu.tr.dbhw.entity.User;
import com.baskent.edu.tr.dbhw.exception.UserNotFoundException;

import java.util.List;

public interface UserService {

    User createUser(User user);

    User updateUser(User user);

    void deleteUser(Integer userId);

    User getUserById(Integer userId) throws UserNotFoundException;

    List<User> getAllUsers();
}
