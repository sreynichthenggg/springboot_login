package com.example.loginregister.service;


import com.example.loginregister.entity.User;
import com.example.loginregister.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceIml implements UserService {

    @Autowired
    private UserRepo repo;


    @Override
    public void registerUser(User user) {

        repo.save(user);

    }
}
