package com.interview.codetest.api.controller;

import com.interview.codetest.api.model.User;
import com.interview.codetest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    private UserService userService;
    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }
    @GetMapping("/user")
    public User getUser(@RequestParam Integer id){
        Optional user = userService.getUser(id);
        if(user.isPresent()){
            return (User) user.get();
        }
        return null;
    }
}
