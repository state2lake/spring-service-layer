package com.example.test1.testing1;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HomeControllerV1 {
    
    @GetMapping("/name")
    public String Name() {
        return "Name";
    }
}
