package com.social.mentweet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.social.mentweet.model.User;
import com.social.mentweet.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    public List<User>findAll(){
        return userRepository.findAll();
    }
    public User save(User user){
        
        if(userRepository.findAll().stream().anyMatch(u-> u.getUsername().equalsIgnoreCase(user.getUsername())) ){
            System.out.println("Usuário já cadastrado");
        }
        return userRepository.save(user);
    }
    
}
