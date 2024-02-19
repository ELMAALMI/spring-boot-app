package com.billal.demo.servcices;

import com.billal.demo.models.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    User fetchUserByEmail(String email);

    User fetchUserByEmailAndPassword(String email, String password);

    List<User> getAllUsers();
}
