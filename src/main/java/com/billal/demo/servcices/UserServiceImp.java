package com.billal.demo.servcices;

import com.billal.demo.models.User;
import com.billal.demo.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    private final UserRepository userRepository;
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public User saveUser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public User fetchUserByEmail(String email) {
        return this.userRepository.findByEmail(email).orElse(null);
    }

    @Override
    public User fetchUserByEmailAndPassword(String email, String password) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }
}
