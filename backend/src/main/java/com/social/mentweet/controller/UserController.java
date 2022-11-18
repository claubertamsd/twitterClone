package com.social.mentweet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.social.mentweet.model.User;
import com.social.mentweet.service.UserService;

@Controller
public class UserController{

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }
    
    @PostMapping
    public User save (User user){
       return userService.save(user);
    }
    
}