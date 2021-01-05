package com.example.test1.testing1;

import javax.persistence.PostLoad;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserConntrolV1 {
    
    @GetMapping
    public String GetUser() {
        return "Get user called";
    }

    @PostMapping
    public String CreateUser() {
        return "Create user called";
    }

    @PutMapping
    public String UpdateUser() {
        return "Update user called";
    }

    @DeleteMapping
    public String DeleteUser() {
        return "Delete user called";
    }
}
