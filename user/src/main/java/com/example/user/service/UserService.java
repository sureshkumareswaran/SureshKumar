package com.example.user.service;


import com.example.user.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service("userService")
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserByUserId(long userId) {
        return userRepository.getById(userId);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUserByUserId(long userId) {
        userRepository.deleteById(userId);
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}
