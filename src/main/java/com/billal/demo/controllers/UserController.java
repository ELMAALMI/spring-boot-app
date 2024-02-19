package com.billal.demo.controllers;

import com.billal.demo.models.User;
import com.billal.demo.servcices.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public ResponseEntity<?> saveUser(@RequestBody User user) {
        return ResponseEntity.ok(this.service.saveUser(user));
    }

    @GetMapping("/all")
    public ResponseEntity<?> get() {
        return ResponseEntity.ok(this.service.getAllUsers());
    }

}
