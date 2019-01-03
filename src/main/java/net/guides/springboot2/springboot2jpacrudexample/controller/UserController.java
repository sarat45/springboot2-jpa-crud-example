package net.guides.springboot2.springboot2jpacrudexample.controller;

import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.PostMapping;



import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import net.guides.springboot2.springboot2jpacrudexample.model.User;

import net.guides.springboot2.springboot2jpacrudexample.repository.UserRepository;
@RestController

@RequestMapping("/api/v1")
public class UserController {
    @Autowired

    private UserRepository userRepository;
    @GetMapping("/user")

    public List<User> getAllEmployees() {

        return userRepository.findAll();

    }

    @PostMapping("/user")

    public User createEmployee(@Valid @RequestBody User user) {

        return userRepository.save(user);

    }



}
