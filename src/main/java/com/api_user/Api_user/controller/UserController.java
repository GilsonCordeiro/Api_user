package com.api_user.Api_user.controller;

import com.api_user.Api_user.model.User;
import com.api_user.Api_user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository repository;

    @GetMapping
    public List<User> findAll(){
       List<User> result = repository.findAll();
       return result;
    }
}
