package com.ch.service_a.service;

import com.ch.service_a.model.User;
import com.ch.service_a.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository repository;
    public User save(User user){
        return repository.save(user);
    }

    public List<User> getAllUsers(){
        return repository.findAll();
    }
}
