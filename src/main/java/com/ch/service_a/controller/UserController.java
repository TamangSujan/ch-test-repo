package com.ch.service_a.controller;

import com.ch.service_a.model.User;
import com.ch.service_a.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/web")
public class UserController {
    private UserService userService;
    @GetMapping("/users")
    public ResponseEntity<?> getUsers(){
        return ResponseEntity.status(HttpStatus.OK).body(userService.getAllUsers());
    }

    @PostMapping("/user")
    public ResponseEntity<?> saveUser(User user){
        return ResponseEntity.status(HttpStatus.OK).body(userService.save(user));
    }
}
