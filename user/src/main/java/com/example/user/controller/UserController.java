package com.example.user.controller;

import com.example.user.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@SpringBootApplication
@RestController
@RequestMapping("/user")

public class UserController {

    @Autowired
    private UserService userService;


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public User getUserByUserId(@PathVariable int userId) {
        return userService.getUserByUserId(userId);
    }


    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/{userId}")
    public String deleteUserByUserId(@PathVariable int userId) {
        userService.deleteUserByUserId(userId);
        return "User Details Deleted";
    }

    @GetMapping("/get/all/User")
    public List<User> findAllUser() {
        return userService.getAllUser();
    }

//    @GetMapping("/get")
//    public String get() {

//        String events = restTemplate.getForObject("http://localhost:8082/Events", String.class);
//
//        String events = restTemplate.getForObject("http://EVENTS-SERVICE/Service", String.class);
//        return events;
//    }
}
